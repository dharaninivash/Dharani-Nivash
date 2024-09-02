import java.util.Scanner;

 class WeightOnOtherPlanets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight on Earth (in lbs): ");
        double earthWeight = scanner.nextDouble();

        System.out.println("Choose a planet:");
        System.out.println("1. Mercury");
        System.out.println("2. Venus");
        System.out.println("3. Mars");
        System.out.println("4. Jupiter");
        System.out.println("5. Saturn");
        System.out.println("6. Uranus");
        System.out.println("7. Neptune");

        int choice = scanner.nextInt();

        double[] conversionFactors = {0.38, 0.91, 0.38, 2.36, 0.92, 0.89, 1.13};

        double weightOnPlanet = earthWeight * conversionFactors[choice - 1];

        String[] planetNames = {"Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.printf("Your weight on %s is %.2f lbs.%n", planetNames[choice - 1], weightOnPlanet);
    }
}