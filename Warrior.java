// Bryan Chan, Mansour Elsharawy, David Apterman - Team Brussel Sprouts
// APCS1 pd3
// HW32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-20


public class Warrior extends Character {

    
    //constructor calls Character construction + initializes.
    public Warrior(String s) {
	super();
	name = s;
	maxHP = 125;
	strength = 100;
	originalDefense = 40;
	originalAttackSt= 0.4;
	defense  = originalDefense;
	attackSt = originalAttackSt;
	HP = maxHP;
    }

    public String about(){
	return "Huzzah! I'm a Warrior.";
    }

    public void specialize(){
	attackSt *= 1.25;
	defense *= 0.75;
    }

    public void normalize(){
	attackSt = originalAttackSt;
	defense = originalDefense;
    }
    

    //Everything (including batteries) are included :)
    
}
    
