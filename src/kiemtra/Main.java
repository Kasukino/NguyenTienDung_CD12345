package kiemtra;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thông tin cho nhân viên Full-time:");
        System.out.print("Nhập mã nhân viên: ");
        String maNhanVien = scanner.nextLine();

        System.out.print("Nhập họ và tên: ");
        String hoTen = scanner.nextLine();

        System.out.print("Nhập ngày sinh (dd/mm/yyyy): ");
        String ngaySinh = scanner.nextLine();

        System.out.print("Nhập số ngày làm việc trong tháng: ");
        int soNgayLamViec = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống sau khi nhập số ngày làm việc

        System.out.print("Nhập lương thưởng: ");
        double luongThuong = scanner.nextDouble();
        scanner.nextLine(); // Đọc bỏ dòng trống sau khi nhập lương thưởng

        NhanVienFullTime nhanVien = new NhanVienFullTime(maNhanVien, hoTen, ngaySinh, soNgayLamViec, luongThuong);

        // Tính và hiển thị thông tin lương của nhân viên Full-time
        nhanVien.tinhLuong();
        nhanVien.printInfo();

        scanner.close();
    }
}


