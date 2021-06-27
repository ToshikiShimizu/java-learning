public class Wand {
    private String name;
    private double power;
    public double getPower(){return this.power;}
    public void setPower(double power) {
        if (power < 0.5 | 100.0 < power){
            throw new IllegalArgumentException("異常です");
        }
        this.power = power;
        }
    public String getName() {return this.name;}


    public void setName(String name) {
        if (name == null | name.length() < 3){
            throw new IllegalArgumentException("異常です");
        }
        this.name = name;
    }
}