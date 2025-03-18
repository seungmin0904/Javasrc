public class Main {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();

        // 직원 추가
        employeeDAO.addEmployee(101, "홍길동", 5000000);

        // 직원 목록 조회
        employeeDAO.getEmployees();

        // 직원 급여 수정
        employeeDAO.updateSalary(101, 6000000);

        // 직원 삭제
        employeeDAO.deleteEmployee(101);
    }
}
