public class Main{
    public static void main(String[] args){
        Y[] ins = new Y[2];
        ins[0] = new A();
        ins[1] = new B();

        for (Y y : ins){
            y.b();
        }
    }
}