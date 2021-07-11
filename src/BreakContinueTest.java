/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-11 15:36
 */

/**
 *break和continue关键字的适用范围
 *              适用范围             循环中使用的作用（不同点）           相同点
 * break： switch-case循环结构中    结束当前循环                        关键字后面不能声明执行语句
 *
 * continue   循环结构中          结束档次循环                          关键字后面不能声明执行语句
 * */
public class BreakContinueTest {
    public static void main(String[] args) {
        for (int i = 1; i <=10;i++ ){
            if (i%4 == 0) {
                //break; 123
                continue;
            }
            System.out.println(i);
        }
        System.out.println();


        lable:for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j % 4 == 0) {
                    //break; // 默认跳出包裹此关键字最近的一层循环
                    //continue;
                    //break lable;//结束指定表示的一层循环结构
                    continue  lable; // 结束指定表示的一层循环结构当次循环
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
