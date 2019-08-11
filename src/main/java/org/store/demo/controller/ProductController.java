package org.store.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.store.demo.domain.Product;
import org.store.demo.dto.ProductDto;
import org.store.demo.service.ProductService;

import javax.validation.Valid;

import static org.store.demo.mapper.ProductMapper.*;

@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/add_product", method = RequestMethod.GET)
    public String addUserView(Model model){
        model.addAttribute("productDto", new ProductDto());
        return "add_product";
    }

    @PostMapping(value = "/product")
    public String createProduct(@Valid @ModelAttribute("productDto") ProductDto productDto, Model model){

        if(productDto.getId() == null) {
            this.productService.createProduct(productDto);
        } else {
            this.productService.updateProduct(productDto);
        }

        model.addAttribute("products", this.productService.findAll());
        return "products";
    }

    @GetMapping(value = "/product") //strona na ktora przechodze
    public String showProducts(Model model){
        model.addAttribute("products", this.productService.findAll());
        return "products";
    }

    @PostMapping(value = "/editProduct")
    public String editUser(@RequestParam(required = true) Long id, Model model){
        model.addAttribute("productDto", toDto(this.productService.getById(id)));
        return "add_product";
    }

    @PostMapping(value = "/deleteProduct") //dotyczy POST
    public String deleteUser(@RequestParam(required = true) Long id, Model model){
        this.productService.deleteProductById(id);
        model.addAttribute("products", this.productService.findAll());
        return "products";
    }


}
