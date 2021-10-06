package view;

import controller.HotelManager;
import model.Hotel;
import model.Person;

import java.util.Scanner;

public class HotelMenu {

    public static HotelManager hotelManager = new HotelManager();
    Scanner scanner = new Scanner(System.in);

    public void run() {
        int choice;
        do {
            menu();
            System.out.println("Nhập lựa chọn của bạn");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                    showAll();
                    break;

                }
                case 2: {
                    addNewGuest();
                    break;

                }
                case 3: {
                    updateGuset();
                    break;

                }
                case 4: {
                    removeGuset();
                    break;

                }
                case 5:{
                    billPlease();
                    break;
                }
                case 0: {
                    System.exit(0);
                    break;

                }
            }

        } while (choice != 0);
    }

    private void billPlease() {
        System.out.println("nhập CMDN muốn tính tiền");
        String identity=scanner.nextLine();
        hotelManager.billPlease(identity);


    }

    private void removeGuset() {
        System.out.println("nhập ID muốn xóa");
        String id = scanner.nextLine();
        hotelManager.removeByID(id);
    }

    private void updateGuset() {
        System.out.println("nhập ID muốn sửa");
        String id = scanner.nextLine();
        Hotel hotel = inputNewGuest();
        hotelManager.updateByID(id,hotel);
    }

    private void addNewGuest() {
        Hotel hotel = inputNewGuest();
        hotelManager.addNew(hotel);
    }

    private Hotel inputNewGuest() {
        System.out.println("Thêm mới khách thuê phòng");
        System.out.println("Nhạp ID :");
        String id = scanner.nextLine();
        System.out.println("Nhập số ngày trọ");
        int day = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập loại phòng");
        String type = scanner.nextLine();
        System.out.println("Nhập giá phòng");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập tên khách hàng");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày tháng năm sinh");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhập số CMND");
        String identity = scanner.nextLine();
        Hotel hotel = new Hotel(id,day,type,price,new Person(name,dateOfBirth,identity));
        return  hotel;

    }


    private void showAll() {
       hotelManager.showAll();
    }

    private void menu() {
        System.out.println("Menu");
        System.out.println("1. Hiển thị danh sách khách ");
        System.out.println("2. Thêm khách mới");
        System.out.println("3. Chỉnh sửa thông tin khách hàng");
        System.out.println("4. Xóa thông tin");
        System.out.println("5. Tính tiền cho khách");
        System.out.println("0. Thoát");
    }
}

