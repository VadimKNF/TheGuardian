package Character;
import Actions.*;
import Files.Read;
import Files.Write;
import Roles.*;
import Units.Unit;

import java.io.*;
import java.util.Scanner;

public class CharacterCreation {
    public static void createCharacter() {
        Player newPlayer = new Player();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, stranger, whats your name?");
        String name = scanner.nextLine();
        newPlayer.setName(name);
        System.out.printf("alright %s, what's your gender?\n1. male\n2. female\n", name);
        byte gender = scanner.nextByte();
        newPlayer.setGender(gender);
        System.out.println("good work now select class\n1. warrior\n2. wizard");
        byte roleClass = scanner.nextByte();
        newPlayer.setRole(roleClass);
        newPlayer.setMainStat(roleClass);
        newPlayer.setHealthPoint(100);
        newPlayer.setWeaponStat(0);
        newPlayer.setArmorStat(0);

        Write.writeInFile(newPlayer, "player.bin");

        //System.out.println(Read.readFromFile(newPlayer, "player.bin"));

        /*Unit wolf = new Unit("wolf", "enemy", 3, 1, 0, 3, 1, 50);
        Actions wolfAttack = new Actions(wolf.getWeaponStat(), wolf.getStrength());
        Actions newPlayerAttack = new Actions(newPlayer.getWeaponStat(), newPlayer.getMainStat());
        wolf.setHealthPoint(newPlayerAttack.attack(newPlayerAttack.attackCounter(), wolf.getArmorStat(), wolf.getHealthPoint()));
        System.out.printf("After %s's attack %s has %d healthpoint\n", newPlayer.getName(), wolf.getName(), wolf.getHealthPoint());

        newPlayer.setHealthPoint(wolfAttack.attack(wolfAttack.attackCounter(), newPlayer.getArmorStat(), newPlayer.getHealthPoint()));
        System.out.printf("After %s's attack %s has %d healthpoint\n", wolf.getName(), newPlayer.getName(), newPlayer.getHealthPoint());*/
    }

}
