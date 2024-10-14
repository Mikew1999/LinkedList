package Main;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println(" ---- ");
        try {
            list.insertAtHead(1);
            list.insertAtHead(2);
            list.print();
            
            System.out.println("Size of list " + list.getSize());

            System.out.println("-----");
            list.insertAtTail(6);
            list.print();
            System.out.println("Size of list " + list.getSize());

            System.out.println("------");
            list.removeHead();
            list.print();
            System.out.println("Size of list " + list.getSize());

            System.out.println("------");
            list.removeTail();
            list.print();
            System.out.println("Size of list " + list.getSize());


            System.out.println("-------");
            list.updateAtIndex(9, 1);
            list.print();
            System.out.println("Size of list " + list.getSize());

            System.out.println("-------");
            list.updateAtIndex(9, 2);
            list.print();
            System.out.println("Size of list " + list.getSize());

            System.out.println("-------");
            list.removeAtIndex(2);
            list.print();
            System.out.println("Size of list " + list.getSize());

            System.out.println("------- removing..");
            list.removeAtIndex(0);
            list.print();
            System.out.println("Size of list " + list.getSize());


        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
     
        
    }

}
