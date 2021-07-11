/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-09 10:58
 */
/**
 * 一：循环结构的四个要素
 *①初始化条件
 *②循环条件
 *③循环体
 *④迭代条件
 *
 *
 * 二、do-while循环结构
 * ①
 * do{
 *     ③；
 *     ④
 * }while(② )；
 * 执行过程: ①-③-④-②-③-④-......-②
 *
 * 说明：
 * do-while循环至少会执行一次循环体！
 * 开发中。使用for和while更多一些，较少使用do-while
 **/
public class DowhileTest {
    public static void main(String[] args) {
        // 遍历100以内的偶数，并计算所有偶数的和及偶数的个数
        int num = 1;
        int sum = 0;
        int count  = 0;
        do{
            if (num %2 == 0){
                System.out.println(num);
                sum+=num;
                count++;
            }

        }while (num <= 100);
        System.out.println("总和为：" + sum);
        System.out.println("个数为："+count );
    }

}
