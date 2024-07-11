import java.util.*;

class PowerOperations
 {
    public static void main(String args[]) 
{
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");
        float num = sc.nextFloat();

        float square = num * num;
        float cube = num * num * num;
        float fourthPower = num * num * num * num;

        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Fourth Power: " + fourthPower);
    }
}