package member;

import java.util.List;
import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MemberDAO mDao = new MemberDAO();
        MemberDTO mDto = null;
        ConsoleUtil util = new ConsoleUtil();
        boolean run = true;

        while (run) {
            System.out.println("======================= Member =========================");
            System.out.println("                  1. member 추가                        ");
            System.out.println("                  2. member 수정                        ");
            System.out.println("                  3. member 삭제                        ");
            System.out.println("                  4. member 조회                        ");
            System.out.println("                  5. member 전체조회                    ");
            System.out.println("                  6. 프로그램 종료                      ");
            System.out.println("========================================================");

            System.out.print("메뉴선택 >>");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    MemberDTO dto = util.memberInsertInfo(sc);
                    int result = mDao.insert(dto);
                    util.printSuccessMessage(result);
                    break;
                case 2:
                    mDto = util.memberUpdateMenu(sc);
                    if (mDto != null) {
                        result = mDao.update(mDto);
                        // 성공 or 실패 메세지 출력 메소드 호출
                        util.printupdateMessage(result, mDto.getId());
                    }
                    break;
                case 3:
                    String id = util.memberDeleteInfo(sc);
                    result = mDao.delete(id);
                    // 성공 or 실패 메세지 출력 메소드 호출
                    util.printdeleteSuccessMessage(result);
                    break;
                case 4:
                    String input = util.memberGetInfo(sc);
                    // regex : 정규식
                    // 영어와 일치하는가 true / false
                    // input.matches("[A-Za-z].*")

                    // 아이디 영어로 시작인지 확인 - getRow()
                    if (input.matches("[A-Za-z].*")) {

                        MemberDTO row = mDao.getRow(input);
                        if (row != null) {
                            util.memberPring(row);
                        } else {
                            System.out.println("조회결과 존재하지않음");
                        }

                    } else {
                        // 이름이 한글로 시작인지 확인 - gerNameList()
                        List<MemberDTO> list = mDao.getNameList(input);
                        if (!list.isEmpty()) {
                            util.memberAllPrint(list);
                        } else {
                            System.out.println("조회결과 존재하지않음");
                        }
                    }
                    break;
                case 5:
                    List<MemberDTO> list = mDao.getList();
                    util.memberAllPrint(list);
                    break;
                case 6:
                    run = false;
                    break;

                default:
                    break;
            }
        }
    }
}
