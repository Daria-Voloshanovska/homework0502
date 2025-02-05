public class Mage extends GameCharacter{

    public Mage(String name){
        super(name,0,100);
    }


    public void attack(){
        System.out.println(name + " casts a spell!");
    }
}
