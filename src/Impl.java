import java.util.List;

public class Impl {
    public static void main(String[] args) {
        ElectronicListService electronicListService = new ElectronicListService();

        System.out.println(electronicListService.addElectronicItemsToList("TV,Computer,Refrigerator,TV"));
        List<String> itemList = electronicListService.addElectronicItemsToList("TV,Computer,Refrigerator,TV");

        System.out.println(electronicListService.searchElectronicItemInList(itemList, "Computer"));

        System.out.println(electronicListService.removeElectronicsItemFromList(itemList, "Computer"));
    }
}
