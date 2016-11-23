// Bryan Chan, Mansour Elsharawy, David Apterman - Team Brussel Sprouts
// APCS1 pd3
// HW32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-20


public class Mage extends Character{


    
    public Mage(String s){
	super();
	name = s;
	maxHP = 50;
	strength = 145;
	originalDefense = 20;
	originalAttackSt = 0.5;
	defense = originalDefense;
	attackSt = originalAttackSt;
	HP = maxHP;

    }


    public  String about(){
	return "Aha! I am a wise old Mage.";
    }

      public void specialize(){
	attackSt *= 1.25;
	defense *= 0.75;
    }

    public void normalize(){
	attackSt = originalAttackSt;
	defense = originalDefense;
    }
    


}
