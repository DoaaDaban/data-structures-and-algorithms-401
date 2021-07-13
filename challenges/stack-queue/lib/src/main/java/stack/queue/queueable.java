package stack.queue;

public interface queueable<G> {
    void enqueue(G data);
    G dequeue();
}
