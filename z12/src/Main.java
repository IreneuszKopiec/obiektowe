import java.util.Arrays;


public class Main {


    public static void main(String[] args) {
        Box<String, Integer> box = new Box<>("Cześć", 3);
        Box<Integer, String> box2 = new Box<>(5, "Cześć");
        Box<Integer, Integer> box3 = new Box<>(5, 3);
        wypisz(4);
        wypisz("str");

        System.out.println();

        System.out.println(isEqual(5,5));
        System.out.println(isEqual(5,4));
        System.out.println(isEqual(5,5.0));
        System.out.println(isEqual(5,"str"));
        System.out.println(isEqual("str","str2"));

        System.out.println();

        Triple<Integer, String, Integer> triple =
                new Triple<>(1,"2",3);
        triple.getFirst();
        triple.getSecond();
        triple.getThird();

        System.out.println();

        String[] tab = {"str1","str2", "str3"};
        System.out.println("Przed");
        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[2]);
        System.out.println("Po");
        swap(tab,0,3);
        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[2]);

        System.out.println();

        Integer[] tab2 = {4,7,3};
        System.out.println(maxValue(tab2));

    }
    public static <T> void wypisz(T val) {
        System.out.println(val);
    }

    public static <T> boolean isEqual(T v1, T v2) {
        return v1.equals(v2);
    }

    public static <T> void swap(T[] arr, int a, int b) {
        if(arr.length>a&&arr.length>b) {
            T help=arr[a];
            arr[a]=arr[b];
            arr[b]=help;
        }

    }

    public static <T extends Comparable<T>> T maxValue(T[] arr) {
        if(arr.length==0) {
            System.out.println("Pusta tablica");
            return null;
        } else {
            T max = arr[0];
            for(int i=1;i<arr.length;i++) {
                if(max.compareTo(arr[i])==-1) {
                    max=arr[i];
                }
            }
            return max;
        }

    }


}