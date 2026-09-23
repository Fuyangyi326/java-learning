import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("我已经想好了一个 1-100 的数字，你有5次机会：");

        boolean success = false;
        for (int i=1;i<=5; i++){
        System.out.print("第 " + i + " 次猜：");
        int guess = scanner.nextInt();
            if (guess > target) {
                System.out.println("太大了！");
            } else if (guess < target) {
                System.out.println("太小了！");
            } else {
                System.out.println("恭喜你猜对了！你用了 " + i + " 次。");
                success=true;
                break;
            }
        }
        if (!success) {
        System.out.println("很遗憾，5 次都没猜中。正确答案是 " + target);
    }
  }
}