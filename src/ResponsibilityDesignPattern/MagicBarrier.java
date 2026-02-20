package ResponsibilityDesignPattern;

class MagicBarrier extends AttackHandler {

    public void handleAttack(int damage) {
        int reduced = damage - 20;
        if (reduced < 0) reduced = 0;

        System.out.println("Magic Barrier reduced damage by 20. Final Damage: " + reduced);
    }
}
