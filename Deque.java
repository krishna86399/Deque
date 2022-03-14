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
    {
        Item firstItem=first.item;
        first=first.next;
        n--;
        return firstItem;
    }

    // remove and return the item from the back
    public Item removeLast()
    {
        Node lastNode=new Node();
        for(Node x=first;x!=null;x=x.next) 
        lastNode=x; 
        n--;
        Item lastItem=lastNode.item;
        return lastItem ;
    }



    // return an iterator over items in order from front to back
    public Iterator<Item> iterator()
    {
        return new LinkedIterator(first); 
    }
    private class LinkedIterator implements Iterator<Item> 
    {
        private Deque<Item>.Node current;

        public LinkedIterator(Deque<Item>.Node first)
        {
            current=first;
        }

        public boolean hasNext()
         { return current != null;}
        public void remove()
         { throw new UnsupportedOperationException();}

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next; 
            return item;
        }
    }

    // unit testing (required)
    public static void main(String[] args)
    {
        Deque<Integer> dq= new Deque<Integer>();
        dq.addFirst(25);
        dq.addFirst(50);
        dq.addLast(100);
        dq.removeFirst();
        dq.addLast(1000);
        dq.addFirst(60);
        dq.removeLast();
        dq.addFirst(250);
        System.out.println(dq.size());
    }

}

