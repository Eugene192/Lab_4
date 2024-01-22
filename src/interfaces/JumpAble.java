package interfaces;
import objects.Place;

public interface JumpAble {

    default  void wantToJump(Place a, Place b, int height){
        if (height == 7 || height == 8 || height == 9){
            System.out.println("Кто-то хотел прыгнуть в воду, которая была в " + a + " и " + b);
        }
        if (height == 1 || height == 2 || height == 3 || height == 4 || height == 5 || height == 6){
            System.out.println("Кто-то хотел покупаться, если бы было достаточно воды");

        }

    }


}

