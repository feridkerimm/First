package Main.Lesson13.Zoos;

class Animal {
    protected String name;
    protected int age;
    protected String sound;

    public Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    public void makeSounds() {
        System.out.println(name + " can make a sound " + sound);
    }


}
