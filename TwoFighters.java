public class Fighter {
    public String name;
    public int health, damagePerAttack;
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public static void main(String[]args){
        Fighter f1 = new Fighter("Jas",340,20);
        Fighter f2 = new Fighter("John",230,25);

        System.out.println(declareWinner(f1,f2,"John"));

    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker){
        String winnerName = "";
        Fighter f1,f2;
        if (fighter1.name == firstAttacker){
            f1 = fighter1;
            f2 = fighter2;
        }
        else {
            f1 = fighter2;
            f2 = fighter1;
        }

        while (f1.health >0 && f2.health>0){
            f2.health -= f1.damagePerAttack;
            if(f2.health <=0){
                winnerName = f1.name;
            }
            else {
                f1.health -= f2.damagePerAttack;
                if (f1.health <= 0)
                    winnerName = f2.name;
            }
        }
        return winnerName;
    }
}
