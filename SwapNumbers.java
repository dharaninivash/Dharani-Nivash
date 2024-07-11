class SwapNumbers 
{
  public static void main(String args[])
 {
    int a = 15;
    int b = 45;
    System.out.println("Before Swapping, a=" + a + " and b=" + b);
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("After Swapping, a=" + a + " and b=" + b);
  }
}