
class areaoftriangle {

	
	public static double base, height;

    public static void main(String[] args) {
        base = 5.0;
        height = 6.0;
        System.out.println("Area of Triangle is: " + calculateArea());
    }

    public static double calculateArea() {
        return 0.5 * base * height;
    }
}