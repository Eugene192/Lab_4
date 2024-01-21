package objects;

import enums.*;
import interfaces.AbstractObj;

import java.util.Objects;
import enums.Status;
import exceptions.Impossible_action;

public class Door extends AbstractObj {
    private Status status;


    public Door(String name) {
        this.name = name;
        System.out.println("Объект - " + name + " успешно создан!");
    }
    public void doSomeThing(Status status){
        System.out.print(super.name+"");
        if (status == Status.Open){
            System.out.println(" теперь открыта");
        }else if (status == Status.Close){
            System.out.println(" теперь закрыта");
        }
    }
    public void doSomeThing(String string) throws Impossible_action  {
        throw new Impossible_action("Несуществующий метод!");
    }
    public Status getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "Объект по имени " + this.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Door obj = (Door) o;
        return status == obj.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), status);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void doSomeThing(Action action, Verb_time time) {

    }


}