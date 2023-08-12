package MapGen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class JSONGenerator {
  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(new File("C:\\Users\\corre\\git\\Battletech_ISaW\\SolarSystems\\SolarSystems.txt"));
      PrintWriter writer = new PrintWriter(new File("C:\\Users\\corre\\git\\Battletech_ISaW\\SolarSystems\\SolarSystems.json"));

      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        String[] values = line.split("\\,");

        int id = Integer.parseInt(values[0]);
        String name = values[1];
        float x = Float.parseFloat(values[2]);
        float y = Float.parseFloat(values[3]);
        String faction1 = values[4];
        String faction2 = values[5];
        String faction3 = values[6];
        String faction4 = values[7];
        String indType = values[8];
        int factories = Integer.parseInt(values[9]);
        String polType = values[10];

        SolarSystem obj = new SolarSystem(id, name, x, y, faction1, faction2, faction3, faction4, indType, factories, polType);
        String json = obj.toJSON();
        writer.println(json);
      }

      scanner.close();
      writer.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
