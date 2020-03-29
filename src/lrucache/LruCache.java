package lrucache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * leetcode 146. LRU缓存机制
 * https://leetcode-cn.com/problems/lru-cache/#/
 */
public class LruCache extends LinkedHashMap<Integer, Integer> {
    private int capacity;

    public LruCache(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
