package Collections;

import Core.Book;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        // Heterogeneous list
        List<Object> list1 = new ArrayList<>();
        list1.add("Neo");     // String
        list1.add(13);        // Integer
        list1.add(true);      // Boolean
        list1.add(12.55);     // Double

        System.out.println(list1);

        list1.remove(1); // removes 13
        System.out.println(list1);

        // Generic String list
        List<String> list2 = new ArrayList<>();
        list2.add("Neo");
        System.out.println(list2);

        // Book list
        List<Book> bookList = new ArrayList<>();
        Book b1 = new Book(100, "Java", "James Gosling");
        bookList.add(b1);
        bookList.add(new Book(101, "Tell Me Your Dreams", "Sidney Sheldon"));

        System.out.println(bookList);

        // Iterator for list1
        Iterator<Object> itr = list1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Iterator for bookList
        Iterator<Book> bItr = bookList.iterator();
        while (bItr.hasNext()) {
            System.out.println(bItr.next());
        }
    }
}
