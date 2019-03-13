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


    void display()
    {
        Node temp=head;
        if(isEmpty())
            System.out.println("queue is empty");
        else {
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        System.out.println();
            }

    private boolean isEmpty() {
        if(head==null&& tail==null)
            return true;
        else
         return   false;
    }

    public static void main(String[] args) {
        Queue obj=new Queue();
        obj.enqueue(11);
        obj.enqueue(22);
        obj.enqueue(33);
        obj.enqueue(44);
        obj.display();
        obj.dequeue();
        obj.dequeue();
        obj.display();
    }
}
