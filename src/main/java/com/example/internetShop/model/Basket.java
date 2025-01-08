package com.example.internetShop.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component //Данная антотациия показывает Spring, что данный класс является отслеживаемым
@SessionScope //Для каждого подключения нового клиента создается новый объект корзины.
public class Basket {
    List<Integer> order = new ArrayList<>(); //Создаем переменную order, которая будет хранить список(List)
    // который содержит элементы типа Integer(целые числа).

    public List<Integer> getOrder() {
        return order;
    }

    public void setOrder(List<Integer> order) {
        this.order = order;
    }

    public void addOrder(List<Integer> Id) { //Метод добавления заказов, принимает один аргумент — список (List),
        // который содержит элементы типа Integer (целые числа)
        order.addAll(Id); //Тело метода, который добавляет все элементы из списка Id в переменную order.
    }
}

