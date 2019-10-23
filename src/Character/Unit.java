package Character;

class Unit {
    private String name;
    private int strength;
    private int intellect;
    private int weaponStat;
    private int armorStat;
    private int healthPoint;

    public void setName(String name){ this.name = name; }
    public void setStrength(int strength){ this.strength = strength; }
    public void setIntellect(int intellect){ this.intellect = intellect; }
    public void setWeaponStat(int weaponStat){ this.weaponStat = weaponStat; }
    public void setArmorStat(int armorStat){ this.armorStat = armorStat; }
    public void setHealthPoint(int healthPoint){ this.healthPoint = healthPoint; }

    public String getName(){ return name; }
    public int getStrength(){ return strength; }
    public int getIntellect(){ return intellect; }
    public int getWeaponStat(){ return weaponStat; }
    public int getArmorStat(){ return armorStat; }
    public int getHealthPoint(){ return healthPoint; }

    public static int attackCounter(int mainParam, int weaponStat) { return mainParam * weaponStat; }
    public static int defenceCounter(int mainParam, int armorStat){
        return mainParam * armorStat;
    }

    Unit(){}

    Unit (String name, int strength, int intellect, int weaponStat, int armorStat, int healthPoint) {
        this.name = name;
        this.strength = strength;
        this.intellect = intellect;
        this.weaponStat = weaponStat;
        this.armorStat = armorStat;
        this.healthPoint = healthPoint;
    }
}

class UnitsList{
    public static void main(String[] args) {
        Unit wolf = new Unit("wolf", 3, 1, 3, 1, 100);

        System.out.println(wolf.attackCounter(wolf.getStrength(), wolf.getWeaponStat()));
        System.out.println(wolf.defenceCounter(wolf.getStrength(), wolf.getArmorStat()));
    }
}