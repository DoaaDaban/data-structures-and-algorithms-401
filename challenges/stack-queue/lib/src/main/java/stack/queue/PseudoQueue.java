package stack.queue;

import java.util.NoSuchElementException;

public class PseudoQueue<G> implements queueable{
    public Stack<G> stack;
    public Stack<G> stack2;

    public PseudoQueue() {
        this.stack = new Stack<>();
        this.stack2 = new Stack<>();
    }

    @Override
    public void enqueue(Object data) {
        while (!stack.isEmpty())
        {
            stack2.push(stack.pop());
        }

        stack.push((G) data);

        while (!stack2.isEmpty())
        {
            stack.push(stack2.pop());
        }
    }

    @Override
    public G dequeue() {
        if (stack.isEmpty())
        {
            System.out.println("Queue is Empty");
            throw new NullPointerException();
        }

        G data = stack.peek();
        stack.pop();
        return data;
    }


    @Override
    public String toString() {
        return "PseudoQueue{" +
                "stack=\n" + stack +
                ", stack2=\n" + stack2 +
                '}';
    }
}
