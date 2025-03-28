package member;

import java.util.List;
import java.util.Scanner;

import emp.EmpDTO;

public class ConsoleUtil {
    public MemberDTO memberInsertInfo(Scanner sc) {

        // 회원 정보 삽입
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

    // 전체조회 출력
    public void memberAllPrint(List<MemberDTO> list) {
        System.out.println("================전체조회 출력=================");
        for (MemberDTO dto : list) {
            memberPring(dto);
        }
        System.out.println("==================출력 종료===================");

    }

    // 성공시 출력 메소드
    public void printSuccessMessage(int result) {
        // result 값에 따라 성공 or 실패 출력
        System.out.println(result > 0 ? "입력성공" : "입력실패");
    }

    // 조회
    public String memberGetInfo(Scanner sc) {
        // 조회할 회원 아이디
        System.out.println("=====조회 선택=====");
        System.out.println("1. 아이디  ");
        System.out.println("2. 이름  ");
        System.out.print("조회 할 목록의 번호를 입력하세요 >> ");
        int no = Integer.parseInt(sc.nextLine());

        String input = "";

        if (no == 1) {
            System.out.print("1. 조회 할 아이디 >> ");
            input = sc.nextLine();
        } else {
            System.out.print("2. 조회 할 이름 >> ");
            input = sc.nextLine();
        }
        return input;
    }

    // 조회출력
    public void memberPring(MemberDTO dto) {
        System.out.println();
        System.out.println(" 번호 : " + dto.getNo());
        System.out.println(" 이름 : " + dto.getName());
        System.out.println(" 나이 : " + dto.getAge());
        System.out.println(" 아이디 : " + dto.getId());
        System.out.println(" 주소 : " + dto.getAddr());
        System.out.println(" 이메일 : " + dto.getEmail());
    }

    // 삭제
    public String memberDeleteInfo(Scanner sc) {
        System.out.println("======회원삭제======");
        System.out.print("삭제 할 아이디 >>");
        // 삭제 할 아이디 입력
        String id = sc.nextLine();
        // 입력값 리턴
        return id;
    }

    public void printdeleteSuccessMessage(int result) {
        // 삭제 출력
        System.out.println(result > 0 ? "삭제성공" : "삭제실패");
    }

    // 정보수정
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

    // 정보 수정 출력
    public void printupdateMessage(int result, String id) {
        // result 값에 따라 성공 or 실패 출력
        System.out.println(result > 0 ? id + "님의 정보를 수정하였습니다." : id + "님의 정보수정에 실패하였습니다.");
    }

    public void updateSuccessMessage(int result) {
        // result 값에 따라 성공 or 실패 출력
        System.out.println(result > 0 ? "수정성공" : "수정실패");
    }

}
