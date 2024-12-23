package com.reviewSpot.models.controllers;

import com.reviewSpot.models.viewmodel.form.comment.CommentPageFormModel;
import com.reviewSpot.models.viewmodel.form.review.ReviewPageFormModel;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/client")
public interface ClientController extends BaseController{

    @GetMapping("/{id}")
    public String clientProfile(@ModelAttribute("commentForm") CommentPageFormModel commentForm,
                                @ModelAttribute("reviewForm") ReviewPageFormModel reviewForm,
                                @PathVariable int id,
                                Model model, @AuthenticationPrincipal UserDetails userDetails);
}
