import java.util.*;

class InchToMeter
 {
    public static void main(String args[])
 {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a value for inch: ");
        int inch = sc.nextInt();

        int meter = (int) (inch * 0.0254);

        System.out.println(inch + " inches is " + meter + " meters");
    }
}