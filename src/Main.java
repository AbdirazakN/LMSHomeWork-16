public class Main {
    public static void main(String[] args) {

        //Animal деген класс тузунуз жана бир метод кошунуз.Анын 3 наследнигин тузунуз.
        //Shark деген класска attack(), Turtle деген класска swim() жана Eagle деген класска fly() методторун тузосуз.
        //Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин кошунуз.
        //instanceOf жана getClass()-ты колдонуп Animal массивиндеги жаныбарлардын оздорунун методдорун чыгарыныз.
        //Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды болуп оз озунун массивине салыныз.


        Animal[] animals = {new Shark(),new Eagle(),new Turtle()};

        for (Animal animal:animals) {
            if (animal instanceof Shark || animal.getClass().equals(Shark.class)){   // two variants.....
                ((Shark) animal).attack();
            }else if (animal instanceof Eagle || animal.getClass().equals(Eagle.class)){
                ((Eagle)animal).fly();
            }else if (animal instanceof Turtle || animal.getClass().equals(Turtle.class)){
                ((Turtle)animal).swim();
            }else {
                System.out.println("Not found this method!");
            }
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Shark shark = null;
        Eagle eagle = null;
        Turtle turtle = null;
        for (Animal animal:animals) {
            if (animal instanceof Shark){
                shark = new Shark();
            } else if (animal instanceof Eagle) {
                eagle = new Eagle();
            }else if (animal instanceof Turtle) {
                turtle = new Turtle();
            }
        }
        shark.attack();
        eagle.fly();
        turtle.swim();


    }
}