package interfaces;

import java.util.Objects;

public abstract class AbstractPlace {

    public String placeName;
    public String typeName;

    @Override
    public String toString() {
        return  this.getPlace();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractPlace that = (AbstractPlace) o;
        return Objects.equals(placeName, that.placeName) && Objects.equals(typeName, that.typeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placeName, typeName);
    }

    public String getPlace() {
        return placeName;
    }

}