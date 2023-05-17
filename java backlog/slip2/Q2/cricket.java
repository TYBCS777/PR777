import java.io.*;
class cricket{
String name;
int innings,notout,totalruns;
double bat_avg;
public cricket(String name,int innings,int notout,int totalruns){
this.name=name;
this.innings=innings;
this.notout=notout;
this.totalruns=totalruns;
}
static void bat_avg(int n,cricket[] a){
for(int i=0;i<n;i++){
  a[i].bat_avg=(a[i].totalruns/a[i].innings);
}
}
static void sort(int n,cricket[] a){
int i,j;
double temp;
String temp1;
int temp2,temp3,temp4;
for(i=0;i<n;i++){
for(j=i+1;j<n;j++){
if(a[i].bat_avg<a[j].bat_avg){
temp=a[i].bat_avg;
a[i].bat_avg=a[j].bat_avg;
a[j].bat_avg=temp;

temp1=a[i].name;
a[i].name=a[j].name;
a[j].name=temp1;

temp2=a[i].innings;
a[i].innings=a[j].innings;
a[j].innings=temp2;

temp3=a[i].notout;
a[i].notout=a[j].notout;
a[j].notout=temp3;

temp4=a[i].totalruns;
a[i].totalruns=a[j].totalruns;
a[j].totalruns=temp4;
}
}
}
}
void display(){
System.out.println(name+"\t"+innings+"\t"+notout+"\t"+totalruns+"\t"+bat_avg);
}
public static void main(String[] args)throws IOException{
int n,i;
String name;
int innings,notout,totalruns;
double bat_avg;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the no of players: ");
n=Integer.parseInt(br.readLine());
cricket[] a=new cricket[n];
for(i=0;i<n;i++){
System.out.println("Enter name: ");
name=br.readLine();
System.out.println("Enter the number of innings: ");
innings=Integer.parseInt(br.readLine());
System.out.println("Enter the number of times not out: ");
notout=Integer.parseInt(br.readLine());
System.out.println("Enter the total runs: ");
totalruns=Integer.parseInt(br.readLine());
a[i]=new cricket(name,innings,notout,totalruns);
}
bat_avg(n,a);
sort(n,a);
System.out.println("Name\tInnings\tNot Out\tTotal runs\tAvgerage");
for(i=0;i<n;i++){
a[i].display();
}
}
}