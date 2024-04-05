import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
class gui {
    public static void main(String[] args){
        //Border border = BorderFactory.createLineBorder(Color.black,1);
        //creates a label and adds text
        JLabel label = new JLabel();
        label.setText("Team #:");
        //label.setBorder(border);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        //location of the text
        label.setBounds(10,0,60,20);

        JTextField team1 = new JTextField("Team #",6);

        JFrame frame = new JFrame();
        frame.setTitle("PAIRWISE+");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        
        frame.setLayout(null);
        //makes frme show uo becuase the defult is dumb
        frame.setVisible(true);
        frame.add(label);
        frame.add(team1);
        frame.getContentPane().setBackground(new Color(5, 10, 70));
    }
}