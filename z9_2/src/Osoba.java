import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Osoba implements Comparable<Osoba>, Cloneable{
    String name;
    double height;
    int age;

    public Osoba(String name, double height, int age) {
        this.name=name;
        this.height=height;
        this.age=age;
    }

    public Osoba(double height, int age) {
        this.height=height;
        this.age=age;
    }

    public Osoba(int age) {
        this.age=age;
    }

    @Override
    public String toString() {
        return " height=" + height +
                ", age=" + age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       return super.clone();
    }

    @Override
    public int compareTo(Osoba o) {
        return 0;
    }


    public static class Main {
        public static void main(String[] args) {
            ArrayList<Osoba> osobaList = new ArrayList<>();
            osobaList.add(new Osoba(156.0, 15));
            osobaList.add(new Osoba(158.0, 18));
            osobaList.add(new Osoba(256.0, 18));
            osobaList.add(new Osoba(176.0, 18));
            System.out.println(osobaList);
            Collections.sort(osobaList, new OsobaheightComparator());
            System.out.println(osobaList);

            ArrayList<Osoba> osobaList2 = new ArrayList<>();
            osobaList2.add(new Osoba(156.0, 15));
            osobaList2.add(new Osoba(158.0, 18));
            osobaList2.add(new Osoba(256.0, 18));
            osobaList2.add(new Osoba(176.0, 18));
            Collections.sort(osobaList2, new OsobaAgeComparator());
            System.out.println(osobaList2);



        }




    }
    //@Override
    //public int compareTo(Osoba o) {
     //   if(Math.signum(o.height - this.height)==0) {
     //       return Integer.compare(o.age,this.age);
     //   }
    //    return Double.compare(o.height, this.height);
   // }

}
class OsobaheightComparator implements Comparator<Osoba> {

    @Override
    public int compare(Osoba o1, Osoba o2) {
        return Double.compare(o2.height, o1.height);
    }
}
class OsobaAgeComparator implements  Comparator<Osoba> {

    @Override
    public int compare(Osoba o1, Osoba o2) {
        return Integer.compare(o2.age, o1.age);
    }
}