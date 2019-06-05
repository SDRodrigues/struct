package RefCopia;

public class RefCopia {
    public static void main(String args[]) {
        int a = 2;
        int b = a;
        a = a + 46;
        b = b + 10;
        Object c = new Object();
        Object d = c;
        System.out.println("Valor de A " + a);
        System.out.println("Valor de B " + b);
        System.out.println(c);
        System.out.println(d);

    }

}
