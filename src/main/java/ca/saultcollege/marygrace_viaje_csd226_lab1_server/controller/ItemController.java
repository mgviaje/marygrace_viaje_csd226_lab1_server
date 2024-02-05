//package ca.saultcollege.marygrace_viaje_csd226_lab1_server.controller;
//
//import ca.saultcollege.marygrace_viaje_csd226_lab1_server.data.Item;
//import ca.saultcollege.marygrace_viaje_csd226_lab1_server.data.Items;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class ItemController {
//
//    private final Items items;
//
//    @Autowired
//    public ItemController(Items items) {
//        this.items = items;
//    }
//
//    @PostMapping("/addItem")
//    public ResponseEntity<String> addItem(@RequestBody ItemFormData formData) {
//        // Check if itemName and itemDescription are not null or empty
//        if (formData.getItemName() == null || formData.getItemName().isEmpty()
//                || formData.getItemDescription() == null || formData.getItemDescription().isEmpty()) {
//            return ResponseEntity.badRequest().body("Item name and description are required.");
//        }
//
//        // Create a new Item instance using the form data
//        Item newItem = new Item(formData.getItemName(), formData.getItemDescription());
//
//        // Add the new item to your data structure or perform any necessary operations
//        items.addItem(newItem);
//
//        // Redirect or return a response as needed
//        return ResponseEntity.ok("Item added successfully!");
//    }
//
//    static class ItemFormData {
//        private String itemName;
//        private String itemDescription;
//
//        // Getters and setters
//        public String getItemName() {
//            return itemName;
//        }
//
//        public void setItemName(String itemName) {
//            this.itemName = itemName;
//        }
//
//        public String getItemDescription() {
//            return itemDescription;
//        }
//
//        public void setItemDescription(String itemDescription) {
//            this.itemDescription = itemDescription;
//        }
//    }
//}
