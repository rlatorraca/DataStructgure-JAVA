package ca.com.rlsp.LIFO;

public class Main {

    public static void main(String[] args) {

       Lifo lifo = new Lifo();
       System.out.println("LIFO is Empty => "+ lifo.isEmpty());
       lifo.push(new Node("Livro 01", 1990));
       lifo.push(new Node("Livro 03", 1999));
       lifo.push(new Node("Livro 04", 1970));
       lifo.push(new Node("Livro 05", 2020));
       lifo.push(new Node("Livro 07", 1990));
       lifo.push(new Node("Livro 09", 1340));
       lifo.push(new Node("Livro 11", 1994));
       lifo.push(new Node("Livro 15", 1950));

       System.out.println(lifo);

       System.out.println(lifo.pop());

       System.out.println(lifo);

       lifo.push(new Node("Livro 1000", 2021));

       System.out.println(lifo);
       System.out.println(lifo.pop());
       System.out.println(lifo.pop());
       System.out.println(lifo.pop());

       lifo.push(new Node("Livro 23", 2021));

       System.out.println(lifo);
       System.out.println("LIFO is Empty => "+ lifo.isEmpty());
       System.out.println(lifo.top());
    }
}
