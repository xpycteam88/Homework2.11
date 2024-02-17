package pro.sky.spring.marketplace.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Component
@SessionScope
public class Basket {
    private final Map<Integer, Integer> items = new HashMap<>();

    public Map<Integer, Integer> get() {
        return Collections.unmodifiableMap(items);
    }

    public void add(int ids) {
        if (items.containsKey(ids)) {
            items.put(ids, items.get(ids) + 1);
        } else {
            items.put(ids, 1);
        }
    }

}
