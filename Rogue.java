// Bryan Chan, Mansour Elsharawy, David Apterman - Team Brussel Sprouts
// APCS1 pd3
// HW32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-20

public class Rogue extends Character{


    public Rogue(String s){
	super();
	name = s;
	maxHP = 70;
	strength = 130;
	originalDefense = 30;
	originalAttackSt = 0.7;
	defense = originalDefense;
	attackSt = originalAttackSt;
	HP = maxHP;

    }


    public  String about(){
	return "Shh. Rogues work alone.";
    }

      public void specialize(){
	attackSt *= 1.25;
	defense *= 0.75;
	System.out.println(getName() + " " + "used Assasinate!");
       
    }

    public void normalize(){
	attackSt = originalAttackSt;
	defense = originalDefense;
    }
    

        //specialize stats


}
