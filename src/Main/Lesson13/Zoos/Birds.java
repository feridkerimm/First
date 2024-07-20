package Main.Lesson13.Zoos;

class Birds extends Animal {

    private double wingSpan;

    public Birds(String name, int age, String sound, double wingSpan) {
        super(name, age, sound);
        this.wingSpan = wingSpan;
    }

    public void fly() {
        System.out.println("Birds can fly.");
    }

    public void displayInfo() {
        System.out.println("Bird's name " + name + ", Age " + age + ", Sound " + sound + ", Wing Span " + wingSpan);
    }


}
