package Character;

import Roles.RoleClass;

import java.io.Serializable;

public class Player extends RoleClass implements Serializable {
    private String name;
    private String[] genderList = {"male", "female"};
    private byte genderX;
    private String gender = genderList[genderX];
    private RoleClass warrior = new RoleClass("warior", 10, 5, 10);
    private RoleClass wizard = new RoleClass("wizard", 5, 10, 10);
    private RoleClass[] rolesList = {warrior, wizard};
    private byte roleY;
    private RoleClass role = rolesList[roleY];
    private int mainStat;
    private int weaponStat;
    private int armorStat;
    private int healthPoint;


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

    public void setMainStat(byte roleY){
        switch (roleY) {
            case 1 -> this.mainStat = role.getStrength();
            case 2 -> this.mainStat = role.getIntellect();
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
    public void setName(String name) { this.name = name; }

    public void setWeaponStat(int weaponStat){ this.weaponStat = weaponStat; }
    public void setArmorStat(int armorStat){ this.armorStat = armorStat; }
    public void setHealthPoint(int healthPoint){ this.healthPoint = healthPoint; }

    public int getWeaponStat(){ return weaponStat; }
    public int getArmorStat(){ return armorStat; }
    public int getHealthPoint(){ return healthPoint; }

    public String getName(){ return name; }
    public String getGender(){
        return gender;
    }
    public byte getGenderX() {
        return genderX;
    }
    public RoleClass getRole(){ return role; }
    public byte getRoleY(){ return roleY; }

    public int getMainStat(){ return mainStat; }



    Player(String name, String className, int strength, int intellect, int leadership, String gender){
        super (className, strength, intellect, leadership);
        this.name = name;
        this.gender = gender;
    }
    Player(int mainStat, int weaponStat, int armorStat){
        this.mainStat = mainStat;
        this.weaponStat = weaponStat;
        this.armorStat = armorStat;
    }

    Player(){}

    public String toString(){
        return name + " : " + gender;
    }

}
