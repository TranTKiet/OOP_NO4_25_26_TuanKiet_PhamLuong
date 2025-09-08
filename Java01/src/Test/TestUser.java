public class TestUser {
    public static void main(String[] args) {
        // Tạo đối tượng User
        User user = new User();

        // Gán dữ liệu bằng setter
        user.setStudentID("23017258");
        user.setFullName("Pham Thi Luong");
        user.setDateOfBirth("30/04/2005");
        user.setAddress("Ha Noi");

        // In toàn bộ thông tin
        user.print();
    }
}