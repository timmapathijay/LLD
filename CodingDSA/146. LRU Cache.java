class Node{
    int key, value;
    Node prev, next;
    Node(int key, int value)
    {
        this.key = key;
        this.value = value;
    }
}
class LRUCache {
    int capacity;
    Node head, tail;
    Map<Integer , Node> map = new HashMap<>();
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }
    // O(1)
    public int get(int key) {
        if(map.containsKey(key))
        {
            // The key is getting recently used we need to change its position 
            Node node = map.get(key);
            remove(node);
            insert(node.key , node.value);
            return node.value;
        }
        else
        {
            return -1;
        }
    }
    // O(1)
    public void put(int key, int value) {
        // update if the key already exist
        if(map.containsKey(key))
        {
           Node node = map.get(key);
           remove(node); 
        }
        // Insert will happen for both the cases (update , new add on) :- Getting recently used 
        insert(key , value);
    }
    private void remove(Node node)
    {
        node.prev.next = node.next;
        node.next.prev = node.prev;

        map.remove(node.key);

    }
    private void insert(int key, int value)
    {
        if(map.size() >= capacity)
        {
            remove(tail.prev);
        }
        Node node = new Node(key , value);
        node.prev = head;
        node.next = head.next;
        head.next = node;
        node.next.prev = node;

        map.put(key, node);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
