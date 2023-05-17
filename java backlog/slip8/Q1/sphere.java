import java.util.*;
class sphere {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius");
        int r = sc.nextInt();
        double surfacearea , volume ;

        surfacearea = 4 * 3.14 * (r * r);
        volume = ((double)4 / 3) * 3.14 * (r * r * r);
        
        System.out.println("Surface area of sphere ="+ surfacearea);
        
        System.out.println("volume of sphere =" + volume);
    }
}