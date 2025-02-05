abstract class GameCharacter {
    protected String name;
    protected int level;
    protected  int health;

    public GameCharacter(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }
    @Override
    public String toString(){
        return String.format("Character: %s | Level: %d | Health: %d%%", name,level,health);
    }
}
