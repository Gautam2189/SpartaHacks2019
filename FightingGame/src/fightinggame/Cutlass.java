
package fightinggame;

public class Cutlass {
    protected String name;
    protected int hp;
    protected int atk;
    protected int rNum;
    
    
    public Cutlass(String Sname, int health, int attack){
        name = Sname;
        hp = health;
        atk = attack;
    }
    
    public int getHp(){
        return hp;
    }
    public void setHp(int health){
        hp = health;
    }
    public int getAtk(){
        return atk;
    }
    public void setAtk(int attack){
        atk = attack;
    }
        public int getRand(){
        return rNum;
    }
    public void normalAttack(Fighter f){
        int health = f.getHp();
        f.setHp(health - atk);
    }
    public void specialAttack(Fighter f){
        rNum = (int)(Math.random() * 10) + 5;
        int health = f.getHp();
        f.setHp(health - rNum);
    }
    public void heal(Cutlass a){
        int health = a.getHp();
        a.setHp(health + 20);
    }
}
