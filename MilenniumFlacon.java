package Space;

public class MilenniumFlacon extends BattleShip {
    private int dodge;
    public MilenniumFlacon(long id, String name, Color color, int attackDamage, int life, int shield, int capacity, int dodge) {
        super(id, name, color, attackDamage, life, shield, capacity);
        dodge = this.dodge;
    }

    @Override
    public void attack(BattleShip attackedShip) {
        attackedShip.takeDamage(this.attackDamage*2);

    }

    @Override
    public void takeDamage(int damage) {
        this.shield -= (damage + 200);
    }


}
