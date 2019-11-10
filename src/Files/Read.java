package Files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Read {
    public static Object readFromFile(Object obj, String filename) {
        try{
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);

            obj = ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;

    }
}
