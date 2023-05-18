public class Node {
    public int getValue() {
        return value;
    }

    private int value;
    private Node next;

    public Node(int value){
        this.value = value;
    }

    public Node getNext(){
        return next;
    }
    public void  setNext(Node next){
        this.next = next;
    }

}
