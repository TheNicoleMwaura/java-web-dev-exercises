package exercises;
import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        Double length = input.nextDouble();

        System.out.println("Enter the width of the rectangle: ");
        Double width = input.nextDouble();

        Double area = length * width;
        System.out.println(" The Area of the rectangle is " +area +"cm^2");

    }


}
