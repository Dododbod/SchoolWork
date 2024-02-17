package LAB3.Problem4;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Problem4 
{
    public static void main(String[] args) 
    {
        Problem4 a = new Problem4();
        ArrayList<Double> newArr = a.userInput();
        System.out.println("");
        System.out.println("UNSORTED");
        System.out.println("");
        a.printArr(newArr);
        System.out.println("");
        System.out.println("SORTED");
        System.out.println("");
        a.sortArr(newArr);
        System.out.println("");
        double average = a.average(newArr);
        System.out.println("AVERAGE: " + average);
        System.out.println("");
        ArrayList<Double> averageDist = a.averageDist(newArr, average);
        a.printArr(averageDist);
        //CHANGE TARGET TO GET DIFFERENT BINARY SEARCH TARGET 
        double target = 1.1;
        int result = a.binarySearch(newArr, target);
        if(result == -1)
        {
            System.out.println("");
            System.out.println("ELEMENT NOT FOUND");
        }
        else
        {
            System.out.println("");
            System.out.println("ELEMENT FOUND AT INDEX " + result);
        }
        System.out.println("");
        ArrayMethods methods = new ArrayMethods();
        System.out.println("LOWEST ELEMENT: " + methods.getMin(newArr));
        System.out.println("");
        System.out.println("ARRAY WITH ELEMENT REMOVED");
        methods.removeMin(newArr);
        a.printArr(newArr);
        System.out.println("");
        /*
        SLIGHTLY CONFUSED ABOUT ADDING CODE TO MAIN TO TEST WHEN I CAN JUST TEST THROUGH USER INPUT?
        */
    }
    
    public ArrayList<Double> userInput()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("___WELCOME___");
        System.out.println("___WELCOME___");
        System.out.println("ENTER 10 DECIMAL VALUES");
        ArrayList<Double> givenArr = new ArrayList<Double>();
        String tempVar = "";
        for(int i = 0; i < 10; i++)
        {
            System.out.print("ENTER VALUE OR QUIT: ");
            tempVar = in.nextLine().trim();
            if(tempVar.equals("QUIT") || tempVar.equals("Quit") || tempVar.equals("quit"))
            {
                break;
            }
            else
            {
                givenArr.add(Double.parseDouble(tempVar));
            }
        }
        return givenArr;
    }

    public void printArr(ArrayList<Double> givenArr)
    {
        System.out.print("[");
        for(int i = 0; i < givenArr.size(); i++)
        {
            if(i == (givenArr.size() - 1))
            {
                System.out.print(givenArr.get(i));
            }
            else
            {
                System.out.print(givenArr.get(i) + ", ");
            }
        }
        System.out.print("]");
        System.out.println("");
    }

    public void sortArr(ArrayList<Double> givenArr)
    {
        Collections.sort(givenArr);
        System.out.print("[");
        for(int i = 0; i < givenArr.size(); i++)
        {
            if(i == (givenArr.size() - 1))
            {
                System.out.print(givenArr.get(i));
            }
            else
            {
                System.out.print(givenArr.get(i) + ", ");
            }
        }
        System.out.print("]");
        System.out.println("");
    }

    public double average(ArrayList<Double> givenArr)
    {
        double total = 0;
        for(int i = 0; i < givenArr.size(); i++)
        {
            total = total + givenArr.get(i);
        }
        total = total / givenArr.size();
        return total;
    }

    public ArrayList<Double> averageDist(ArrayList<Double> givenArr, double average)
    {
        ArrayList<Double> distance = new ArrayList<Double>();
        for(int i = 0; i < givenArr.size(); i++)
        {
            distance.add(givenArr.get(i) - average );
        }
        return distance;
    }

    public static int binarySearch(ArrayList<Double> givenArr, double target)
    {
        int left = 0;
        int right = givenArr.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (givenArr.get(mid).equals(target)) {
                return mid;
            }
            if (givenArr.get(mid) < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
}