public class LoopedList<E> {

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

    public void printListNTimes(int n) {
        for (int i = 0; i < n; i++) {
            Node<E> current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}
