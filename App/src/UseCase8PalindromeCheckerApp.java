/**
 * ================================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * Checks palindrome using Singly Linked List,
 * Fast & Slow pointer technique,
 * and in-place reversal of second half.
 *
 * @author Lakshvanth
 * @version 8.0
 */

public class UseCase8PalindromeCheckerApp {

    // Node class (Singly Linked List)
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to check palindrome
    public static boolean isPalindrome(Node head) {

        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;

        // Find middle using Fast & Slow pointer
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node prev = null;
        Node current = slow;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        // Compare both halves
        Node firstHalf = head;
        Node secondHalf = prev;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "radar";

        // Convert string to Linked List
        Node head = new Node(input.charAt(0));
        Node current = head;

        for (int i = 1; i < input.length(); i++) {
            current.next = new Node(input.charAt(i));
            current = current.next;
        }

        System.out.println("Input String : " + input);

        if (isPalindrome(head)) {
            System.out.println("Result : It is a Palindrome ✅");
        } else {
            System.out.println("Result : Not a Palindrome ❌");
        }
    }
}