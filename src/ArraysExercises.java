import java.util.Arrays;

public class ArraysExercises {

    static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }
    }
    static Person[] addPerson(Person[] person, Person otherDude){
        int arrLength = person.length;
        Person[] arrPersons = new Person[arrLength + 1];
        System.arraycopy(person, 0, arrPersons, 0, arrLength);
        arrPersons[arrLength] = otherDude;
        return arrPersons;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        //Person person = new Person("String");
        Person[] person = new Person[3];
        String[] names = {"jason", "henry", "casey"};

        for(int i = 0; i < person.length; i++) {
            person[i] = new Person(names[i]);
            System.out.println(person[i].name);
        }

        System.out.println("------------");

        Person other = new Person("Jason");
        person = addPerson(person, other);
        for (Person value : person) {
            System.out.println(value.name);
        }
    }
}

