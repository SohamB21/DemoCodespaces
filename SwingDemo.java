import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Font;

public class SwingDemo{
    public static void main(String[] args){
        JFrame frame = new JFrame("Hello Swing");
        frame.setLayout(new BorderLayout());
        frame.setSize(400, 600);
        frame.setLocation(250, 100);
        frame.setVisible(true);
        
        //setting layout of mainPanel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 2));
        frame.add(mainPanel);
        Font font = new Font("", Font.BOLD, 25);
        
        //User Name 
        JLabel nameLabel = new JLabel("Enter User Name : ");
        nameLabel.setFont(font);
        JTextField nametf = new JTextField(20);
        nametf.setFont(font);
        mainPanel.add(nameLabel);
        mainPanel.add(nametf);
        
        //Password
        JLabel passwordLabel = new JLabel("Enter Password : ");
        passwordLabel.setFont(font);
        JPasswordField passwordtf = new JPasswordField(20);
        passwordtf.setFont(font);
        mainPanel.add(passwordLabel);
        mainPanel.add(passwordtf);
        
        //Reset Button
        JButton resetBtn = new JButton("Reset");
        resetBtn.setFont(font);
        mainPanel.add(resetBtn);
        
        //Submit Button
        JButton submitBtn = new JButton("Submit");
        submitBtn.setFont(font);
        mainPanel.add(submitBtn);
    }
}