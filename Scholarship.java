package LAB2;
import java.util.Scanner;
public class Scholarship 
{
    public static void main(String[] args) 
    {
        getInfo();
    }

    public static void getInfo()
    {
        double gpa;
        int exActivites;
        int serActivities;
        Scanner in = new Scanner(System.in);
        System.out.println("__WELCOME__");
        System.out.print("ENTER GPA: ");
        gpa = in.nextDouble();
        System.out.print("ENTER # OF EC ACTIVITIES: ");
        exActivites = in.nextInt();
        System.out.print("ENTER # OF SERVICE ACTIVITIES: ");
        serActivities = in.nextInt();
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
