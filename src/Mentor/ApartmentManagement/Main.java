package Mentor.ApartmentManagement;

public class Main {
    public static void main(String[] args) {

        Building building = new Building(2027,"Rosa",3,9,"2",true);
        Person person = new Person(12345, "Farid","Karimov",25,"It manager",5,building);

       System.out.println("Id: " +person.getId()+ ", Name:" +person.getName()+ ", Surname: " +person.getLastName()+ ", Age: " + person.getAge()+ ", Profession: " +person.getProfession()+ ", NumberOfFamilies: " +person.getNumberOfFamilies()+ ", Building: "  +person.getBuilding() );

    }
}
