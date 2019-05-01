import java.util.*;
public class insertsort {
    Node head;
    void insert(int data)
    {
        Node n=new Node();
        n.data=data;
        Node after=insertAfter(data);
        if(after==null)
        {
            n.next=head;
            head=n;
        }
        else
        {
            n.next=after.next;
            after.next=n;
        }

    }
    Node insertAfter(int data)
    {
        if(head==null)
            return null;
        if(head.data>data)
            return null;
        else
        {
            Node temp=head;
            Node pvr=null;
            while(temp!=null)
            {
                pvr=temp;
                if(temp.data<=data)
                    return pvr;
                temp=temp.next;
            }
            return pvr;
        }
    }
    void dispaly()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        insertsort obj=new insertsort();
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++) {
            obj.insert(sc.nextInt());
            obj.dispaly();
            System.out.println();
        }
        }
}
