class Pair<K, V> {

    private K key;
    private V value;

    // Constructor
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getter for key
    public K getKey() {
        return key;
    }

    // Getter for value
    public V getValue() {
        return value;
    }

    // Setter for key
    public void setKey(K key) {
        this.key = key;
    }

    // Setter for value
    public void setValue(V value) {
        this.value = value;
    }
}