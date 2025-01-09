package com.example.internetShop.controller;

import com.example.internetShop.service.OrderServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //обрабатывает HTTP запрос от Service и выдает его пользователю
@RequestMapping("/store/order") // повторяющийся путь в адресной строке, чтобы не писать его в каждом методе.
public class OrderController {
    private final OrderServiceImpl orderService; //Объявляем переменную orderService,
    // которая хранит объект класса OrderServiceImpl

    public OrderController(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }

    @GetMapping(path = "/add") //адрес чтобы добавить в заказ
    public void add(@RequestParam List<Integer> items) { //Метод добавления, который принимает переменную items c типом данных Integer
        orderService.add(items); //Тело метода, orderService - объект класса, который предоставляет сервис для работы с заказами.
        //add(items) — это метод сервиса, который добавляет элементы из списка items в заказ.
    }

    @GetMapping(path = "/get") //адрес чтобы получить элементы из корзины
    public List<Integer> get() {//Метод получения get, возвращющий список целых чисел, здесь не нужно ничего принимать от клиента
        return orderService.get();//Метод возвращает(выводит окончательный результат) список целых чисел
        // который получает из сервиса orderService.
    }
}

