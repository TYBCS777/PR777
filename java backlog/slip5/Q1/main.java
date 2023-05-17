import java.io.*;
class Continent{
String con;
BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
void con_input()throws IOException{
System.out.println("Enter Continent Name: ");
con = r.readLine();
}
}
class Country extends Continent{
String cou;
void cou_input() throws IOException{
System.out.println("Enter Country Name: ");
cou = r.readLine();
}
}
class State extends Country{
String sta;
void sta_input() throws IOException{
System.out.println("Enter State Name: ");
sta = r.readLine();
}
}
class main extends State{
String pla;
void pla_input()throws IOException{
System.out.println("Enter Place Name : ");
pla = r.readLine();
}
public static void main( String argsp[] )throws IOException{
main s = new main();
s.con_input();
s.cou_input();
s.sta_input();
s.pla_input();
System.out.println("\n\nContinent: "+s.con);
System.out.println("Country: "+s.cou);
System.out.println("State: "+s.sta);
System.out.println("Place :" + s.pla);
}
}