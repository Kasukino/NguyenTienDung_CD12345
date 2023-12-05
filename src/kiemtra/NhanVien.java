package kiemtra;

public class NhanVien {
    private String maNhanVien;
    private String hoTen;
    private String ngaySinh;

    private double luong;


    // Constructor để khởi tạo đối tượng Nhân viên
    public NhanVien(String maNhanVien, String hoTen, String ngaySinh) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    // Các phương thức getter và setter để truy cập và thiết lập giá trị của các thuộc tính
    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    // Phương thức để hiển thị thông tin của Nhân viên
    public void printInfo() {
        System.out.println("Thông tin nhân viên:");
        System.out.println("Mã nhân viên: " + maNhanVien);
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Lương: " + luong + " VND");
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
}

