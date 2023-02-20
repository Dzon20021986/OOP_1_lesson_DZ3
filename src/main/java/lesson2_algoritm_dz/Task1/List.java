package lesson2_algoritm_dz.Task1;

public class List {
    private Node head;  // в начало
    private Node tail;    // в конец

    public List() {
        head = null;
        tail = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int data) {  // добавить в начало
        Node temp = new Node(data);
        if (isEmpty())
            tail = temp;
        else
            head.prev = temp;
        temp.next = head;
        head = temp;
    }

    public void addLast(int data) {  // добавить в конец
        Node temp = new Node(data);
        if (isEmpty())
            head = temp;
        else
            tail.next = temp;
        temp.prev = tail;
        tail = temp;
    }

    public void addByIndex(int data, int index) { // добавление по выбранному индексу
        Node cur = head;
        int c = 0;
        while (cur != null && c != index) {
            cur = cur.next;
            c++;
        }

        Node temp = new Node(data);
        cur.prev.next = temp;
        temp.prev = cur.prev;
        cur.prev = temp;
        temp.next = cur;
    }

    public void removeFirst() {  // удаление в начале
        if (head.next == null) {
            tail = null;
        } else
            head.next.prev = null;
        head = head.next;
    }

    public void removeLast() {  // удаление в конце
        if (head.next == null)
            head = null;
        else
            tail.prev.next = null;
        tail = tail.prev;

    }

    public void removeAt(int key) {  // удаление по ключу
        Node cur = head;
        while (cur.data != key) {
            cur = cur.next;
            if (cur == null)
                return;
        }
        if (cur == head)
            removeFirst();
        else
            cur.prev.next = cur.next;
        if (cur == tail)
            removeLast();
        else
            cur.next.prev = cur.prev;
    }



    public void print() {  // вывод
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


}
