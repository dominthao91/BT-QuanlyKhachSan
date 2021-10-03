package controller;

import model.Hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelManager {
    private List<Hotel> hotels = new ArrayList<>();

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public void showAll() {
        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }
    }

    public void addNew(Hotel hotel) {
        hotels.add(hotel);
    }
    public int searchById(String id) {
        int index = -1;
        for (int i = 0; i < hotels.size(); i++) {
            if (hotels.get(i).getId().equals(id)) {
                index = i;
            }
        }
        return index;
    }
    public void updateByID(String id, Hotel car) {
        int index = searchById(id);
        if (index != -1) {
            hotels.set(index, car);
        } else {
            System.out.println("Không tìm thấy mã ID này >>.");
        }

    }
    public void removeByID(String id) {
        int index = searchById(id);
        if (index != -1) {
            hotels.remove(index);
        } else {
            System.err.println("Không tìm thấy mã ID này >>.");
        }

    }


}