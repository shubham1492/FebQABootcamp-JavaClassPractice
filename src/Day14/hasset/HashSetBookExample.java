package Day14.hasset;

import java.util.HashSet;

public class HashSetBookExample {
    public static void main(String[] args) {

        Book b1 = new Book(101,"let us c","Yashwant","BPB",8);
        Book b2 = new Book(102,"Data communicatioin","forozon","MC",9);
        Book b3 = new Book(103,"OS","Galvin","wiley",10);


        HashSet<Book> set = new HashSet<>();
        set.add(b1);
        set.add(b2);
        set.add(b3);

        for(Book b: set){
            System.out.println(b.id+" "+b.name+" "+b.publisher+" "+b.author+" "+b.quantity);
        }


    }
}
