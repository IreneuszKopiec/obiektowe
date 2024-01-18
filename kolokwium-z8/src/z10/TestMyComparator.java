package z10;

public class TestMyComparator implements MyComparator{
    @Override
    public int compare(int a, int b) {
        if(a<b) return -1;
        if(a==b) return 0;
        return 1;
    }
}
