package com.reviewSpot.models.controllers;

import com.reviewSpot.models.viewmodel.form.client.ClientFormModel;
import com.reviewSpot.models.viewmodel.form.client.ClientLoginFormModel;
import jakarta.validation.Valid;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/auth")
public interface AuthController extends BaseController {

    @GetMapping("/login")
    String pageLogin(@RequestParam(value = "error", required = false) String error, Model model, @AuthenticationPrincipal UserDetails userDetails);

    @GetMapping("/register")
    String pageRegistration(Model model, @AuthenticationPrincipal UserDetails userDetails);


    @PostMapping("/register")
    String requestRegister(@Valid @ModelAttribute("newClient") ClientFormModel clientFormModel,
                           BindingResult bindingResult, Model model);
}
