package mainoop1;

import java.util.LinkedList;

class Demo01 {

    public void pintLinkedlist() {
        LinkedList<String> ll = new LinkedList<String>();

        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");

        System.out.println(ll);

        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}

public class Abstraction1 {
    public static void main(String[] args) {

        Demo01 d1 = new Demo01();

        d1.pintLinkedlist();

    }
}
