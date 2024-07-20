package Mentor.ApartmentManagement;

public class Building {

    int id;
    String buildingName;
    int buildingNumber;
    int countOfFloor;
    String apartmentNumber;
    boolean mortgage;

    public Building(int id, String buildingName, int buildingNumber, int countOfFloor, String apartmentNumber, boolean mortgage) {
        this.id = id;
        this.buildingName = buildingName;
        this.buildingNumber = buildingNumber;
        this.countOfFloor = countOfFloor;
        this.apartmentNumber = apartmentNumber;
        this.mortgage = mortgage;
    }

    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", buildingName='" + buildingName + '\'' +
                ", buildingNumber=" + buildingNumber +
                ", countOfFloor=" + countOfFloor +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", mortgage=" + mortgage;
    }


}
