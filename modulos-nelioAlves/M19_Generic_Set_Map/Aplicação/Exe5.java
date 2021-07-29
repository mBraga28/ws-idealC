/* Parte 2
Princípio get/put - covariância

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);
             |---> indica q pode ser qualquer tipo de Number(int, double, long, short, float e byte).
        List<?extends Number> list=intList;
        Number x=list.get(0);
        list.add(20); // erro de compilacao

get - OK
put - ERROR

   Parte 3
Princípio get/put - contravariância
        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");
              |---> indica q pode ser qualquer tipo de um super tipo de Number(ou seja, Object)
        List<? super Number> myNums = myObjs;
        myNums.add(10);
        myNums.add(3.14);
        Number x = myNums.get(0); // erro de compilacao

get - ERROR
put - OK

*/


package Aplicação;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exe5 {
    public static void main(String[] args) {
        List<Integer> meusInts = Arrays.asList(1, 2, 3, 4);
        List<Double> meusDoubles = Arrays.asList(3.14, 6.28);
        List<Object> meusObjs = new ArrayList<Object>();

        copiar(meusInts, meusObjs);
        imprimirLista(meusObjs);
        copiar(meusDoubles, meusObjs);
        imprimirLista(meusObjs);
    }

    public static void copiar(List<? extends Number> origem, List<? super Number> destino) {
        for (Number número : origem) {
            destino.add(número);
        }
    }

    public static void imprimirLista(List<?> lista) {
        for (Object obj : lista) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

}
