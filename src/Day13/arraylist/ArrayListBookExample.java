package Day13.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBookExample {
    public static void main(String[] args) {

        List<Book> list = new ArrayList<>();

        Book b1 = new Book(101,"let us c","Yashwant","BPB",8);
        Book b2 = new Book(102,"Data communicatioin","forozon","MC",9);
        Book b3 = new Book(103,"OS","Galvin","wiley",10);

        list.add(b1);
        list.add(b2);
        list.add(b3);

        for(Book b: list){
            System.out.println(b.id+" "+b.name+" "+b.publisher+" "+b.author+" "+b.quantity);
        }
    }

}
