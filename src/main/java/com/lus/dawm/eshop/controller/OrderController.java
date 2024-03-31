package com.lus.dawm.eshop.controller;

import com.lus.dawm.eshop.model.Commande;
import com.lus.dawm.eshop.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/orders")
public class OrderController {

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private ProductService productService;

    @GetMapping("")
    public String list(Model model) {
        logger.info("list orders");

        return "admin/order/lister";
    }

    @GetMapping("/new")
    public String showNewOrderForm(Model model) {
        logger.info("show new order form");
        model.addAttribute("productItems", productService.findAll());
        model.addAttribute("commande", new Commande());
        return "admin/order/create";
    }

    @GetMapping("/delete/{id}")
    public String deleteOrder(Long id) {
        logger.info("delete order");

        return "redirect:/orders";
    }


}
