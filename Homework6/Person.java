package Homework6;

import java.util.Objects;

/**
 * В классе Person мы определяем пять полей - `firstName`, `lastName`, `age`,
 * `gender` и `profession`, и конструктор, который принимает значения для всех
 * этих полей.
 * 
 * Мы также реализуем методы `toString`, `equals` и `hashCode`, чтобы мы могли
 * легко преобразовывать объекты Person в строки, сравнивать их и использовать
 * их в качестве ключей в HashMap.
 * 
 * Мы также создаем метод `sayHello`, который просто выводит на экран
 * приветствие с именем и профессией человека.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String profession;

    public Person(String firstName, String lastName, int age, String gender, String profession) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.profession = profession;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", occupation='" + profession + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(gender, person.gender) &&
                Objects.equals(profession, person.profession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, gender, profession);
    }

    public void sayHello() {
        System.out.println("Привет, меня зовут " + firstName + " " + lastName + " и моя профессия " + profession + ".");
    }
}
