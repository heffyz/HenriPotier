package tn.zyoussef.henripotier;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tn.zyoussef.henripotier.model.Product;
import tn.zyoussef.henripotier.model.Book;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/panier")
public class PanierController {
    private List<Product> Panier;
    private static List<Book> books;

    public PanierController() {
        books = new ArrayList<>();
    }

    @RequestMapping(value = "/book",method = RequestMethod.POST)
    public void getBooks(@RequestBody Book book){
        books.add(book);
    }
    @RequestMapping(value = "/offer/2",method = RequestMethod.POST)
    public void getPanier(@RequestBody Product panier){


    }
}
