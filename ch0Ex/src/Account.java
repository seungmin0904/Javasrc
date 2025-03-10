public class Account {
    // 회원가입
    // 생년월일 , 이름 , 이메일 , 휴대전화번호 , 비밀번호 입력 , 비밀번호 확인 , 닉네임

    private String birth;
    private String username;
    private String email;
    private String phonNumber;
    private String password;
    private String confirmPassword;
    private String nickname;

    public Account() {

    }

    public String getBirth() {
        System.out.println("생년월일을 입력해주세요");
        if (birth.length() == 8) {
            birth = birth.substring(0, 4) + "년"
                    + birth.substring(4, 6) + "월"
                    + birth.substring(6, 8) + "일";
            System.out.println(birth);
            return birth;

        } else {
            System.out.println("생년월일을 다시 입력해주세요");

        }
        return "";
    }

    public String getUsername() {
        if (username == null || username.isEmpty()) { // null과 isEmpty는 거의 짝궁이다
            System.out.println("닉네임을 입력해주세요 (한글 4글자 + 영어 10글자)");
            return ""; // 빈 값 반환
        }

        // 한글과 영어 글자 수 체크
        int koreanCount = 0;
        int englishCount = 0;

        for (char ch : username.toCharArray()) {
            if (Character.toString(ch).matches("[가-힣]")) {
                koreanCount++;
            } else if (Character.toString(ch).matches("[a-zA-Z]")) {
                englishCount++;
            }
        }

        if (koreanCount != 4 || englishCount != 10) {
            System.out.println("닉네임 형식이 올바르지 않습니다. (한글 4글자 + 영어 10글자)");
            return "";
        }

        return username; // 조건을 만족하면 정상 반환
    }

    public String getEmail() {
        if (email == null || email.isEmpty())
            System.out.println("이메일을 입력해주세요");

        return "";
    }

    public String getPhonNumber() {
        if (phonNumber == null || phonNumber.isEmpty()) {
            System.out.println("전화번호를 입력해주세요");
            System.out.printf("입력 하신 전화번호는 %d%d%d - %d%d%d%d - %d%d%d%d 입니다");

        }
        return phonNumber;
    }

    public String getNickname() {
        return nickname;
    }

    // 기능
    // 닉네임 변경, 비밀번호 변경, 이메일 변경, 전화번호 변경
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhonNumber(String phonNumber) {
        this.phonNumber = phonNumber;
    }

    public void setPassword(String password, String confirmPassword) {
        if (password.equals(confirmPassword)) {
            this.password = password;
        } else {
            System.out.println("비밀 번호가 일치하지 않습니다.");

        }
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

}
