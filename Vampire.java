// Bryan Chan, Mansour Elsharawy, David Apterman - Team Brussel Sprouts
// APCS1 pd3
// HW32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-20




public class Vampire extends Character{

    
    public Vampire(String s){
	super();
	name = s;
	maxHP = 120;
	strength = 80;
	originalDefense = 35;
	originalAttackSt = 0.4;
	defense = originalDefense;
	attackSt = originalAttackSt;
	HP = maxHP;
    }


    public  String about(){
	return "Hisssss. I thirst for blood.";
    }

    public int attack(Character objName){
	int bloodDrink = super.attack(objName);
	HP += bloodDrink;
	if (HP > maxHP){
	    HP = maxHP;
	}
	return bloodDrink;
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
