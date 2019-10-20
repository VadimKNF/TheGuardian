package Character;

class RoleClass {
    private String className;
    private int strength;
    private int intellect;
    private int leadership;

    public void setClassName(String className){
        this.className = className;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public void setIntellect(int intellect){
        this.intellect = intellect;
    }

    public void setLeadership(int leadership){
        this.leadership = leadership;
    }

    public String getClassName(){return className;}

    public int getStrength(){
        return strength;
    }

    public int getIntellect(){
        return intellect;
    }

    public int getLeadership(){
        return leadership;
    }

    RoleClass(String className, int strength, int intellect, int leadership){
        this.className = className;
        this.strength = strength;
        this.intellect = intellect;
        this.leadership = leadership;
    }
    RoleClass(){}

    static String showClassName(RoleClass obj){
        return obj.getClassName();
    }

    static void showStats(RoleClass obj){

        System.out.printf("Character stats\n%s \nstrength: %d\nintellect: %d\nleadership: %d\n", obj.getClassName(), obj.getStrength(), obj.getIntellect(), obj.getLeadership());

    }
}

