public class Thief {
    String name;
    int hp;
    int mp;

    public Theif(String name, int hp, int mp){
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public Theif(String name, int hp){
        this(name, hp, 5);
    }

    public Theif(String name){
        this(name, 40);
    }



}