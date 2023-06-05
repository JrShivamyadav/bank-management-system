/*package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class fastCash extends JFrame implements ActionListener {
    JButton rs100,rs500,rs1000,rs2000,rs5000,rs10000,exit;
    JLabel lbltrans;
    fastCash(){
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700,800,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(15,10,700,500);
        add(image);

        lbltrans = new JLabel("Select Withdrawl Amount:");
        lbltrans.setFont(new Font("raleway",Font.BOLD,20));
        lbltrans.setBounds(150,100,400,20);
        image.add(lbltrans);

        rs100 = new JButton("Rs 100");
        rs100.setBounds(150,150,100,25);
        rs100.setBackground(Color.black);
        rs100.setForeground(Color.WHITE);
        rs100.addActionListener(this);
        image.add(rs100);

        rs500 = new JButton("Rs 500");
        rs500.setBounds(350,150,100,25);
        rs500.setBackground(Color.black);
        rs500.setForeground(Color.WHITE);
        rs500.addActionListener(this);
        image.add(rs500);

        rs1000 = new JButton("Rs 1000");
        rs1000.setBounds(150,180,100,25);
        rs1000.setBackground(Color.black);
        rs1000.setForeground(Color.WHITE);
        rs1000.addActionListener(this);
        image.add(rs1000);

        rs2000 = new JButton("Rs 2000");
        rs2000.setBounds(350,180,100,25);
        rs2000.setBackground(Color.black);
        rs2000.setForeground(Color.WHITE);
        rs2000.addActionListener(this);
        image.add(rs2000);

        rs5000 = new JButton("Rs 5000");
        rs5000.setBounds(150,210,100,25);
        rs5000.setBackground(Color.black);
        rs5000.setForeground(Color.WHITE);
        rs5000.addActionListener(this);
        image.add(rs5000);

        rs10000 = new JButton("Rs 10000");
        rs10000.setBounds(350,210,100,25);
        rs10000.setBackground(Color.black);
        rs10000.setForeground(Color.WHITE);
        rs10000.addActionListener(this);
        image.add(rs10000);

        exit = new JButton("Back");
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
        new fastCash();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==exit){

        } else  {
            String amount = ((JButton)e.getSource().subString(3));
            Conn c = new Conn();
            try{
                ResultSet rs = c.s.executeQuery("Select * from bank where pin ='"+number+"'");
                int balance =0;
                while(rs.next()){
                    if (rs.getString("type").equals("Deposit")){
                    balance +=Integer.parseInt( rs.getString("Amount"));
                }else{
                    balance -=Integer.parseInt( rs.getString("Amount"));
                }
                if (e.getSource != exit && balance <Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "InSufficient Balance");
                    return;
                }
                Date date = new Date();
                String query =" insert into bank values ('"+number+"','"+date+"','Withdrawl','"+amount+"'");
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Debited SuccessFull");

                setVisible(false);
                new transactions(number).setVisible(true);
                }
            }catch (Exception ej){
                System.out.println(ej);
            }

        }
    }}*/
