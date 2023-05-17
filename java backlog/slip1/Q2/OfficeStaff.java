import java.io.*;
import java.util.*;
abstract class Staff{
protected int id;
protected String name;

public Staff(int id,String name){
this.id=id;
this.name=name;
}
}

class OfficeStaff extends Staff{
String department;
public OfficeStaff(String department,int id,String name){
super(id,name);
this.department=department;
}

void display(){
System.out.println(id+"\t"+name+"\t"+department);
}

public static void main(String[] args)throws IOException{
int i,n,id;
String name;
String department;
System.out.println("Enter the number of employees: ");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
OfficeStaff[] ob=new OfficeStaff[n];
for(i=0;i<n;i++){
System.out.println("Enter the id: ");
id=Integer.parseInt(br.readLine());
System.out.println("Enter the name: ");
name=br.readLine();
System.out.println("Enter the department: ");
department=br.readLine();
ob[i]=new OfficeStaff(department,id,name);
}
System.out.println("ID\tName\tDepartment");
for(i=0;i<n;i++){
ob[i].display();
}
}
}