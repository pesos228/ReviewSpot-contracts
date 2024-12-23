package com.reviewSpot.models.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public interface MainController extends BaseController {

    @GetMapping
    public String mainPage(Model model, @AuthenticationPrincipal UserDetails userDetails);

}
