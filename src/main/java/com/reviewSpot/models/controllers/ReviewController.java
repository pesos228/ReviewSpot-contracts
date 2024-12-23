package com.reviewSpot.models.controllers;

import com.reviewSpot.models.viewmodel.form.review.ReviewFormModel;
import com.reviewSpot.models.viewmodel.form.review.ReviewPageFormModel;
import jakarta.validation.Valid;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/review")
public interface ReviewController extends BaseController {

    @GetMapping("/{id}")
    String reviewPreview(@PathVariable int id, Model model, @AuthenticationPrincipal UserDetails userDetails);

    @PostMapping
    String createReview(@Valid @ModelAttribute("review")ReviewFormModel reviewFormModel, BindingResult bindingResult, RedirectAttributes redirectAttributes, @AuthenticationPrincipal UserDetails userDetails);

    @PostMapping("/delete")
    String deleteReview(@RequestParam("reviewId") int reviewId, @RequestParam("currentUrl") String currentUrl, RedirectAttributes redirectAttributes, @AuthenticationPrincipal UserDetails userDetails);
}
