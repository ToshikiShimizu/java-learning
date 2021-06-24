public class SuperHero extends Hero{
    public SuperHero(){
        System.out.println("SuperHero");
    }
    boolean flying;
    public void attack(Matango m){
        super.attack(m);
        if (this.flying){
            super.attack(m);
        }
    }
}
