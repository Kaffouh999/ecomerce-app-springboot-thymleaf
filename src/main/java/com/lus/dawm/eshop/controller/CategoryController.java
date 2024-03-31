package com.lus.dawm.eshop.controller;

import com.lus.dawm.eshop.model.Categorie;
import com.lus.dawm.eshop.service.CategoryService;
import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    private static final Logger logger = LoggerFactory.getLogger(CategoryController.class);


    @GetMapping
    public String listCategories(HttpSession session, Model model) {
        logger.info("Listing categories");
        model.addAttribute("categories", categoryService.getAllCategories());
        return "admin/category/lister";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        logger.info("Showing category create form");
        model.addAttribute("category", new Categorie());
        model.addAttribute("categories",categoryService.getAllCategories());
        return "admin/category/create";
    }

    @PostMapping("/save")
    public String saveCategorie(@ModelAttribute("category") Categorie categorie) {
        logger.info("Saving category: "+categorie);
        categoryService.saveCategorie(categorie);
        return "redirect:/categories";
    }

//    @GetMapping("/edit/{id}")
//    public String showEditForm(@PathVariable("id") Long id, Model model) {
//        Categorie categorie = categoryService.getCategorieById(id);
//        model.addAttribute("category", categorie);
//        return "edit_categorie";
//    }

//    @PostMapping("/update/{id}")
//    public String updateCategorie(@PathVariable("id") Long id, @ModelAttribute("categorie") Categorie categorie) {
//        categoryService.updateCategorie(id, categorie);
//        return "redirect:/categories";
//    }

    @GetMapping("/delete/{id}")
    public String deleteCategorie(@PathVariable("id") Long id) {
        logger.info("Deleting category with id: "+id);
        categoryService.deleteCategorie(id);
        return "redirect:/categories";
    }



}
