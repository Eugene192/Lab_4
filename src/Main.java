
public class Main {
    public static int Time = 1;
    public static int TimeLimit = 10;

    public static void main(String[] args){
        System.out.println();


        //Введение персонажей и места действий
        Human boy = new Human("Малыш");
        System.out.println();

        Human karlson = new Human("Карлсон");
        System.out.println();

        Place locatioun1 = new Place("Прихожая");
        locatioun1.setType(Places.Hallway);
        System.out.println();

        Place locatioun2 = new Place("Ванная");
        locatioun2.setType(Places.Bathroom);
        System.out.println();


        //Действия
        boy.open( locatioun1.getPlace());
        karlson.meaning();

        while (Time != TimeLimit){
            locatioun1.levelOfWater(locatioun2.getPlace(), (Time));
            karlson.wantToJump(locatioun1.getPlace(), locatioun2.getPlace(), Time);
            karlson.jump(Time);
            if (Time == (TimeLimit-1)){
                System.out.println("Уровень воды заполнен");
            }
            else{
                System.out.println("Уровень воды возрастает");
            }
            System.out.println(" ");
            Time++;
        }
    }
}