package com.lus.dawm.eshop.controller;

import com.lus.dawm.eshop.model.Product;
import com.lus.dawm.eshop.service.CategorieService;
import com.lus.dawm.eshop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CategorieService categorieService;

    @GetMapping("/products")
    public String listProducts(Model model) {
        model.addAttribute("products", productService.findAll());
        return "admin/product/lister";
    }

    @GetMapping("/products/new")
    public String showNewProductForm(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("categories", categorieService.getAllCategories());
        return "/admin/product/create";
    }

    @PostMapping("/products/save")
    public String saveProduct(Product product) {
        productService.save(product);
        return "redirect:/products";
    }
}
