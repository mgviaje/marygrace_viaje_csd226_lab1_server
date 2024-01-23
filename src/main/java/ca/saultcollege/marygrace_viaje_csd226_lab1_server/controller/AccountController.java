package ca.saultcollege.marygrace_viaje_csd226_lab1_server.controller;

import ca.saultcollege.marygrace_viaje_csd226_lab1_server.data.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class AccountController {
    @PostMapping("/signup")
    public ResponseEntity<String> createAccount(@RequestBody Account signUpFormData){
        return ResponseEntity.ok("createAccount() : "+signUpFormData.getEmail());
    }

}
