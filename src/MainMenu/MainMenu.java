package MainMenu;
import Character.*;
import java.util.Scanner;

public class MainMenu {
    private String s1;
    private String s2;
    private String s3;

    public int showMenu(String x, String y, String z){
        System.out.printf("Main menu\n1.%s\n2.%s\n3.%s\n", x, y, z);
        Scanner sc = new Scanner(System.in);
        byte i = sc.nextByte();
        return i;
    }

    public void getMenu(int a){
        if (a == 1){
            CharacterCreation.createCharacter();
        }else if (a == 2){
            System.out.println("savelist");
        }else if (a == 3){
            System.out.println("quit");
        }else{
            System.out.println("you have to pick 1, 2 or 3");
        }
    }

    public MainMenu(){}
    public MainMenu(String s1, String s2, String s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS1() {
        return s1;
    }

    public String getS2() {
        return s2;
    }

    public String getS3() {
        return s3;
    }
}

class Menu{
    public static void main(String[] args) {
        MainMenu game = new MainMenu("New game", "Load game", "Quit");
        //game.showMenu(game.getS1(), game.getS2(), game.getS3());
        game.getMenu(game.showMenu(game.getS1(), game.getS2(), game.getS3()));
    }
}