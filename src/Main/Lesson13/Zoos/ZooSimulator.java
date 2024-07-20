package Main.Lesson13.Zoos;

public class ZooSimulator {
    public static void main(String[] args) {
        Mammals mammals = new Mammals("Lion",5,"Roar","Golden");
        Birds birds = new Birds("Owl",1,"Hooting",0.43);
        Aquatics aquatics = new Aquatics("Crabs",3,"Clarking",300);

        mammals.displayInfo();
        mammals.makeSounds();
        mammals.giveBirth();
        System.out.println();
        birds.displayInfo();
        birds.makeSounds();
        birds.fly();
        System.out.println();
        aquatics.displayInfo();
        aquatics.makeSounds();
        aquatics.swim();

    }
}
