import java.util.function.Consumer;

public class ThingList {
    private Node head;

    private class Node {
        Thing data;
        Node next;
        Node(Thing t) {
            data = t;
        }
    }

    public void add(Thing t) {
        Node n = new Node(t);
        n.next = head;
        head = n;
    }

    public void forAll(Consumer<Thing> action) {
        Node curr = head;
        while (curr != null) {
            action.accept(curr.data);
            curr = curr.next;
        }
    }
}

