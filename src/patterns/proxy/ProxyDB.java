package patterns.proxy;

import java.util.HashSet;
import java.util.Set;

public class ProxyDB implements db{

    db myDb = new myDb();
    Set<String> cache = new HashSet<>();

    @Override
    public void create(String item) {
        myDb.create(item);
        cache.add(item);
    }

    @Override
    public void read(String item) {
        if (cache.contains(item)) {
            System.out.println("Response " + item);
        } else {
            myDb.read(item);
        }
    }
}
