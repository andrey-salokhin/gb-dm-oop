package lesson_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy>, Comparator<Pharmacy> {
    // public class Pharmacy{
    // private int index;
    private List<Component> components;

    public Pharmacy() {
        this.components = new ArrayList<>();
        // this.index = 0;
    }

    public List<Component> getComponents() {
        return components;
    }

    public Pharmacy addComponent(Component component) {
        this.components.add(component);
        return this;
    }

    private int getPharmacyPower() {
        int power = 0;
        for (Component component : components) {
            power += component.getPower();
        }
        return power;
    }

    @Override
    public String toString() {
        return String.format("%s Состав: %s, сила: %s\n", getClass().getSimpleName(), this.components,
                this.getPharmacyPower());
    }

    @Override
    public Iterator<Component> iterator() {
        return new ComponentIterator(this);
    }

    @Override
    public int compareTo(Pharmacy o) {
        if (this.getPharmacyPower() > o.getPharmacyPower())
            return 10;
        else if (this.getPharmacyPower() < o.getPharmacyPower())
            return -10;
        return 0;
    }

    @Override
    public int compare(Pharmacy o1, Pharmacy o2) {
        // return o1.compareTo(o2);

        if (o1.getPharmacyPower() > o2.getPharmacyPower())
            return 10;
        else if (o1.getPharmacyPower() < o2.getPharmacyPower())
            return -10;
        return 0;

    }

    // @Override
    // public Iterator<Component> iterator() {
    // return new Iterator<>() {

    // @Override
    // public boolean hasNext() {
    // return index < components.size();
    // }

    // @Override
    // public Component next() {
    // // Component component = components.get(index);
    // // index++;
    // // return component;
    // return components.get(index++);
    // }

    // };
    // }

}
