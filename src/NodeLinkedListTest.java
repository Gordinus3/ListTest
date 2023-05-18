import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeLinkedListTest {
    @Test
    public void shouldAddToFront(){
        NodeLinkedList list = new NodeLinkedList();
        assertEquals(0,list.getSize());
        list.addToFront(5);
        assertEquals(5,list.getHead().getValue());
        list.addToFront(12);
        assertEquals(12,list.getHead().getValue());
        assertEquals(2,list.getSize());
    }
    @Test
    public void shouldAddtoTail(){
        NodeLinkedList list = new NodeLinkedList();
        assertEquals(0, list.getSize());
        list.addToTail(4);
        assertEquals(4,list.getTail().getValue());
        list.addToTail(5);
        assertEquals(5,list.getTail().getValue());
        list.addToTail(3);
        assertEquals(3,list.getTail().getValue());
    }
    @Test
    public void shouldRemoveFromFront(){
        NodeLinkedList list = new NodeLinkedList();
        list.addToFront(4);
        list.addToTail(3);
        list.addToFront(5);
        assertEquals(3,list.getTail().getValue());
        assertEquals(5,list.getHead());
        list.removeFromFront();
        assertEquals(4,list.getHead());
    }
    @Test
    public void shouldRemoveFromFrontEmpty(){
        NodeLinkedList list = new NodeLinkedList();
        assertEquals(null,list.getHead());
        assertEquals(0,list.getSize());
    }
    @Test
    public void shouldRemoveFromTail(){
        NodeLinkedList list = new NodeLinkedList();
        list.addToTail(5);
        list.addToFront(3);
        list.addToFront(7);
        list.removeFromTail();
        assertEquals(3,list.getTail().getValue());
        list.addToTail(10);
        assertEquals(10,list.getTail());
        list.removeFromTail();
        assertEquals(3,list.getTail());
    }
    public void shouldRemoveFromTailEmpty(){
        NodeLinkedList list = new NodeLinkedList();
        assertEquals(null,list.getTail());
        assertEquals(0,list.getSize());
    }

}