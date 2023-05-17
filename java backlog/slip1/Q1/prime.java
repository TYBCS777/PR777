import java.util.*;
public class prime{
public static void main (String[] args){
    int[] array = new int [5];
    
    int l=args.length; 

    for(int i=0; i<array.length; i++){
        boolean isPrime = true;


        for (int j=2; j<i; j++){

            if(i%j==0){
                isPrime = false;
                break;
            }
        }
     

        if(isPrime)

            System.out.println(i + " are the prime numbers in the array ");
    }
}
}