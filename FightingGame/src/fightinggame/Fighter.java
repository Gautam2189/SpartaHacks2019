/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fightinggame;

/**
 *
 * @author Dan
 */
public class Fighter {
   protected String name;
    protected int hp;
    protected int atk;
    
    public Fighter(String Sname, int health, int attack){
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
    public void normalAttack(Cutlass f){
        int health = f.getHp();
        f.setHp(health - atk);
    }
    public void specialAttack(Cutlass f){
        int rNum = (int)(Math.random() * 10) + 1;
        int health = f.getHp();
        f.setHp(health - (atk + rNum));
    }
}
