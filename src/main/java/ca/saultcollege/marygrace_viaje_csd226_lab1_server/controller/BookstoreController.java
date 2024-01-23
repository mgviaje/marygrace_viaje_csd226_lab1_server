package ca.saultcollege.marygrace_viaje_csd226_lab1_server.controller;

import ca.saultcollege.marygrace_viaje_csd226_lab1_server.data.Content;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookstoreController {
    @GetMapping("/publiccontent")
    public ResponseEntity<String> getPublicContent(){ // map a URL to a method
        return ResponseEntity.ok("getPublicContent() :");
    }

    @GetMapping("/publiccontent2")
    public Content getPublicContent2(){ // map a URL to a method
        return new Content("some content");
    }


}
