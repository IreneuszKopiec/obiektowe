interface MyComparator {
    abstract int compare(int a, int b);
}
public class TestMyComparator implements MyComparator{
    @Override
    public int compare(int a, int b) {
        if(a<b) return -1;
        if(a==b) return 0;
        return 1;
    }

    public static void main(String[] args) {
        TestMyComparator test=new TestMyComparator();
        System.out.println(test.compare(1,2));
        System.out.println(test.compare(2,1));
        System.out.println(test.compare(2,2));


    }
}
