public class DaoTest {
    public static void main(String[] args) throws Exception {
        StudentDao dao = new StudentDao();

        // 1. 查询所有
        System.out.println("===== 所有学生 =====");
        for (Student s : dao.findAll()) {
            s.introduce();
        }

        // 2. 按学号查
        System.out.println("\n===== 查 001 =====");
        Student s = dao.findById("001");
        if (s != null) {
            s.introduce();
        } else {
            System.out.println("没找到");
        }

        // 3. 添加
        System.out.println("\n===== 添加 003 =====");
        if (!dao.existsById("003")) {
            dao.add(new Student("003", "王五", 19, 78));
            System.out.println("添加成功");
        } else {
            System.out.println("003 已存在");
        }

        // 4. 再查一遍确认
        System.out.println("\n===== 添加后所有学生 =====");
        for (Student st : dao.findAll()) {
            st.introduce();
        }

        // 5. 删除
        System.out.println("\n===== 删除 003 =====");
        dao.deleteById("003");
        System.out.println("删除完成");

        // 6. 再查一遍
        System.out.println("\n===== 删除后所有学生 =====");
        for (Student st : dao.findAll()) {
            st.introduce();
        }
    }
}