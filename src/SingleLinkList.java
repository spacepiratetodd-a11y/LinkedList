public class SinglyLinkedList<E> {

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E value) {
            this.data = value;
            this.next = null;
        }
    }

    private Node<E> head;
    private int size;

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

        size++;
    }

    public E popFront() {
        if (head == null) return null;

        E value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public E popEnd() {
        if (head == null) return null;

        if (head.next == null) {
            E value = head.data;
            head = null;
            size--;
            return value;
        }

        Node<E> current = head;
        Node<E> previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        previous.next = null;
        size--;
        return current.data;
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
