public class Warrior extends GameCharacter{
    private boolean shield;

    public Warrior(String name, boolean shield) {
        super(name,0,100);
        this.shield = shield;
    }
    @Override
    public void takeDamage (int damage){
        if (shield){
            damage /=2;
            System.out.println(name + " blocked part of the damage with a shield!");
        }
        super.takeDamage(damage);
    }

    @Override
    public void attack(){
        System.out.println(name + " attacks with a sword!");
    }
}
