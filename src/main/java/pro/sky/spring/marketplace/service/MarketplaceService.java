package pro.sky.spring.marketplace.service;


import org.springframework.stereotype.Service;
import pro.sky.spring.marketplace.model.Basket;

import java.util.Arrays;
import java.util.Map;

@Service
public class MarketplaceService {
    private final Basket basket;

    public MarketplaceService(Basket basket) {
        this.basket = basket;
    }

    public void addProductInBasket(int... ids) {
        Arrays.stream(ids).forEach(basket::add);
    }
    public Map<Integer, Integer> getBasketContents() {
        return basket.get();
    }


}
