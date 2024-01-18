package z12;

public class DoTestowania {
    public static void main(String[] args) {
        System.out.println(isEqual(12,12));
        System.out.println(isEqual("12",12));
        System.out.println(isEqual(12,"str"));
        System.out.println(isEqual('2',"2"));

        System.out.println();

        Triple<Integer, String, Integer> triple =
                new Triple<>(12,"string",4);
        System.out.println(triple.getFisrt());
        System.out.println(triple.getSecond());
        System.out.println(triple.getThird());

        System.out.println();

        Integer[] tab = {1,2,3};
        swap(tab,0,2);
        for(int i=0;i<tab.length;i++) {
            System.out.println(tab[i]);
        }
        System.out.println();
        System.out.println(maxValue(tab));

        System.out.println();

        Car car1 = new Car();
        Car car2 = new Car();
        ElectricCar electricCar = new ElectricCar();

        System.out.println(compareObjects(car1, car2));           // true
        System.out.println(compareObjects(car1, electricCar));    // false

    }

    public static <T> boolean isEqual(T v1, T v2) {
        return v1.equals(v2);
    }

    public  static <T> void swap(T[] arr, int a, int b) {
        T help=arr[a];
        arr[a]=arr[b];
        arr[b]=help;
    }


    public static <T extends Comparable<T>> T maxValue(T[] arr) {
        if (arr.length == 0) {
            System.out.println("Pusta tablica");
            return null;
        } else {
            T max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (max.compareTo(arr[i]) == -1) {
                    max = arr[i];
                }
            }
            return max;
        }
    }

    public static <T extends Car> boolean compareObjects(T object1, T object2) {
        return object1.getClass() == object2.getClass();
    }








}
