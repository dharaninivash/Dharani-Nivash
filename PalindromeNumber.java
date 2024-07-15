import java.util.*;

class PalindromeNumber
{
    public static void main(String args []) 
{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversed = 0, original = num;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println(original == reversed ? original + " is a palindrome number." : original + " is not a palindrome number.");
    }
}