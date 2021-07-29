package exercício2.serviços;

import exercício2.entidades.Produto;

import java.util.List;

public class Serviço_Calculação {


    public static <P extends Comparable<P>> P max(List<P> lista) {
        /*         ^
            |------|
           indica do tipo de lista que vai ser utilizada, justamente para não dar erro.
         */
        if (lista.isEmpty()) {
            throw new IllegalStateException("Lista não pode estar vazia!!!");
        }
        P max = lista.get(0);
        for (P item : lista) {
            if (item.compareTo(max) > 0) {
                /*
                   para que o compareTo não dê erro, em: L10 (public static <P> Produto max(List<P> lista) {...)
                   teria q utilizar um maneria de definir que o método P seja comparable, ou seja...
                   |-----> L10(public static <P extends Comparable<P>> Produto max(List<P> lista) {
                 */
                max = item;
            }
        }
        return  max;
    }
}
