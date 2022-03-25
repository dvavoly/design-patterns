package patterns.iterator;

public class Main {
    public static void main(String[] args) {
        var skills = new String[]{"Java", "Spring", "Hibernate", "Maven", "PostgreSQL"};
        var developer = new JavaDeveloper("Yevhen Danylov", skills);

        var iterator = developer.getIterator();
        System.out.print("Developer: " + developer.name() + "\nSkills: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
