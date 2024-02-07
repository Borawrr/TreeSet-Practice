package KitapSiralayici;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        /*
        Book isminde bir sınıf tasarlayınız. Bu sınıf Comparable interface'den kalıtım alıp "compareTo" metodunu override ediniz.  
        Bu metodun içinde kitabı A'dan Z'ye isme göre sıralayan kodu yazınız.
        Bu sınıftan 5 tane nesne oluşturun ve nesneleri Set tipinde bir yapısında saklayınız. 
        Sonra ikinci kez Set tipinden bir veri yapısı kullanın ve kitapları sayfa sayısına göre sıralamasını sağlayınız.
        Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi, yayın tarihi değişkenlerinden oluşmaktadır.

        */

        TreeSet<Book> bookSet = new TreeSet<>(new OrderByName());
        TreeSet<Book> bookSet2 = new TreeSet<>(new OrderByPageNum());
    
        Book LordOfTheRings = new Book("Yüzüklerin Efendisi", "29.07.1954", "J.R.R. Tolkien", 1026);
        Book SongOfIceAndFire = new Book("Buz ve Ateşin Şarkısı", "01.08.1994", "George R.R. Martin", 4244);
        Book PercyJackson = new Book("Percy Jackson ve Olimposlular", "28.06.2005", "Rick Riordian", 11000);
        Book HarryPotter = new Book("Harry Potter", "26.06.1997", "J.K. Rowling", 3407);
        Book Dune = new Book("Dune", "01.08.1965", "Frank Herbert", 896);
        
        bookSet.add(LordOfTheRings);
        bookSet.add(SongOfIceAndFire);
        bookSet.add(PercyJackson);
        bookSet.add(HarryPotter);
        bookSet.add(Dune);
        
        //Yazar isimlerine göre sıralayan for each döngüsü
        System.out.println("Kitapların alfabetik olarak sıralanmış hali :");
        for (Book book : bookSet) {
            
            System.out.println(book.getBookName());

        }
        
        bookSet2.add(LordOfTheRings);
        bookSet2.add(SongOfIceAndFire);
        bookSet2.add(PercyJackson);
        bookSet2.add(HarryPotter);
        bookSet2.add(Dune);

        System.out.println("-------------------");
        System.out.println("Kitapların toplam sayfa sayısına göre küçükten büyüğe sıralanmış hali :");
        for (Book book : bookSet2) {
            
            System.out.println(book.getBookName());
        }
    }
}
