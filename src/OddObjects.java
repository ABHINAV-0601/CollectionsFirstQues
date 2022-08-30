import java.util.ArrayList;

public class OddObjects {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);
        integerArrayList.add(6);
        integerArrayList.add(7);
        integerArrayList.add(8);
        integerArrayList.add(9);
        integerArrayList.add(10);

        int count = 0;
        for(Integer element:integerArrayList){
            if(element % 2 == 0){
                count++;
            }
        }
        System.out.println("Number of odd objects = "+ (integerArrayList.size()-count));

    }
}
