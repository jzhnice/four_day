import java.io.DataOutput;
import java.util.Scanner;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-08 10:27
 */
public class ForTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入一个正整数");
        int m = scan.nextInt();

        System.out.println("请输入第二个正整形");
        int n = scan.nextInt();

        // 获取最大公约数
        //获取两个数中的较小值
        int min = (m <= n)? m:n;
        // 遍历
        for (int i = min; i >=1; i--) {
            if(m % i == 0 && n % i == 0){
                System.out.println("最大公约数为:" + i);
                break;
            }
        }
        // 获取最小公倍数
        // 获取两个数中的较大值
        int max = ( m >= n) ? m:n;
        //遍历
        for (int i = max; i <= m*n; i++) {
            if (i % m == 0 && i % n == 0) {
                System.out.println("最小公倍数：" + i);
                break;
            }
        }
    }


}