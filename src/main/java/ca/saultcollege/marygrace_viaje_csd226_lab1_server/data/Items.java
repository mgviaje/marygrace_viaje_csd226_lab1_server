package ca.saultcollege.marygrace_viaje_csd226_lab1_server.data;

import org.springframework.stereotype.Component;

@Component
public class Items {
    private Item[] items = {
            new Item("item1", "Description of item1"),
            new Item("item2", "Description of item2"),
            new Item("item3", "Description of item3"),
            new Item("item4", "Description of item4")
    };

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    // Inner class representing an item
    public static class Item {
        private String name;
        private String description;

        public Item(String name, String description) {
            this.name = name;
            this.description = description;
        }

        // Getters and setters for name and description
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}




//package ca.saultcollege.marygrace_viaje_csd226_lab1_server.data;
//
//import org.springframework.stereotype.Component;
//
//@Component
//public class Items {
//    private String[] items = {"item1", "item2", "item3", "item4"};
//
//    public String[] getItems() {
//        return items;
//    }
//
//    public void setItems(String[] items) {
//        this.items = items;
//    }
//}
