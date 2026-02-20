package ResponsibilityDesignPattern;

class Armor extends AttackHandler {

    public void handleAttack(int damage) {
        int reduced = damage - 15;
        System.out.println("Armor reduced damage by 15. Remaining: " + reduced);

        if (next != null) {
            next.handleAttack(reduced);
        }
    }
}
