
public class List {
    private Node head, tail;
    private int size;
    public List()
    {
        head = null;
        tail = null;
        size = 0;
    }

    public void add_el(int info)
    {
        Node ptr = new Node(info);

        if (head == null) {
            head = ptr;
            tail = ptr;
        }
        else {
            tail.next = ptr;
            tail = ptr;
        }

        size++;
    }
    public void del_el(int index)
    {
    }


}
