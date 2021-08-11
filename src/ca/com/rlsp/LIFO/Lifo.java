package ca.com.rlsp.LIFO;

/*
    Sao as famosas PILHAS (Em portugues)
     - Ultimo a entrar é o Primeiro a sair
 */
public class Lifo {

    Node<?> referenceNodeLifo = null;

    /*
        Entrando novo NO e apontaando a Entrada da Pilha para o novo No
     */
    public void push(Node newNode) {
        Node auxiliarNode = referenceNodeLifo; // Copia a Entrada da Pilha par ao auxiliar
        referenceNodeLifo = newNode; // Copia o novo NO como entrada da Pilha
        referenceNodeLifo.setReferenceNode(auxiliarNode); // Seta o antigo No final como No anterior
    }

    /*
        Retira da Filha
     */
    public Node<?> pop() {

        if(!isEmpty()){
            Node nodePoped = referenceNodeLifo;
            referenceNodeLifo = referenceNodeLifo.getReferenceNode();
            return nodePoped;
        }
        return null;
    }

    // Apresenta, sem retirar o No
    public Node<?> top(){
        return referenceNodeLifo;
    }


    public boolean isEmpty(){
        return referenceNodeLifo == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "------------\n";
        stringRetorno += "  LIFO / PILHA\n";
        stringRetorno += "------------\n";
        Node auxiliarNode = referenceNodeLifo; // Pega o Ultimo NO
        while(true){
            if(auxiliarNode != null){
                stringRetorno += "[No{dado=" + auxiliarNode.getBook() + " - " + auxiliarNode.getYear() + "}]\n";
                auxiliarNode = auxiliarNode.getReferenceNode(); // Passa a referencia do proximo NO abaixo da pilha
            }else{
                break;
            }
        }
        stringRetorno += "============";
        return stringRetorno;
    }
}
