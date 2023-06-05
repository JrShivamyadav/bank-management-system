package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signUpthree extends JFrame implements ActionListener {
    JLabel lblAccType,lblcardnum,lbl10dgt,lblsrvreq;
    JCheckBox card,netbanking,mobbanking,mailandsmsalert,checque,Estatement,flag;
    JRadioButton saving,fd,current,recurring;
    JButton submit,cancel;
    String formno;
    signUpthree(String formno){

        this.formno =formno;

        JLabel personalDetails = new JLabel(" Page 3 : Additional Details " );
        personalDetails.setFont(new Font("raleway",Font.BOLD,20));
        personalDetails.setBounds(150,40,600,30);
        add(personalDetails);

        lblAccType = new JLabel("Account Type :");
        lblAccType.setFont(new Font("raleway",Font.BOLD,20));
        lblAccType.setBounds(50,80,200,30);
        add(lblAccType);

        saving= new JRadioButton("Saving Account");
        saving.setBounds(50,120,200,20);
        saving.setBackground(Color.WHITE);
        add(saving);

        fd = new JRadioButton("Fixed Deposit Account");
        fd.setBounds(300,120,200,20);
        fd.setBackground(Color.WHITE);
        add(fd);

        current= new JRadioButton("Current Account");
        current.setBounds(50,150,200,20);
        current.setBackground(Color.WHITE);
        add(current);

        recurring = new JRadioButton("Recurring Deposit Account");
        recurring.setBounds(300,150,200,20);
        recurring.setBackground(Color.WHITE);
        add(recurring);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(saving);
        gendergroup.add(fd);
        gendergroup.add(current);
        gendergroup.add(recurring);

        lblcardnum = new JLabel("Card Number :");
        lblcardnum.setFont(new Font("raleway",Font.BOLD,20));
        lblcardnum.setBounds(50,200,200,30);
        add(lblcardnum);

        lbl10dgt= new JLabel("Your 10 digit card number:");
        lbl10dgt.setFont(new Font("raleway",Font.BOLD,10));
        lbl10dgt.setBounds(50,215,200,30);
        add(lbl10dgt);

        lblcardnum = new JLabel("XXXX-XXXX-XXXX-XXXX");
        lblcardnum.setFont(new Font("serif",Font.BOLD,20));
        lblcardnum.setBounds(250,200,250,30);
        add(lblcardnum);

        lblcardnum = new JLabel("PIN :");
        lblcardnum.setFont(new Font("raleway",Font.BOLD,20));
        lblcardnum.setBounds(50,250,200,30);
        add(lblcardnum);

        lbl10dgt= new JLabel("Your 4 digit Password:");
        lbl10dgt.setFont(new Font("raleway",Font.BOLD,10));
        lbl10dgt.setBounds(50,265,200,30);
        add(lbl10dgt);

        lblcardnum = new JLabel("XXXX");
        lblcardnum.setFont(new Font("serif",Font.BOLD,20));
        lblcardnum.setBounds(300,250,200,30);
        add(lblcardnum);

        lblsrvreq = new JLabel("Services Required :");
        lblsrvreq.setFont(new Font("raleway",Font.BOLD,20));
        lblsrvreq.setBounds(50,310,200,30);
        add(lblsrvreq);

        card = new JCheckBox("ATM CARD");
        card.setBounds(50,340,200,30);
        card.setBackground(Color.WHITE);
        card.setFont(new Font("raleway",Font.BOLD,15));
        add(card);

        netbanking = new JCheckBox("Internet banking");
        netbanking.setBounds(280,340,200,30);
        netbanking.setBackground(Color.WHITE);
        netbanking.setFont(new Font("raleway",Font.BOLD,15));
        add(netbanking);

        mobbanking = new JCheckBox("Mobile Banking");
        mobbanking.setBounds(50,370,200,30);
        mobbanking.setBackground(Color.WHITE);
        mobbanking.setFont(new Font("raleway",Font.BOLD,15));
        add(mobbanking);

        mailandsmsalert = new JCheckBox("EMAIL & SMS Alerts");
        mailandsmsalert.setBounds(280,370,200,30);
        mailandsmsalert.setBackground(Color.WHITE);
        mailandsmsalert.setFont(new Font("raleway",Font.BOLD,15));
        add(mailandsmsalert);

        checque = new JCheckBox("Checque Book");
        checque.setBounds(50,400,200,30);
        checque.setBackground(Color.WHITE);
        checque.setFont(new Font("raleway",Font.BOLD,15));
        add(checque);

        Estatement = new JCheckBox("E-Statement");
        Estatement.setBounds(280,400,200,30);
        Estatement.setBackground(Color.WHITE);
        Estatement.setFont(new Font("raleway",Font.BOLD,15));
        add(Estatement);

        flag = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge");
        flag.setBounds(50,480,600,30);
        flag.setBackground(Color.WHITE);
        flag.setFont(new Font("raleway",Font.BOLD,10));
        add(flag);

        submit = new JButton("Submit");
        submit.setBounds(150,520,100,25);
        submit.setBackground(Color.black);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBounds(300,520,100,25);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);





        getContentPane().setBackground(Color.WHITE);


        setSize(600,600);
        setLocation(350,50);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new signUpthree("") {

        };
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==submit){
            String accounttype = null;
            if (saving.isSelected()){
                accounttype = "Saving Account";
            } else if (fd.isSelected()) {
                accounttype ="Fixed Deposit Account ";
            } else if (current.isSelected()) {
                accounttype = "Current Account";
            } else if (recurring.isSelected()) {
                accounttype = "Recurring Deposit Account ";
            }
            Random random =  new Random();
            String cardnumber = "" +  Math.abs((random.nextLong() % 90000000L)+5040936000000000L);
           String number = "" + Math.abs((random.nextLong()%9000L)+1000L);

            String facility ="";
            if (card.isSelected()){
                facility = facility+ "ATM CARD";
            } else if (netbanking.isSelected()) {
                facility = facility+ "Internet Banking";
            } else if (mobbanking.isSelected()) {
                facility = facility+ "Mobile Banking";
            } else if (mailandsmsalert.isSelected()) {
                facility = facility+ "Email & Sms Alerts";
            } else if (checque.isSelected()) {
                facility = facility+ "Cheque Book";
            } else if (Estatement.isSelected()) {
                facility = facility+ "E-Statement";
            }
            try{
                if (accounttype.equals("")){
                    JOptionPane.showMessageDialog(null,"Account Type is Required");
                }else {
                    Conn conn = new Conn();
                    String query1 ="insert into signupthree values ('"+formno+"','"+accounttype+"','"+cardnumber+"','"+number+"','"+facility+"')";
                    String query2 ="insert into login values ('"+formno+"','"+cardnumber+"','"+number+"')";
                        conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null,"Card Number :" +cardnumber +"\n pin :"+number);
                    setVisible(false);
                  //  new deposit(number).setVisible(false);
                }

            }catch (Exception eg){
                System.out.println(eg);
            }
        } else if (e.getSource()==cancel) {
            setVisible(false);
            new login().setVisible(true);


        }
    }
}