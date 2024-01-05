public class Main {
    public static void main(String[] args) {

//        Dog d = new Dog();
//        d.bark();// Bark-Bark!
//
//        Chihuahua c = new Chihuahua();
//        c.bark();// Yip-Yip!
//        c.poop();// dog is pooping!

//        Dog d = new Chihuahua();// because it's a Chihuahua
//        d.bark();// Yip-Yip
//
//        Dog dd = new Dog();
//        dd.bark(); // if the dog Bark-Bark!

        Dog d = new Chihuahua(); //creating object of this class - Chihuahua
        d.bark(); // Yip-Yip!
        System.out.println(d.getAvgSize()); //avgSize 10;

        Dog dd = new Dog(); //creating object of original class - Dog
        dd.bark();//Bark-Bark!
        System.out.println(dd.getAvgSize()); //avgSize 20

    }
}