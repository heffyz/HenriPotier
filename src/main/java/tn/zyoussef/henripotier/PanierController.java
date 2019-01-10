package tn.zyoussef.henripotier;

import org.springframework.web.bind.annotation.*;
import tn.zyoussef.henripotier.model.Product;
import tn.zyoussef.henripotier.model.Book;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/panier")
@CrossOrigin
public class PanierController {
    private List<Product> panier;
    private List<Book> books;

    public PanierController() {
        books = new ArrayList<>();
        panier = new ArrayList<>();
    }

    @RequestMapping(value = "/book",method = RequestMethod.POST)
    public void getBooks(@RequestBody Book book){
        if(!books.contains(book))
        books.add(book);
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public void addToPanier(@RequestBody Product p){
        boolean test = false;
        if(panier.isEmpty()){
            panier.add(p);
        }else{
            for (Product product: panier) {
                if (product.getIsbn().equals(p.getIsbn())){
                    product.setQuantity(product.getQuantity()+p.getQuantity());
                    test= true;
                }
            }
            if(!test){
                panier.add(p);
            }
        }
    }
    @RequestMapping(value = "/remove",method = RequestMethod.POST)
    public void modifOrremoveFromPanier(@RequestBody Product p){
        if(!panier.isEmpty()){
            for (Product product: panier) {
                if (product.getIsbn().equals(p.getIsbn())){
                    if(p.getQuantity()!=0) {
                        product.setQuantity(p.getQuantity());
                    }else{
                        panier.remove(product);
                    }
                }
            }
        }
    }
    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public List<Product> getPanier(){
        return panier;
    }
    @RequestMapping(value = "book/{id}",method = RequestMethod.GET)
    public Book getBookById(@RequestParam("id") String id){
        for (Book b: books) {
            if(b.getIsbn().equals(id)){
                return b;
            }
        }
        return null;
    }
}
