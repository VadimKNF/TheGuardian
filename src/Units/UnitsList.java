package Units;

import Files.Write;

public class UnitsList{
    public static void main(String[] args) {
        Unit wolf = new Unit("wolf", "warrior", 2, 0, 1, 0, 0, 20);
        Write.writeInFile(wolf, "enemies.bin");
    }

}
