package edu.mum.controller;

import edu.mum.domain.Category;
import edu.mum.domain.Product;
import edu.mum.service.CategoryService;
import edu.mum.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequestMapping(value = {"/"})
public class ProductController {

    ProductService productService;
    CategoryService categoryService;

    ProductController() {

    }

    // Setter based injection....
    @Autowired
    ProductController(ProductService productService, CategoryService categoryService) {
        this.categoryService = categoryService;
        this.productService = productService;
    }

    @RequestMapping(value = {"/", "/add"}, method = RequestMethod.GET)
    public String inputProduct(@ModelAttribute("newProduct") Product product, Model model) {

        List<Category> categories = categoryService.getAll();
        model.addAttribute("categories", categories);//    model.asMap().get("categories")
        return "ProductForm";
    }


    @RequestMapping(value = "/save")
    public RedirectView saveProduct(Product product, RedirectAttributes redirectAttributes) {

        Category category = categoryService.getCategory(product.getCategory().getId());
        product.setCategory(category);
        productService.save(product);

        redirectAttributes.addFlashAttribute("product", product);

        RedirectView rv = new RedirectView();
        rv.setContextRelative(true);
        rv.addStaticAttribute("greet", "Greetings object saved");
        rv.setUrl("/details");

        return rv;
    }


    @RequestMapping(value = "/details")
    public String productDetails() {
        return "ProductDetails";
    }

    @RequestMapping(value = "/list")
    public String listProducts(Model model) {

        List<Product> list = productService.getAll();
        model.addAttribute("products", list);

        return "ListProducts";
    }

}
