abstract class GameCharacter {
    protected String name;
    protected int level;
    protected int health;

    public GameCharacter(String name, int level, int health) {
        this.name = name;
        this.level = 0;
        this.health = 100;
    }

    public void levelUp() {
        if (level < 5) {
            level++;
            System.out.println(name + " leveled up to " + level);
        } else {
            System.out.println(name + "has already reached the maximum level!");
        }
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
        System.out.println(name + " took " + damage + " damage and now has " + health);
    }

    @Override
    public String toString(){
        return String.format("Character: %s | Level: %d | Health: %d%%", name,level,health);
    }

    public abstract void attack();
}
