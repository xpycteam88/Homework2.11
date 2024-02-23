package pro.sky.spring.marketplace.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.spring.marketplace.service.MarketplaceService;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class MarketplaceController {
    private MarketplaceService marketplaceService;

    public MarketplaceController(MarketplaceService marketplaceService) {
        this.marketplaceService = marketplaceService;
    }

    @GetMapping("/add")
    public void addProduct(@RequestParam int... ids) {
        marketplaceService.addProductInBasket(ids);

    }
    @GetMapping("/get")
    public ResponseEntity<Map<Integer, Integer>> getBasket() {
        return new ResponseEntity<>(marketplaceService.getBasketContents(), HttpStatus.OK);
    }
}
