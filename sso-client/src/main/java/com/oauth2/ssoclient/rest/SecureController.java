package com.oauth2.ssoclient.rest;


import com.sun.security.auth.UserPrincipal;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/secure")
public class SecureController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> getHello(Principal principal) {
        return ResponseEntity.ok("Hello secure " + principal.toString());
    }

//    @RequestMapping(value = "/helloTwo", method = RequestMethod.GET)
//    @ResponseBody
//    public ResponseEntity<String> getHelloTwo(HttpServletRequest req) {
//        return req.getUserPrincipal.getName();
//    }

}