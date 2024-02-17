package LAB2;
import java.util.Scanner;
public class problemOne
{
    public static void main(String[] args) 
    {
        programLoop();
    }

    public static void programLoop() {
        Scanner in = new Scanner(System.in);
        System.out.println("__WELCOME__");
        System.out.print("ENTER A NUMBER (OR TYPE QUIT): ");

        while (in.hasNext()) {
            if (in.hasNextInt()) {
                int tempVar = in.nextInt();

                if ((tempVar % 2) == 0) {
                    System.out.println(tempVar + " IS EVEN");
                } else {
                    System.out.println(tempVar + " IS ODD");
                }
            } else {
                String userInput = in.next();
                if (userInput.equalsIgnoreCase("QUIT")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number or type QUIT to exit.");
                }
            }

            System.out.print("ENTER A NUMBER (OR TYPE QUIT): ");
        }

        // Close the scanner when done
        in.close();
        System.out.println("Exited the loop. Program finished.");
    }
}