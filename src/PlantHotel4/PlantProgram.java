package PlantHotel4;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class PlantProgram {


//    //// <<< START: HashMap Version: (bättre?)
    private Map<String, Plant> plantHotel = new HashMap<>();

    public PlantProgram() {

        // instansiera plantobjekt i hashmap.
        plantHotel.put("igge", new Cacti("Igge", 0.2, false));
        plantHotel.put("laura", new PalmTree("Laura", 5, true));
        plantHotel.put("meatloaf", new CarnivorousPlant("Meatloaf", 0.7, false));
        plantHotel.put("olof", new PalmTree("Olof", 1.0, false));
        plantHotel.put("esmeralda", new Cacti("Esmeralda", 0.9));       // <- en icke-binär planta!
    }

    public void checkPlant() {

        StringBuilder plantList = new StringBuilder("Current residents of the plant hotel:\n\n");

        // loopa genom hashmap
        for (Map.Entry<String, Plant> entry : plantHotel.entrySet()) {
            Plant plant = entry.getValue();
            plantList.append(plant.getName())
                    .append(": a ")
                    .append(plant.getPlantType().getTypeName())
                    .append(". \n");

        }
        JOptionPane.showMessageDialog(null, plantList.toString());

        // input med felhantering med early return.
        String name = JOptionPane.showInputDialog("Which plant do you want to water?");
        if (name == null || name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "You didn't enter a plant name.");
            return;
        }

        // gör inputen till gemener för att jämföra med key i hashmap.
        String capitalizeInput = name.trim().toLowerCase();

        if (!plantHotel.containsKey(capitalizeInput)) {
            String message = "We're sorry, " + name + " is not a guest here at our hotel.";
            JOptionPane.showMessageDialog(null, message);
            return;
        }

        Plant selectedPlant = plantHotel.get(capitalizeInput);

        // kör plantans getDrinkFormula (toString)
        JOptionPane.showMessageDialog(null, selectedPlant.getDrinkFormula());

//        //// <<< STOP


        //// >>> START: Switch version:
/*    public void checkPlant() {
        String name = JOptionPane.showInputDialog("Enter PlantHotel4pkg.Plant Name");

        // enhanced switch
        Plant selectedPlant = switch (name.toLowerCase()) {
            case "igge" -> new Cacti("Igge", 0.2, false);
            case "laura" -> new PalmTree("Laura", 0.5, true);
            case "meatloaf" -> new CarnivorousPlant("Meatoaf", 0.75, false);
            case "olof" -> new PalmTree("Olof", 1.0, false);
            default -> {
                System.out.println(name + " is not a plant here at this hotel");
                String message = "We're sorry, " + name + " is not a guest here at our hotel";
                JOptionPane.showMessageDialog(null, message);
                yield null;
            }
        };

        if (selectedPlant != null) {
            JOptionPane.showMessageDialog(null, selectedPlant.getDrinkFormula());
        }
    }*/
        //// <<< STOP (ta bort näst sista "}" vid denna version

    }
}