package oop;

// 사칙연산
public class Calc {
    Long add(long num1, long num2) {
        return num1 + num2;
    }

    Long subtract(long num1, long num2) {
        return num1 - num2;
    }

    Long multiply(long num1, long num2) {
        return num1 * num2;
    }

    double divide(double num1, double num2) {
        return num1 / num2;
    }

    // long 타입의 입력값 2개 받아서
    // 입력값 2개중에서 큰것을 출력
    Long max(long num1, long num2) {
        // 조건 ? 참 : 거짓;
        // if (num1 > num2) {
        // return num1;
        // } else {
        // return num2;
        // }
        return num1 > num2 ? num1 : num2;

    }

    Long min(long num1, long num2) {
        // if (num1 < num2) {
        // return num1;
        // } else {
        // return num2;
        // }
        return num1 < num2 ? num1 : num2;
    }

}
