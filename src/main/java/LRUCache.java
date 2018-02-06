/**
 * Created by rsingh13.
 */
import java.util.*;
class LRUCache {
    private  int capacity = 0;
    private Map<Integer ,Integer> cache = null;
    private Deque<Integer> queue = new LinkedList<Integer>();

    private LRUCache(){}

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<Integer,Integer>();
    }

    public int get(int key) {
        if(cache.get(key) != null) {
            queue.remove(key);
            queue.add(key);
            return cache.get(key);
        }
        return -1;
    }


    public void put(int key, int value) {
        if(cache.get(key) == null) {
            if(cache.size() == capacity) {
                int k = queue.remove();
                cache.remove(k);
                System.out.println("evict " + k);
            }
            cache.put(key,value);
            queue.add(key);
        }else {
            cache.put(key,value);
            queue.remove(key);
            queue.add(key);
        }
    }
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
