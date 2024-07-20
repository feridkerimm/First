package Mentor.ApartmentManagement;

public class Person {

    int id;
    String name;
    String lastName;
    int age;
    String profession;
    int numberOfFamilies;
    Building building;

    public Person(int id, String name, String lastName, int age, String profession, int numberOfFamilies, Building building) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.profession = profession;
        this.numberOfFamilies = numberOfFamilies;
        this.building = building;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    public int getNumberOfFamilies() {
        return numberOfFamilies;
    }

    public Building getBuilding() {
        return building;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                ", numberOfFamilies=" + numberOfFamilies +
                "}\n" + building +
                '}';
    }
}
