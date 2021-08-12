package QuanLyKhachSan;
//Để quản lý khách hàng đến thuê phòng trọ của một khách sạn,
//        người ta cần quản lý những thông tin sau:
//        - Số ngày trọ, loại phòng trọ, giá phòng,
//        và các thông tin cá nhân về mỗi khách trọ.-
//        Với mỗi cá nhân, người ta cần quản lý các thông tin :
//        Họ và tên, ngày sinh, số chứng minh thư nhân dân.1.
//        Hãy xây dựng lớpNguoiđể quản lý thông tin cá nhân về mỗi cá nhân2.
//        Xây dựng lớpKhachSanđể quản lý các thông tin về khách trọ.3.
//        Viết các phương thức : nhập, hiển thị, xóa các thông tin về một khách trọ,4.
//        Cài đặt chương trình thực hiện các công việc sau:-
//        Nhập vào một dãy gồm n khách trọ ( n - nhập từ bàn phím)-
//        Hiển thị ra màn hình thông tin về các cá nhân hiện đang trọ ở khách sạn đó.-
//        Tính số tiền cần phải trả nếu một khách hàng trả phòng trọ
//        (căn cứ vào số CMND để tìm kiếm trong mảng)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng khách trọ:");
        int size = scanner.nextInt();
        HotelManagement hotelManagement = new HotelManagement(size);
        Hotel[] hotels = hotelManagement.getHotels();
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập thông tin về khách trọ thứ " + (i + 1));
            hotels[i] = hotelManagement.inputHotelInfo(scanner);
        }
        hotelManagement.displayHotelList();
        System.out.println("Nhập chứng minh nhân dân khách trọ cần xóa thông tin:");
        String identity = scanner.nextLine();
        int index = hotelManagement.findHotelByIdentity(identity);
        if (index == -1) {
            System.out.println("Không tìm thấy");
        } else {
            hotelManagement.removeHotelInfo(index);
            hotelManagement.displayHotelList();
        }
    }
}

