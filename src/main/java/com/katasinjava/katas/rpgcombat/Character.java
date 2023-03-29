package com.katasinjava.katas.rpgcombat;

public class Character {

    private Long health = 1000L;
    public Long getHealth() {
        return this.health;
    }


    private Integer level = 1;
    public long getLevel() {
        return this.level;
    }

    private Boolean alive = true;
    public boolean isAlive() {
        return this.alive;
    }

    public void attacks(Character victim, Long damage) {
        victim.damage(damage);
    }

    private void damage(Long damage) {
        if(this.health < damage ){
            this.health = 0L;
            this.alive = false;
            return;
        }
         this.health -= damage;

    }
}
