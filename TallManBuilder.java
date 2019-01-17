
public class TallManBuilder implements PersonBuilder {
    private Person person;

    TallManBuilder(){
        person = new Person();
    }

    @Override
    public void buildHead(String head) {
        person.setHead(head);
        System.out.printf("Build Tall Man Head: %s \n", head);
    }

    @Override
    public void buildHand(String hand) {
        person.setHand(hand);
        System.out.printf("Build Tall Man Hand: %s \n", hand);
    }

    @Override
    public void buildLeg(String leg) {
        person.setLeg(leg);
        System.out.printf("Build Tall Man Leg: %s \n", leg);
    }
    @Override
    public Person getPerson() {
        return person;
    }
}
