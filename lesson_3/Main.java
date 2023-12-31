package lesson_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.addComponent(new Component("Peneciline", "0.6", 15))
                .addComponent(new Component("Water", "1.2", 4));

        // while(pharmacy.hasNext()){
        // System.out.println(pharmacy.next());
        // }

        for (Component item : pharmacy) {
            System.out.println(item);
        }

        Pharmacy pharmacy2 = new Pharmacy();
        pharmacy2.addComponent(new Component("Peneciline", "0.6", 14))
                .addComponent(new Component("Water", "1.2", 2));

        Pharmacy pharmacy3 = new Pharmacy();
        pharmacy3.addComponent(new Component("Peneciline", "0.6", 24))
                .addComponent(new Component("Water", "1.2", 6));

        List<Pharmacy> pharmacyList = new ArrayList<>();
        pharmacyList.add(pharmacy);
        pharmacyList.add(pharmacy2);
        pharmacyList.add(pharmacy3);
        System.out.println(pharmacyList);
        System.out.println("---------- list");

        Collections.sort(pharmacyList);
        System.out.println(pharmacyList);

        // Так не работает:
        // System.out.println(pharmacy > pharmacy2);
        Pharmacy pharmacy4 = new Pharmacy();
        pharmacy4.addComponent(new Component("Peneciline", "0.6", 24))
                .addComponent(new Component("Water", "1.2", 6));

        System.out.println(pharmacy4.equals(pharmacy3));


        Set<Pharmacy> result = new HashSet<>();

        result.add(pharmacy4);
        result.add(pharmacy3);
        result.add(pharmacy2);
        System.out.println("----------");
        System.out.println(result);
        System.out.println(pharmacy3.equals(pharmacy4));

    }
}
