package objects;

import interfaces.AbstractPlace;

import java.util.Objects;

import enums.*;


public class Place extends AbstractPlace {

    private static Status common_status;
    private Status own_status;

    private Places type;


    public Place(String name){
        this.placeName = name;
        System.out.println("Место - " + name  + " успешно создано!");
    }

    public void setType(Places type){
        this.type = type;
        typeName = "";

        if (type == Places.Bathroom) {
            typeName = "Ванная";
        }
        else if (type == Places.Hallway) {
            typeName = "Прихожая";
        }

        System.out.println(placeName +" объявлена как " + typeName);
    }

    public void setType(Status status) {
        this.own_status = status;
    }



    // Статический вложенный класс, нужен для того, чтобы указать какое-то общее состояние объяектов этого класса
    public static class State {
        public static void set_state(Place[] places, Status status, Verb_time time, int height) {
            common_status = status;
            for (Place place: places) {
                place.setType(status);
            }
            if (status == Status.Flood && time == Verb_time.Past) {
                StringBuilder objects = new StringBuilder();
                for (Place place: places) {
                    objects.append(place.getName()).append(" ");
                }
                if (height == 7 || height == 8 || height == 9) {
                    System.out.println("Эти места: " + objects + "были заполнены водой");
                }
                else if (height == 1 || height == 2 || height == 3){
                    System.out.println("В местах: " + objects + " не было воды ");
                }
                else if (height == 4 || height == 5 || height == 6){
                    System.out.println("В местах: " + objects + " было немного воды ");
                }
            }
        }
    }

    public Places getType() {
        return this.type;
    }

    public String getName() { return this.placeName; }


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