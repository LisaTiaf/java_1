
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
    public boolean del_el(int index)
    {
        if(index >= size || index < 0)
            return false;
        else{
            if(index == 0){
                head = head.next;
                if (head == null) {
                    tail = null;
                }
            }
            else{
                Node ptr = head;
                tmp = 0;

                while(ptr != null){
                    if (tmp == index - 1) {
                        if (ptr.next == tail) {
                            tail = ptr;
                        }
                        ptr.next = ptr.next.next;
                        break;
                    }
                    tmp++;
                    ptr = ptr.next;
                }
            }
            size--;
            return true;
        }
    }

    public int get_num(int index){
        Node ptr = head;
        int tmp = 0;

        while(ptr != null) {
            if (tmp == index) {
                return ptr.info;
            }
            tmp++;
            ptr = ptr.next;
        }
        throw new IndexOutOfBoundsException("Index out of bounds");
    }

    public int getSize() {
        return size;
    }
}
