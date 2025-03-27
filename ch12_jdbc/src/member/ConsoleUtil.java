package member;

import java.util.Scanner;

import emp.EmpDTO;

public class ConsoleUtil {
    public MemberDTO memberInsertInfo(Scanner sc) {

        System.out.println();
        MemberDTO memberDTO = new MemberDTO();
        System.out.println("=========회원 정보 입력화면==========");
        System.out.print("아이디 >>");
        memberDTO.setId(sc.nextLine());
        System.out.print("이름 >>");
        memberDTO.setName(sc.nextLine());
        System.out.print("주소 >>");
        memberDTO.setAddr(sc.nextLine());
        System.out.print("이메일 >>");
        memberDTO.setEmail(sc.nextLine());
        System.out.print("나이 >>");
        memberDTO.setAge(Integer.parseInt(sc.nextLine()));

        return memberDTO;
    }

    // 성공시 출력 메소드
    public void printSuccessMessage(int result) {
        // result 값에 따라 입력성공 or 입력실패 출력
        System.out.println(result > 0 ? "입력성공" : "입력실패");
    }

    public void printupdateMessage(int result, String id) {
        // result 값에 따라 수정성공 or 수정실패 출력
        System.out.println(result > 0 ? id + "님의 정보를 수정하였습니다." : id + "님의 정보수정에 실패하였습니다.");
    }

    public void updateSuccessMessage(int result) {
        // result 값에 따라 성공 or 실패 출력
        System.out.println(result > 0 ? "수정성공" : "수정실패");
    }

    public MemberDTO memberUpdateMenu(Scanner sc) {
        MemberDTO mDto = new MemberDTO();
        System.out.println("=============회원 정보 수정=================");
        System.out.println("1. 주소 수정");
        System.out.println("2. 이메일 수정");
        System.out.println("=============================================");
        System.out.println("번호 >>");

        int no = Integer.parseInt(sc.nextLine());
        // no == 1 memberUpdateAddr
        // no == 2 memberUpdateEmail

        // 리턴받은 DTO를 리턴
        if (no == 1) {

            return mDto = memberUpdateAddr(sc);
        } else if (no == 2) {
            return mDto = memberUpdateEmail(sc);
        }
        return null;
    }

    public MemberDTO memberUpdateAddr(Scanner sc) {
        // 수정 할 값 입력(id, 변경할 addr) = DTO에 담은 후 리턴
        System.out.println("============수정 정보 입력 ===========");
        System.out.print("아이디 >>");
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(sc.nextLine());
        System.out.print("변경 주소 >>");
        memberDTO.setAddr(sc.nextLine());
        return memberDTO;

    }

    public MemberDTO memberUpdateEmail(Scanner sc) {
        // 수정 할 값 입력(id, 변경할 email) = DTO에 담은 후 리턴

        System.out.println("============수정 정보 입력 ===========");
        System.out.print("아이디 >>");
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(sc.nextLine());
        System.out.print("변경 이메일 >>");
        memberDTO.setEmail(sc.nextLine());
        return memberDTO;

    }
}
