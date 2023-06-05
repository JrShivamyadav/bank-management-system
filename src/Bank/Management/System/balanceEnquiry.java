/*package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class balanceEnquiry extends JFrame implements ActionListener {
    JLabel lblbalenq;
    JButton back;
    String number;
    balanceEnquiry(String number){
        this.number=number;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/delete.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,70);
        add(label);

        lblbalenq = new JLabel("your current account balance is Rs "+amount);
        lblbalenq.setFont(new Font("raleway",Font.BOLD,30));
        lblbalenq.setBounds(170,20,400,70);
        add(lblbalenq);

        back = new JButton("Clear");
        back.setBounds(300,220,100,25);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        Conn c = new Conn();
        try {
            ResultSet rs = c.s.executeQuery("Select * from bank where pin ='" + number + "'");
            int balance = 0;
            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("Amount"));
                }
                else{
                    balance -= Integer.parseInt(rs.getString("Amount"));
                }}
        }catch (Exception e){
            System.out.println(e);
        }
        getContentPane().setBackground(Color.white);
        setBounds(300,100,550,350);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new balanceEnquiry(number);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new transactions(number).setVisible(true);
    }
}
*/