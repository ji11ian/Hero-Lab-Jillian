import java.util.Random;

public class HeroTester {
    public static void main(String[] args) {
        Hero AndrewTate = new Hero("Andrew Tate");
        Hero GretaThunberg = new Hero("Greta Thunberg");
        System.out.println("Name Test: " + (AndrewTate.getName().equals("Andrew Tate")));
        System.out.println("Hit Points Test: " + (AndrewTate.getHitPoints() == 100));
        System.out.println("To String Test: " + (AndrewTate.toString().equals("Hero{name='Andrew Tate', hitPoints=100}")));
        AndrewTate.attack(GretaThunberg);
        System.out.println("Attack Test: " + (GretaThunberg.getHitPoints() == 90));
        AndrewTate.senzuBean();
        System.out.println("Senzu Bean Test: " + (AndrewTate.getHitPoints() == 100));
        System.out.println("Fight Until the Death Test: " + (AndrewTate.fightUntilTheDeath(GretaThunberg).equals("Andrew Tate: 0          Greta Thunberg: 20\n")));
        System.out.println("N Fights to Death Test: " + (AndrewTate.nFightsToDeath(GretaThunberg, 5).equals("Andrew Tate: 2 wins\nGreta Thunberg: 8 wins\nGreta Thunberg wins!\n")));
        System.out.println("Dramatic Fight to the Death Test: " + (AndrewTate.dramaticFightToTheDeath(GretaThunberg).equals("Andrew Tate: 0          Greta Thunberg: 20\n")));
    }
}
