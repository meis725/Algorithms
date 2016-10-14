/**
 * Created by Song on 10/13/16.
 */
public class insertionSrt {

    public static void main (String[] args) {

        String[] temp = new String[]{"E", "X", "A", "M", "P", "L", "E"};
        insertionSort(temp);

        //for each print
        for (String i:temp) {
            System.out.print(i);
        }
    }

    //insertion sort from the book.
    public static void insertionSort (String[] temp) {
        for (int i = 1; i < temp.length; i++) {
            String v = temp[i];
            int j = i - 1;
            while ((j >= 0 ) && temp[j].compareTo(v) > 0){
                temp[j + 1] = temp[j];
                j--;
                temp[j + 1] = v;
            }
        }

    }

}
