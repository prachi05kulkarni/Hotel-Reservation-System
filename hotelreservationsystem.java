package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10;
    JTextField t1,t2,t3;
    JRadioButton male,female;
    JComboBox roomtype,foodtype,day,month,year,roomsavailable;
    JTextArea ta1;
    JCheckBox terms;
    JButton submit;
    JLabel msg;
    JTextArea screen;

    MyFrame()
    {
        setTitle("Hotel Reservation Form");
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c= getContentPane();
        c.setLayout(null);
        label1=new JLabel("Name");
        label1.setBounds(20,50,100,20);
        c.add(label1);

        t1=new JTextField();
        t1.setBounds(130,50,100,20);
        c.add(t1);

        label2=new JLabel("Contact Number");
        label2.setBounds(20,100,100,20);
        c.add(label2);

        t2=new JTextField();
        t2.setBounds(130,100,100,20);
        c.add(t2);
        label3=new JLabel("Gender");
        label3.setBounds(20,150,100,20);
        c.add(label3);

        male=new JRadioButton("Male");
        female =new JRadioButton("Female");
        male.setBounds(130,150,80,20);
        female.setBounds(220,150,80,20);
        c.add(male);
        c.add(female);

        ButtonGroup gen=new ButtonGroup();
        gen.add(male);
        gen.add(female);

        label4=new JLabel("Room Types ");
        label4.setBounds(20,200,100,20);
        c.add(label4);

        String roomtype[] ={"Room Type","Single Dulux Room:2000/-","Single Luxury Room:4000/-","Double Dulux Room:6000/-","Double Luxury Room:8000"};
        JComboBox rb=new JComboBox(roomtype);
        rb.setBounds(130, 200,180,20);
        c.add(rb);

        label5=new JLabel("Number of Room");
        label5.setBounds(20,250,100,20);
        c.add(label5);

        String  foodtype[] ={"Number of rooms","1","2","3","4","5"};
        JComboBox fb=new JComboBox(foodtype);
        fb.setBounds(150, 250,120,20);
        c.add(fb);

        label6=new JLabel("Checkin");
        label6.setBounds(20,300,100,20);
        c.add(label6);

        String  day[] ={"date","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        JComboBox dy=new JComboBox(day);
        dy.setBounds(150, 300,90,20);
        c.add(dy);
        String  month[] ={"month","January","Febury","March","April","May","June","July","August","September","Octomber","November","December",};
        JComboBox my=new JComboBox(month);
        my.setBounds(300, 300,90,20);
        c.add(my);
        String  year[] ={"year","2019","2020","2021","2022","2023","2024"};
        JComboBox yy=new JComboBox(year);
        yy.setBounds(450, 300,90,20);
        c.add(yy);

        label7=new JLabel("Checkout");
        label7.setBounds(20,350,100,20);
        c.add(label7);

        String  day1[] ={"date","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        JComboBox dy1=new JComboBox(day);
        dy1.setBounds(150, 350,90,20);
        c.add(dy1);
        String  month1[] ={"month","January","Febury","March","April","May","June","July","August","September","Octomber","November","December",};
        JComboBox my1=new JComboBox(month);
        my1.setBounds(300, 350,90,20);
        c.add(my1);
        String  year1[] ={"year","2019","2020","2021","2022","2023","2024"};
        JComboBox yy1=new JComboBox(year);
        yy1.setBounds(450, 350,90,20);
        c.add(yy1);

        label8=new JLabel("Room Availibility ");
        label8.setBounds(20,400,100,20);
        c.add(label8);

        String roomavailable[] ={"Number of vacant room","Single Dulux Room:05","Single Luxury Room:10","Double Dulux Room:13","Double Luxury Room:15"};
        JComboBox rv=new JComboBox(roomavailable);
        rv.setBounds(150, 400,150,20);
        c.add(rv);

        label9=new JLabel("Payment");
        label9.setBounds(20,450,100,20);
        c.add(label9);

        t3=new JTextField("8000");
        t3.setBounds(100,450,100,20);
        c.add(t3);

        terms =new JCheckBox(" I Accept all the terms and conditions");
        terms.setBounds(20,500,250,20);
        c.add(terms);

        submit  = new JButton("Submit");
        submit.setBounds(20,550,100,20);
        c.add(submit);
        submit.addActionListener(this);

        screen = new JTextArea();
        screen.setBounds(350,50,300,200);
        c.add(screen);

        msg = new JLabel();
        msg.setBounds(400,550,250,20);
        c.add(msg);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(terms.isSelected()){
            msg.setText("Room Booked Sucessfully!!");
            String name=t1.getText();
            String contactnumber=t2.getText();
            String gender="female";
            if(male.isSelected()){
                gender="male";
            }
            String Checkin=day.getSelectedItem()+""+month.getSelectedItem()+""+year.getSelectedItem();
            String Checkout=day.getSelectedItem()+""+month.getSelectedItem()+""+year.getSelectedItem();
            screen.setText("Name : "+name+"\n"+"contactnumber"+contactnumber+"\n"+"gender : "+gender+"\n"+"Checkin : "+Checkin+"\n"+"Checkout : "+Checkout+"\n");
        }
        else
        {
            msg.setText("Accept terms and Conditions to submit...");
            //screen.setText("");
        }
    }
    public static void main(String[] args) {
        MyFrame m=new MyFrame();
        JFrame f=new JFrame();
        f.add(m);
        f.setSize(400,400);
        f.setVisible(true);
    }
}
class ReservationForm<rtype> {
    public static void main(String[] args){
        MyFrame frame=new MyFrame();
    }
}

          
