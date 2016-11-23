// Bryan Chan, Mansour Elsharawy, David Apterman - Team Brussel Sprouts
// APCS1 pd3
// HW32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-20



public class Brute extends Character{



    
    public Brute(String s){
	super();
	name = s;
	maxHP = 200;
	strength = 100;
	originalDefense = 50;
	originalAttackSt = 0.2;
	defense = originalDefense;
	attackSt = originalAttackSt;
	HP = maxHP;

    }

    public  String about(){
	return "I am Bruuuute.";
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
