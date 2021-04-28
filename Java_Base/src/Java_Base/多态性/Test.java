package Java_Base.多态性;

public class Test {
    public static void main(String[] args) {
//        Person p1 = new Man();
//        p1.eat();
//        Man m = (Man) p1;
//        m.fuck();
//        p1 = new Person();
//        p1.eat();
//        p1 = new Woman();
//        p1.eat();
//        p1.out("2");
//        p1.out(2);

//        Person p2 = new Woman();
//        Man m3 = (Man)p2;


        Man man = new Man();
        man.showage();
        Person person = man;
        System.out.println(person==man);
        System.out.println(person.age);
        person.showage();

    }

}
