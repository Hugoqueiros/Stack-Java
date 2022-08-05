package ltc_project_2_by_hugo;

import java.util.NoSuchElementException;

public class Pilha {

    private final int TAMANHO;                    // dimensão do vetor = tamanho máximo da pilha
    private String pilha[];                       // vetor que implementa a pilha
    private int ultimo;
    private int topo;

    public Pilha() {
        TAMANHO=10;
        ultimo = 0;
        topo=0;
        pilha = new String [TAMANHO];
    }
    
    // verifica se a pilha está vazia
    public boolean PilhaVazia() {
        return topo == 0;
    }

    // verifica se a pilha está cheia
    public boolean PilhaCheia() {
        return ultimo == TAMANHO;
    }

    //metodo de adicionar data à pilha
    public void push(String data) {
        if(!PilhaCheia()){
          pilha[topo] = data;
          topo++;  
        }
        else{
            System.out.println("Pilha Cheia!");
        }
    }
    
    //metodo de retirar data à pilha através da regra LIFO (Last In First Out)
    public void pop() {
        String data;
        if (!PilhaVazia()) {
            data = pilha[topo-1];
            pilha[topo-1] = "";
            topo--;
            if(topo>TAMANHO){
                pilha[topo-1] = "";
            }
            System.out.println("O elemento " + data + " foi removido da pilha");
        }
        else {
            System.out.println("Pilha Vazia!");
        }
    }
    
    //método de retirar data à pilha em específico para a Realização da Inversa da Expressão
    public void popInversa() {
        String data;
        if (!PilhaVazia()) {
            data = pilha[topo-1];
            pilha[topo-1] = "";
            topo--;
            if(topo>TAMANHO){
                pilha[topo-1] = "";
            }
            System.out.printf(data);
        }
        else {
            System.out.println("Pilha Vazia!");
        }
    }

    //mostra elementos da pilha
    public void MostraPilha() {
        for (int i = 0; i<topo; i++) {
            System.out.println(pilha[i]);
        }
    }
}