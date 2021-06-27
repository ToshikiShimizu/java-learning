public class Main {
    public static void main(String[] args){
        Empty e = new Empty();
        String s = e.toString();
        System.out.println(s);
    }
    public void printAnything(Object o){
        System.out.prinln(o.toString());
    }
}