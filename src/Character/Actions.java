package Character;

public class Actions {
    public static int AttackCounter(int mainParam, int weaponStat){
        return mainParam * weaponStat;
    }

    public static int DefenceCounter(int mainParam, int armorStat){
        return mainParam * armorStat;
    }
}
