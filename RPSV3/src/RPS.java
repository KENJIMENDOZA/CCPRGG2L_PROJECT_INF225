import javax.crypto.spec.RC5ParameterSpec;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.interfaces.RSAPrivateCrtKey;

public class RPS extends JFrame implements ActionListener {
    private JButton rockButton;
    private JButton paperButton;
    private JButton scissorsButton;
    private JLabel resultLabel;

    public RPS() {
        // Create the buttons and add an action listener to each as well as adding fonts and designs(feel free to reconfigure just remember to tell before you commit)
        rockButton = new JButton("Rock");
        rockButton.addActionListener(this);
        rockButton.setIcon(new ImageIcon("TR.png"));
        rockButton.setBounds(getBounds());
        rockButton.setSize(25, 25);
        rockButton.setBounds(50,50,50,50);
        rockButton.setFont(new Font("Comic Sans", Font.BOLD,25));
        rockButton.setHorizontalTextPosition(JButton.CENTER);
        rockButton.setVerticalTextPosition(JButton.BOTTOM);
        rockButton.setBorder(BorderFactory.createEtchedBorder());
        rockButton.setFocusable(false);
        rockButton.setLayout(null);

        paperButton = new JButton("Paper");
        paperButton.addActionListener(this);
        paperButton.setIcon(new ImageIcon("TP.png"));
        paperButton.setSize(25, 25);
        paperButton.setBounds(50,50,50,50);
        paperButton.setFont(new Font("Comic Sans", Font.BOLD,25));
        paperButton.setHorizontalTextPosition(JButton.CENTER);
        paperButton.setVerticalTextPosition(JButton.BOTTOM);
        paperButton.setBorder(BorderFactory.createEtchedBorder());
        paperButton.setFocusable(false);
        paperButton.setLayout(null);


        scissorsButton = new JButton("Scissors");
        scissorsButton.addActionListener(this);
        scissorsButton.setIcon(new ImageIcon("Hand.png"));
        scissorsButton.setSize(25, 25);
        scissorsButton.setBounds(50,50,50,50);
        scissorsButton.setFont(new Font("Comic Sans", Font.BOLD,25));
        scissorsButton.setHorizontalTextPosition(JButton.CENTER);
        scissorsButton.setVerticalTextPosition(JButton.BOTTOM);
        scissorsButton.setBorder(BorderFactory.createEtchedBorder());
        scissorsButton.setFocusable(false);
        scissorsButton.setLayout(null);

        // Create the result label
        resultLabel = new JLabel();

        // Add the buttons and result label to the content pane
        Container c = getContentPane();
        c.setLayout(new GridLayout(2, 1));
        c.add(rockButton);
        c.add(paperButton);
        c.add(scissorsButton);
        c.add(resultLabel);

        // Set the window properties
        setTitle("Rock Paper Scissors");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Determine which button was clicked
        if (e.getSource() == rockButton) {
            // Set the result label to display the rock icon
            resultLabel.setIcon(new ImageIcon("TR.png"));
        } else if (e.getSource() == paperButton) {
            // Set the result label to display the paper icon
            resultLabel.setIcon(new ImageIcon("TP.png"));
        } else if (e.getSource() == scissorsButton) {
            // Set the result label to display the scissors icon
            resultLabel.setIcon(new ImageIcon("Hand.png"));
        }
        
        
        String playerChoice = e.getActionCommand();

        
        // generate computer's choice
        String[] choices = {"rock", "paper", "scissors"};
        int computerIndex = (int)(Math.random() * choices.length);
        String computerChoice = choices[computerIndex];

        
        // determine winner
        String result;
        if (playerChoice.equals(computerChoice)) {
            result = "It's a tie!";
        } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors"))
                || (playerChoice.equals("paper") && computerChoice.equals("rock"))
                || (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
            result = "You win!";
        } else {
            result = "Computer wins!";
        }
        
        // update result label
        resultLabel.setText("You chose " + playerChoice + ". Computer chose " + computerChoice + ". " + result);
        
    }
    
    public static void main(String[] args) {
        new RPS() {
            
        };
    }

   
}
