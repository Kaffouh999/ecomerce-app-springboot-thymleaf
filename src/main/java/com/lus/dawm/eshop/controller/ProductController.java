package com.lus.dawm.eshop.controller;

import com.lus.dawm.eshop.model.Product;
import com.lus.dawm.eshop.service.CategoryService;
import com.lus.dawm.eshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("")
    public String listProducts(Model model) {
        model.addAttribute("products", productService.findAll());
        return "admin/product/lister";
    }

    @GetMapping("/new")
    public String showNewProductForm(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("categories", categoryService.getAllCategories());
        return "/admin/product/create";
    }

    @PostMapping("/save")
    public String saveProduct(Product product) {
        productService.save(product);
        return "redirect:/products";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") Long id) {
        productService.delete(id);
        return "redirect:/products";
    }
}
