package pokemans.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class PokemanStats {
    @JsonProperty("HP")
    public String hp;
    @JsonProperty("Attack")
    public int attack;
    @JsonProperty("Defense")
    public int defense;
    @JsonProperty("Sp. Attack")
    public int sp_attack;
    @JsonProperty("Sp. Defense")
    public int sp_defense;
    @JsonProperty("Speed")
    public int speed;

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSp_attack() {
        return sp_attack;
    }

    public void setSp_attack(int sp_attack) {
        this.sp_attack = sp_attack;
    }

    public int getSp_defense() {
        return sp_defense;
    }

    public void setSp_defense(int sp_defense) {
        this.sp_defense = sp_defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PokemanStats that = (PokemanStats) o;
        return attack == that.attack &&
                defense == that.defense &&
                sp_attack == that.sp_attack &&
                sp_defense == that.sp_defense &&
                speed == that.speed &&
                Objects.equals(hp, that.hp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hp, attack, defense, sp_attack, sp_defense, speed);
    }
}
