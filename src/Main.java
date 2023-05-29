import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.random.*;

public class Main {
    public static void main(String[] args) {
        Personagem p = new Personagem("",0,0,0);
        Enemy e = new Enemy("",0,0,0);
        System.out.println("Informe o nome do seu personagem: ");
        p.setName(read.nextLine());
        System.out.println(p.getName());

        p.setMaxLife(30);
        p.setActualLife(p.getMaxLife());
        p.setDamage(7);
        e.setDamage(6);
        e.setName("Goblin da Floresta");
        e.setMaxLife(28);
        e.setActualLife(e.getMaxLife());

        ArrayList<Enemy> enemies = new ArrayList<Enemy>();

        System.out.println("Um "+e.getName()+" apareceu!");
        System.out.println("Uma batalha vai começar!");
        int t = 0;
        while (p.getActualLife() > 0 && e.getActualLife() > 0){
            t++;
            System.out.println("Turno: "+t);
            System.out.println(" ");
            System.out.println("Pressine X para atacar: ");
            read.nextLine();

            if (p.pAt() > e.eDef()){
                e.setActualLife(e.getActualLife() - p.getDamage());
                System.out.println("Voce acertou o ataque!");
                System.out.println("Vida do inimigo: "+e.getActualLife());
                System.out.println(" ");
            }

            else {
                System.out.println("voce errou o ataque!");
                System.out.println(" ");
            }

            if (e.eAt() > p.pDef()){
                p.setActualLife(p.getActualLife() - e.getDamage());
                System.out.println("O Inimigo acertou o ataque!");
                System.out.println("Vida do seu personagem: "+p.getActualLife());
                System.out.println(" ");
            }
            else{
                System.out.println("O Inimigo Errou o ataque!");
                System.out.println(" ");
            }
        }
        if(e.getActualLife() <= 0){
            System.out.println("Voce derrotou o "+e.getName());
        }
        else if (p.getActualLife() <= 0){
            System.out.println("Sua Vida chegou a 0.");
            System.out.println("GAME OVER!");
        }
        
    }
public static Scanner read = new Scanner(System.in);
}