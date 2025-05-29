import java.util.Scanner;

public class ImprovedSwitchCase {
  public static void main(String[] args) {
    scanner sc = new Scanner(System.in);
    System.out.print("Enter first number : ");
    Int num1 = sc.nextInt();
    System.out.print("Enter second number : ");
    Int num2 = sc.nextInt();
    System.out.print("Enter operation(+, -, *, /) : ");
    Char operation = sc.next().charAt(0);

    Switch(operation);{
  case'+' -> System.out.println("Result : " + (num1 + num2)); 
     case'-' -> System.out.println("Result : " + (num1 - num2));
     case'*' -> System.out.println("Result : " + (num1 * num2));
      case'/' -> {
        if (num2 != 0)
          System.out.println("Result : " + (num1 / num2));
        else
          System.out.println("Division by zero is not allowed.");
      }
      default -> System.out.println("Invalid operation.");
    }
  }
}