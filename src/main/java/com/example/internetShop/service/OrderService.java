package com.example.internetShop.service;

import java.util.List;

public interface OrderService {
    List<Integer> add(List<Integer> list);//Метод add в интерфейса OrderService,
    //который принимает список целых чисел в качестве входного параметра
    //и возвращает новый список целых чисел (List<Integer>)

    List<Integer> get();//Метод get, который возвращает список целых чисел.
}
