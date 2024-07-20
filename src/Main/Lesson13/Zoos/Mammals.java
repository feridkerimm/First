package Main.Lesson13.Zoos;

class Mammals extends Animal {
    private String furColor;

    public Mammals(String name, int age, String sound, String furColor) {
        super(name, age, sound);
        this.furColor = furColor;
    }

    public void giveBirth() {
        System.out.println("Mammal gives birth.");
    }

    public void displayInfo() {
        System.out.println("Mammal's name " + name + ", Age " + age + ", Sound " + sound + ", FurColor " + furColor);
    }


}
