import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

public class AnotherCounter {
    private AtomicLong count = new AtomicLong(0);
    public void add(long i){
        this.count.getAndUpdate(c -> c + i);
    }
    public void mul(long i){
        this.count.getAndUpdate(c -> c * i);
    }
}