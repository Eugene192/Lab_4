package objects;

import enums.Action;
import enums.Places;
import enums.Plants;
import enums.Verb_time;
import interfaces.AbstractObj;

public class Pot extends AbstractObj {
    private String name1 = "Горшок";

    public Pot(Plants Plant_name) {
        this.name1 = (new Plant(Plant_name)).getfullName();
        System.out.println("Объект - " + this.name1 + " успешно создан!");
    }

    @Override
    public void doSomeThing(Action action, Verb_time time) {
        if (action == Action.Stay && time == Verb_time.Past){
            System.out.println(name1 + " стоял на подоконнике");
        }
    }

    // Вложенный non-static класс. Нужен для того, чтобы указать на цветке растение.
    class Plant {
        private final Plants name;
        public Plant(Plants name) {
            this.name = name;
        }



        public String getfullName() {
            return name1 + " с " + name.getName() + "ом";
        }
    }
    @Override
    public String getName() {
        return name1;
    }
}


