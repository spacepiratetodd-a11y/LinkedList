public class DoublyLinked<E> {

    private static class DNode<E> {
        E data;
        DNode<E> next;
        DNode<E> prev;

        DNode(E value) {
            this.data = value;
            this.next = null;
            this.prev = null;
        }
    }

    private DNode<E> head;
    private DNode<E> tail;
    private int size;

    public void add(E value) {
        DNode<E> newNode = new DNode<>(value);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
    }

    public E popFront() {
        if (head == null) return null;

        E value = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;
        return value;
    }

    public E popEnd() {
        if (tail == null) return null;

        E value = tail.data;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;
        return value;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        DNode<E> current = head;

        while (current != null) {
            sb.append(current.data);
            if (current.next != null) sb.append(", ");
            current = current.next;
        }

        sb.append("]");
        return sb.toString();
    }
}
