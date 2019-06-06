package PekingOnlineJudge;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author zhangyue95
 * @date 2019/5/23.
 */
public class Exponentiation {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("start:" + start);
        Scanner scanner = new Scanner(System.in);
        BigDecimal one = scanner.nextBigDecimal();
        int oneIndex = scanner.nextInt();
        BigDecimal two = scanner.nextBigDecimal();
        int twoIndex = scanner.nextInt();
        BigDecimal three = scanner.nextBigDecimal();
        int threeIndex = scanner.nextInt();
        BigDecimal four = scanner.nextBigDecimal();
        int fourIndex = scanner.nextInt();
        BigDecimal five = scanner.nextBigDecimal();
        int fiveIndex = scanner.nextInt();
        BigDecimal six = scanner.nextBigDecimal();
        int sixIndex = scanner.nextInt();
        BigDecimal result1 = one.pow(oneIndex);
        System.out.println(result1);
        BigDecimal result2 = two.pow(twoIndex);
        String result2String = result2.stripTrailingZeros().toPlainString();
        result2String = result2String.substring(1);
        System.out.println(result2String);
        BigDecimal result3 = three.pow(threeIndex);
        System.out.println(result3);
        BigDecimal result4 = four.pow(fourIndex);
        System.out.println(result4);
        BigDecimal result5 = five.pow(fiveIndex);
        System.out.println(result5);
        BigDecimal result6 = six.pow(sixIndex);
        result6 = result6.setScale(24);
        System.out.println(result6);
        long end = System.currentTimeMillis();
        System.out.println("internal:" + (end - start) + "MS");
    }
}
