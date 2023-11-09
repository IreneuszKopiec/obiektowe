public class Animal {
    public String name;

    public Animal() {
        name="default";
    }

    public  Animal(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object other) {
        if(other instanceof Animal temp) {
            return this.name.equals(temp.name);
        }
        else {
            return false;
        }
    }

    public void makeNoise() {
        System.out.println("Odgłosy zwierzecia");
    }

}

class Cat extends Animal {
    public Cat() {

    }
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Miau miau");
    }
}

