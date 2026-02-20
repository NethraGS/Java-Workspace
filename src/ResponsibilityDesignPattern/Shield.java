package ResponsibilityDesignPattern;

class Shield extends AttackHandler {

    public void handleAttack(int damage) {
        int reduced = damage - 10;
        System.out.println("Shield reduced damage by 10. Remaining: " + reduced);

        if (next != null) {
            next.handleAttack(reduced);
        }
    }
}
