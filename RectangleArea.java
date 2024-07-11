import java.util.*;

class RectangleArea 
{
    public static void main(String args []) 
{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter the width of the rectangle: ");
        int width = sc.nextInt();

        int area = length * width;

        System.out.println("The area of the rectangle is: " + area);
    }
}