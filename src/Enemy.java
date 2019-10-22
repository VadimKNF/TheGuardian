class Enemy {
    private String enemyName;
    private int enemyStrength;
    private int enemyWeaponStat;
    private int enemyArmorStat;
    private int enemyHealthPoint;

    public void setEnemyName(String enemyName){ this.enemyName = enemyName; }
    public void setEnemyStrength(int enemyStrength){ this.enemyStrength = enemyStrength; }
    public void setEnemyWeaponStat(int enemyWeaponStat){ this.enemyWeaponStat = enemyWeaponStat; }
    public void setEnemyArmorStat(int enemyArmorStat){ this.enemyArmorStat = enemyArmorStat; }
    public void setEnemyHealthPoint(int enemyHealthPoint){ this.enemyHealthPoint = enemyHealthPoint; }

    public String getEnemyName(){ return enemyName; }
    public int getEnemyStrength(){ return enemyStrength; }
    public int getEnemyWeaponStat(){ return enemyWeaponStat; }
    public int getEnemyArmorStat(){ return enemyArmorStat; }
    public int getEnemyHealthPoint(){ return enemyHealthPoint; }

    Enemy(){}

    Enemy (String enemyName, int enemyStrength, int enemyWeaponStat, int enemyArmorStat, int enemyHealthPoint) {
        this.enemyName = enemyName;
        this.enemyStrength = enemyStrength;
        this.enemyWeaponStat = enemyWeaponStat;
        this.enemyArmorStat = enemyArmorStat;
        this.enemyHealthPoint = enemyHealthPoint;
    }
}

class EnemyList{
    public static void main(String[] args) {
        Enemy wolf = new Enemy("wolf", 3, 3, 1, 100);
    }
}