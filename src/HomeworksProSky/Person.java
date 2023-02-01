package HomeworksProSky;

public class Person {
    private String name;
    private static int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static boolean adult() {
        return age > 18;
    }

    public String toString() {
        return " Имя " + this.name + " возраст " + this.age;
    }

    public String getName() {

        return name;
    }

    public int getAge() {


        return age;
}

    public void increaseAge(int increment) {

        if (increment < 0) {
            throw new IllegalArgumentException("Инкремент отрицательный");
        }
        this.age = increment + age;


    }

    public static void testAge() {
        if (adult()) {
            System.out.println(" go to the bar");
        } else {
            System.out.println(" go to the school");
        }
    }

}
