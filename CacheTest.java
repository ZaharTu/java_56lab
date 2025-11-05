public class CacheTest {
    public static void main(String[] args) {
        Cache<Integer> c = new Cache<>(2);
        System.out.println("get item index=42: " + c.getItemByIndex(42));
        System.out.println("get first empty: " + c.getFirst());
        System.out.println("get last empty: " + c.getLast());

        c.add(1);
        c.add(2);
        System.out.println("size: " + c.getSize());
        c.add(3);
        System.out.println("first: " + c.getFirst());
        System.out.println("last: " + c.getLast());

        c.add(4);
        System.out.println("index 0: " + c.getItemByIndex(0));
        System.out.println("index 1: " + c.getItemByIndex(1));

        System.out.println("exists(3): " + c.exists(3));
        System.out.println("remove(3): " + c.remove(3));
        System.out.println("exists(3): " + c.exists(3));
    }
}
