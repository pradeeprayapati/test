import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class AppDemo
{
JTextField name,fname,dob,email;
JTextArea addr;
JButton submit;
public AppDemo()
{
JFrame jfrm=new JFrame("App Demo");
jfrm.setLayout(null);

jfrm.setSize(300,300);
jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JLabel j1=new JLabel("Name:");
j1.setBounds(75,50,100,30);
jfrm.add(j1);
jfrm.setVisible(true);
name=new JTextField(15);
name.setBounds(125,50,100,30);
jfrm.add(name);
jfrm.setVisible(true);

JLabel j2=new JLabel("FName:");
j2.setBounds(75,100,100,30);
jfrm.add(j2);
jfrm.setVisible(true);
fname=new JTextField(15);
fname.setBounds(125,100,100,30);
jfrm.add(fname);
jfrm.setVisible(true);
JLabel j3=new JLabel("Gender:");
j3.setBounds(75,150,100,30);
jfrm.add(j3);
jfrm.setVisible(true);
JRadioButton r1=new JRadioButton("Male");
JRadioButton r2=new JRadioButton("Female");
ButtonGroup bg=new ButtonGroup();
r1.setBounds(175,150,100,30);
r2.setBounds(275,150,100,30);
bg.add(r1);
bg.add(r2);
jfrm.add(r1);
jfrm.add(r2);
jfrm.setVisible(true);
JLabel j4=new JLabel("DOB:");
j4.setBounds(75,200,100,30);
jfrm.add(j4);
jfrm.setVisible(true);
dob=new JTextField(15);
dob.setBounds(125,200,100,30);
jfrm.add(dob);
jfrm.setVisible(true);
JLabel j5=new JLabel("Address:");
j5.setBounds(75,250,100,30);
jfrm.add(j5);
jfrm.setVisible(true);
addr=new JTextArea(2,10);
addr.setBounds(125,250,100,30);
jfrm.add(addr);
jfrm.setVisible(true);
submit=new JButton("Submit");
submit.setBounds(75,300,100,30);
jfrm.add(submit);
jfrm.setVisible(true);
}
public static void main(String args[])
{
AppDemo a=new AppDemo();
}
}

