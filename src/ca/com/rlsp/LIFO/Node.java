package ca.com.rlsp.LIFO;

public class Node<Object> {

    private String book;
    private Integer year;
    private Node<Object> referenceNode;

    public Node(String book, Integer year) {
        this.book = book;
        this.year = year;
        this.referenceNode = null;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Node<Object> getReferenceNode() {
        return referenceNode;
    }

    public void setReferenceNode(Node<Object> referenceNode) {
        this.referenceNode = referenceNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "book='" + book + '\'' +
                ", year=" + year +
                '}';
    }
}
