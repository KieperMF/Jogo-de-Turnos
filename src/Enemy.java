import java.util.Random;

public class Enemy {
    private String eName;
    private int eActualLife;
    private int eMaxLife;
    private int eDamage;

    public Enemy(String n, int al, int ma, int d){
        eName = n;
        eActualLife = al;
        eMaxLife = ma;
        eDamage = d;
    }

    public String getName() {
        return eName;
    }

    public void setName(String ename) {
        eName = ename;
    }

    public int getActualLife() {
        return eActualLife;
    }

    public void setActualLife(int eactualLife) {
        eActualLife = eactualLife;
    }

    public int getMaxLife(){
        return eMaxLife;
    }

    public void setMaxLife(int emaxLife) {
        eMaxLife = emaxLife;
    }

    public int getDamage(){
        return eDamage;
    }

    public void setDamage(int edamage) {
        eDamage = edamage;
    }

    public int eAt(){
        Random d6 = new Random();
        return d6.nextInt(1,21);
    }

    public int eDef(){
        Random d6 = new Random();
        return d6.nextInt(1,21);
    }

}
