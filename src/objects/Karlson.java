package objects;

import enums.Action;
import enums.Verb_time;
import interfaces.AbstractHuman;
import interfaces.JumpAble;

public class Karlson extends AbstractHuman implements JumpAble {




    public Karlson (String name){
        this.name = name;
        System.out.println("Человек - " + name  + " успешно создан!");
    }


     public void meaning(){
             System.out.println(super.name + " был прав");
     }



    public  void doSomeThing(Action action, int height){
        if (action == Action.Jump) {
            if (height == 7 || height == 8 || height == 9) {
                System.out.println(super.name + " прыгнул в воду и начал купаться");
            }
            if (height == 4 || height == 5 || height == 6) {
                System.out.println(super.name + " зашел в воду по колено");
            }
            if (height == 1 || height == 2 || height == 3) {
                System.out.println(super.name + " не может покупаться");
            }
        }
    }

    @Override
    public  void wantToJump(Place a, Place b, int height){
        if (height == 7 || height == 8 || height == 9){
            System.out.println(name + " хотел прыгнуть в воду, которая была в " + a + " и " + b);
        }
        if (height == 1 || height == 2 || height == 3 || height == 4 || height == 5 || height == 6){
            System.out.println(name + " хотел покупаться, если бы было достаточно воды");

        }

    }
    public void doSomeThing(Action action, Verb_time time){
        if (action == Action.Laugh && time == Verb_time.Past )
            System.out.println(super.name + " громко засмеялся");
        if (action == Action.Fly && time == Verb_time.Past)
            System.out.println(super.name + " улетел");
        if (action == Action.GoHome && time == Verb_time.Past)
            System.out.println(super.name + " вернулся в свой зелёный домик на крыше.");

    }
    public void doSomeThing(Action action, Verb_time time, Boy e){
        if (action == Action.Mimic && time == Verb_time.Past)
            System.out.println(super.name + " начал передразнивать " + e.getName() + "а");
        if (action == Action.Clap_clap && time == Verb_time.Past)
            System.out.println(super.name + " хлопал " + e.getName() + "а по щеке");
        if (action == Action.Watch && time == Verb_time.Past)
            System.out.println(super.name + " наклонил голову и ласково поглядел на " + e.getName() + "а");
        if (action == Action.StopJump && time == Verb_time.Past)
            System.out.println(super.name + " перестал прыгать в воде и с обидой посмотрел на " + e.getName() + "а");
        if (action == Action.Sprayed && time == Verb_time.Past)
            System.out.println(super.name + " обрызгал " + e.getName() + "а с головы до ног");
        if (action == Action.Ignore && time == Verb_time.Present)
            System.out.println(super.name + " не захотел помогать " + e.getName() + "у");

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