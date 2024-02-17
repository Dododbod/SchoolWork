package LAB3.Problem4;
import java.util.ArrayList;
public class ArrayMethods 
{
    public Double getMin(ArrayList<Double> givenArr)
    {
        if (givenArr.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        double minValue = givenArr.get(0);

        for (double value : givenArr) {
            if (value < minValue) {
                minValue = value;
            }
        }

        return minValue;
    }

    public void removeMin(ArrayList<Double> givenArr)
    {
        if (givenArr.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        double minValue = givenArr.get(0);
        int minIndex = 0;
        for (int i = 1; i < givenArr.size(); i++) {
            if (givenArr.get(i) < minValue) {
                minValue = givenArr.get(i);
                minIndex = i;
            }
        }
        givenArr.remove(minIndex);
    }
}
