import java.util.Scanner; // Import Scanner class from java.util package

    class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt(); // Read the first number from the user

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt(); // Read the second number from the user

        int sum = num1 + num2; // Calculate the sum

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        sc.close(); // Close the Scanner object
    }
}
