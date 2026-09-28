public class ArrayStats {
    public static void main(String[] args) {
        int[] numbers = {23, 45, 12, 67, 89, 34};

        System.out.print("数组内容：");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        System.out.println("最大值：" + findMax(numbers));
        System.out.println("最小值：" + findMin(numbers));
        System.out.println("平均值：" + avg(numbers));
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static double avg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }
}