package br.edu.ifs.ED.lista;

public class ListaEnc<T extends Comparable<T>> extends Lista<T> {

    //=============Incluir elemento na lista=========
    public T incluir(T elemento) {
        No<T> novoNo = new No<T>(elemento);

        No<T> auxiliar = inicio;
        No<T> auxiliar2 = null;
        while ((auxiliar != null) && (auxiliar).getElemento().compareTo(novoNo.getElemento()) == -1) {
            auxiliar2 = auxiliar;
            auxiliar = (No<T>) auxiliar.getElemento();
        }
        if (this.inicio == null) {
            this.inicio = novoNo;
        } else if (auxiliar == this.inicio) {
            novoNo.setProx(auxiliar);
            this.inicio = novoNo;
        } else {
            novoNo.setProx(auxiliar);
            auxiliar2.setProx(novoNo);

        }
        return elemento;

    }

    //==============Incluir no Inicio da Lista=======
    public void incluirInicio(No no) {

        no.prox = inicio;
        inicio = no;
        tamanho++;
    }
//=====criar exceção

    //====Incluir um Elemento na Posição específica======
    public void incluir(T elemento, int posicao) {
        // fix the position
        if (posicao < 0) {
            posicao = 0;
        }
        if (posicao > tamanho) {
            posicao = tamanho;
        }
        // if the list is empty, make it be the only element
        if (inicio == null) {
            inicio = new No<T>(elemento);
            throw new IllegalArgumentException("Posição Inválida!");

        }
        // if adding at the front of the list...
        else if (posicao == 0) {
            No temp = new No<T>(elemento);
            temp.prox = inicio;
            inicio = temp;
        }
        // else find the correct position and insert
        else {
            No<T> temp = inicio;
            for (int i = 1; i < posicao; i += 1) {
                temp = temp.prox;
            }
            No<T> novoNo = new No<T>(elemento);
            novoNo.prox = temp.prox;
            temp.prox = novoNo;
        }
        // the list is now one value longer
        tamanho += 1;
    }

    //==========Get na Posicao=========
    public T get(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição Inválida!");
        }
        return this.incluir(null);
    }

    //=============Get Elemento===============
    public  No<T> get(T elemento) {
        No<T> auxiliar = inicio;
        while ((auxiliar != null)&&(auxiliar.getElemento().compareTo(elemento))!=0)
        {
            auxiliar = auxiliar.getProx();
        }

        return auxiliar;
    }

    //=============Remover da Posição==============
    public void remover(int posicao) {
        // fix position
        if (posicao < 0) {
            posicao = 0;

        }
        if (posicao >= tamanho) {
            posicao = tamanho
                    -1;

        }
        // if nothing in the list, do nothing
        if (inicio == null)
            return;
        // if removing the head element...
        if (posicao == 0) {
            inicio = inicio.prox;

        }
        // else advance to the correct position and remove
        else {
            No<T> temp = inicio;
            for (int i=1; i<posicao; i+=1) {
                temp = temp.prox;

            }
            temp.prox = temp.prox.prox;

        }
        // reduce the length of the list
        tamanho -= 1;

    }

    //=========Contém===========
    public  boolean contem(T elemento) {
        No<T> auxiliar = inicio;
        while (auxiliar != null)
        {

            auxiliar = auxiliar.prox;
        }
        return false;
    }



    private boolean incluir(boolean equals) {
        // TODO Auto-generated method stub
        return false;
    }




}