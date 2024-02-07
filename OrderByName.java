package KitapSiralayici;

import java.util.Comparator;

public class OrderByName implements Comparator<Book> {


    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthorName().compareTo(o2.getAuthorName());
    }
    
}
