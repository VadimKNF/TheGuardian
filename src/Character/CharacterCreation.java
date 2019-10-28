package Character;

import java.util.Scanner;

public class CharacterCreation {
    public static void main(String[] args) {
        Player newPlayer = new Player();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, stranger, whats your name?");
        String name = scanner.nextLine();
        newPlayer.setName(name);
        System.out.printf("alright %s, what's your gender?\n1. male\n2. female\n", name);
        byte gender = scanner.nextByte();
        newPlayer.setGender(gender);
        System.out.println("good work now select class\n1. warrior\n2. wizard");
        byte roleClass = scanner.nextByte();
        newPlayer.setRole(roleClass);

        Player.showCharacterInformation(newPlayer);
        Player.showStats(newPlayer.getRole());

    }

}
class Player extends RoleClass {
    private String name;
    private String[] genderList = {"male", "female"};
    private byte genderX;
    private String gender = genderList[genderX];
    private RoleClass warrior = new RoleClass("warior", 10, 5, 10);
    private RoleClass wizard = new RoleClass("wizard", 5, 10, 10);
    private RoleClass[] rolesList = {warrior, wizard};
    private byte roleY;
    private RoleClass role = rolesList[roleY];



    public static void showCharacterInformation(Player obj){
        System.out.printf("Character information\nname: %s \ngender: %s\nclass: %s\n", obj.getName(), obj.getGender(), RoleClass.showClassName(obj.role));

    }

    public void setGender(byte genderX) {
        if (genderX == 1 || genderX == 2){
            genderX--;
            this.gender = genderList[genderX];
        } else{
            System.out.println("please, pick 1 or 2");
        }
    }

    public void setRole(byte roleY) {
        if (roleY == 1 || roleY == 2){
            roleY--;
            this.role = rolesList[roleY];
        } else {
            System.out.println("you have to pick 1 or 2");
        }
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName(){ return name; }
    public String getGender(){
        return gender;
    }
    public byte getGenderX() {
        return genderX;
    }
    public RoleClass getRole(){ return role; }
    public byte getRoleY(){ return roleY; }



    Player(String name, String className, int strength, int intellect, int leadership, String gender){
        super (className, strength, intellect, leadership);
        this.name = name;
        this.gender = gender;
    }
    Player(){}

}