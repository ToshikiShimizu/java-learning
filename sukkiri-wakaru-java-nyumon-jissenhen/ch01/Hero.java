import java.util.Objects;

public class Hero implements Cloneable{
    private String name;
    private int hp, mp;
    Sword sword;

    public String toString(){
        return "勇者（名前=" + this.name + "/HP=" + this.hp + "/MP=" + this.mp + "）";
    }

    public int HashCode() {
        return Objects.hash(this.name, this.hp);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public void setMp(int mp){
        this.mp = mp;
    }

    public Hero clone(){
        Hero result = new Hero();
        result.name = this.name;
        result.hp = this.hp;
        result.sword = this.sword.clone();
        return result;
    }

    public Sword getSword(){
        return this.sword;
    }


}