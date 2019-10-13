package Character;

import java.util.Scanner;

public class CharacterCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // System.out.println("Welcome, stranger, whats your name?");
        //String name = scanner.nextLine();
        //System.out.printf("alright %s, what's your gender?\n1. male\n2. female\n", name);
        //byte gender = scanner.nextByte();
        System.out.println("good work now select class\n1. warrior\n2. wizard");
        byte roleClass = scanner.nextByte();
        Player newPlayer = new Player();
        newPlayer.setRoleY(roleClass);
        System.out.println(newPlayer.getRoleY());

        /*Player newPlayer = new Player();
        newPlayer.setName(name);
        newPlayer.setGenderX(gender);
        newPlayer.setRoleY(roleClass);

        Player.showCharacterStats(newPlayer);*/




    }

}
class Player {
    private String name;
    private String[] genderList = {"male", "female"};
    private String[] rList = {"warrior", "wizard"};
    private byte genderX;
    private String gender = genderList[genderX];
    private RoleClass warrior = new RoleClass(100, 50, 100);
    private RoleClass wizard = new RoleClass(50, 100, 100);
    private RoleClass[] rolesList = {warrior, wizard};
    private byte roleY;
    //private RoleClass role = rolesList[roleY];
    private String role = rList[roleY];



    public static void showCharacterStats(Player obj){
        System.out.printf("Character stats\nname: %s\ngender: %s\nclass: %s", obj.getName(), obj.getGender(), obj.getRole());

        //System.out.printf("strength: %d\n intellect: %d\n leadership: %d\n", );
    }

    public byte getRoleY(){
        return roleY;
    }
    public void setRoleY(byte roleY) {
        if (roleY == 1 || roleY == 2){
            roleY--;
            this.roleY = roleY;
        } else {
            System.out.println("you have to pick 1 or 2");
        }
    }
    public String getRole(){
        return role;
    }

    public void setRole(String role){
        this.role = role;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setGenderX(byte genderX) {
        if (genderX == 1 || genderX == 2){
            genderX--;
            this.genderX = genderX;
        } else{
            System.out.println("please, pick 1 or 2");
        }
    }

    public byte getGenderX() {
        return genderX;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}