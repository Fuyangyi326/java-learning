public class ArrayStats {
    static void main(String[] args) {
        int[] numbers = {23,45,12,67,89,34};
        System.out.print("数组内容:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            
        }
        System.out.println();
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("最大值：" + max);
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("最小值：" + min);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double avg = (double) sum / numbers.length;
        System.out.println("平均值：" + avg);
            
        }
    }
