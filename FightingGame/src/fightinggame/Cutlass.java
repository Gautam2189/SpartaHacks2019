
package fightinggame;

public class Cutlass {
    protected String name;
    protected int hp;
    protected int atk;
    
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
    
}
