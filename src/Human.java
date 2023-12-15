import java.util.Objects;

public class Human extends AbstractHuman {




    public Human (String name){
        this.name = name;
        System.out.println("Человек - " + name  + " успешно создан!");
    }






    public void meaning(){
            System.out.println(super.name + " был прав, что великое наводнение началось");
    }

    public void open(String place){
        System.out.println(super.name + " распахнул дверь в " + place);
    }

    public  void jump( int height){
        if (height == 7 || height == 8 || height == 9){
            System.out.println(super.name + " прыгнул в воду и начал купаться");
        }
        if (height == 4 || height == 5 || height == 6) {
            System.out.println(super.name + " зашел в воду по колено");
        }
        if (height == 1 || height == 2 || height == 3){
            System.out.println(super.name + " не может покупаться");
        }
    }

    public  void wantToJump( String place1, String place2, int height){
        if (height == 7 || height == 8 || height == 9){
            System.out.println(super.name + " хотел прыгнуть в воду, которая была в " + place1 + " и " + place2);
        }
        if (height == 1 || height == 2 || height == 3 || height == 4 || height == 5 || height == 6){
            System.out.println(super.name + " хотел покупаться, если бы было достаточно воды");

        }

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

    @Override
    public String toString() {
        return "Человека по имени " + this.getName();
    }

    @Override
    public String getName() {
        return name;
    }


}