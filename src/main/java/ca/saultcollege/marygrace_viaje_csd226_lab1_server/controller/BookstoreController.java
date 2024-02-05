package ca.saultcollege.marygrace_viaje_csd226_lab1_server.controller;

import ca.saultcollege.marygrace_viaje_csd226_lab1_server.data.Content;
import ca.saultcollege.marygrace_viaje_csd226_lab1_server.data.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookstoreController {

    private final Items items; // Assuming you have a service or component to manage items

    @Autowired
    public BookstoreController(Items items) {
        this.items = items;
    }

    @GetMapping("/items")
    public ResponseEntity<String> getItemsPage() {
        // Replace this string with the content you want to display on the Items page
        String itemContent = "<h1>Welcome to CSD226 Bookstore</h1><p>See List of Items Available Below!</p>";

        // Retrieve the list of items
        Items itemsInstance = new Items();
        String[] itemList = itemsInstance.getItems();

        // Generate HTML to display the items
        StringBuilder itemListHtml = new StringBuilder();
        itemListHtml.append("<ul>");
        for (String item : itemList) {
            itemListHtml.append("<li>").append(item).append("</li>");
        }
        itemListHtml.append("</ul>");

        return ResponseEntity.ok(itemContent + itemListHtml.toString());
    }

    @GetMapping("/publiccontent")
    public ResponseEntity<String> getPublicContent(){ // map a URL to a method
        String homeContent = "<h1> Welcome to CSD226 Bookstore</h1>\n" +
                "  <div>\n" +
                "    <h2> Instruction on how to Signup</h2>\n" +
                "  </div>\n" +
                "  <div>\n" +
                "    <h2> 1. Click the signup button above</h2>\n" +
                "  </div>\n" +
                "  <div>\n" +
                "    <h2> 2. Fill up the form</h2>\n" +
                "  </div>\n" +
                "  <div>\n" +
                "    <h2> 2. Click submit</h2>\n" +
                "  </div>\n"
                ;



        return ResponseEntity.ok(homeContent);
    }
//    @GetMapping("/about")
//    public ResponseEntity<String> getAbout(){ // map a URL to a method
//        return ResponseEntity.ok("getAbout() : About");
//    }

    @GetMapping("/admin")
    public ResponseEntity<String> getAdminPage() {
        // Replace this string with the content you want to display on the About page
        String adminContent = "<h1>Welcome to Admin Portal</h1><p>See List of Items Available!</p>";

        List<String> itemList = new ArrayList<>();
        itemList.add("item1");
        itemList.add("item2");
        itemList.add("item3");
        itemList.add("item4");

        String addItem = "\n<form hx-post=\"/addItem\" hx-target=\"this\" hx-swap=\"outerHTML\">\n" +
                "    <div>\n" +
                "        <label>Item Name</label>\n" +
                "        <input type=\"text\" name=\"itemName\" value=\"\">\n" +
                "    </div>\n" +
                "    <div class=\"form-group\">\n" +
                "        <label>Item Description</label>\n" +
                "        <input type=\"text\" name=\"itemDescription\" value=\"\">\n" +
                "    </div>\n" +
                "    <button class=\"btn\">Add Item</button>\n" +
                "</form>";

        String editItem = "<h2>Choose Item to edit:</h2>\n<form hx-post=\"/editItem\" hx-target=\"this\" hx-swap=\"outerHTML\">\n" +
                "    <div>\n" +
                "        <label>Item Name</label>\n" +
                "        <input type=\"text\" name=\"itemName\" value=\"\">\n" +
                "    </div>\n" +
                "    <div class=\"form-group\">\n" +
                "        <label>Item Description</label>\n" +
                "        <input type=\"text\" name=\"itemDescription\" value=\"\">\n" +
                "    </div>\n" +
                "    <button class=\"btn\">Edit Item</button>\n" +
                "</form>";

        String deleteItem = "<h2>Choose Item to delete:</h2>\n<form hx-post=\"/deleteItem\" hx-target=\"this\" hx-swap=\"outerHTML\">\n" +
                "    <div>\n" +
                "        <label>Item Name</label>\n" +
                "        <input type=\"text\" name=\"itemName\" value=\"\">\n" +
                "    </div>\n" +
                "    <button class=\"btn\">Delete Item</button>\n" +
                "</form>";

        return ResponseEntity.ok(adminContent +  itemList.toString() + "\n"+ "\n" + addItem + editItem + deleteItem);
    }

    @GetMapping("/staff")
    public ResponseEntity<String> getStaffPage() {
        // Replace this string with the content you want to display on the About page
        String staffContent = "<h1>Welcome to Staff Portal</h1><p>See List of Items Available!</p>";

        List<String> itemList = new ArrayList<>();
        itemList.add("item1");
        itemList.add("item2");
        itemList.add("item3");
        itemList.add("item4");

        String editItem = "<h2>Choose Item to edit:</h2>\n<form hx-post=\"/editItem\" hx-target=\"this\" hx-swap=\"outerHTML\">\n" +
                "    <div>\n" +
                "        <label>Item Name</label>\n" +
                "        <input type=\"text\" name=\"itemName\" value=\"\">\n" +
                "    </div>\n" +
                "    <div class=\"form-group\">\n" +
                "        <label>Item Price</label>\n" +
                "        <input type=\"text\" name=\"itemPrice\" value=\"\">\n" +
                "    </div>\n" +
                "    <div class=\"form-group\">\n" +
                "        <label>Item Description</label>\n" +
                "        <input type=\"text\" name=\"itemDescription\" value=\"\">\n" +
                "    </div>\n" +
                "    <button class=\"btn\">Edit Item</button>\n" +
                "</form>";

        String deleteItem = "<h2>Choose Item to delete:</h2>\n<form hx-post=\"/deleteItem\" hx-target=\"this\" hx-swap=\"outerHTML\">\n" +
                "    <div>\n" +
                "        <label>Item Name</label>\n" +
                "        <input type=\"text\" name=\"itemName\" value=\"\">\n" +
                "    </div>\n" +
                "    <button class=\"btn\">Delete Item</button>\n" +
                "</form>";

        return ResponseEntity.ok(staffContent +  itemList.toString() + "\n"+ "\n" + editItem + deleteItem);
    }
    @GetMapping("/publiccontent2")
    public Content getPublicContent2(){ // map a URL to a method
        return new Content("some content");
    }

//    @PostMapping("/signup")
//    public ResponseEntity<String> createAccount(@RequestBody Account signUpFormData){
//        return ResponseEntity.ok("createAccount() : "+signUpFormData.getEmail());
//    }
}
