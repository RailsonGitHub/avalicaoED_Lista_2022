package br.edu.ifs.ED.lista;

public class No<T> {

    public T elemento;
    public No<T> prox;

    //=====Construtor Padrão=====
    public No() {
    }

    public No(T elemento) {
        this.elemento = elemento;
        this.prox = prox;
    }
    //=====Getts e Sets==========
    public T getElemento() {
        return this.elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No<T> getProx() {
        return this.prox;
    }

    public void setProx(No<T> prox) {
        this.prox = prox;
    }

}

