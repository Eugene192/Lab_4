package interfaces;

import enums.*;
import exceptions.Empty_message;

import java.sql.SQLOutput;
import java.util.Objects;

public abstract class AbstractHuman  {
    public String name;

    public AbstractHuman(){
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractHuman that = (AbstractHuman) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName(){
        return name;
    }

    public void doSomeThing(String message, Action action, Verb_time time) {
        // Unckecked exception. Проверка на пустое сообщение
        try {
            if (message.isEmpty()) {
                throw new Empty_message(this.name + " проигнорировал");
            } else if (action == Action.Say && time == Verb_time.Past) {
                System.out.println(this.name + " сказал: " + "'" + message + "'");
            } else if (action == Action.Say && time == Verb_time.Present) {
                System.out.println(this.name + " говорит: " + "'" + message + "'");
            } else if (action == Action.Ask && time == Verb_time.Present) {
                System.out.println(this.name + " спрашивает: " + "'" + message + "'");
            }
        }
        catch (Empty_message e) {
            System.out.println(e.get_message());
        }
    }


}