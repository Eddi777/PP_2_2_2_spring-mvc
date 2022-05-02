package web.service;

import web.dao.CarDAO;

import java.util.List;

public class CarService {

    private final CarDAO carDao = new CarDAO();

    public List<String> getCars(Integer count) {
        if (count == null || count <= 0) {
            count = Integer.MAX_VALUE;
        }
        return carDao.getCarsAsString(count);
    }
}
