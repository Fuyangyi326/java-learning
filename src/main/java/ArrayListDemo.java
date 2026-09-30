import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("张三");
        names.add("李四");
        names.add("王五");

        System.out.println("共 " + names.size() + " 个名字");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + ": " + names.get(i));
        }

        names.remove(1);
        System.out.println("删除后：");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + ": " + names.get(i));
        }
    }
}