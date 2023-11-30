import java.util.Objects;

public class Animal {
    String name;
    int age;
    double weight;

    public Animal(String name, int age, double weight) {
        this.age=age;
        this.name=name;
        this.weight=weight;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o==null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age==animal.age &&
                Double.compare(weight, animal.weight) == 0 &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + age;
        long doubleToLong = Double.doubleToLongBits(weight);
        result = 31 * result * (int)(doubleToLong ^ (doubleToLong >>> 32));
        result = 31 * result + name.hashCode();
        return result;
    }


}
