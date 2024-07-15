import java.util.*;

 class ArmstrongNumber
 {
    public static void main(String args []) 
{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(), sum = 0, temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        System.out.println(sum == num ? num + " is an Armstrong number." : num + " is not an Armstrong number.");
    }
}