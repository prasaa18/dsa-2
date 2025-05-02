package LinkedList.doublyLin;

import java.util.HashMap;
import java.util.Map;

public class lengthOfloopLL {
    // of loop using hashing
    //
    /// O(N) The code traverses the entire linked list at least once, where 'N' is the number of nodes in the list. Therefore, the time complexity is linear, O(N).

    //Space Complexity: O(N) The
    public static int lengthOfLoop(Node head) {
        // Hashmap to store visited nodes
        // and their timer values
        Map<Node, Integer> visitedNodes = new HashMap<Node, Integer>();

        // Initialize pointer to
        // raverse the linked list
        Node temp = head;

        // Initialize timer to
        // track visited nodes
        int timer = 0;

        // Traverse the linked list
        // till temp reaches null
        while (temp != null) {
            // If revisiting a node, return
            // the difference of timer values
            if (visitedNodes.containsKey(temp)) {
                // Calculate the length of the loop
                int loopLength = timer - visitedNodes.get(temp);

                // Return the length of the loop
                return loopLength;
            }
            // Store the current node and
            // its timer value in the hashmap
            visitedNodes.put(temp, timer);

            // Move to the next node
            temp = temp.next;

            // Increment the timer
            timer++;
        }

        // If traversal is completed and we
        // reach the end of the list (null),
        // means there is no loop
        return 0;
    }

    public class LinkedListLoopLength {

        // Function to return the lenght
        // of loop when slow and fast are
        // on the same node
        static int findLength(Node slow, Node fast) {

            // count to keep track of
            // nodes encountered in loop
            int cnt = 1;

            // move fast by one step
            fast = fast.next;

            // traverse fast till it
            // reaches back to slow
            while (slow != fast) {

                // at each node increase
                // count by 1 and move fast
                // forward by one step
                cnt++;
                fast = fast.next;
            }

            // loop terminates when fast reaches
            // slow again and the count is returned
            return cnt;
        }

        // Function to find the length
        // of the loop in a linked list
        static int lengthOfLoop(Node head) {
            Node slow = head;
            Node fast = head;

            // Step 1: Traverse the list to detect a loop
            while (fast != null && fast.next != null) {
                // Move slow one step
                slow = slow.next;

                // Move fast two steps
                fast = fast.next.next;

                // Step 2: If the slow and fast
                // pointers meet, there is a loop
                if (slow == fast) {
                    return findLength(slow, fast);
                }
            }

            // Step 3: If the fast pointer reaches the end
            // there is no loop

            return 0; //  linear 1ll
        }

        public static void main(String[] args) {
            // Create a linked list with a loop
            Node head = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);
            Node fourth = new Node(4);
            Node fifth = new Node(5);

            // Create a loop from fifth to second
            head.next = second;
            second.next = third;
            third.next = fourth;
            fourth.next = fifth;

            // This creates a loop
            fifth.next = second;

            int loopLength = lengthOfLoop(head);

            if (loopLength > 0) {
                System.out.println("Length of the loop: " + loopLength);
            } else {
                System.out.println("No loop found in the linked list.");
            }
        }
    }
}
