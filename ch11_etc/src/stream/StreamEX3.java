package stream;

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import java.nio.*;

public class StreamEX3 {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
                new Member("남1", Member.MALE, 30),
                new Member("여1", Member.FEMALE, 20),
                new Member("남2", Member.MALE, 45),
                new Member("여2", Member.FEMALE, 27)
        );

        int age = 0, count = 0;
        for (Member member : members) {
            if (member.getGender() == Member.MALE) {
                age =+member.getAge();
                count++;
            }
        }
        System.out.println("남자 평균나이 :  " + (age / count));

        // 스트림 처리
        // filter(Predicate<Member> predicate)
        double ageAvg = members.stream()
                .filter((member) -> member.getGender() == Member.MALE)
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();
        System.out.println("남자 평균" + ageAvg);
    }
}