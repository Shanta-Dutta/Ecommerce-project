package com.tts.TechTalentEcommerce.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tts.TechTalentEcommerce.model.Product;
import com.tts.TechTalentEcommerce.service.ProductService;
//
//@Controller
//public class ProductController {
//	
//	@Controller
//	public class DBConnection {
//
//	   // @Autowired
//	    private Product prDao;
//
//	    @RequestMapping(value = "/newproduct", method = RequestMethod.GET)
//	    public ModelAndView showForm() {
//	        Product product = new Product();
//	        return new ModelAndView("newproduct", "product", product);
//	    }
//
//	    @RequestMapping(value = "/newproduct", method = RequestMethod.POST)
//	    public ModelAndView submitForm(@ModelAttribute("product") Product product) {
//	        ModelAndView mav = new ModelAndView();
//
//	        prDao.addProduct(product.getId(), product.getDescription(), product.getPrice(), product.getDate());
//	        mav.setViewName("product");
//	        mav.addObject("product", product);
//	        return mav;
//	    }
//	}
//	
//	
//	
	
@Controller
public class ProductController {
    @Autowired
  private  ProductService productService;

    @GetMapping("/product/{id}")
    public String show(@PathVariable int id, Model model) {
        Product product = productService.findById(id);
        model.addAttribute(product);
        return "product";
    }

    // TODO: Either implement admin controls or remove these methods.

    @RequestMapping(value = "/product", method = {RequestMethod.POST, RequestMethod.PUT})
    public String createOrUpdate(@Valid Product product) {
        productService.save(product);
        return "redirect:/product/" + product.getId();
    }
}


	
  //  @Autowired
//    ProductService productService;
//
//    @GetMapping("/product/{id}")
//    public String show(@PathVariable int id, Model model) {
//        Product product = productService.findById(id);
//        model.addAttribute(product);
//        return "product";
//    }
//
//    // TODO: Either implement admin controls or remove these methods.
//
//    @RequestMapping(value = "/product", method = {RequestMethod.POST, RequestMethod.PUT})
//    public String createOrUpdate(@Valid Product product) {
//        productService.save(product);
//        return "redirect:/product/" + product.getId();
//    }
//}

