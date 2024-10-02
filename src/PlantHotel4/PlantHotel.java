package PlantHotel4;

public class PlantHotel {
    public PlantHotel() {

        PlantProgram checkPlant = new PlantProgram();
        checkPlant.checkPlant();
    }

    // bryter ur den statiska kontexten ;)
    public static void main(String[] args) {
        PlantHotel plantHotel = new PlantHotel();
    }
}
