package ca.com.rlsp.FIFO;

/*
    Sao as famosas FILAS (Em portugues)
     - Primeiro a entrar será o Primeiro a sairs
 */
public class Fifo<Object> {

    private Node referenceEntranceNodeFifo;

    public Fifo() {
    }

    public Fifo(Node referenceEntranceNodeFifo) {
        this.referenceEntranceNodeFifo = null;
    }

    // Enfileirar (ENTRA)
    public void enqueue(Node newNode){
        newNode.setNodeReference(this.referenceEntranceNodeFifo); // Novo Nó se torna o ultmo elemento da fila
        referenceEntranceNodeFifo = newNode; // referencia de entrada da fila sera o novo No

    }

    // Desinfileirar (SAIR)
    public Node dequeue(){

        if(!this.isEmpty()){
            Node lastNodeInTheLine = this.referenceEntranceNodeFifo;
            Node auxiliarNode = this.referenceEntranceNodeFifo;
            while (true){
                if(lastNodeInTheLine.getNodeReference() != null){
                    auxiliarNode = lastNodeInTheLine;
                    lastNodeInTheLine = lastNodeInTheLine.getNodeReference(); // Ate chegar no primeiro (null)
                } else {
                    auxiliarNode.setNodeReference(null);
                    break;
                }
            }
            return lastNodeInTheLine;
        }
        return null;
    }

    // Retorna o Primeiro elemeoo da FIDO/Fila
    public Node firstNode(){

        if(!isEmpty()){
            Node lastNodeInTheLine = this.referenceEntranceNodeFifo;
            while (true){
                if(lastNodeInTheLine.getNodeReference() != null){
                    lastNodeInTheLine = lastNodeInTheLine.getNodeReference(); // Ate chegar no primeiro (null)
                } else {
                    break;
                }
            }
            return lastNodeInTheLine;
        }
        return null;
    }

    public boolean isEmpty(){
        return this.referenceEntranceNodeFifo == null?  true : false;
    }

    @Override
    public String toString() {
        String stringToReturn = "";

        Node auxiliarNode = this.referenceEntranceNodeFifo;

        if(this.referenceEntranceNodeFifo != null){
            while (true){
                stringToReturn += "[No{dado=" + auxiliarNode.getObject() + "}] ---> ";
                if(auxiliarNode.getNodeReference() != null){
                    auxiliarNode = auxiliarNode.getNodeReference();
                } else {
                    stringToReturn += "null";
                    break;
                }
            }
        }else{
            stringToReturn = "null";
        }

        return stringToReturn;
    }
}
