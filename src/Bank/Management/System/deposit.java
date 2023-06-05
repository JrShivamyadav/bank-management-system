package Bank.Management.System;

/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class deposit extends JFrame implements ActionListener {
    JButton deposit,back;
    JLabel lblamt;
    JTextField tfamt;
    deposit(){

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700,800,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(15,10,700,500);
        add(image);

        lblamt = new JLabel("Enter the amount you want to Bank.Management.System.deposit :");
        lblamt.setFont(new Font("raleway",Font.BOLD,12));
        lblamt.setBounds(150,100,400,20);
        image.add(lblamt);

        tfamt = new JTextField();
        tfamt.setBounds(150,130,250,20);
        image.add(tfamt);


        deposit = new JButton("Deposit");
        deposit.setBounds(300,230,100,25);
        deposit.setBackground(Color.black);
        deposit.setForeground(Color.WHITE);
        deposit.addActionListener(this);
        image.add(deposit);

        back = new JButton("Back");
        back.setBounds(300,260,100,25);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        image.add(back);



        setSize(750,570);
        setLocation(100,50);
        setVisible(true);
        setLayout(null);


    }

    public static void main(String[] args) {
        new deposit();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==deposit){
            String number = tfamt.getText();
            Date date = new Date();
            if (number.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter the amount you want to Bank.Management.System.deposit ");
            }else {
                try {
                    Conn conn = new Conn();
                    String query = "Insert into bank values ('" +number+ "','" +date+ "','Bank.Management.System.deposit','" +number+ "')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs" + number + "Deposited Successfully");
                    setVisible(false);
                    new deposit(number).setVisible(false);
                    new transactions(number).setVisible(true);
                }catch (Exception es){
                    System.out.println(es);
                }
            }
        }
    }
}*/