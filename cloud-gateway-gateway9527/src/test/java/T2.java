import java.time.ZonedDateTime;

/**
 * @author wangyang
 * @version V1.0
 * @create 2020-04-15-15:13
 */
public class T2 {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now();//默认时区
        System.out.println(zbj);
        //2020-04-15T15:20:23.855+08:00[Asia/Shanghai]
    }
}
