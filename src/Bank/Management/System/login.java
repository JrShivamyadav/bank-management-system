package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {
    JButton signin, signup, clear;
    JTextField tfcardno;
    JLabel cardno, lblWlcm, pin;
    JPasswordField tfpin;

    login() {
        setTitle("Automated teller machine");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 70);
        add(label);

        lblWlcm = new JLabel("welcome to ATM");
        lblWlcm.setFont(new Font("raleway", Font.BOLD, 30));
        lblWlcm.setBounds(170, 20, 400, 70);
        add(lblWlcm);

        cardno = new JLabel("Card No");
        cardno.setFont(new Font("raleway", Font.BOLD, 20));
        cardno.setBounds(100, 100, 150, 30);
        add(cardno);

        tfcardno = new JTextField();
        tfcardno.setBounds(200, 100, 200, 30);
        tfcardno.setFont(new Font("Arial", Font.PLAIN, 15));
        add(tfcardno);

        pin = new JLabel("PIN");
        pin.setFont(new Font("raleway", Font.BOLD, 20));
        pin.setBounds(100, 150, 150, 30);
        add(pin);

        tfpin = new JPasswordField();
        tfpin.setBounds(200, 150, 200, 30);
        add(tfpin);

        signin = new JButton("SignIn");
        signin.setBounds(150, 220, 100, 25);
        signin.setBackground(Color.black);
        signin.setForeground(Color.WHITE);
        signin.addActionListener(this);
        add(signin);

        clear = new JButton("Clear");
        clear.setBounds(300, 220, 100, 25);
        clear.setBackground(Color.black);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SignUp");
        signup.setBounds(150, 250, 250, 25);
        signup.setBackground(Color.black);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);


        getContentPane().setBackground(Color.white);
        setBounds(300, 100, 550, 350);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==clear){
            tfcardno.setText("");
            tfpin.setText("");
        }
       /* else if (e.getSource()==signin) {
        Conn conn = new Conn();
        String cardnumber = new tfcardno.getText();
        String number = new tfpin.getText();
        String query ="select * from Bank.Management.System.login where cardnumber ='"+cardnumber+"'add pin ='"+number;

        try{
            ResultSet rs = conn.s.executeQuery(query);
            if (rs.next()){
                setVisible(false);
                new transactions().setVisible(true);
            }else {
                JOptionPane.showMessageDialog(null,"Incorrect Card Number Or pin");
            }
        }catch (Exception ed){
            System.out.println(ed);
        }
        }*/

        else if (e.getSource()==signup){
            setVisible(false);
         new signupOne("").setVisible(true);
        }
    }
    }
