package Units;

import Roles.RoleClass;

import java.io.Serializable;

public class Unit extends RoleClass implements Serializable {
    private String name;
    private int weaponStat;
    private int armorStat;
    private int healthPoint;

    public void setName(String name){ this.name = name; }
    public void setWeaponStat(int weaponStat){ this.weaponStat = weaponStat; }
    public void setArmorStat(int armorStat){ this.armorStat = armorStat; }
    public void setHealthPoint(int healthPoint){ this.healthPoint = healthPoint; }

    public String getName(){ return name; }
    public int getWeaponStat(){ return weaponStat; }
    public int getArmorStat(){ return armorStat; }
    public int getHealthPoint(){ return healthPoint; }

    public Unit(){}

    public Unit (String name, String className, int strength, int intellect, int leadership, int weaponStat, int armorStat, int healthPoint) {
        super (className, strength, intellect, leadership);
        this.name = name;
        this.weaponStat = weaponStat;
        this.armorStat = armorStat;
        this.healthPoint = healthPoint;
    }
}
