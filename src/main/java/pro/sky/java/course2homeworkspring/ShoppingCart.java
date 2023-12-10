package pro.sky.java.course2homeworkspring;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Component
@SessionScope
public class ShoppingCart {
    private final List<Integer> items = new ArrayList<>();

    public List<Integer> add(List<Integer> items) {
        this.items.addAll(items);
        return this.items;
    }

    public List<Integer> get() {
        return items;
    }
}