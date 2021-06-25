public class Main{
    public static void main(String[] args){
        Wizard w = new Wizard();
        w.setHp(50);
        System.out.println(w.getHp());
        w.setHp(100);
        System.out.println(w.getHp());
        w.setHp(-50);
        System.out.println(w.getHp());
        w.setName("A");
    }
}