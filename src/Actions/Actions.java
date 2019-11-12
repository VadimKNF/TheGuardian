package Actions;

public class Actions {
    private int weaponStat;
    private int mainStat;

    public static int attackCounter(int weaponStat, int mainStat){
        return weaponStat + mainStat;
    }

    public static int attack(int attackCounter1, int defence2, int healthPoint2){
        int healthUpdate = (defence2 + healthPoint2) - attackCounter1;
        return healthUpdate;
    }


    public Actions(int weaponStat, int mainStat){
        this.weaponStat = weaponStat;
        this.mainStat = mainStat;
    }
}