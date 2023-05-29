import java.util.Random;

public class Personagem {
    private String Name;
    private int ActualLife;
    private int MaxLife;
    private int Damage;

    public Personagem(String n, int al, int ml, int d) {
        Name = n;
        ActualLife = al;
        MaxLife = ml;
        Damage = d;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getActualLife() {
        return ActualLife;
    }

    public void setActualLife(int actualLife) {
        ActualLife = actualLife;
    }

    public int getMaxLife(){
        return MaxLife;
    }

    public void setMaxLife(int maxLife) {
        MaxLife = maxLife;
    }

    public int getDamage(){
        return Damage;
    }

    public void setDamage(int d) {
        Damage = d;
    }

    public int pAt(){
        Random d6 = new Random();
        return d6.nextInt(1,21);
    }

    public int pDef(){
        Random d6 = new Random();
        return d6.nextInt(1,21);
    }
}
