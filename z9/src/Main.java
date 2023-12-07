import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Osoba o1 = new Osoba("Stefan", 182., 21);
        //Osoba o2=(Osoba) o1.clone();
        //System.out.println(o1);
        //System.out.println(o2);
        //o2.age=96;
        //System.out.println(o1);
        //System.out.println(o2);

        //System.out.println();

        //ArrayList<Ksiazka> ksiazki = new ArrayList<>();
        //ksiazki.add(new Ksiazka(125));
        //ksiazki.add(new Ksiazka(156));
        //ksiazki.add(new Ksiazka(111));
        //ksiazki.add(new Ksiazka(190));
        //Collections.sort(ksiazki);
        //System.out.println(ksiazki);

        System.out.println();

        ArrayList<Samochod> s=new ArrayList<>();
        s.add(new Samochod(123));
        s.add(new Samochod(124));
        s.add(new Samochod(1242343));
        s.add(new Samochod(1223));
        Collections.sort(s, new test());
        System.out.println(s);

    }
}