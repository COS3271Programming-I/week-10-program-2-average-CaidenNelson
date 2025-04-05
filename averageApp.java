import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    static Scanner userinput = new Scanner(System.in);

    static int average(ArrayList list){

        int listAverage =0;
        int loc = 0;
        int listTotal = 0;

        for (int j =0; j < list.size(); j++){
            listTotal = listTotal + (int) list.get(loc);

            loc ++;
        }

        listAverage = listTotal/list.size();

        return listAverage;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        int listLength;

        System.out.println("How many numbers do you want to add to the list? 1-30");
        listLength = userinput.nextInt();

        for ( int i=0; i < listLength; i++){
            System.out.println("what number would you like to add");
            list.add(userinput.nextInt());
        }

        System.out.println(average(list));
    }
}
