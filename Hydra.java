// Bryan Chan, Mansour Elsharawy, David Apterman - Team Brussel Sprouts
// APCS1 pd3
// HW32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-25


public class Hydra extends Character {

    //constructor calls contstructor of Character then initializes variables
    public Hydra() {
	super();
	name = "smaug";
	maxHP = 150;
	strength = (int)(Math.random()*45 + 20);
	defense = 20;
	attackSt=1;
	HP = maxHP;

    }

    public  String about(){
	return "As you cross through a swamp a giant hydra attacks! 'Hsssssssss'";
    }
    public int attack(Character objName){
	double d = 0.0;
	for (int x = 0; x < 8; x+=1) {
	    d += (strength*attackSt*Math.random()*0.5 );
	}
	int dmg = (int) d;
          objName.lowerHP(dmg);
	return dmg;
	
    }

    public void specialize(){
	attackSt *= 1.25;
	defense *= 0.75;
    }

    public void normalize(){
	attackSt = originalAttackSt;
	defense = originalDefense;
    }
    

    //Everything else included :)

}
    
