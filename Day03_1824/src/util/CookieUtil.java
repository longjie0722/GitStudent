package util;

import javax.servlet.http.Cookie;
import java.text.SimpleDateFormat;
import java.util.Date;
     //cookie储存在本地浏览器
public class CookieUtil {

    // 获取当前系统时间的字符串表示
    public static String getCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return sdf.format(new Date());
    }

    // 根据Cookie名称找到对应的Cookie
    public static Cookie getCookieByName(Cookie[] arr, String name) {
        if (arr == null) { // 如果数组为空，表示没有Cookie
            return null;
        }
        for (Cookie cook : arr) {
            if (cook.getName().equals(name)) {
                return cook;
            }
        }
        return null;
    }
}
