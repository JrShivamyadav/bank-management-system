package Bank.Management.System;

/*import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class miniStatement extends JFrame {

    JLabel mini,bank,card,balance;
    miniStatement(){
        setTitle("Mini Statement");

        mini = new JLabel();
        add(mini);

         bank = new JLabel("Indian Bank");
        bank.setBounds(150,20,100,20);
        add(bank);

        card = new JLabel("Indian Bank");
        card.setBounds(150,20,100,20);
        add(card);

        balance = new JLabel();
        balance.setBounds(20,30,300,20);
        add(balance);

        try{
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from Bank.Management.System.login where pin = '"+number+"'");
            while (rs.next()){
                card.setText("Card number:"+rs.getString("Card Number").substring(0,4)+"xxxxxxxx");
            }
        }catch (Exception e){
            System.out.println(e);
        }

        try{
            Conn conn = new Conn();
            int bal =0;
            ResultSet rs = conn.s.executeQuery("select * from Bank.Management.System.login where pin = '' '"+number+"'");
            while (rs.next()){
                 mini.setText(mini.getText() + "<html>"+ rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount"));

                if (rs.getString("type").equals("Deposit")){
                    bal +=Integer.parseInt( rs.getString("Amount"));
                }else{
                    bal -=Integer.parseInt( rs.getString("Amount"));
                }
            }
            balance.setText("your Current Account Balance is Rs "+ bal);
        }catch (Exception e){
            System.out.println(e);
        }
        mini.setBounds(20,140,400,200);

        setSize(400,500);
        setLocation(20,20);
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }


    public static void main(String[] args) {
new miniStatement();
    }
}
*/