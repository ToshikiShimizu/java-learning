public class Hero{
    String name;
    int hp;
    Sword sword;
    public void attack(){
        System.out.println(this.name + "は攻撃した！");
    }
    public Hero(String name){
        this.hp = 200;
        this.name = name;
    }
    public Hero(){
        this("ダミー");
    }
}