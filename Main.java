public class Main {

    public static void main(String[] args){
        TallManBuilder tallBuilder = new TallManBuilder();
        SmallManBuilder smallManBuilder = new SmallManBuilder();
        Director director = new Director();
        director.setBuilder(smallManBuilder);
        director.createPerson("hand", "head", "leg");
    }
}
