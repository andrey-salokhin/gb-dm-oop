package lesson_3;

public class Component {
    private String name;
    private String weight;

    private int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public String getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s {Название: %s, вес: %s, сила: %s}", getClass().getSimpleName(), this.name, this.weight,
                this.power);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Component component = (Component) obj;

        return power == component.getPower() &&
                weight.equals(component.getWeight()) &&
                name.equals(component.getName());
    }
}
