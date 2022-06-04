package br.edu.ifs.ED.lista;

public abstract class Lista<T extends Comparable> {
    public int tamanho;
    public No<T>inicio;
    //=========Percorre a lista e verifica tamanho===
    public int tamanho(No<T> inicio) {
        int tamanho = 0;
        No<T> noEmUso = inicio;
        while (noEmUso != null) {
            tamanho++;
            noEmUso = noEmUso.prox;
        }
        return tamanho;
    }

//=======Incluir na Lista=====


    // Remove toda a lista.
    public void limpar(){
        No<T> inicio = null;
        tamanho = 0;
    }


}