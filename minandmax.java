
public class minandmax {

	public static void main(String[] args) {1
		int[] array = {14, 25, 36, 472, 191, 85, 654, 27, 938};

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

	}

}
