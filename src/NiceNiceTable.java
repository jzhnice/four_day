/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-10 17:39
 */
public class NiceNiceTable {
    public static void main(String[] args) {
        for (int i = 1; i<=9;i++){
            for (int j = 1; j <= i;j++ ){
                System.out.print(i+"*"+ j +"="+(i*j)+"");
            }
            System.out.println();
        }

    }
}
