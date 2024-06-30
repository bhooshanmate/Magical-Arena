package SwiggyAsde.model;

public class Player {
    private Integer health;
    private Integer strength;
    private Integer attack;

    public Player(Integer health, Integer strength, Integer attack) {
        this.health = health;
        this.attack = attack;
        this.strength = strength;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }
}


