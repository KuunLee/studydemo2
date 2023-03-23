import java.util.Optional;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("叫大哥");
        System.out.println("哈哈哈哈");
        int count = 0;
        String s = "s";
        Optional.ofNullable(s);
        int a = 0;
        int b = 0;
        for (int i = 10; i >= 0; i--) {
            a = b + i;
            b++;
            if(a == i - b){
                break;
            }
        }
        System.out.printf("i");
    }
}
