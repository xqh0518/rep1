import com.sun.jndi.ldap.sasl.SaslInputStream;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int a = sc.nextInt();
        if (a > 99 && a < 1000) {
            int b = a % 10;
            int c = a / 10 % 10;
            int d = a / 100 % 10;
            int e = b * b * b + c * c * c + d * d * d;
            if (a == e) {
                System.out.println(a + "是水仙花数");
            } else {
                System.out.println(a + "不是水仙花数");
            }
        } else {
            System.out.println(a + "不是水仙花数");
        }
    }
}

