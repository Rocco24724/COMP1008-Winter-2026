public class Boss extends Fighter{

    private boolean specialMoveActivated;
    private int specialMoveCount = 1;

    public int getPower(){
        
        if(specialMoveActivated){
            specialMoveActivated = false;
            return 3 * super.getPower();
        }
        return super.getPower();
    }

    public void useSpecialMove(){
        if(specialMoveCount <= 0){
            return;
        }
        specialMoveActivated = true;
        specialMoveCount--;
    }

    public Boss(String name, int power, Fighter opponent){

        super(name, power, opponent.getHealth() * 2);

        if(opponent instanceof Boss){
            throw new IllegalArgumentException ("A boss can not fight itself");
        }
    }
}
