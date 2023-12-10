package pro.sky.java.course2homeworkspring.Service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2homeworkspring.ShoppingCart;

import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    private final ShoppingCart shoppingCart;

    public ShoppingCartServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public List<Integer> add(List<Integer> items) {
        return shoppingCart.add(items);
    }

    @Override
    public List<Integer> get() {
        return shoppingCart.get();
    }
}
