import java.util.Objects;

public abstract class AbstractHuman implements HumanAble {
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
}