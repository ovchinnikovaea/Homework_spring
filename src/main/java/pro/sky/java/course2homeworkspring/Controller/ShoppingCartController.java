package pro.sky.java.course2homeworkspring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2homeworkspring.Service.ShoppingCartService;
import pro.sky.java.course2homeworkspring.Service.ShoppingCartServiceImpl;

import java.util.List;
import java.util.Set;

@RequestMapping("/order")
@RestController
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }
    @GetMapping("/add")
    public List<Integer> add(@RequestParam("items") List<Integer> items) {
        return shoppingCartService.add(items);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return shoppingCartService.get();
    }
}