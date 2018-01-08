/**
 * Created by rsingh13.
 */
public class LinkedListOperations {
    static class Node {
        int data;
        Node next;
    }

    public static Node removeDuplicate(Node head) {

        if(head == null) return null;
        if(head.next == null) return head;

        Node current = head;
        while(current != null) {
            Node temp = head;
            while (temp.next != null ){
                if(temp.data == temp.next.data) {
                    temp.next= temp.next.next;
                }else {
                    temp = temp.next;
                }
            }
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {


        //removeDuplicate(  createLinkedList(3));


        System.out.println(Integer.toBinaryString(121));
// prints "1111001"
        System.out.println(Integer.parseInt( Integer.toBinaryString( 121 >> 1),2));
        System.out.println(Integer.parseInt( Integer.toBinaryString(-121 >>> 1) , 2));
// prints "111100"
        System.out.println(Integer.toBinaryString(121 >>> 1));
// prints "111100"

        System.out.println(Integer.toBinaryString(-121 >>> 1));

    }

    private static Node createLinkedList(int i) {

        Node head = new Node();
        head.data = 0;

        for(int j = 1 ; j < i; j++) {
            Node temp = new Node();
            temp.data = j;
            head.next = temp;
        }

        return head;
    }
}
