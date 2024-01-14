public class LinkedList {
    Node head;
    public LinkedList() 
    {
        head = null;
    }
    public void insert(int value) 
    {
        Node newNode = new Node(value, null);
        if (head == null) 
        {
            head = newNode;
        } else 
        {
            Node current = head;
            while (current.next != null) 
            {
                current = current.next;
            }
            current.next = newNode;
        }
    }
}