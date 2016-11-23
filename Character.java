// Bryan Chan, Mansour Elsharawy, David Apterman - Team Brussel Sprouts
// APCS1 pd3
// HW32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-20


public abstract class Character{
    protected String name;
    protected int HP, strength, defense, originalDefense;
    protected double attackSt, originalAttackSt;

    //sets name to an empty string, the other variables are already 0.
    public Character(){
	name = "";
    }

    //checks if HP is above 0, which constitutes "aliveness".
    public Boolean isAlive() {
	return (HP > 0);
    }
    //check defense
    public int getDefense() {
	return defense;
    }
    //adjust health
    public void lowerHP(int dmgtaken) {
	HP -= dmgtaken;
	if (HP < 0){
	    HP = 0;
	}
	    }
    //attack
    public int attack(Character objName) {
	double d = (strength * attackSt) - objName.getDefense();
	if (d < 0){
	    d = 0.0;
	}
	int dmg = (int) d;
        objName.lowerHP(dmg);
	return dmg;
    }


    
    //about is an abstract method
    public abstract String about();

    public String getName() {
	return name;
    }

       //specialize stats
    public abstract void specialize();
  
    //normalize stats
    public abstract void normalize();



    


}

