package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signupOne extends JFrame implements ActionListener {

JLabel lblname, lblfather,lbldob,lblgender,lblemail,lblstatus,lbladdrsess,lblcity,lblstate,lblpin;
JTextField tfname,tffather,tfdob,tfemail,tfstatus,tfaddress,tfcity,tfstate,tfpin;

JButton next,back;
JRadioButton Married,UnMarried,male,female,others;
    String formno;
    long random;
    signupOne(String formno)
    {

        Random ran = new Random();
        random =Math.abs((ran.nextLong() % 9000L)+1000L);

        JLabel formNo = new JLabel(" Application form No:  "+random );
        formNo.setFont(new Font("Raleway",Font.BOLD,30));
        formNo.setBounds(100,10,600,40);
        add(formNo);

        JLabel personalDetails = new JLabel(" page 1 : Personal Details " );
        personalDetails.setFont(new Font("raleway",Font.PLAIN,20));
        personalDetails.setBounds(150,50,600,30);
        add(personalDetails);

        lblname = new JLabel("Name :");
        lblname.setFont(new Font("raleway",Font.BOLD,20));
        lblname.setBounds(50,90,150,20);
        add(lblname);

        tfname = new JTextField();
        tfname.setBounds(250,90,200,20);
        tfname.setFont(new Font("Arial",Font.PLAIN,15));
        add(tfname);


        lblfather = new JLabel("Father's Name : ");
        lblfather.setFont(new Font("raleway",Font.BOLD,20));
        lblfather.setBounds(50,120,150,20);
        add(lblfather);

        tffather= new JTextField();
        tffather.setBounds(250,120,200,20);
        tffather.setFont(new Font("Arial",Font.PLAIN,15));
        add(tffather);

        lbldob = new JLabel("Date of Birth :");
        lbldob.setFont(new Font("raleway",Font.BOLD,20));
        lbldob.setBounds(50,150,150,20);
        add(lbldob);

        tfdob= new JTextField();
        tfdob.setBounds(250,150,200,20);
        tfdob.setFont(new Font("Arial",Font.PLAIN,15));
        add(tfdob);

        lblgender = new JLabel("Gender :");
        lblgender.setFont(new Font("raleway",Font.BOLD,20));
        lblgender.setBounds(50,180,150,20);
        add(lblgender);

        male = new JRadioButton("male");
        male.setBounds(250,180,100,20);
        male.setBackground(Color.WHITE);
       add(male);

        female = new JRadioButton("Female");
        female.setBounds(350,180,100,20);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);



        lblemail = new JLabel("Email Address :");
        lblemail.setFont(new Font("raleway",Font.BOLD,20));
        lblemail.setBounds(50,210,200,20);
        add(lblemail);

        tfemail = new JTextField();
        tfemail.setBounds(250,210,200,20);
        tfemail.setFont(new Font("Arial",Font.PLAIN,15));
        add(tfemail);

        lblstatus = new JLabel("Martial Status :");
        lblstatus.setFont(new Font("raleway",Font.BOLD,20));
        lblstatus.setBounds(50,240,150,20);
        add(lblstatus);

         Married = new JRadioButton("Married");
        Married.setBounds(230,240,70,20);
        Married.setBackground(Color.WHITE);
        add(Married);

         UnMarried = new JRadioButton("UnMarried");
        UnMarried.setBounds(300,240,90,20);
        UnMarried.setBackground(Color.WHITE);
        add(UnMarried);

        others = new JRadioButton("Others");
        others.setBounds(390,240,70,20);
        others.setBackground(Color.WHITE);
        add(others);

        ButtonGroup statusGroup = new ButtonGroup();
        statusGroup.add(Married);
        statusGroup.add(UnMarried);
        statusGroup.add(others);

        lbladdrsess = new JLabel("Address :");
        lbladdrsess.setFont(new Font("raleway",Font.BOLD,20));
        lbladdrsess.setBounds(50,270,150,20);
        add(lbladdrsess);

        tfaddress = new JTextField();
        tfaddress.setBounds(250,270,200,20);
        tfaddress.setFont(new Font("Arial",Font.PLAIN,15));
        add(tfaddress);

        lblcity = new JLabel("City :");
        lblcity.setFont(new Font("raleway",Font.BOLD,20));
        lblcity.setBounds(50,300,150,20);
        add(lblcity);

        tfcity = new JTextField();
        tfcity.setBounds(250,300,200,20);
        tfcity.setFont(new Font("Arial",Font.PLAIN,15));
        add(tfcity);


        lblstate = new JLabel("State :");
        lblstate.setFont(new Font("raleway",Font.BOLD,20));
        lblstate.setBounds(50,330,150,20);
        add(lblstate);

        tfstate = new JTextField();
        tfstate.setBounds(250,330,200,20);
        tfstate.setFont(new Font("Arial",Font.PLAIN,15));
        add(tfstate);

        lblpin = new JLabel("Pin Code :");
        lblpin.setFont(new Font("raleway",Font.BOLD,20));
        lblpin.setBounds(50,360,150,20);
        add(lblpin);

        tfpin = new JTextField();
        tfpin.setBounds(250,360,200,20);
        tfpin.setFont(new Font("Arial",Font.PLAIN,15));
        add(tfpin);

        back = new JButton("Back");
        back.setBounds(150,450,100,25);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        next = new JButton("Next");
        next.setBounds(300,450,100,25);
        next.setBackground(Color.black);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

               getContentPane().setBackground(Color.white);

        setSize(600,600);
        setLocation(350,50);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
new signupOne("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = "" + random;
        String name = tfname.getText();
        String Fathername = tffather.getText();
        String Dob = tfdob.getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }

        String email = tfemail.getText();
        String status = null;
        if (Married.isSelected()){
            status= "Married";
        } else if (UnMarried.isSelected() ){
            status= "UnMarried";
        } else if (others.isSelected()) {
            status= "Others";
        }

        String address = tfaddress.getText();
        String city = tfcity.getText();
        String State = tfstate.getText();
        String Pin_code = tfpin.getText();

        try {
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is required");
            } else {
                Conn c = new Conn();
                String query = "insert into signupone values ( '" + formno + "','" + name+ "','" + Fathername+ "','" + Dob+
                "','" + gender+ "','" + email+ "','" + status+ "','" + address+ "','" + city+ "','" + State+ "','" + Pin_code+
                "')";
                c.s.executeUpdate(query);

                new signupTwo(formno).setVisible(true);

            }
        }catch (Exception ef){
            System.out.println(ef);
        }

        if (e.getSource()==next){
            setVisible(false);
          new signupTwo("");
        }else {
            new login();
        }
    }
}
