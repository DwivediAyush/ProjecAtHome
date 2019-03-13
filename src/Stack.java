public class Stack {
    Node tos;
    Node head;
   private int f;

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    //push in stack
    void push(int data)
    {
        Node node=new Node();
        node.data=data;
        if(isEmpty())
        {
          tos=node;
        }
        else if(isFull())
            System.out.println("the stack is full");
        else
        {
          node.next=tos;
          tos=node;
        }

    }
//check whether the stack is full
    private boolean isFull() {
        if(getF()==size())
            return true;
        return false;
    }

    //size of stack
    int size()
    {
        Node n=tos;
        int t=0;
        while(n!=null)
        {
            n=n.next;
            t++;
        }
        return t;
    }
//pop
    void pop() {
        if (!isEmpty()) {
            System.out.print(tos.data + " ");
            tos = tos.next;
        }
        else
            System.out.println("Stack is empty");
    }
    //display number of element in the stack
void display()
{
    Node n=tos;
    System.out.print("[");
    while(n!=null)
    {
        System.out.print(n.data+" ");
        n=n.next;
    }
    System.out.println("]");
}
//display the top of the element in stack
void peek()
{
    if(isEmpty())
        System.out.println("null");
    else
        System.out.println(tos.data);
}
// check whether   the stack is empty or not
    private boolean isEmpty() {
        if(tos==null)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Stack obj=new Stack();
        int s=7;
        obj.setF(s);


        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);
        obj.push(55);
        obj.push(66);
        obj.push(77);
        obj.push(88);
        obj.display();
        obj.peek();
        System.out.println(obj.size());
        obj.pop();
        obj.pop();
        System.out.println();

        obj.display();
        System.out.println(obj.size());
        obj.peek();
    }

}
