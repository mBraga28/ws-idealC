package Aplicação;

import java.util.HashSet;
import java.util.Set;

public class Exe8_1 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");

        //                     |----> é ultilizado para identificar se é true ou false
        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }
    }
}
