public class MammalTest {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();

        gorilla.eatBanans();
        gorilla.eatBanans();

        gorilla.climb();

        gorilla.diplayEnergy();

        Bat bat = new Bat();

        bat.attackTown();
        bat.attackTown();
        bat.attackTown();
        bat.eatHumans();
        bat.eatHumans();
        bat.fly();
        bat.fly();
        bat.diplayEnergy();
    }
}
