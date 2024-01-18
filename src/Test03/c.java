package Test03;

public class c extends a{
    private c() {
        s+= "c";

    }

    public static void main(String[] args) {
        new c();
        System.out.println(s);
    }
}
