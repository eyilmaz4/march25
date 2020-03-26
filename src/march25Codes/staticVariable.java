package march25Codes;

public class staticVariable {
    static int a=0;
    int b=0;
    public staticVariable(){
        a++;
        b++;
    }
    public static void getA(){
        System.out.println(a);
    }
    public void getB(){
        System.out.println(this.b);
    }
}
