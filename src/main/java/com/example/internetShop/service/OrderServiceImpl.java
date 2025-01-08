package com.example.internetShop.service;

import com.example.internetShop.model.Basket;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service //Аннотация, которая отвечает за бизнес логику и выполняет основную работу приложения
public class OrderServiceImpl implements OrderService {
    //Класс OrderServiceImpl реализует методы интерфейса OrderService
    private final Basket basket;
    //объявляем переменную basket, которая хранит объект класса Basket

    public OrderServiceImpl(Basket basket) {
        this.basket = basket;
    }//конструктор класса OrderServiceImpl, который принимает параметр basket типа Basket.


    @Override//Переопределяет метод из родительского класса или интерфейса.
    public List<Integer> add(List<Integer> list) {//Публичный (Имеет доступ из другого класса) метод add,
        // который принимает список чисел в качестве входного параметра и возвращает списко чисел
        basket.addOrder(list);//Вызываем метод addOrder у объекта basket, передавая ему список list
        return list;//возвращаем тот же список как результат, который был передан на вход.
    }

    @Override
    public List<Integer> get() {//Возвращаем список целых чисел с попомщью метода get
        return basket.getOrder();//Вызываем метод getOrder у объекта basket и возвращаем результат.
    }
}
