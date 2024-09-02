import java.util.Scanner;

public class MountvilleUniversityAdmission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's GPA: ");
        double gpa = scanner.nextDouble();

        System.out.print("Enter student's SAT score: ");
        int satScore = scanner.nextInt();

        System.out.print("Was the student a valedictorian or salutatorian? (yes/no): ");
        String honorStatus = scanner.next();

        System.out.print("What was the student's school size? ");
        int schoolSize = scanner.nextInt();

        boolean isAccepted = isAccepted(gpa, satScore, honorStatus, schoolSize);

        if (isAccepted) {
            System.out.println("The student is accepted into Mountville University.");
        } else {
            System.out.println("The student is not accepted into Mountville University.");
        }
    }

    public static boolean isAccepted(double gpa, int satScore, String honorStatus, int schoolSize) {
        if ((honorStatus.equalsIgnoreCase("yes")) && (schoolSize >= 1400)) {
            return true;
        }

        if ((gpa >= 4.0) && (satScore >= 1100)) {
            return true;
        }

        if ((gpa >= 3.5) && (satScore >= 1300)) {
            return true;
        }

        if ((gpa >= 3.0) && (satScore >= 1500)) {
            return true;
        }

        return false;
    }
}