package Main.Lesson16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Participant {

    public Participant(String name, int age, String email) {
    }

    public void displayParticipant() {
        try {
            FileReader fr = new FileReader("Example.txt");
            BufferedReader br = new BufferedReader(fr);
        } catch (IOException e) {
            System.out.println("IO" + e.getMessage());
        }


    }

    public static void main(String[] args) {
        Participant participant = new Participant("John Doe", 20, "john.doe@example.com");
        participant.displayParticipant();

    }

}