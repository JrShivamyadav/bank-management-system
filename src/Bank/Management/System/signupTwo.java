package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signupTwo extends JFrame implements ActionListener {

    JLabel lblreligion,lblcategory,lblincome,lblEQ,lblOccupation,lblpan,lblaadhar,lblSC,lblEA;
    JTextField tfpan,tfaadhar;
    JComboBox cbreligion,cbcategory,cbincome,cbEQ,cboccupation;
 JRadioButton eayes,eano,scyes,scno;
    JButton next,back;
    String formno;

    signupTwo(String formno) {
        this.formno = formno;
        JLabel personalDetails = new JLabel(" page 2 : Additional Details " );
        personalDetails.setFont(new Font("raleway",Font.PLAIN,20));
        personalDetails.setBounds(150,50,600,30);
        add(personalDetails);

        lblreligion = new JLabel("Religion :");
        lblreligion.setFont(new Font("raleway",Font.BOLD,20));
        lblreligion.setBounds(50,90,150,20);
        add(lblreligion);

        String valreligion[] = {"Hindu","Muslim","Sikh","Christian","Others"};
        cbreligion =new JComboBox(valreligion);
        cbreligion.setBackground(Color.WHITE);
        cbreligion.setBounds(250,90,250,20);
        add(cbreligion);



        lblcategory = new JLabel("Category : ");
        lblcategory.setFont(new Font("raleway",Font.BOLD,20));
        lblcategory.setBounds(50,120,150,20);
        add(lblcategory);


        String valcategory[] = {"General","OBC","SC","St","Others"};
        cbcategory =new JComboBox(valcategory);
        cbcategory.setBackground(Color.WHITE);
        cbcategory.setBounds(250,120,250,20);
        add(cbcategory);

        lblincome = new JLabel("Income :");
        lblincome.setFont(new Font("raleway",Font.BOLD,20));
        lblincome.setBounds(50,150,150,20);
        add(lblincome);

        String valincome[] = {"Null","below 2.5 lakh","between 2.5 - 5 lakh","between 5 - 10 lakh ","above 10 lakh"};
        cbincome =new JComboBox(valincome);
        cbincome.setBackground(Color.WHITE);
        cbincome.setBounds(250,150,250,20);
        add(cbincome);

        lblEQ = new JLabel("High Qualification:");
        lblEQ.setFont(new Font("raleway",Font.BOLD,20));
        lblEQ.setBounds(50,180,250,20);
        add(lblEQ);


        String valHQ[] = {"HighSchool","Intermediate","Diploma","BPharma","Graduation","Post-Graduation","Phd."};
        cbEQ =new JComboBox(valHQ);
        cbEQ.setBackground(Color.WHITE);
        cbEQ.setBounds(250,180,250,20);
        add(cbEQ);

        lblOccupation = new JLabel("Occupation :");
        lblOccupation.setFont(new Font("raleway",Font.BOLD,20));
        lblOccupation.setBounds(50,210,200,20);
        add(lblOccupation);


        String valoccupation[] = {"Salaried","SelfEmployeed","Business","Student","Others"};
        cboccupation =new JComboBox(valoccupation);
        cboccupation.setBackground(Color.WHITE);
        cboccupation.setBounds(250,210,250,20);
        add(cboccupation);

        lblpan = new JLabel("PAN Number :");
        lblpan.setFont(new Font("raleway",Font.BOLD,20));
        lblpan.setBounds(50,240,150,20);
        add(lblpan);

        tfpan = new JTextField();
        tfpan.setBounds(250,240,250,20);
        tfpan.setFont(new Font("Arial",Font.PLAIN,15));
        add(tfpan);



        lblaadhar = new JLabel("Aadhar Number :");
        lblaadhar.setFont(new Font("raleway",Font.BOLD,20));
        lblaadhar.setBounds(50,270,170,20);
        add(lblaadhar);

        tfaadhar = new JTextField();
        tfaadhar.setBounds(250,270,250,20);
        tfaadhar.setFont(new Font("Arial",Font.PLAIN,15));
        add(tfaadhar);


        lblSC = new JLabel("Senior Citizen :");
        lblSC.setFont(new Font("raleway",Font.BOLD,20));
        lblSC.setBounds(50,330,150,20);
        add(lblSC);

         scyes = new JRadioButton("Yes");
        scyes.setBounds(250,330,100,20);
        scyes.setBackground(Color.WHITE);
        add(scyes);

        scno = new JRadioButton("No");
        scno.setBounds(350,330,100,20);
        scno.setBackground(Color.WHITE);
        add(scno);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(scyes);
        gendergroup.add(scno);


        lblEA = new JLabel("Existing Account:");
        lblEA.setFont(new Font("raleway",Font.BOLD,20));
        lblEA.setBounds(50,360,180,20);
        add(lblEA);


        eayes = new JRadioButton("Yes");
        eayes.setBounds(250,360,100,20);
        eayes.setBackground(Color.WHITE);
        add(eayes);

        eano = new JRadioButton("No");
        eano.setBounds(350,360,100,20);
        eano.setBackground(Color.WHITE);
        add(eano);

        ButtonGroup EAgroup = new ButtonGroup();
        EAgroup.add(eayes);
        EAgroup.add(eano);

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

    }    public static void main(String[] args) {
        new signupTwo("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String sreligion = (String) cbreligion.getSelectedItem();
        String Scategory = (String) cbcategory.getSelectedItem();
        String Sincome = (String) cbincome.getSelectedItem();
        String Seducation = (String) cbEQ.getSelectedItem();
        String Soccupation = (String) cboccupation.getSelectedItem();
        String SeniorCitizen = null;
        if (scyes.isSelected()){
            SeniorCitizen = "yes";
        }else if (scno.isSelected()){
            SeniorCitizen ="No";
        }

        String SExistAccount = null;
        if (eayes.isSelected()){
             SExistAccount= "yes";
        }else if (eano.isSelected()){
            SExistAccount ="No";
        }

        String Span = tfpan.getText();
        String Saadhar = tfaadhar.getText();

        try {
            if (sreligion.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is required");
            } else {
                Conn c = new Conn();
                String query = "insert into signuptwo values ( '" + formno+ "','" +sreligion+"','" +Scategory+ "','" +Sincome+
                "','" +Seducation+ "','" +Soccupation+ "','" +SeniorCitizen +"','" +SExistAccount+ "','" +Span+ "','" + Saadhar+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new signUpthree(formno).setVisible(true);
            }
        }catch (Exception ea){
            System.out.println(ea);
        }



        if (e.getSource()==next){
             setVisible(false);
              new signUpthree(formno).setVisible(true);
        }else {
            new signupOne("");
        }
    }
}
