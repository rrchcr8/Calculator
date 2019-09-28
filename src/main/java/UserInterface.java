import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface extends JFrame implements ActionListener {

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;



    public UserInterface(){
        setLayout(null);
        Font buttonsFont = new Font("calibri", 0, 40);

        button1 = new JButton("1");
        button1.setBounds(10,100,90,90);
        button1.setFont(buttonsFont);
        add(button1);
        button1.addActionListener(this);

        button2 = new JButton("2");
        button2.setBounds(110,100,90,90);
        button2.setFont(buttonsFont);
        add(button2);
        button1.addActionListener(this);

        button3 = new JButton("3");
        button3.setBounds(210,100,90,90);
        button3.setFont(buttonsFont);
        add(button3);
        button3.addActionListener(this);

        button4 = new JButton("4");
        button4.setBounds(10,200,90,90);
        button4.setFont(buttonsFont);
        add(button4);
        button4.addActionListener(this);

        button5 = new JButton("5");
        button5.setBounds(110,200,90,90);
        button5.setFont(buttonsFont);
        add(button5);
        button5.addActionListener(this);

        button6 = new JButton("6");
        button6.setBounds(210,200,90,90);
        button6.setFont(buttonsFont);
        add(button6);
        button6.addActionListener(this);

        button7 = new JButton("7");
        button7.setBounds(10,300,90,90);
        button7.setFont(buttonsFont);
        add(button7);
        button7.addActionListener(this);

        button8 = new JButton("8");
        button8.setBounds(110,300,90,90);
        button8.setFont(buttonsFont);
        add(button8);
        button8.addActionListener(this);

        button9 = new JButton("9");
        button9.setBounds(210,300,90,90);
        button9.setFont(buttonsFont);
        add(button9);
        button9.addActionListener(this);




    }

    public static void main(String args[]){
        UserInterface UserInterface1 = new UserInterface();
        UserInterface1.setBounds(0,0,600,700);
        UserInterface1.setVisible(true);
        UserInterface1.setLocationRelativeTo(null);
        UserInterface1.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}