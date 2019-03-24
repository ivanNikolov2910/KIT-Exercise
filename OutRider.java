package Space;

public class OutRider extends BattleShip {
    private int plasmaDefence;

    public OutRider(long id, String name, Color color, int attackDamage, int life, int shield, int capacity, int plasmaDefence) {
        super(id, name, color, attackDamage, life, shield, capacity);
        plasmaDefence = this.plasmaDefence;
        this.life += 100;
    }

    @Override
    public void attack(BattleShip attackedShip) {
        attackedShip.takeDamage(this.attackDamage);
    }

    @Override
    public void takeDamage(int damage) {
        this.shield -= (damage - 50);
    }

}
