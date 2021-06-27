public class Sword implements Cloneable {
    private String name;
    public Sword clone(){
        Sword result = new Sword();
        result.name = this.name;
        return result;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}