package tn.zyoussef.henripotier;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.zyoussef.henripotier.model.Offer;
import tn.zyoussef.henripotier.model.Slice;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "promo")
public class PromoController {

    @RequestMapping("/offer/1")
    public Offer offerForOne(){
        return new Offer("percentage",15);
    }

    @RequestMapping("/offer/2")
    public List<Offer> offerForMore(){
        List<Offer> offers = new ArrayList<Offer>();
        offers.add(new Offer("percentage",15));
        offers.add(new Offer("minus",4));
        offers.add(new Slice("slice",100,12));
        return offers;
    }


}
