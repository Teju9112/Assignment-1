import java.util.Scanner;

public class id {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user ID: ");
        int id = scanner.nextInt();
        if (id == 1234) {
            System.out.println("Name: Jake");
            System.out.println("Age: 25");
        } else {
            System.out.println("User ID not found.");
        }
    }
}
