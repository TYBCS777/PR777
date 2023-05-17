import java.util.*;
interface operation{
public int square();
}
class number implements operation{
    int num;
    number(int num){
    this.num = num;
}
public int square(){
    return (num * num);
}
}
public class bba{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int num = sc.nextInt();
number n1 = new number(num);
System.out.println("Square of " + num + " is " + n1.square());
}
}