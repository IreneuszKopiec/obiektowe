import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

        ArrayList<Ksiazka> ksiazki = new ArrayList<>();
        ksiazki.add(new Ksiazka(125));
        ksiazki.add(new Ksiazka(156));
        ksiazki.add(new Ksiazka(111));
        ksiazki.add(new Ksiazka(190));
        Collections.sort(ksiazki, new test2());
        System.out.println(ksiazki);

        System.out.println();

        ArrayList<Samochod> s=new ArrayList<>();
        s.add(new Samochod(123));
        s.add(new Samochod(124));
        s.add(new Samochod(1242343));
        s.add(new Samochod(1223));
        Collections.sort(s, new test());
        System.out.println(s);

        System.out.println();

        ArrayList<Zamowienie> z=new ArrayList<>();
        z.add(new Zamowienie(3.42, 5));
        z.add(new Zamowienie(3.44, 6));
        z.add(new Zamowienie(3.44, 7));
        z.add(new Zamowienie(3.21, 2));
        Collections.sort(z);
        System.out.println(z);

        System.out.println();

        ArrayList<Order> o =new ArrayList<>();
        o.add(new Order(1, LocalDate.now()));
        o.add(new Order(2, LocalDate.now()));
        o.add(new Order(4, LocalDate.now()));
        o.add(new Order(2, LocalDate.now()));
        Collections.sort(o, new test4());
        System.out.println(o);

        System.out.println();

        ArrayList<Song> song = new ArrayList<>();
        song.add(new Song("GEG",123));
        song.add(new Song("FSF",127));
        song.add(new Song("DSD",32141));
        song.add(new Song("GEGG",1233));
        Collections.sort(song, new SongComparator());
        System.out.println(song);

        System.out.println();

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,  4.5));
        students.add(new Student(3,  3.8));
        students.add(new Student(2,  4.0));
        students.add(new Student(5,  3.5));
        students.add(new Student(4, 4.2));

        Collections.sort(students, new AverageGradeComparator());
        System.out.println(students);

        Collections.sort(students, new IdComparator());
        System.out.println(students);

        ArrayList<Integer> lapTimes = new ArrayList<>();
        lapTimes.add(10);
        lapTimes.add(12);
        lapTimes.add(11);
        lapTimes.add(13);
        Athlete originalAthlete = new Athlete("John", lapTimes);

        // Sklonuj sportowca
        Athlete clonedAthlete = originalAthlete.clone();

        // Zmiana czasu na pozycji 3 oryginalnego sportowca
        originalAthlete.setLapTime(2, 14);

        // Wyświetl czasy obu sportowców
        System.out.println("Oryginalny sportowiec: " + originalAthlete.name + ", Czasy: " + originalAthlete.lapTimes);
        System.out.println("Sklonowany sportowiec: " + clonedAthlete.name + ", Czasy: " + clonedAthlete.lapTimes);


    }
}