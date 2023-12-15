
import java.util.Objects;

public class Place extends AbstractPlace {


    private Places type;

    public Place(String name){
        this.placeName = name;
        System.out.println("Место - " + name  + " успешно создано!");
    }

    public void setType(Places type){
        this.type = type;
        typeName = "";
        switch (type){
            case Bathroom : typeName = "Ванная";
                break;
            case Hallway : typeName = "Прихожая";
                break;
        }
        System.out.println(placeName +" объявлена как " + typeName);
    }
    public  void levelOfWater( String name2, int height){
        if (height == 7 || height == 8 || height == 9){
            System.out.println(super.placeName + " и " + name2 + " были заполнены водой");
        }
        if (height == 1 || height == 2 || height == 3){
            System.out.println("В " + super.placeName + " и " + name2 + " не было воды ");
        }
        if (height == 4 || height == 5 || height == 6){
            System.out.println("В " + super.placeName + " и " + name2 + " было немного воды ");
        }
    }

    public Places getType() {
        return this.type;
    }

    public String getPlace() {
        return placeName == null ? "..." : placeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Place place = (Place) o;
        return type == place.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}