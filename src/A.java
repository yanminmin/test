import java.util.HashMap;
import java.util.Map;

public class A {
    private   static Map<String, String> a = new HashMap<>(100000);
    public static void main(String[] args) throws InterruptedException {
        System.out.println("开始初始化");

        for (int i = 0; i < 100000; i++) {
            a.put("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + i, "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb" + i);
        }
        System.out.println("完成初始化");
        Thread.sleep(1000000);
        System.out.println("休眠结束");

    }
}
