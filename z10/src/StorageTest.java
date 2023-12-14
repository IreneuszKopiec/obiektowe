interface Storage {
    abstract boolean save(String data);
    abstract boolean delete(String identifier);
    abstract String retrieve(String identifier);
}

class FileStorage implements Storage{
    String data;
    String identifier;

    public FileStorage(String data, String identifier) {
        this.data=data;
        this.identifier=identifier;
    }

    @Override
    public boolean save(String data) {
        return data!=null;
    }

    @Override
    public boolean delete(String identifier) {
        return false;
    }

    @Override
    public String retrieve(String identifier) {
        return identifier;
    }
}

class DatabaseStorage implements Storage {
    String data;
    String identifier;

    public DatabaseStorage(String data, String identifier) {
        this.data=data;
        this.identifier=identifier;
    }

    @Override
    public boolean save(String data) {
        return true;
    }

    @Override
    public boolean delete(String identifier) {
        return false;
    }

    @Override
    public String retrieve(String identifier) {
        return identifier;
    }
}

public class StorageTest {
    public static void main(String[] args) {
        FileStorage fs = new FileStorage("data1", "1");
        DatabaseStorage ds = new DatabaseStorage("data2", "2");
        System.out.println(fs.save(fs.data));
        System.out.println(fs.retrieve(fs.identifier));
        System.out.println(fs.delete(fs.identifier));

        System.out.println();

        System.out.println(ds.save(ds.data));
        System.out.println(ds.retrieve(ds.identifier));
        System.out.println(ds.delete(ds.identifier));
    }

}
