package ch2;

public class TeamMain {
    public static void main(String[] args) {
        Team team1 = new Team(1L, "team1");

        TeamMember teamMember1 = new TeamMember(1L, "홍길동");
        TeamMember teamMember2 = new TeamMember(2L, "성춘향");

        teamMember1.setTeam(team1);
        teamMember2.setTeam(team1);

        System.out.println(teamMember1);
        // 객체 그래프 탐색 (member 입장에서 팀 정보 가져오기)
        System.out.println(teamMember1.getTeam().getTeamName());
        // 팀 -> 멤버 조회
        team1.getList().add(teamMember1);
        team1.getList().add(teamMember2);
        System.out.println(team1.getList());
    }
}
