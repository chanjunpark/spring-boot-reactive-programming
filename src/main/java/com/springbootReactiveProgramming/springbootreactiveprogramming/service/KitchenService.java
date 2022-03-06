package com.springbootReactiveProgramming.springbootreactiveprogramming.service;

import com.springbootReactiveProgramming.springbootreactiveprogramming.domain.Dish;
import reactor.core.publisher.Flux;

public class KitchenService {
    Flux<Dish> getDishes() {
        return Flux.just(
                new Dish("chicken"),
                new Dish("noodles"),
                new Dish("beef")
        );
    }

}
