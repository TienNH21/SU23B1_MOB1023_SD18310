package lesson2_interface;

public class MainClass {
    public static void main(String[] args) {
        Animal c1 = new Cat();
        Cat c = new Cat();
        Dog d = new Dog();
        Chicken ga = new Chicken();
        nuoi(c);
        nuoi(d);
        nuoi(ga);
    }
    
    public static void nuoi(Animal c)
    {
        c.an();
        c.tiengKeu();
        c.diChuyen();
    }
}
