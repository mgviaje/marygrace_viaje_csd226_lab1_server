package ca.saultcollege.marygrace_viaje_csd226_lab1_server.data;

import org.springframework.stereotype.Component;

@Component
public class Items {
    private String[] items = {"item1", "item2", "item3", "item4"};

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }
}