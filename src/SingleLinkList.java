public class SingleLinkList<E> {

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
    
    public void add(int index, E value) {
    	if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
    	}
    	
    	Node<E> newNode = new Node<>(value);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }

        Node<E> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        
        newNode.next = current.next;
        current.next = newNode;

        size++;
    	}
    }

    public E remove(int index) {
        if (index < 0 || index >= size) return null;

        // Case 1: remove head
        if (index == 0) {
            return popFront();
        }

        Node<E> current = head;
        Node<E> previous = null;

        for (int i = 0; i < index; i++) {
            previous = current;
            current = current.next;
        }

        // unlink the node
        previous.next = current.next;
        size--;

        return current.data;
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
