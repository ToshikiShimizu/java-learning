public class Main{
    public static void main(String[] args){
        Slime s = new Slime();
        Monster m = new Slime();
        s.run();
        m.run();
        // 12-10
        Monster[] monsters = new Monster[3];
        monsters[0] = new Slime();
        monsters[1] = new Goblin();
        monsters[2] = new DeathBat();
        for (Monster m : monsters){
            m.run();
        }
    }
}