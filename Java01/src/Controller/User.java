public class User {
    
    private String studentID;
    private String fullName;
    private String dateOfBirth;
    private String address;

    // studentID
    public String getStudentID() {
        return studentID;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // fullName
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    // dateOfBirth
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // address
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    // In thông tin User
    public void print() {
        System.out.println("Mã SV: " + studentID);
        System.out.println("Họ tên: " + fullName);
        System.out.println("Ngày sinh: " + dateOfBirth);
        System.out.println("Địa chỉ: " + address);
    }
}
