package kiemtra;

public class NhanVienFullTime extends NhanVien {
    private int soNgayLamViec;
    private double luongThuong;
    private double luongCoBan = 12345; // Lương cơ bản của nhân viên

    // Constructor
    public NhanVienFullTime(String maNhanVien, String hoTen, String ngaySinh, int soNgayLamViec, double luongThuong) {
        super(maNhanVien, hoTen, ngaySinh);
        this.soNgayLamViec = soNgayLamViec;
        this.luongThuong = luongThuong;
    }

    // Getter và setter
    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public double getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(double luongThuong) {
        this.luongThuong = luongThuong;
    }

    // Phương thức tính lương
    public void tinhLuong() {
        double luong = luongCoBan * soNgayLamViec;

        if (soNgayLamViec >= 26) {
            int soNgayThuong = Math.min(soNgayLamViec - 25, 4); // Số ngày thưởng tối đa là 4
            double luongThem = soNgayThuong * 500000;
            luong += luongThem;
        }

        // Cập nhật giá trị lương trực tiếp, không sử dụng setLuong từ lớp cha
        this.setLuong(luong);
    }
    public void setLuong(double luong) {
        super.setLuong(luong);
    }

    // Override phương thức printInfo để hiển thị thông tin của Nhân viên Full-time
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Số ngày làm việc trong tháng: " + soNgayLamViec);
        System.out.println("Lương thưởng: " + luongThuong);
    }
}
