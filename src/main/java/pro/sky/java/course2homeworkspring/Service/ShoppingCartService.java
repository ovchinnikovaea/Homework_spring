package pro.sky.java.course2homeworkspring.Service;

import java.util.List;

public interface ShoppingCartService {

    List<Integer> add(List<Integer> items);

    List<Integer> get();
}