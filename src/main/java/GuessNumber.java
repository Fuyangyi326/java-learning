import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        System.out.println("我已经想好了一个 1-100 的数字，你猜猜看：");
        while (true) {
            System.out.print("请输入你的猜测：");
            int guess = scanner.nextInt();
            count++;

            if (guess > target) {
                System.out.println("太大了！");
            } else if (guess < target) {
                System.out.println("太小了！");
            } else {
                System.out.println("恭喜你猜对了！你一共猜了 " + count + " 次。");
                break;
            }
        }
    }
}