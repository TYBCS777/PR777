import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class chkdemo2 extends JFrame implements ItemListener{
JComboBox c5;
JLabel l1;
JTextField t1;
JFrame f;
public chkdemo2(){
f=new JFrame("combo box demo");
f.setSize(300,300);
f.setVisible(true);
f.setLayout(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
l1=new JLabel("Selected Item is");
t1=new JTextField(20);
c5=new JComboBox();
c5.addItem("Java");
c5.addItem("Python");
c5.addItem("WT");
c5.addItem("TCS");
c5.setBounds(150,150,75,65);
f.add(c5);
l1.setBounds(150,350,105,85);
f.add(l1);
t1.setBounds(350,350,125,60);
f.add(t1);
c5.addItemListener(this);
}
public void itemStateChanged(ItemEvent e){
  String s=(String)e.getItem();
  t1.setText(s);
}
public static void main(String args[]){
chkdemo2  t=new chkdemo2 ();
}
}