import java.io.*;
import java.util.*;
class emp{
int id;String name;String dname;double salary;
static int cnt=0;
public emp(){
    
}
public emp(int id,String name,String dname,double salary)throws IOException{
this.id=id;
this.name=name;
this.dname=dname;
this.salary=salary;
cnt++;
}
static int recnt(){
return cnt;
}
public static void main(String[] args)throws IOException{
int i,n;
int id;
String name,dname;
double salary;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of employees: ");
n=Integer.parseInt(br.readLine());
emp[] e=new emp[n];
for(i=0;i<n;i++){
System.out.println("Enter the employee id: ");
id=Integer.parseInt(br.readLine());
System.out.println("Enter employee name: ");
name=br.readLine();
System.out.println("Enter department: ");
dname=br.readLine();
System.out.println("Enter salary: ");
salary=Double.parseDouble(br.readLine());
e[i]=new emp(id,name,dname,salary);
System.out.println("Count "+recnt());
}
for(i=0;i<n;i++)
{
System.out.println("Id:"+e[i].id+"\tName:"+e[i].name+"\tDepartment:"+e[i].dname+"\tSalary:"+e[i].salary);
}
}
}