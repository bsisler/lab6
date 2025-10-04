public class ThingList {
    private Node head;

    private class Node {
        Thing data;
        Node next;
        Node(Thing t) {
            data = t;
        }
    }

    public void addThing(Thing t) {
        Node n = new Node(t);
        n.next = head;
        head = n;
    }

    public void moveAll(Random rand) {
        Node curr = head;
        while (curr != null) {
            curr.data.maybeTurn(rand);
            curr.data.step();
            curr = curr.next;
        }
    }

    public void printAll() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
        System.out.println("done");
        System.out.flush();
    }
}

