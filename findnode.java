public class findnode {
    Node head,tail;

    public findnode(){
        head = tail = null;
    }
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void create(int data){
        Node newnode = new Node(data);
        if(head == null){
            tail = head = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void print(Node head){
        if(head == null){
            System.out.println("list is empty");
        }
        else{
            while (head!=null) {
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
    public Node findnth_Node(int pos){
        int size = 0;
        Node temp = head;
        while (temp!=null) {
            temp = temp.next;
            size++;
        }
        temp = head;
        int newpos = size - pos+1;
        for(int i=1;i<newpos;i++){
            temp = temp.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        findnode l = new findnode();
        l.create(1);
        l.create(5);
        l.create(3);
        l.create(6);
        l.print(l.head);
        Node temp = l.findnth_Node(4);

        System.out.println();
        System.out.println(temp.data);
    }
}