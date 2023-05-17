import java.util.Scanner;
public class BMI{
    public static void main(String[] Strings) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fisrt name:-");
        String fname=sc.nextLine();
        System.out.print("Last name:-");
        String flast=sc.nextLine();

        System.out.print("Input weight in Kg: ");
        double weight = sc.nextDouble();

        System.out.print("Input height in cm: ");
        double inches = sc.nextDouble();

        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.print("Body Mass Index is " + BMI+"\n");
    }
}