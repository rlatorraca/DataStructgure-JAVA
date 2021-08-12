package ca.com.rlsp.FIFO;

public class Main {
    public static void main(String[] args) {

        Fifo fifo = new Fifo();

        fifo.enqueue(new Node("Antony"));
        fifo.enqueue(new Node("Bruno"));
        fifo.enqueue(new Node("Carlina"));
        fifo.enqueue(new Node("Dianna"));
        fifo.enqueue(new Node("Elmira"));
        fifo.enqueue(new Node("Frida"));
        fifo.enqueue(new Node("Gisele"));
        fifo.enqueue(new Node("Harold"));
        fifo.enqueue(new Node("Inara"));

        System.out.println(fifo);

        System.out.println(fifo.dequeue());

        System.out.println(fifo);

        fifo.enqueue(new Node("Jose"));

        System.out.println(fifo);

        System.out.println(fifo.firstNode());

        System.out.println(fifo);
    }
}
