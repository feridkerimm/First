package Main.Lesson13.Zoos;

class Aquatics extends Animal {

    private double swimmingDepth;

    public Aquatics(String name, int age, String sound, double swimmingDepth) {
        super(name, age, sound);
        this.swimmingDepth = swimmingDepth;
    }

    public void swim() {
        System.out.println("Aquatics can swim.");
    }

    public void displayInfo() {
        System.out.println("Aquatic's name " + name + ", Age " + age + ", Sound " + sound + ", Swimming Depth " + swimmingDepth);
    }


}
