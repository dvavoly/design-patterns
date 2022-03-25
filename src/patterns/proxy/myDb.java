package patterns.proxy;

import java.util.HashSet;
import java.util.Set;

public class myDb implements db {

    private final Set<String> db = new HashSet<>();

    @Override
    public void create(String item) {
        db.add(item);
        System.out.println("Request " + item);
    }

    @Override
    public void read(String item) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            System.out.println("Response " + item);
    }
}
