/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-10 17:15
 */

/**
 * 嵌套循环的使用：
 * 1.嵌套循环：将一个循环结构A声明在另一个循环结构B的循环体中，就构成了嵌套循环
 * 2。
 * 外层循环：循环结构B
 * 内层循环：循环结构A
 * 3.
 * 内层循环结构遍历一遍。只相当于外层循环循环体执行了一遍
 * 假设外层循环需要执行m次,内层循环需要执行n次，此时内外层循环一共执行n*m次.
 * 4.技巧
 * 外层控制行数，内层控制列数
 */
public class ForForTest {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.print('*');
        }
        System.out.println("\n");



        /*
        *******
        *******
        *******
        *******
        */
        for (int j = 1; j <= 4; j++) {
            for (int k = 0; k <= 6; k++) {
                System.out.print('*');
            }
            System.out.println();
        }


        /*
         *
         **
         ***
         ****
         */
        for (int k = 1; k <= 5;k++){
            for (int j = 1; j <= k; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        /*
         ****
         ***
         **
         *
         */
        for (int k = 1; k <= 5; k++) {
            for (int j = 1; j<=5-k;j++){
                System.out.print('*');
            }
            System.out.println();
        }

        /*
         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *

         */




    }
}
