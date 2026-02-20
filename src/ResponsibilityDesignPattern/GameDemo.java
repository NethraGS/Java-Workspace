package ResponsibilityDesignPattern;

public class GameDemo {

    public static void main(String[] args) {

        AttackHandler shield = new Shield();
        AttackHandler armor = new Armor();
        AttackHandler magic = new MagicBarrier();

        // create chain
        shield.setNext(armor);
        armor.setNext(magic);

        System.out.println("Enemy attacks with 50 damage!");

        shield.handleAttack(50);
    }
}
