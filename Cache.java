import java.util.ArrayDeque;
import java.util.Deque;

public class Cache<T> {

    private final int n;
    private final Deque<T> array_deque;

    public Cache(int n){
        if(n<0){
            throw new IllegalArgumentException("длина кеша должна быть больше 0");
        }
        this.n=n;
        array_deque = new ArrayDeque<>(n);
    }

    public void add(T item){
        if (array_deque.size()==n){
            array_deque.removeFirst();
        }
        array_deque.addLast(item);
    }
    
}
