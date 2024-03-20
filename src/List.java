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
            else {
                Node ptr = head;
                int tmp = 0;

                for (int i = 0; i < index - 1; i++) {
                    tmp++;
                    ptr = ptr.next;
                }

                if (ptr.next == tail) {
                    tail = ptr;
                }
                ptr.next = ptr.next.next;

            }
            size--;
            return true;
        }
    }
    public boolean edit_el(int num, int index)
    {
        if(index >= size)
            return false;
        else {
            if (index == 0) {
                head = head.next;
            }
            else {
                Node ptr = head;
                int tmp = 0;
                for (int i = 0; i < index; i++) {
                    ptr = ptr.next;
                }
                ptr.info = num;
            }
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
    public String to_str() {
        Node ptr = head;
        String res = "";
        for(int i = 0; i < size; i++){
            res += ptr.info + " ";
            ptr = ptr.next;
        }
        return res;
    }
}
