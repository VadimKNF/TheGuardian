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

    static void showCharacterStats(RoleClass obj){

        System.out.printf("Character stats\nstrength: %d\nintellect: %d\nleadership: %d\n", obj.getStrength(), obj.getIntellect(), obj.getLeadership());

    }
}

class RoleList {
    //public static void main(String[] args) {
        private RoleClass warrior = new RoleClass(100, 50, 100);
        private RoleClass wizard = new RoleClass(50, 100, 100);
        public RoleClass[] rolesList = {warrior, wizard};
        //System.out.println(List[0]);
        //RoleClass.showCharacterStats(warrior);
    //}



}
