/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-10 16:50
 */

import java.util.Scanner;

/**
 *题目：
 * 从键盘读入个数不确定的整数，并判断读入的正数和负数的个数
 *
 *
 * 说明：
 * 1.不在循环体哦阿健限制次数的结构：for(;;) 或while(true)
 * 2.结束循环有几种方式？
 *      方式一：循环条件部分返回false
 *      方式二：在循环中使用break;
 * */
public class ForWhileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int zhengshu = 0;
        int fushu = 0;
        while(true){
            System.out.println("请输入数字");
            int number = input.nextInt();
            if(number > 0){
                zhengshu++;
            }else if (number <0) {
                fushu++;
            }else{
                break;
            }
        }
        System.out.println("整数有：" + zhengshu);
        System.out.println("负数有：" + fushu);
    }
}
