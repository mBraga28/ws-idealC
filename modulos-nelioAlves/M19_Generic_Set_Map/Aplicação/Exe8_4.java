package Aplicação;

import java.util.LinkedHashSet;
import java.util.Set;

public class Exe8_4 {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        set.add("Tv");
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");
        set.add("note");
        set.add("tab");

        set.remove("Tv");
        //              |----> "x tal que..."
        set.removeIf(x -> x.length() > 4);
        set.removeIf(x -> x.charAt(0) == 'n');
        /*                       |-----> no charAt(0) o "zero" significa a posição do algotimo

         */

        for (String p : set) {
            System.out.println(p);
        }
    }
}
