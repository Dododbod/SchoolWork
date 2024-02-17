package LAB2;
import java.util.Scanner;
public class Scholarship2 
{
    public static void main(String[] args) 
    {
        getInfo();
    }

    public static void getInfo()
    {
        double gpa = 0;
        int exActivites = 0;
        int serActivities = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("__WELCOME__");
        System.out.print("ENTER GPA: ");
        boolean isRunning = true;
        
        do {
            System.out.print("ENTER GPA: ");
            if (in.hasNextDouble()) {
                gpa = in.nextDouble();
                if (gpa > 0 && gpa <= 4.0) {
                    isRunning = false; 
                } else {
                    System.out.println("ENTER VALID GPA (between 0 and 4.0)");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid GPA.");
                in.next();
            }

        } while (isRunning);

        isRunning = true;
        do {
            System.out.print("ENTER # OF EC ACTIVITIES: ");
            if (in.hasNextInt()) {
                exActivites = in.nextInt();
                if (exActivites >= 0) {
                    isRunning = false; 
                } else {
                    System.out.println("ENTER VALID EC (>= 0)");
                }
            } else {
                System.out.println("Invalid input.");
                in.next();
            }

        } while (isRunning);

        isRunning = true;
        do {
            System.out.print("ENTER # OF SERVICE ACTIVITIES: ");
            if (in.hasNextInt()) {
                serActivities = in.nextInt();
                if (serActivities >= 0) {
                    isRunning = false; 
                } else {
                    System.out.println("ENTER VALID EC (>= 0)");
                }
            } else {
                System.out.println("Invalid input.");
                in.next();
            }

        } while (isRunning);

        System.out.println();
        System.out.println("THANKYOU");
        if(gpa >= 3.8 && exActivites >= 1 && serActivities >= 1)
        {
            System.out.println("SCHOLARSHIP CANDIDATE");
        }
        else if((gpa >= 3.4 && gpa <= 3.8) &&  (exActivites + serActivities) == 3)
        {
            System.out.println("SCHOLARSHIP CANDIDATE");
        }
        else if((gpa >= 3.0 && gpa <= 3.4) && exActivites == 2 && serActivities == 3)
        {
            System.out.println("SCHOLARSHIP CANDIDATE");
        }
        else
        {
            System.out.println("NOT A CANDIDATE");
        }
    }
}
