import javax.lang.model.util.ElementScanner6;
import java.util.*;
public class Queue {
    Node head;
    Node tail;
    void enqueue(int data)
    {
        Node temp=new Node();
        temp.data=data;
        temp.next=null;
        if(isEmpty())
        {
           head=temp;
           tail=temp;
        }
        else
        {
            tail.next=temp;
            tail=temp;
        }

    }

    void dequeue() {
        if (isEmpty())
            System.out.println("The Queue is empty ");
        else {
            System.out.println(head.data);
               head=head.next;
             }
    }

//display using recursion
    void display(Node n)
    {  if(n.next==null) {
        System.out.print(n.data);
        return;
    }
    display(n.next);
        System.out.print("==>"+n.data);
            }

    private boolean isEmpty() {
        if(head==null&& tail==null)
            return true;
        else
         return   false;
    }

    public static void main(String[] args) {
        Queue obj=new Queue();
       /* obj.enqueue(11);
        obj.enqueue(22);
        obj.enqueue(33);
        obj.enqueue(44);
        obj.display();
        obj.dequeue();
        obj.dequeue();
        obj.display();

    */
        Scanner s;
        s = new Scanner(System.in);
        int n=s.nextInt();
        while(n!=0)
        {
            int r=n%10;
            obj.enqueue(r);
            n=n/10;
        }
        obj.display(obj.head);
    }
}
