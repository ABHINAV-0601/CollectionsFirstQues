import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ElectronicListService {
    public static List<String> addElectronicItemsToList(String electronicItems){
        List<String> items = new ArrayList<>();

        String[] inputs = electronicItems.split(",");

        for (int i = 0; i < inputs.length; i++) {
            if(inputs[i].equals("Refrigerator")){
                items.add("Fridge");
            }
            else{
                items.add(inputs[i]);
            }
        }
        return items;
    }

    public static int searchElectronicItemInList(List<String> itemList,String searchItem){
        return itemList.indexOf(searchItem);
    }

    public  boolean removeElectronicsItemFromList(List<String> itemList,String removeItem){
        boolean flag = false;
        Iterator<String> stringIterator = itemList.iterator();
        while(stringIterator.hasNext()){
            if(stringIterator.next().equals("Computer")){
                stringIterator.remove();
                flag = true;
            }
        }
        return flag;
    }
}
