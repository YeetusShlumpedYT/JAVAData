package chatGPTproblems;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}
public class ReversedLinkedList {

    public static ListNode reversedList(ListNode head){

        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode nextNode = current.next;
            current.next = prev;

            prev = current;
            current = nextNode;
        }
        return prev;
    }
    public static void printList(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.println(current.val + " ");
            current =current.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        ListNode reversedHead = reversedList(head);

        System.out.println("Reversed List:");
        printList(reversedHead);
    }
}

