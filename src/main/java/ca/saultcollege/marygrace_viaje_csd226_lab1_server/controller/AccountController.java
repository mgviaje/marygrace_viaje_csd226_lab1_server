package ca.saultcollege.marygrace_viaje_csd226_lab1_server.controller;



import ca.saultcollege.marygrace_viaje_csd226_lab1_server.data.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AccountController {
//    @PostMapping("/signup")
//    public ResponseEntity<String> createAccount(@RequestBody Account signUpFormData){
//        return ResponseEntity.ok("createAccount() : "+signUpFormData.getEmail());
//    }

    @GetMapping("/signup")
    public ResponseEntity<String> getSignup(){ // map a URL to a method
        String s="<form hx-post=\"/signup\" hx-target=\"this\" hx-swap=\"outerHTML\">\n" +
                "    <div>\n" +
                "        <label>First Name</label>\n" +
                "        <input type=\"text\" name=\"firstname\" value=\"Joe\">\n" +
                "    </div>\n" +
                "    <div class=\"form-group\">\n" +
                "        <label>Last Name</label>\n" +
                "        <input type=\"text\" name=\"lastname\" value=\"Blow\">\n" +
                "    </div>\n" +
                "    <div class=\"form-group\">\n" +
                "        <label>Email Address</label>\n" +
                "        <input type=\"email\" name=\"email\" value=\"joe@blow.com\">\n" +
                "    </div>\n" +
                "    <div class=\"form-group\">\n" +
                "        <label>Password</label>\n" +
                "        <input type=\"password\" name=\"password\" value=\"xxxxx\">\n" +
                "    </div>\n" +
                "    <div class=\"form-group\">\n" +
                "        <label>Confirm Password</label>\n" +
                "        <input type=\"password\" name=\"confirmPassword\" value=\"xxxxx\">\n" +
                "    </div>\n" +
                "    <button class=\"btn\">Submit</button>\n" +
                "    <button class=\"btn\" hx-get=\"/signin\">Cancel</button>\n" +
                "</form>";
        return ResponseEntity.ok(s);
    }

    @GetMapping("/signin")
    public ResponseEntity<String> getSignin(){ // map a URL to a method
        String s="<form hx-post=\"/signin\" hx-target=\"this\" hx-swap=\"outerHTML\">\n" +
                "    <div class=\"form-group\">\n" +
                "        <label>Email Address</label>\n" +
                "        <input type=\"email\" name=\"email\" value=\"joe@blow.com\">\n" +
                "    </div>\n" +
                "    <div class=\"form-group\">\n" +
                "        <label>Password</label>\n" +
                "        <input type=\"password\" name=\"password\" value=\"xxxxx\">\n" +
                "    </div>\n" +
                "    <button class=\"btn\">Submit</button>\n" +
                "    <button class=\"btn\" hx-get=\"/signin\">Cancel</button>\n" +
                "</form>";
        return ResponseEntity.ok(s);
    }

    // just here for reference: call it with http://localhost:8080/signup2?email=f.c@g.c
    @GetMapping("/signup2")
    @ResponseBody
    public String createAccount2(@RequestParam String email) {
        return "email: " + email;
    }
}
