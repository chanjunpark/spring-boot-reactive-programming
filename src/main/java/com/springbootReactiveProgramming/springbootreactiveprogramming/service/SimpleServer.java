package com.springbootReactiveProgramming.springbootreactiveprogramming.service;

import com.springbootReactiveProgramming.springbootreactiveprogramming.domain.Dish;
import reactor.core.publisher.Flux;

public class SimpleServer {

    private final KitchenService kitchenService;

    public SimpleServer(KitchenService kitchenService) {
        this.kitchenService = kitchenService;
    }

    public Flux<Dish> doingMyJob() {
        return this.kitchenService.getDishes()
                .map(dish -> Dish.deliver(dish));
    }

}
