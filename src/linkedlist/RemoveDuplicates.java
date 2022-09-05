package linkedlist;

public class RemoveDuplicates {
    private Node head;

    public RemoveDuplicates() {
        this.size = 0;
    }

    private Node tail;
    private int size;



    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.print("END");
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;

    }
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }
    public void duplicates(){
        Node node = head;
        while (node.next != null){
            if(node.next != null && node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }
            else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;

    }

    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        removeDuplicates.insertLast(1);
        removeDuplicates.insertLast(1);
        removeDuplicates.insertLast(2);
        removeDuplicates.insertLast(3);
        removeDuplicates.insertLast(3);
        removeDuplicates.display();
        removeDuplicates.duplicates();
        System.out.println();
        removeDuplicates.display();

    }
}
