// Bryan Chan, Mansour Elsharawy, David Apterman - Team Brussel Sprouts
// APCS1 pd3
// HW32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-25


public class Merc  extends Character {

    //constructor calls contstructor of Character then initializes variables
    public Merc() {
	super();
	name = "smaug";
	maxHP = 100;
	strength = (int)(Math.random()*45 + 20);
	defense = 25;
	attackSt=1.1;
	HP = maxHP;

    }

    public  String about(){
	return "The mercenary draws his dagger 'I'll fight for the richer side - pay with your coin or your life' ";
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
