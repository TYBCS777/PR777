import java.awt.*;
public class border extends Frame{
	Button b1,b2,b3,b4;
	TextField t1;
    Frame f;
	public border(){
		f=new Frame();
		b1=new Button("B1");
		b2=new Button("B2");
		b3=new Button("B3");
		b4=new Button("B4");
		t1=new TextField(30);
		f.add("North",b1);
		f.add("South",b2);
		f.add("East",b3);
		f.add("West",b4);
		f.add("Center",t1);
        f.setSize(500,500);
    	f.setVisible(true);
		f.setLayout(new BorderLayout());
	}
public static void main(String args[]){
   new border();         
  }
}