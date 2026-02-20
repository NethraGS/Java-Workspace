package ResponsibilityDesignPattern;

abstract class AttackHandler {

    protected AttackHandler next;

    public void setNext(AttackHandler next) {
        this.next = next;
    }

    public void handleAttack(int damage) {
        if (next != null) {
            next.handleAttack(damage);
        }
    }
}
