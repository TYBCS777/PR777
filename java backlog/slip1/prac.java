import java.io.*;
abstract class Staff{
    protected int id;
    protected String name;
    public Staff(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class prac extends Staff{
    String department;
    public prac(int id,String name,String department){
        super(id,name);
        this.department=department;
    }
void display(){
    System.out.println(id+"\t"+name+"\t"+department);
    
}
public static void main(String[] args)throws Exception{
    int id,n;
    String name,department;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter no of office staff");
    n=Integer.parseInt(br.readLine());
    prac[] Of=new prac[n];
    for(int i=0;i<n;i++){
    System.out.println("Enter id");
    id=Integer.parseInt(br.readLine());
    System.out.println("Enter name");
    name=br.readLine();
    System.out.println("Enter dep");
    department=br.readLine();
    Of[i]=new prac(id, name,department);
    }
    System.out.println("ID\tName\tDep");
    for(int i=0;i<n;i++){
        Of[i].display();
    }
}
}