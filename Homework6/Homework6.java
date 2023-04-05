package Homework6;

// Создать класс Person.
// У класса должны быть поля:
// 1. Имя (String)
// 2. Фамилия (String)
// 3. Возраст (продумать тип)
// 4. Пол
// 5*. Придумать свои собственные поля

// Для этого класса
// 1. Реализовать методы toString, equals и hashCode.
// 2*. Придумать собственные методы и реализовать их

// В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.
public class Homework6 {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person("Алексей", "Иванов", 25, "мужской", "программист");
        people[1] = new Person("Мария", "Петрова", 19, "женский", "дизайнер");
        people[2] = new Person("Дмитрий", "Сидоров", 35, "мужской", "бухгалтер");
        people[3] = new Person("Татьяна", "Кузнецова", 18, "женский", "студент");
        people[4] = new Person("Иван", "Смирнов", 28, "мужской", "продавец");

        for (Person person : people) {
            if (person.getAge() >= 20) {
                System.out.println(person.getFirstName() + " " + person.getLastName() + ", " + person.getAge() + " лет");
            }
        }
    }
}
