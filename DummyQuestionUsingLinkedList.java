import java.util.Scanner;
import java.util.ArrayList;

public class DummyQuestionUsingLinkedList 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of an array: ");
        int sz = Integer.valueOf(sc.nextLine());

        System.out.println("Input number: ");
        LinkedList nList = new LinkedList();
        for (int i = 0; i < sz; i++)
        {
            int a = Integer.valueOf(sc.nextLine());
            nList.insert(a);
        }

        Node trarvese1 = nList.head;
        System.out.println("Original array: ");
        while (trarvese1 != null)
        {
            System.out.print(trarvese1.value + " ");
            trarvese1 = trarvese1.next;
        }
        System.err.println();
        
        Node current = nList.head;
        Node prevCurr = new Node(0, current);
        
        while (current != null)
        {
            int count = 0;
            Node dummy = nList.head;
            while(dummy != null)
            {
                if (dummy.value == current.value)
                {
                    count++;
                }
                dummy = dummy.next;
            }
            if (count > 1)
            {
                if (current == nList.head)
                {
                    nList.head = current.next;
                    Node temp = current;
                    current = current.next;
                    prevCurr.next = current;
                    temp.next = null;
                }
                else
                {
                    Node temp = current;
                    current = current.next;
                    prevCurr.next = current;
                    temp.next = null;
                }
            }
            else
            {
                current = current.next;
                prevCurr = prevCurr.next;
            }
        }

        Node trarvese2 = nList.head;
        System.out.println("Modified array: ");
        while (trarvese2 != null)
        {
            System.out.print(trarvese2.value + " ");
            trarvese2 = trarvese2.next;
        }
    }
}