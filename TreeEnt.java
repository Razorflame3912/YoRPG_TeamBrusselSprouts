// Bryan Chan, Mansour Elsharawy, David Apterman - Team Brussel Sprouts
// APCS1 pd3
// HW32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-25


public class TreeEnt extends Character {

    //constructor calls contstructor of Character then initializes variables
    public TreeEnt() {
	super();
	name = "smaug";
	maxHP = 200;
	strength = (int)(Math.random()*45 + 15);
	defense = 25;
	attackSt=1;
	HP = maxHP;

    }

    public  String about(){
	return "A majestic oak suddenly turns around. 'I have slumbered in this forest for millenia, who dares awake me!'";
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
