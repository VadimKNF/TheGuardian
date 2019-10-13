package Character;


import java.sql.SQLOutput;
import java.util.Scanner;

public class CharacterCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, stranger, whats your name?");
        String name = scanner.nextLine();
        System.out.printf("alright %s, whats your gender?\n1. male\n2. female\n", name);
        byte gender = scanner.nextByte();
        Player newPlayer = new Player();
        newPlayer.setName(name);
        newPlayer.setGenderX(gender);


    }

}
class Player {
    private String name;
    private String[] genderList = {"test", "male", "female"};
    private byte genderX;
    private String gender = genderList[genderX];


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setGenderX(byte genderX) {
        if (genderX == 1 || genderX == 2){
            this.genderX = genderX;
        } else{
            System.out.println("please, pick 1 or 2");

        }

    }

    public byte getGenderX() {
        return genderX;
    }
}