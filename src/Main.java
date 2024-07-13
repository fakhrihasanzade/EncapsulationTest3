import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        String name = "Fexri";
        int age = 26;

        Person men = new Person();

        men.setName(name);
        men.setAge(age);

        String ad = men.getName();
        int yas = men.getAge();

        System.out.println("My name is " + ad + "\n" + "I am " + yas + " year older");

    }
}