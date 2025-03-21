public class SinglyLinkedList {
    
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head; 

    
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    
    public void deleteFromBeginning() {
        if (head != null) {
            head = head.next;
        } else {
            System.out.println("List is empty.");
        }
    }

    
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);

        
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        
        list.display(); 

        
        list.deleteFromBeginning();

        
        list.display(); 
    }
}

