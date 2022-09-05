package linkedlist;

public class Main {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.insertFirst(3);
        ll.insertFirst(5);
        ll.insertFirst(8);
        ll.insertFirst(6);
        ll.insertLast(56);
        ll.insertLast(34);
        //System.out.println(ll.deleteFirst());

        //ll.insert(100,3);
        ll.display();
        System.out.println();
        //System.out.println(ll.deleteLast());
        //ll.display();
        System.out.println(ll.delete(2));
        ll.display();
        System.out.println();
        ll.insertRec(7,3);
        ll.display();

    }
}
