/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-11 15:56
 */
public class PrimeNummberTest2 {

    public static void main(String[] args) {


        // 标识i是否被j整除，一旦除尽，修改其值
        int count=0;
        long start = System.currentTimeMillis();
        // 获取当前时间举例1970-01-01 00:00:00的毫秒数

        lable:for (int i = 2; i <= 100000; i++) {
            // 遍历100以内的自然数
            for (int j = 2; j < Math.sqrt(i); j++) { // Math.sqrt(i)：根号i
                // 优化二对本身是指数的自然数是有效的
                //j:被i去除
                if (i % j == 0) {
                    //i被j整除
                    continue lable;

                }
            }


                count++;


            // 重置
        }

        long end = System.currentTimeMillis();
        System.out.println("所花费的时间"+(end-start)); // 9497-1029
        System.out.println(count);
        //二次9
    }
}
