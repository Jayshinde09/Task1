public class infiniteloop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("Hello!");
            i++;
        }
        while (true) {
            System.out.println("Infinite loop");
        }
    }
}