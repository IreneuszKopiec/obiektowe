public class Triple <T, U, V>{
    T v1;
    U v2;
    V v3;

    public Triple(T v1, U v2, V v3) {
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
    }

    public <T> T getFirst() {
        return (T)v1;
    }
    public <U> U getSecond() {
        return (U)v2;
    }
    public <V> V getThird() {
        return (V)v3;
    }
}
