package Character;

public class RoleClass {
    private int strength;
    private int intellect;
    private int leadership;

    public void setStrength(int strength){
        this.strength = strength;
    }

    public void setIntellect(int intellect){
        this.intellect = intellect;
    }

    public void setLeadership(int leadership){
        this.leadership = leadership;
    }

    public int getStrength(){
        return strength;
    }

    public int getIntellect(){
        return intellect;
    }

    public int getLeadership(){
        return leadership;
    }


    RoleClass(int strength, int intellect, int leadership){
        this.strength = strength;
        this.intellect = intellect;
        this.leadership = leadership;
    }
    //RoleClass(){}

    static void showROLECLASSStats(RoleClass obj){

        System.out.printf("Character stats\nstrength: %d\nintellect: %d\nleadership: %d\n", obj.getStrength(), obj.getIntellect(), obj.getLeadership());

    }
}

