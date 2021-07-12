/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.queue;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(9);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());

        Queue<Integer> queue = new Queue<>();
        queue.enqueue(15);
        queue.enqueue(16);
        queue.enqueue(17);
        queue.enqueue(18);
        queue.dequeue();
        System.out.println(queue.peek());
        System.out.println(queue);

    }
}