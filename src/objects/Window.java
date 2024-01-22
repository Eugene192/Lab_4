package objects;

import enums.*;
import interfaces.AbstractObj;

import java.util.Objects;
import enums.Status;
import exceptions.Impossible_action;


public class Window extends AbstractObj {

    private Status status;
    private String name = "окно";


    public Window(String name) {
        this.name = name;
        System.out.println("Объект - " + name + " успешно создан!");
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void doSomeThing(Action action, Verb_time time) {
        System.out.println();
    }

    public void doSomeThing(Status status){
        System.out.print(super.name+"");
        if (status == Status.Open){
            System.out.println(" теперь открыта");
        }else if (status == Status.Close){
            System.out.println(" теперь закрыта");
        }
    }

}
