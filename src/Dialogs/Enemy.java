package Dialogs;
import Character.*;
import Files.Write;
import Units.*;

import java.util.Scanner;

public class Enemy {
    public static void visitEnemy(Player obj, Unit obj1){
        System.out.printf("You've met an angry %s will you take a fight?\n1. Fight\n2. Runaway\n", obj1.getName());
        Scanner sc = new Scanner(System.in);
        byte answer = sc.nextByte();
        if (answer == 1){ System.out.println("Fight starts"); }
        else if (answer == 2){
            System.out.printf("You've escaped now you need to change your pants also your leadership decreased by %d\n", obj1.getLeadership());
            int x = obj.getLeadership() - obj1.getLeadership();
            obj.setLeadership(x);
            Write.writeInFile(obj, "player.bin");
        }
        else{ System.out.println("You have to pick 1 or 2"); }
    }
}
