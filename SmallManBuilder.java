
public class SmallManBuilder implements PersonBuilder {
    private Person person;

    SmallManBuilder(){
        person = new Person();
    }

    @Override
    public void buildHead(String head) {
        person.setHead(head);
        System.out.printf("Build Small Man Head: %s \n", head);
    }

    @Override
    public void buildHand(String hand) {
        person.setHand(hand);
        System.out.printf("Build Small Man Hand: %s \n", hand);
    }

    @Override
    public void buildLeg(String leg) {
        person.setLeg(leg);
        System.out.printf("Build Small Man Leg: %s \n", leg);
    }
    @Override
    public Person getPerson() {
        return person;
    }
}
