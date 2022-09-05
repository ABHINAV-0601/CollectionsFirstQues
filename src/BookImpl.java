import java.util.*;

public class BookImpl {
    public static void main(String[] args) {
        Book book1 = new Book("Five Point Someone","Chetan Bhagat",12547874558L,250.0);
        Book book2 = new Book("Five Point Someone","Arundhati Roy",12547874558L,502.0);
        Book book3 = new Book("Five Point Someone","Kushwant Singh",12547874558L,185.0);
        Book book4 = new Book("Five Point Someone","Acharya Prashant",12547874558L,175.6);
        Book book5 = new Book("Five Point Someone","Vikram Seth",12547874558L,235.0);
        Book book6 = new Book("Five Point Someone","Ruskin Bond",12547874558L,100.0);
        Book book7 = new Book("Five Point Someone","Jhumpa Lahiri",12547874558L,99.5);
        Book book8 = new Book("Five Point Someone","Kiran Desai",12547874558L,452.0);
        Book book9 = new Book("Five Point Someone","Salman Rushdie",12547874558L,375.0);
        Book book10 = new Book("Five Point Someone","Shashi Tharoor",12547874558L,135.4);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);
        bookList.add(book8);
        bookList.add(book9);
        bookList.add(book10);

        for (Book element : bookList){
            System.out.println(element);
        }
        // sorting logic to sort objects on the basis of any value in the element
        /*for (int i = 0; i < bookList.size(); i++) {
            for (int j = 0; j < bookList.size() - 1 - i; j++) {
                if (bookList.get(j).getPrice() > bookList.get(j+1).getPrice()) {
                    Book temp = bookList.get(j);
                    bookList.set(j,bookList.get(j+1));
                    bookList.set(j+1,temp);
                }
            }
        }*/

        /*Collections.sort(bookList);
        bookList.sort(book1);*/

        /*System.out.println();
        System.out.println("after sorting");
        System.out.println();
        for (Book element : bookList){
            System.out.println(element);
        }*/

        Collections.sort(bookList,new Book());
        System.out.println();
        for(Book element : bookList){
            System.out.println(element);
        }
    }
}
