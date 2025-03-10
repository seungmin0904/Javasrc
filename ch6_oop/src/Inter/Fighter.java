package Inter;

import java.util.Scanner;

// 보통 아래와 같은 형태로 클래스 구성이 이루어져 있음
// 클래스 상속 + 인터페이스 다중상속 
public class Fighter extends Unit implements Fightable {
    Scanner sc;
    String msg;

    @Override
    public void move(int x, int y) {
        Math.random();
    }

    @Override
    public void attack(Unit unit) {

    }

}
