package Bank.Management.System;

/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pinChange extends JFrame implements ActionListener {
    JLabel lblWlcm,pin,repin;
    JPasswordField tfpin,tfrepin;
    JButton change ,back;

    String number;
    pinChange(){
        this.number = number;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/delete.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,70);
        add(label);

        lblWlcm = new JLabel("welcome to ATM");
        lblWlcm.setFont(new Font("raleway",Font.BOLD,30));
        lblWlcm.setBounds(170,20,400,70);
        add(lblWlcm);

        pin = new JLabel("PIN  :");
        pin.setFont(new Font("raleway",Font.BOLD,20));
        pin.setBounds(100,100,150,30);
        add(pin);

        tfpin = new JPasswordField();
        tfpin.setBounds(250,100,200,30);
        tfpin.setFont(new Font("Arial",Font.PLAIN,15));
        add(tfpin);

        pin = new JLabel("Re-PIN:");
        pin.setFont(new Font("raleway",Font.BOLD,20));
        pin.setBounds(100,150,170,30);
        add(pin);

        tfrepin = new JPasswordField();
        tfrepin.setBounds(250,150,200,30);
        add(tfrepin);

        change = new JButton("Change");
        change.setBounds(300,220,100,25);
        change.setBackground(Color.black);
        change.setForeground(Color.WHITE);
        change.addActionListener(this);
        add(change);

        back = new JButton("Back");
        back.setBounds(150,220,100,25);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        getContentPane().setBackground(Color.white);
        setBounds(300,100,550,350);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new pinChange();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==change){
            try{
                String npin = pin.getText();
                String rpin = repin.getText();
                if (!npin.equals(rpin)){
                    JOptionPane.showMessageDialog(null,"Entered PIN is not Matched");
                    return;
                }
                if (npin.equals("")){
                    JOptionPane.showMessageDialog(null,"Plese Enter new PIN");
                    return;
                }
                if (rpin.equals("")){
                    JOptionPane.showMessageDialog(null,"Plese Enter new re-PIN");
                    return;
                }
            }catch (Exception ae){
                System.out.println(ae);
            }

            Conn conn = new Conn();
            String query1 = "update bank set pin ='"+repin+"','where pin='"+number+"'";
            String query2 = "update bank set pin ='"+repin+"','where pin='"+number+"'";
            String query3 = "update bank set pin ='"+repin+"','where pin='"+number+"'";

            conn.s.executeUpdate(query1);
            conn.s.executeUpdate(query2);
            conn.s.executeUpdate(query3);

            JOptionPane.showMessageDialog(null,"PIN Changed Successfully ");
            setVisible(false);
            new transactions(repin).setVisible(true);

        }else {
            setVisible(false);
            new transactions(number).setVisible(true);
        }
    }
}*/
