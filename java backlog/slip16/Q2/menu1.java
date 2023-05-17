import java.awt.*;
import javax.swing.*;

class myframe extends JFrame{
    JMenuBar mb1;
    JMenu m1,m2,m3,m11;
    JMenuItem m12,m14,m13,m15;
  myframe(){
    mb1=new JMenuBar();
    m1=new JMenu("File");
    m2=new JMenu("Edit");
    m3=new JMenu("View");
    m11=new JMenu("New ctl+n");
    m12=new JMenuItem("Open");
    m13=new JMenuItem("Save");
    m14=new JMenuItem("Exit");
    m15=new JMenuItem("Show About");

    add(mb1);
    mb1.add(m1);
    mb1.add(m2);
    mb1.add(m3);
    m1.add(m11);
    m1.add(m12);
    m1.add(m13);
    m1.addSeparator();
    m1.add(m15);
    m1.addSeparator();
    m1.add(m14);

    setJMenuBar(mb1);
    setTitle("Menu Bar");
    setSize(500,500);
    setVisible(true);
  }
}
class menu1{
   public static void main(String args[]){
       new myframe();
     }
 }
