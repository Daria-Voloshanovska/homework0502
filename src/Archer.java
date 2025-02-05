public class Archer extends GameCharacter{
    public Archer(String name) {
        super(name,0,100);
    }

    public void attack(){
    System.out.println(name + " shoots an arrow!");
}
}
