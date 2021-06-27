public class Computer {

    String makerName;
    public Computer(String name, int price, String color, String makerName){
        super(name, price, color)
        this.makername = makerName;
    }

    public String getMakerName() { return this.makerName;}
}
