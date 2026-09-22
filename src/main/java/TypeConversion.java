public class TypeConversion {
    static void main(String[] args) {
        int a = 10;
        double b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        double c= 9.99;
        int d = (int)c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        long bigNumber =1234567890123L;
        int samllNumber = (int) bigNumber;
        System.out.println("bigNumber =" +bigNumber);
        System.out.println("samllNumber=" + samllNumber);

        char ch = 'A';
        int chCode = ch;
        System.out.println("ch = " + ch);
        System.out.println("chCode = " + chCode);

        int num = 66;
        char ch2 = (char) num;
        System.out.println("num = " + num);
        System.out.println("ch2 = " + ch2);
    }
}
