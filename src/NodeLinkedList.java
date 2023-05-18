public class NodeLinkedList {
    private Node head;
    private int size;

    public void addToFront(int value){
        Node node = new Node(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public void addToTail(int value){
        Node node = new Node(value);
        Node tail = head;
        if(head==null){
            head = node;
        }
        else{
            while(tail.getNext()!=null){
                tail = tail.getNext();
            }
            tail.setNext(node);
        }
    }


    public Node removeFromTail(){
        Node node = head;
        if(node==null){
            return null;
        }
        else{
            if(node.getNext()==null){
                head = null;
            }
            else {
                while(node.getNext().getNext()!=null){
                    node = node.getNext();
                }
                node.setNext(null);
            }
        }
        return node;
    }
    public Node getTail() {
        Node node = head;
        if (head == null) {
            return null;
        } else {
            while (node.getNext() != null) {
                node = node.getNext();
            }
            return node;
        }
    }
    public void removeFromFront(){
        if(head!=null){
            Node oldHead = head;
            Node newHead = head.getNext();
            oldHead.setNext(null);
            head = newHead;
        }

    }

    public Node getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }
}
