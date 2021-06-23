public class Cleric{
    String name;
    int hp = 10;
    final int MAX_HP = 50;
    int mp = 10;
    final int MAX_MP = 50;

    public void selfAid(){
        this.mp -= 5;
        this.hp = this.MAX_HP;
    }

    public int pray(int time){
        int recover = time + new java.util.Random().nextInt(3);
        recover = Math.min(recover, this.MAX_MP - this.mp);
        this.mp += recover;
        return recover;
    }
}