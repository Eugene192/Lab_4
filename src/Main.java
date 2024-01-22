import enums.*;

import interfaces.AbstractObj;
import objects.*;
import exceptions.Impossible_action;

public class Main {
    public static int Time = 1;
    public static int TimeLimit = 10;

    public static void main(String[] args){

        System.out.println();


        //Введение персонажей и места действий
        Boy boy = new Boy("Малыш");
        System.out.println();

        Karlson karlson = new Karlson("Карлсон");
        System.out.println();

        Place locatioun1 = new Place("Прихожая");
        locatioun1.setType(Places.Hallway);
        System.out.println();

        Place locatioun2 = new Place("Ванная");
        locatioun2.setType(Places.Bathroom);
        System.out.println();

        Door door = new Door("Дверь");
        System.out.println();

        Water water = new Water("Наводнение");
        System.out.println();

        Window window = new Window("Окно");
        System.out.println();



        Place[] places = {
          locatioun1,
          locatioun2
        };

        Pot pot = new Pot(Plants.ficus);
        System.out.println();


        // Анонимный класс.
        AbstractObj bag = new AbstractObj("Мешок") {
            @Override
            public void doSomeThing(Action action, Verb_time time) {
                if (action == Action.Falling && time == Verb_time.Past) {
                    System.out.println(super.name + " упал");
                }

                else if (action == Action.Falling && time == Verb_time.Present) {
                    System.out.println(super.name + " падает");
                }

            }
        };

        class Story {
            void make_story() {
                // Новое


                // ckecked exception.
                try {
                    door.doSomeThing("какая то строка");
                } catch (Impossible_action e) {
                    System.out.println(e.get_message());
                }


                bag.doSomeThing(Action.Falling, Verb_time.Past);
                pot.doSomeThing(Action.Stay, Verb_time.Past);
                karlson.doSomeThing("Гляди, — сказал Карлсон, — она ахнула, словно мы сбросили горшок с фикусом, а не полтора стакана воды", Action.Say, Verb_time.Past );
                boy.doSomeThing(Action.Close, Verb_time.Past, window);
                boy.doSomeThing("Я думаю, что этого нельзя делать", Action.Say, Verb_time.Past);
                karlson.doSomeThing(Action.Laugh, Verb_time.Past);
                karlson.doSomeThing(Action.Mimic, Verb_time.Past, boy);
                karlson.doSomeThing("Могу сказать, что вообще ты и твоя мама самые странные люди на свете, но всё же я вас люблю.", Action.Say, Verb_time.Past);
                karlson.doSomeThing(Action.Clap_clap, Verb_time.Past, boy);
                boy.doSomeThing(Action.Choke, Verb_time.Past);
                boy.doSomeThing("Ты что, не закрыл кран в ванной?", Action.Ask, Verb_time.Present);
                karlson.doSomeThing(Action.Watch, Verb_time.Past, boy);
                karlson.doSomeThing("Угадай, закрыл ли я кран или нет! До трёх раз!", Action.Say, Verb_time.Past);


                boy.open(locatioun1);
                door.doSomeThing(Status.Open);
                karlson.meaning();
                water.doSomeThing(Status.Starting);
                System.out.println();

                while (Time != TimeLimit){
                    Place.State.set_state(places, Status.Flood, Verb_time.Past, Time);
                    karlson.wantToJump(locatioun1, locatioun2, Time);
                    karlson.doSomeThing(Action.Jump, Time);
                    if (Time == (TimeLimit-1)){
                        System.out.println("Уровень воды заполнен");
                        water.doSomeThing(Status.Ending);
                    }
                    else{
                        System.out.println("Уровень воды возрастает");
                    }
                    System.out.println(" ");
                    Time++;
                }
                karlson.doSomeThing(Action.StopJump, Verb_time.Past, boy);
                karlson.doSomeThing(Action.Sprayed, Verb_time.Past, boy);
                karlson.doSomeThing(Action.Fly, Verb_time.Past);
                boy.doSomeThing(Action.StartCleaning, Verb_time.Past, new Place[] {locatioun1, locatioun2});
                karlson.doSomeThing(Action.Ignore, Verb_time.Present, boy);
                karlson.doSomeThing(Action.GoHome, Verb_time.Past);


            }
        }

        Story story = new Story();
        story.make_story();
    }
}