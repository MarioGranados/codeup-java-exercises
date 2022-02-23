public class Person {

    private String name;
    private int age;
    private double favoriteNum;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public Person(String name, int age, double favoriteNum) {
        this(name, age);
        this.favoriteNum = favoriteNum;
    }

    //getter
    public String getName(){
//TODO: return the person's name
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public double getFavoriteNum() {
        return this.favoriteNum;
    }
    //setter
    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello, my name is: " + getName());
    }

    public static void main(String[] args) {

/*        Person person1 = new Person();
        person1.setName("john");
        Person person2 = new Person();
        person2.setName("john");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);*/

/*        Person person1 = new Person();
        person1.setName("John");
        Person person2 = person1;
        System.out.println(person1 == person2);*/

/*        Person person1 = new Person();
        person1.setName("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());*/

        Person name1 = new Person("Mario", 25,20.0);
        //Person name2 = new Person(); //error here because we have to assign it things first

        //name2.setName("john");

        System.out.println(name1.getName());
        System.out.println(name1.getAge());
        System.out.println(name1.getFavoriteNum());
    }
}
