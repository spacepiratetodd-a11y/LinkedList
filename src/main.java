public class main {

    public static void main(String[] args) {

        // ---------------------------------------------------------
        // 1. Singly Linked List
        // ---------------------------------------------------------
        System.out.println("=== Singly Linked List ===");
        SingleLinkList<Integer> sll = new SingleLinkList<>();
        sll.add(10);
        sll.add(20);
        sll.add(30);
        //sll.remove(2);
        System.out.println("SLL contents: " + sll);

        System.out.println("Pop front: " + sll.popFront());
        System.out.println("After pop front: " + sll);

        System.out.println("Pop end: " + sll.popEnd());
        System.out.println("After pop end: " + sll);


        // ---------------------------------------------------------
        // 2. Doubly Linked List
        // ---------------------------------------------------------
        System.out.println("\n=== Doubly Linked List ===");
        DoublyLinked<String> dll = new DoublyLinked<>();
        dll.add("A");
        dll.add("B");
        dll.add("C");
        System.out.println("DLL contents: " + dll);

        System.out.println("Pop front: " + dll.popFront());
        System.out.println("After pop front: " + dll);

        System.out.println("Pop end: " + dll.popEnd());
        System.out.println("After pop end: " + dll);


        // ---------------------------------------------------------
        // 3. Linked List Reversal
        // ---------------------------------------------------------
        System.out.println("\n=== Linked List Reversal ===");
        ReversedList<Integer> revList = new ReversedList<>();
        revList.add(1);
        revList.add(2);
        revList.add(3);
        revList.add(4);

        System.out.println("Original list: " + revList);
        revList.reverse();
        System.out.println("Reversed list: " + revList);


        // ---------------------------------------------------------
        // 4. Loop N Times
        // ---------------------------------------------------------
        System.out.println("\n=== Loop List N Times ===");
        LoopedList<String> loopList = new LoopedList<>();
        loopList.add("X");
        loopList.add("Y");
        loopList.add("Z");

        System.out.println("Printing list 3 times:");
        loopList.printListNTimes(3);
    }
}
