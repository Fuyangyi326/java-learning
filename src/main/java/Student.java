public class Student {
   private String name;
   private int age;
   private int score;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }
    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("年龄不合法：" + age);
            return;
        }
        this.age = age;
    }
    public void setScore(int score) {
        if (score < 0 || score > 100) {
            System.out.println("成绩不合法：" + score);
            return;
        }
        this.score = score;
    }

    public Student(String name,int age,int score){
    this.name = name;
    this.age = age;
    this.score = score;
}
    public void introduce(){
        System.out.println("我是 " + name + "，今年 " + age + " 岁，成绩 " + score + " 分");
    }
}

