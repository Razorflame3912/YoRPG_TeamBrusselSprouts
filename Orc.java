// Bryan Chan, Mansour Elsharawy, David Apterman - Team Brussel Sprouts
// APCS1 pd3
// HW32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-25

public class Orc extends Character {
    
     //constructor calls contstructor of Character then initializes variables
    public Orc() {
	super();
	name = "smaug";
	maxHP = 200;
	strength = (int)(Math.random()*45 + 25);
	defense = 14;
	attackSt=1;
	HP = maxHP;

    }

    public String about() {
	return "The approaching orc bellows 'ORC SMASH!'";
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
