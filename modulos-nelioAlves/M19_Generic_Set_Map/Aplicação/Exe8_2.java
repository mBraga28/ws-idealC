package Aplicação;

import java.util.TreeSet;
import java.util.Set;

public class Exe8_2 {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();

        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }
    }
}
