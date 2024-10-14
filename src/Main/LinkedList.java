package Main;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insertAtHead(int data) {
        Node new_node = new Node(data);
        if (this.head == null) {
            this.head = new_node;
            return;
        }
        new_node.next = this.head;
        this.head = new_node;
    }

    public void insertAtTail(int data) {
        Node new_node = new Node(data);
        if (this.head == null) {
            this.head = new_node;
            return;
        }

        Node curNode = this.head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }

        curNode.next = new_node;
    }

    @SuppressWarnings("unused")
    public boolean insertAtIndex(int data, int index) {
        Node new_node = new Node(data);
        if (this.head == null) {
            this.head = new_node;
            return true;
        }

        int curIdx = 0;
        Node curNode = this.head;
        while (curNode.next != null && (curIdx + 1) != index) {
            curNode = curNode.next;
            curIdx++;
        }

        if (curNode != null) {
            new_node = new Node(data);
            new_node.next = curNode.next;
            curNode.next = new_node;
            return true;
        }

        return false;
    }

    public void removeHead() {
        if (this.head == null) {
            return;
        }

        this.head = this.head.next;
    }

    @SuppressWarnings("unused")
    public boolean updateAtIndex(int data, int index) {
        int curIdx = 0;
        Node curNode = this.head;
        while (curNode.next != null && (curIdx + 1) != index) {
            curNode = curNode.next;
            curIdx++;
        }

        if (curNode != null) {
            curNode.data = data;
            return true;
        }
        return false;
    }

    public void removeTail() {
        if (this.head == null) return;
        Node curNode = this.head;

        while (curNode != null && curNode.next.next != null) {
            curNode = curNode.next;
        }

        curNode.next = null;
    }

    public boolean removeAtIndex(int index) {
        if (this.head == null) return false;
        if (index == 0) {
            removeHead();
            return true;
        }
        int curIdx = 0;
        Node curNode = this.head;
        Node prevNode = null;
        while (curNode.next != null && (curIdx + 1) != index) {
            curNode = curNode.next;
            curIdx++;
            if (curIdx + 1 == index) {
                prevNode = curNode;
            }
        }

        if (prevNode == null) {
            return false;
        }

        if (curNode.next != null) {
            prevNode.next = curNode.next;
        } else {
            prevNode.next = null;
        }
        
        return true;
    }

    public int getSize() {
        int size = 1;
        if (this.head == null) return 0;

        Node curNode = this.head;
        while(curNode.next != null) {
            size++;
            curNode = curNode.next;
        }

        return size;
    }

    public void print() {
        Node curNode = this.head;
        if (curNode == null) {
            System.out.println("List is empty");
            return;
        }
        while(curNode != null) {
            System.out.println(curNode.data);
            curNode = curNode.next;
        }
    }

}
