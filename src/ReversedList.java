public class LinkedListReversal<E> {

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E value) {
            this.data = value;
            this.next = null;
        }
    }

    private Node<E> head;

    public void add(E value) {
        Node<E> newNode = new Node<>(value);

        if (head == null) {
            head = newNode;
        } else {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void reverse() {
        Node<E> prev = null;
        Node<E> current = head;
        Node<E> next = null;

        while (current != null) {
            next = current.next;   // save next
            current.next = prev;   // reverse pointer
            prev = current;        // move prev forward
            current = next;        // move current forward
        }

        head = prev;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<E> current = head;

        while (current != null) {
            sb.append(current.data);
            if (current.next != null) sb.append(", ");
            current = current.next;
        }

        sb.append("]");
        return sb.toString();
    }
}
