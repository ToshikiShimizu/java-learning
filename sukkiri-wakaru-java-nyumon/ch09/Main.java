public class Main {
    public static void main(String[] args){
        Hero h1, h2;
        h1 = new Hero("ミナト");
        System.out.println(h1.hp);
        h1.attack();
        h2 = new Hero();
        System.out.println(h2.hp);
        System.out.println(h2.name);
    }
}