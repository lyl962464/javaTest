package file;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;

public class FileTest {
    public static void main(String[] args) {

        /***
         * File.separator：表示文件路径的分隔符，为了避免程序在部署的时候出现不同系统，不同的文件目录符
         *
         *IO操作存在延迟问题。需要注意
         *
         */
        try {
            File file = new File("e:"+File.separator+"demo"+File.separator+"hello"+File.separator+"test.txt");
            //判断父级目录是否存在。
            if(!file.getParentFile().exists()){
//                创建多级父级目录
                file.getParentFile().mkdirs();
            }
            if(file.exists()){
                file.delete();
            }else {
                file.createNewFile();
                System.out.println(file.isFile());
                System.out.println(file.isDirectory());

                /***
                 * new BigDecimal((double)file.length()/1024/1024).divide(new BigDecimal(1)(被除数),2(保留几位),BigDecimal.ROUND_HALF_UP(进位模式))
                 *
                 *
                 */
                System.out.println("文件大小"+new BigDecimal((double)file.length()/1024/1024).divide(new BigDecimal(1),2,BigDecimal.ROUND_HALF_UP)+"M");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
