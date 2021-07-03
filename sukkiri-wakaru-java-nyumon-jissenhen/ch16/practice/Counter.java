public class Counter {
    private long count = 0;
    public void add(long i){
        synchronized(this){
            this.count += 1;
        }
    }

    public void mul(long i){
        synchronized(this){
            this.count *= 1;
        }
    }
}