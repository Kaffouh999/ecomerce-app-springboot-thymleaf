package com.lus.dawm.eshop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/order")
public class OrderController {
    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @GetMapping("")
    public String list(Model model) {
        logger.info("list orders");

        return "admin/order/lister";
    }

    @GetMapping("/new")
    public String showNewOrderForm(Model model) {
        logger.info("show new order form");

        return "admin/order/create";
    }

    @GetMapping("/delete/{id}")
    public String deleteOrder(Long id) {
        logger.info("delete order");

        return "redirect:/order";
    }


}
