public class Director {

    private PersonBuilder builder;

    Director(){
        this.builder = new TallManBuilder();
    }

    public void setBuilder(PersonBuilder builder){
        this.builder = builder;
    }

    public void createPerson(String hand, String head, String leg){
        builder.buildHand(hand);
        builder.buildHead(head);
        builder.buildLeg(leg);
    }
}
