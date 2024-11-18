package GFG;

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}


public class findLengthForLoop {
    public static void main(String[] args) {
        Node1 head = new Node1(25);
        head.next = new Node1(14);
        head.next.next = new Node1(19);
        head.next.next.next = new Node1(33);
        head.next.next.next.next = new Node1(10);
        head.next.next.next.next.next = new Node1(21);
        head.next.next.next.next.next.next = new Node1(39);
        head.next.next.next.next.next.next.next = new Node1(90);
        head.next.next.next.next.next.next.next.next = new Node1(58);
        head.next.next.next.next.next.next.next.next.next = new Node1(45);

        // Creating a loop here: Connect last Node1 to the 4th Node1
        head.next.next.next.next.next.next.next.next.next.next = head.next.next.next;
        findLengthForLoop obj = new findLengthForLoop();
        int loopLength = obj.countNodesinLoop(head);
        System.out.println("Length of the loop is: " + loopLength);
    }
    public  int countNodesinLoop(Node1 head) {
        Node1 slow = head, fast = head;

        // Detect Loop using Floyd's Cycle Detection algorithm
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;        // move slow by one step
            fast = fast.next.next;   // move fast by two steps

            if (slow == fast) {
                // Loop detected, now find the loop length
                return countLoopLength(slow);
            }
        }
        return 0; // No loop found
    }

    private static int countLoopLength(Node1 slow) {
        Node1 temp = slow;
        int count = 1;

        while (temp.next != slow) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
