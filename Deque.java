public class Deque<Item> implements Iterable<Item> {
    private Node  first;
    private int n;
    public Deque<Item>.Node current;
    private class Node
    {
        Item item;
        Node next;
    }

    // construct an empty deque
    public Deque()
    {   
        first= null;
        n=0;
    }
    

    // is the deque empty?
    public boolean isEmpty()
    {return first==null; }
    


    // return the number of items on the deque
    public int size()
    { return n; }

    // add the item to the front
    public void addFirst(Item item)
    {
        Node second=first;
        first= new Node();
        first.item=item;
        first.next=second;
        n++;
    }

    // add the item to the back
    public void addLast(Item item)
    {   
        Node last=new Node();
        for(Node x=first;x!=null ; x=x.next) 
        last=x;
        Node lastButOne=new Node();
        lastButOne=last;
        last=new Node();
        last.item=item;
        lastButOne.next=last;
        n++;
    }

    // remove and return the item from the front
    public Item removeFirst()

    // remove and return the item from the back
    public Item removeLast()

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator()

    // unit testing (required)
    public static void main(String[] args)

}

