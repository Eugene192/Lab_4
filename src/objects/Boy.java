package objects;

import enums.Action;
import enums.Verb_time;
import interfaces.AbstractHuman;
import interfaces.OpenAble;

public class Boy extends AbstractHuman implements OpenAble {

    public Boy (String name){
        this.name = name;
        System.out.println("Человек - " + name  + " успешно создан!");
    }

   @Override
    public void open(Place e) {
        System.out.println(super.name + " распахнул дверь в " + e);
    }


    public void doSomeThing(Action action, Verb_time time, Window e){
        if (action == Action.Close && time == Verb_time.Past)
            System.out.println((super.name + " захлопнул " + e.getName()));
    }
    public void doSomeThing(Action action, Verb_time time){
        if (action == Action.Choke){
            System.out.println("У " + super.name + "а перехватило дыхание");
        }
    }

    public void doSomeThing(Action action, Verb_time time, Place[] places){
        StringBuilder objects = new StringBuilder();
        for (Place place: places) {
            objects.append(place).append(" ");
        }
        if (action == Action.StartCleaning){
            System.out.println(super.name + " начал убираться в " + objects);
        }
    }
    @Override
    public String toString() {
        return "Человека по имени " + this.getName();
    }

    @Override
    public String getName() {
        return name;
    }


}