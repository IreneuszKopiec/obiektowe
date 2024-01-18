package z10;

public interface Storage {
    abstract boolean save(String data);
    abstract boolean delete(String identifier);
    abstract String retrieve(String identifier);

}
