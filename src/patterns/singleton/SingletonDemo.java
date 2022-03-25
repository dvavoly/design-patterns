package patterns.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Foo");
        Singleton anotherSingleton = Singleton.getInstance("Bar");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
