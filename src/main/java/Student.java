public class Student {
    String name;
    int age;
    int score;

public Student(String name,int age,int score){
    this.name = name;
    this.age = age;
    this.score = score;
}
    public void introduce(){
        System.out.println("我是 " + name + "，今年 " + age + " 岁，成绩 " + score + " 分");
    }
}

