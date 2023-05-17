import java.io.*;
class CovidException extends Exception{
public CovidException(String msg){
System.out.println(msg);
}
}
class Patient{
String name;
int age;
double level,hrct;
public Patient(String name,int age,double level,double hrct){
this.name=name;
this.age=age;
this.level=level;
this.hrct=hrct;
}
public static void main(String[] args)throws IOException{
String name;
int age;
double level,hrct;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter name: ");
name=br.readLine();
System.out.println("Enter the age: ");
age=Integer.parseInt(br.readLine());
System.out.println("Oxygen level: ");
level=Double.parseDouble(br.readLine());
System.out.println("HRCT report: ");
hrct=Double.parseDouble(br.readLine());
Patient ob=new Patient(name,age,level,hrct);
try{
if(ob.level<95 && ob.hrct>10)
throw new CovidException("Patient is Covid Positive and needs to be hospitalized");
else
System.out.println("Patient Info: \n"+"Name: "+ob.name+"\nAge: "+ob.age+"\nHRCT report: "+ob.hrct+"\nOxygen level:"+ob.level);
}
catch(CovidException e){
}
}
}