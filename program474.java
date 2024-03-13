//Java Linked List

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////
//      Linear node
////////////////////////////////////////////////////////////////////////////////////
class Node
{
    public int data;
    public Node next;

    public Node (int no)
    {
        this.data = no;
        this.next = null;
    }
}

////////////////////////////////////////////////////////////////////////////////////
//      Doubly node
////////////////////////////////////////////////////////////////////////////////////
class NodeD
{
    public int data;
    public NodeD next;
    public NodeD prev;

    public NodeD(int no)
    {
        data = no;
        this.next = null;
        this.prev = null;
    }
}

////////////////////////////////////////////////////////////////////////////////////
//Singly Linear 
////////////////////////////////////////////////////////////////////////////////////
class SinglyLL
{
    public Node first;
    public int iCount;

    public SinglyLL()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void Display()
    {
        System.out.println("Elements of Linked List are : ");

        Node temp = first;

        while(temp != null)
        {
            System.out.print("| "+temp.data+" |->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public int Count()
    {
        return this.iCount;
    }

    public void InsertFirst(int no)
    {
        Node newn = new Node(no);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            newn.next = first;
            first = newn;
        }
        iCount++;
    }

    public void InsertLast(int no)
    {
        Node newn = new Node(no);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            Node temp = first;

            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newn;
        }
        iCount++;
    }

    public void DeleteFirst()
    {
        if(first != null)
        {
            first = first.next;
            iCount--;
        }
    }

    public void DeleteLast()
    {
        if(first == null)
        {
            return;
        }
        else if(first.next == null)
        {
            first = null;
        }
        else
        {
            Node temp = first;

            while(temp.next.next != null)
            {
                temp = temp.next;
            }

            temp.next = null;
        }
        iCount--;
    }

    public void InsertAtPos(int no,int iPos)
    {
        int iSize = Count();

        if((iPos < 1)||(iPos > iSize + 1))
        {
            System.out.println("Incorrect position");
            return;
        }

        if(iPos == 1)
        {
            InsertFirst(no);
        }
        else if(iPos == iSize + 1)
        {
            InsertLast(no);
        }
        else
        {
            Node temp = first;
            for(int iCnt = 1;iCnt < iPos -1;iCnt++)
            {
                temp = temp.next;
            }

            Node newn = new Node(no);
            newn.next = temp.next;
            temp.next = newn;
            iCount++;
        }
    }

    public void DeleteAtPos(int iPos)
    {

        int iSize = Count();

        if((iPos < 1)||(iPos > iSize))
        {
            System.out.println("Incorrect position");
            return;
        }

        if(iPos == 1)
        {
            DeleteFirst();
        }
        else if(iPos == iSize)
        {
            DeleteLast();
        }
        else
        {
            Node temp = first;
            for(int iCnt = 1;iCnt < iPos -1;iCnt++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            
            iCount--;
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////
//Doubly Linear 
////////////////////////////////////////////////////////////////////////////////////
class DoublyLL
{
    public NodeD first;
    public int iCount;

    public DoublyLL()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void Display()
    {
        System.out.println("Elements of Linked List are : ");

        NodeD temp = first;
        
        System.out.print("null");
        while(temp != null)
        {
            System.out.print("| "+temp.data+" |<=>");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public int Count()
    {
        return this.iCount;
    }

    public void InsertFirst(int no)
    {
        NodeD newn = new NodeD(no);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            newn.next = first;
            first.prev = newn;
            first = newn;
        }
        iCount++;
    }

    public void InsertLast(int no)
    {
        NodeD newn = new NodeD(no);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            NodeD temp = first;

            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newn;
            newn.prev = temp;
        }
        iCount++;
    }

    public void DeleteFirst()
    {
        if(first == null)
        {
            return;
        }
        else if(first.next == null)
        {
            first = null;
        }
        else
        {
            first = first.next;
            first.prev = null;
        }
        iCount--;
    }

    public void DeleteLast()
    {
        if(first == null)
        {
            return;
        }
        else if(first.next == null)
        {
            first = null;
        }
        else
        {
            NodeD temp = first;

            while(temp.next.next != null)
            {
                temp = temp.next;
            }

            temp.next = null;
        }
        iCount--;
    }

    public void InsertAtPos(int no,int iPos)
    {
        int iSize = Count();

        if((iPos < 1)||(iPos > iSize + 1))
        {
            System.out.println("Incorrect position");
            return;
        }

        if(iPos == 1)
        {
            InsertFirst(no);
        }
        else if(iPos == iSize + 1)
        {
            InsertLast(no);
        }
        else
        {
            NodeD temp = first;
            for(int iCnt = 1;iCnt < iPos -1;iCnt++)
            {
                temp = temp.next;
            }

            NodeD newn = new NodeD(no);
            
            newn.next = temp.next;
            temp.next.prev = newn;

            temp.next = newn;
            newn.prev = temp;

            iCount++;
        }
    }

    public void DeleteAtPos(int iPos)
    {

        int iSize = Count();

        if((iPos < 1)||(iPos > iSize))
        {
            System.out.println("Incorrect position");
            return;
        }

        if(iPos == 1)
        {
            DeleteFirst();
        }
        else if(iPos == iSize)
        {
            DeleteLast();
        }
        else
        {
            NodeD temp = first;
            for(int iCnt = 1;iCnt < iPos -1;iCnt++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            temp.next.prev = temp;
            
            iCount--;
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////
//      Singly Circular
/////////////////////////////////////////////////////////////////////////////////////////
class SinglyCL
{
    public Node first;
    public Node last;
    public int iCount;

    public SinglyCL()
    {
        first = null;
        last = null;
        iCount = 0;
    }

    public void Display()
    {
        System.out.println("Elements of Singly Circular Linked List are : ");
        Node temp = first;
        do
        {
            System.out.print("| "+temp.data+" | -> ");
            temp = temp.next;
        }while(temp != first);
        System.out.println();
    }

    public int Count()
    {
        return this.iCount;
    }

    public void InsertFirst(int no)
    {
        Node newn = new Node(no);

        if(first == null)
        {
            first = newn;
            last = newn;
        }
        else
        {
            newn.next = first;
            first = newn;
        }
        last.next = first;
        iCount++;
    }

    public void InsertLast(int no)
    {

        Node newn = new Node(no);

        if(first == null)
        {
            first = newn;
            last = newn;
        }
        else
        {
            last.next = newn;
            last = newn;
        }
        last.next = first;
        iCount++;
    }

    public void InsertAtPos(int no,int iPos)
    {}

    public void DeleteFirst()
    {}

    public void DeleteLast()
    {}

    public void DeleteAtPos(int iPos)
    {}
}

class program474
{
    public static void main(String arg[])
    {
        SinglyCL obj = new SinglyCL();
        
        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.InsertLast(101);
        obj.InsertLast(111);

        obj.Display();
        System.out.println("Number of nodes are : "+obj.Count());

    }
}