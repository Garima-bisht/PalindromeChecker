import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

/**
 * =====================================================
 * MAIN CLASS - PalindromeChecker
 * =====================================================
 * Use Case 6: Queue + Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using two data
 * structures:
 *
 * - Queue (FIFO – First In First Out)
 * - Stack (LIFO – Last In First Out)
 *
 * The program:
 * - Inserts characters into both Queue and Stack
 * - Removes characters from the front of the queue
 *   and the top of the stack
 * - Compares them for equality
 *
 * If all characters match, the input string is
 * confirmed as a palindrome.
 *
 * @author Developer
 * @version 6.0
 */

public class PalindromeChecker {

    /**
     * Application entry point for UC6.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Declare and initialize the input string.
        String input = "civic";

        // Create a Queue to store characters in FIFO order.
        Queue<Character> queue = new LinkedList<>();

        // Create a Stack to store characters in LIFO order.
        Stack<Character> stack = new Stack<>();

        // Insert each character into both queue and stack.
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Compare characters from queue and stack.
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove();
            char fromStack = stack.pop();

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Display result.
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}


