public class LemonDriver {
    public static void main(String[] args) {
        
        Lemon lemon1 = new Lemon("green", (float) 0.1);
        System.out.println(lemon1.toString());

        Lemon lemon2 = new Lemon("golden", (float) 0.2);
        
        Lemon lemon3 = new Lemon("pale yellow", (float) 0.15);
        System.out.println(lemon3.toString());
    }
}
