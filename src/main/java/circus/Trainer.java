package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
import circus.animal.Parrot;

public class Trainer {
    public static void main(String[] args) {
<<<<<<< HEAD
        Duck d = new Duck();
        System.out.println(d.speak());
=======
        Duck d = new Duck("Donald");
        getToSpeak(d);

>>>>>>> upstream/master
        Bird b = (Bird)d;  // upcasting
        Animal a = (Animal)b; // upcasting
        System.out.println(a.speak());
        Duck d2 = (Duck) a; // downcasting
<<<<<<< HEAD
        train(new Duck());
        // train(new Parrot());
=======
        train(new Duck("Daisy"));
        // train(new circus.animal.Parrot());
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
>>>>>>> upstream/master
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        }
    }
}
