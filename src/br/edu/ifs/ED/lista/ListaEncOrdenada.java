package br.edu.ifs.ED.lista;

public class ListaEncOrdenada<T extends Comparable<T>> extends ListaEnc<T> {

    public void inserirNoMeio(T elemento) {
        No<T> novoNo = new No<T>(elemento);

        No<T> auxiliar = inicio;
        No<T> auxiliar2 = null;

        while ((auxiliar != null) && (auxiliar.getElemento().compareTo(novoNo.getElemento())) == -1) {
            auxiliar2 = auxiliar;
            auxiliar = auxiliar.inicio();
        }

        if (this.inicio == null) {
            this.inicio = novoNo;
        } else if (auxiliar == this.inicio) {
            novoNo.inicio = this.inicio;
            this.inicio = novoNo;
        } else {
            novoNo.inicio = auxiliar;
            auxiliar2.inicio = novoNo;
        }
    }

    //===============ordem crescente=============
    public void ordemCrescente(No<T> inicio) {
        No<T> auxiliar = inicio;
        No<T> auxiliar2 = inicio;
        No<T> novoNo = null;
        while ((auxiliar2!=null)&&(auxiliar2.elemento < auxiliar.elemento))
        {
            auxiliar = auxiliar2;
            auxiliar2=auxiliar.prox;
        }
        if(auxiliar == auxiliar2) {
            novoNo.prox=auxiliar;
            inicio=novoNo;
        }
        else
        {
            novoNo.prox=auxiliar.prox;
            auxiliar.prox=novoNo;
        }
    }


    //===============ordem crescente=============
    public void ordemDecrescente(No<T> inicio) {
        No<T> auxiliar = inicio;
        No<T> auxiliar2 = inicio;
        No<T> novoNo = null;
        Object elemento;
        while ((auxiliar2!=null)&&(auxiliar2.getElemento()<auxiliar.getElemento()))
        {
            auxiliar = auxiliar2;
            auxiliar2=auxiliar.prox;
        }
        if(auxiliar == auxiliar2) {
            novoNo.prox=auxiliar;
            inicio=novoNo;
        }
        else
        {
            novoNo.prox=auxiliar.prox;
            auxiliar.prox=novoNo;
        }
    }

}
