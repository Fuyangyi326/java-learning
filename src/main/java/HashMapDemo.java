import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
HashMap<String,Integer> ages =new HashMap<>();
    ages.put("张三",18);
    ages.put("李四",20);
    ages.put("王五",19);

    System.out.println("张三的年龄：" + ages.get("张三"));
    System.out.println("李四的年龄：" + ages.get("李四"));

    System.out.println("包含王五？" + ages.containsKey("王五"));
    System.out.println("包含赵六？" + ages.containsKey("赵六"));

    System.out.println("共 " + ages.size() + " 个");

    ages.put("张三", 19);
    System.out.println("张三新年龄：" + ages.get("张三"));
    }
}
