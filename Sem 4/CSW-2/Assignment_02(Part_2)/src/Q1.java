// Create a generic class Pair<K,V> with private variables key and value.
// The class Pair should define a parameterised constructor and getter and
// setter methods for these attributes. After addition of objects, the main
// class should retrieve and print the pair of key and value

class Pair<K, V> {
    private K key;
    private V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

}

public class Q1 {
    public static void main(String[] args) throws Exception {
        Pair<String, String> p1 = new Pair("Dane", "Josh");
        Pair<Integer, Integer> p2 = new Pair(32, 312);

        System.out.println("Key : " + p1.getKey() + " Value : " + p1.getValue());
        System.out.println("Key : " + p2.getKey() + " Value : " + p2.getValue());
    }
}
