package com.reviewSpot.models.controllers;

import com.reviewSpot.models.viewmodel.form.media.MediaSearchFormModel;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/search")
public interface SearchController extends BaseController {

    @GetMapping
    String search(@ModelAttribute("filter") MediaSearchFormModel filter, Model model, @AuthenticationPrincipal UserDetails userDetails);
}
