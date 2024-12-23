package com.reviewSpot.models.controllers;

import com.reviewSpot.models.viewmodel.form.comment.CommentFormModel;
import jakarta.validation.Valid;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/comment")
public interface CommentController extends BaseController{

    @PostMapping
    String createComment(@Valid @ModelAttribute("commentForm")CommentFormModel commentFormModel,
                         BindingResult bindingResult, RedirectAttributes redirectAttributes, @AuthenticationPrincipal UserDetails userDetails);

    @PostMapping("/delete")
    String deleteComment(@RequestParam("commentId") int commentId, @RequestParam("currentUrl") String currentUrl,
                         RedirectAttributes redirectAttributes, @AuthenticationPrincipal UserDetails userDetails);
}
