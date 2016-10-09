import java.util.ArrayList;
import java.util.List;

/**
 * Created by Song on 10/9/16.
 */
public class BfStringMatching {

    public static int counter = 0;
    public static void main (String[] args) {
        List<String> x = new ArrayList<>();

        //initialize the text.
        for (int i = 0; i < 1000; i++){
            x.add(Integer.toString(0));
        }
        //your patterns
        String[] item = new String[]{"0","1","0","1","0"};
        BfStringMatching(x, item);
        System.out.print(counter);
    }

    //brute force String search algorithm from the book
    public static int BfStringMatching (List<String> x, String[] item) {
        for (int i = 0; i < x.size() - item.length+1; i++){
            int j = 0;
            while (j < item.length && item[j].equals(x.get(i+j))){
                counter++; //add to number of comparisons.
                j++;
            }
            counter++; //even it is not equal, still done comparisons.
            if (j == item.length) return i;
        }
        return -1;
    }
}
