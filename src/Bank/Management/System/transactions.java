/*package Bank.Management.System;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class transactions extends JFrame implements ActionListener {
    JButton deposit,withdrawl,ministatement,pinchange,balanceEnquiry,fastCash,exit;
    JLabel lbltrans;
    transactions(){
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700,800,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(15,10,700,500);
        add(image);

        lbltrans = new JLabel("Select Transaction Options:");
        lbltrans.setFont(new Font("raleway",Font.BOLD,20));
        lbltrans.setBounds(150,100,400,20);
        image.add(lbltrans);

        deposit = new JButton("Deposit");
        deposit.setBounds(150,150,100,25);
        deposit.setBackground(Color.black);
        deposit.setForeground(Color.WHITE);
        deposit.addActionListener(this);
        image.add(deposit);

        withdrawl = new JButton("Withdrawl");
        withdrawl.setBounds(350,150,100,25);
        withdrawl.setBackground(Color.black);
        withdrawl.setForeground(Color.WHITE);
        withdrawl.addActionListener(this);
        image.add(withdrawl);

        ministatement = new JButton("MiniStateMent");
        ministatement.setBounds(150,180,100,25);
        ministatement.setBackground(Color.black);
        ministatement.setForeground(Color.WHITE);
        ministatement.addActionListener(this);
        image.add(ministatement);

        pinchange = new JButton("Change Pin");
        pinchange.setBounds(350,180,100,25);
        pinchange.setBackground(Color.black);
        pinchange.setForeground(Color.WHITE);
        pinchange.addActionListener(this);
        image.add(pinchange);

        balanceEnquiry = new JButton("Balance Enquiry");
        balanceEnquiry.setBounds(150,210,100,25);
        balanceEnquiry.setBackground(Color.black);
        balanceEnquiry.setForeground(Color.WHITE);
        balanceEnquiry.addActionListener(this);
        image.add(balanceEnquiry);

        fastCash = new JButton("Fast Cash");
        fastCash.setBounds(350,210,100,25);
        fastCash.setBackground(Color.black);
        fastCash.setForeground(Color.WHITE);
        fastCash.addActionListener(this);
        image.add(fastCash);

        exit = new JButton("Exit");
        exit.setBounds(150,250,100,25);
        exit.setBackground(Color.black);
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        image.add(exit);



        setSize(750,570);
        setLocation(100,50);
        setVisible(true);
        setLayout(null);

    }

    public static void main(String[] args) {
        new transactions();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (deposit.getSource()==deposit){
            setVisible(false);
           new deposit(number).setVisible(true);
        }
        else if (withdrawl.getScource()==withdrawl){
            setVisible(false);
            new transactions(number).setvisible(true);
        }
        else if (ministatement.getSource()==ministatement) {
            setVisible(false);
            new miniStatement(number).setvisible(true);
        }
        else if (balanceEnquiry.getSource()==balanceEnquiry) {
            setVisible(false);
            new balanceEnquiry(number).setVisible(true);
        }
        else if (exit.getSource()==exit) {
            System.exit(0);
        }
        else if (fastCash.getSource()==fastCash){
            setVisible(false);
            new fastCash(number).setVisible(true);
        }
       else if (pinchange.getSource()==pinchange) {
            setVisible(false);
            new pinChange(number).setVisible(true);
        }
    }
}*/