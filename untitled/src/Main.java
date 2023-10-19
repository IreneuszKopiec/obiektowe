import java.util.*;
import java.util.ArrayList;

public class Main {
    public static Random random = new Random();

    public static void main(String[] args) {



        //System.out.println(generateRandomInt());
        //System.out.println(generateRandomGaussian());
        //System.out.println(generateRandomBoolean());
        //wypiszTab();
        //System.out.println(avgTab());
        //minAndMax();
        //piramida();
        //usunDalszeZnaki();
        //StringBuilder napis=new StringBuilder();
        //napis.append("Ala ma kota");
        //System.out.println(reverseString(napis));
        //naOdwrot();
        suma();
        ArrayList<Double> tab=new ArrayList<Double>();
        for(int i=0;i<10;i++) {
            tab.add(random.nextDouble(2,10));
        }
        System.out.println(avarage(tab));
        ArrayList<Integer> tab2=new ArrayList<Integer>();
        for(int i=0;i<10;i++) {
            tab2.add(random.nextInt(-1, 5));
        }
        System.out.println(wystapieniaZera(tab2));
    }

    public static int generateRandomInt() {
        return random.nextInt(10, 15);
    }

    public static double generateRandomDouble() {
        return random.nextDouble();
    }

    public static double generateRandomGaussian() {
        return random.nextGaussian();
    }

    public static boolean generateRandomBoolean() {
        return random.nextBoolean();
    }

    public static void wypiszTab() {
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[10];
        for(int i=0;i<10;i++) {
            tab[i]=scanner.nextInt();
        }
        for(int i=9;i>=0;i--) {
            System.out.println(tab[i]);
        }
    }

    public static double avgTab() {
        int[] tab = new int[20];
        int suma=0;
        for(int i=0;i<20;i++) {
            tab[i]=random.nextInt(1, 100);
            suma+=tab[i];
        }
        double avg = suma/20.0;
        return avg;

    }

    public static void minAndMax() {
        int[] tab= new int[15];
        for(int i=0;i<15;i++) {
            tab[i]=random.nextInt(50);
        }
        System.out.println(Arrays.stream(tab).max().getAsInt());
        System.out.println(Arrays.stream(tab).min().getAsInt());
    }

    public static void piramida() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj znak");
        String znak=scanner.next();
        System.out.println("Podaj wysokosc");
        int wysokosc = scanner.nextInt();

        for(int i=0;i<wysokosc;i++) {
            int liczbaspacji = wysokosc - i -1;
            int liczbaznakow = 2*i + 1;
            StringBuilder sb = new StringBuilder();

            while(liczbaspacji-- > 0) {
                sb.append(' ');
            }
            while(liczbaznakow-- > 0) {
                sb.append(znak);
            }

            System.out.println(sb.toString());
        }
    }

    public static void usunDalszeZnaki() {
        String napis="bananowy";
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<napis.length();i++) {
            char curr=napis.charAt(i);
            if(sb.indexOf(String.valueOf(curr))==-1) {
                sb.append(curr);
            }
        }
        System.out.println(sb.toString());

    }

    public static StringBuilder reverseString(StringBuilder napis) {
        StringBuilder nowy = napis.reverse();
        return nowy;
    }

    public static void naOdwrot() {
        ArrayList<Integer> tab =new ArrayList<Integer>();
        for(int i=0;i<10;i++) {
            tab.add(random.nextInt(10, 100));
        }
        System.out.println(tab);
        Collections.reverse(tab);
        for (int i : tab) {
            System.out.println(i);
        }
    }

    public static void suma() {
        ArrayList<Double> tab = new ArrayList<Double>();
        double suma= 0;
        for(int i=0;i<10;i++) {
            tab.add(random.nextDouble());
            suma+=tab.get(i);
        }
        System.out.println(suma);


    }

    public static double avarage(ArrayList<Double> tab) {
        double sum=0;
        for(int i=0;i<tab.size();i++) {
            sum +=tab.get(i);
        }
        if(sum==0) {
            return 0;
        }
        return sum/tab.size();


    }

    public static int wystapieniaZera(ArrayList<Integer> tab) {
        int l=0;
        for(int i=0;i<tab.size();i++) {
            if(tab.get(i)==0) {
                l++;
            }
        }
        return l;
    }

}