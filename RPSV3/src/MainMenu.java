import java.util.*;

public class RockPaperScissors {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int userChoice, computerChoice;
    String userChoiceStr, computerChoiceStr;

do {
    System.out.println("Enter 1 for rock, 2 for paper, 3 for scissors, or 4 to quit:");
    userChoice = scanner.nextInt();
    
    if (userChoice == 4) {
        break;
    }
    
    computerChoice = random.nextInt(3) + 1;
    
    if (userChoice == 1) {
        userChoiceStr = "rock";
    } else if (userChoice == 2) {
        userChoiceStr = "paper";
    } else if (userChoice == 3) {
        userChoiceStr = "scissors";
    } else {
        System.out.println("Invalid choice. Please try again.");
        continue;
    }
    
    if (computerChoice == 1) {
        computerChoiceStr = "rock";
    } else if (computerChoice == 2) {
        computerChoiceStr = "paper";
    } else {
        computerChoiceStr = "scissors";
    }
    
    System.out.println("You chose " + userChoiceStr + ".");
    System.out.println("The computer chose " + computerChoiceStr + ".");
    
    if (userChoice == computerChoice) {
        System.out.println("It's a tie!");
    } else if (userChoice == 1 && computerChoice == 2 || 
               userChoice == 2 && computerChoice == 3 || 
               userChoice == 3 && computerChoice == 1) {
        System.out.println("You lose!");
    } else {
        System.out.println("You win!");
    }
    
} while (userChoice != 4);

System.out.println("Thanks for playing!");
}
}
