package ChatGPT;

import java.util.Date;
import java.text.SimpleDateFormat;

public class two {
    public static void main(String[] args) {
        Date currentDate = new Date();

        // 設定日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("現在的時間是: " + sdf.format(currentDate));
    }
}

