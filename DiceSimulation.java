public class DiceSimulation {
   
    public void start() {
        Die d1 = new Die();
        Die d2 = new Die(20);
        System.out.println("Roll: " + d1.getRoll());
        System.out.println("Roll: " + d2.getRoll());
    }
}
