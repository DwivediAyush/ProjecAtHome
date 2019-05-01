public class LinkLIst
{
    Node head;

    //normal insetion
    void insert(int n)
    {
        Node node=new Node();
        node.data=n;
        node.next=null;

        if(isEmpty())
        {
            head=node;
        }
        else {
              Node n1=head;
              while(n1.next!=null)
              {
                  n1=n1.next;
              }
              n1.next=node;

        }

    }
    //DELETE ODD node
    /*PUBLIC VOID DELETEODDNODE()
{
    NODE N=HEAD;
    NODE PRE;
    IF(N.DATA%2!=0)
    HEAD=HEAD.NEXT;
    PRE=N;
    N=N.NEXT;
    ELSE
    {
        WHILE(N!=NULL)
        {
            IF(N.DATA%2!=0)
            {
                PRE.NEXT=N.NEXT.NEXT;
                N=N.NEXT;
            }
            PRE=N;
            N=N.NEXT;
        }
    }*/
    public void deleteoddnode()
    {
        Node n=head;
        Node pre;
        pre=head;

//traverser
            while(n!=null) {
                if(n.data%2!=0&&n==head) {
                    head= head.next;

                    n=n.next;

                }
               else if (n.data % 2 != 0) {
                    pre.next = n.next;
                    n = n.next;
                } else {
                    pre = n;
                    n = n.next;
                }
            }
        }

//insertAtanyposition
    void InsertAtPosition(int position, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (position == 1)
            insertAtStart(data);
        else {
            Node n = head;
            for (int i = 1; i < position - 1; i++)
                n = n.next;
            node.next = n.next;
            n.next = node;
        }
    }
    //insert at start point
    void insertAtStart(int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=head;
        head=node;
    }

    //search
    boolean search(int data)
    {
        Node n=head;
        while(n!=null)
        {
          if(n.data==data)
              return true;
          n=n.next;
        }
        return false;
    }
//replace
    void replace(int pdata,int newdata)
    {
        Node n=head;

        while(n!=null)
        {
            if(n.data==pdata)
            {
                n.data=newdata;
                break;
            }

            n=n.next;
        }
    }
    //replaceAtPosition
    void replaceAtPosition(int position,int data)
    {
        Node node=new Node();
        node.data=data;
        if(position<= 0)
            System.out.println("invlaid position");
        else if(position==1)
        {
            node.next=head.next;
            head=node;
    }
        else
        {
            Node n = head;
            for (int i = 1; i < position-1; i++)
                n = n.next;

              node.next=n.next.next;
              n.next=node;
        }
    }
    //normal delete
    void delete()
    {   if(isEmpty())
        System.out.println("Linklist is empty");
    else{
        Node n1 = head;
        while (n1.next.next != null) {
            n1 = n1.next;
        }
        System.out.println(n1.next.data);
        n1.next = null;
    }

    }
    //delete at starting
    void deleteAtStarting()
    {
        System.out.println(head.data);
        head=head.next;
    }
    //delete at any position
    void deleteAt(int position)
    {  if(position<= 0)
        System.out.println("invlaid position");
        else if(position==1)
        {
            deleteAtStarting();
        }
        else
        {
            Node n = head;
            for (int i = 1; i < position - 1; i++)
                n = n.next;
            System.out.println(n.next.data);
            n.next=n.next.next;
        }
    }
    private boolean isEmpty()
    {
        return head == null;
    }

    //bubble sort
    void bsort()
    {
        Node i=head,j;
        for(;i!=null;i=i.next)
        {
            for(j=i.next;j!=null;j=j.next)
            {
                //asecending order
                //if(i.data>j.data)
                  //decreasing order
                if(i.data<j.data)
                {
                    int temp=i.data;
                    i.data=j.data;
                    j.data=temp;
                }
            }
        }
    }

//displsy
void show()
{
    Node n=head;
    while(n!=null)
    {
        System.out.print(n.data+" ");
        n=n.next;
    }
    System.out.println();
}
    public static void main(String[] args) {
        LinkLIst obj=new LinkLIst();
        obj.insert(11);
        obj.insert(11);

        obj.insert(12);
        obj.insert(24);
        obj.insert(34);
        obj.insert(55);

        obj.show();
        /*obj.InsertAtPosition(3,44);
        obj.show();
        obj.InsertAtPosition(1,11);
        obj.show();
        obj.insertAtStart(000);
        obj.show();
        obj.delete();
        obj.show();
      /*  obj.deleteAt(2);
        obj.show();
        obj.replaceAtPosition(2,43);
        obj.show();
        obj.replace(44,55);
        obj.show();
*/
          obj.insert(77);
        obj.insert(77);
        obj.insert(88);
        obj.insert(99);
        obj.show();

     /* obj.bsort();
      obj.show();
     */obj.deleteoddnode();
     obj.show();
    }
}
