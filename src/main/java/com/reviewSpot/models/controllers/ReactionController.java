package com.reviewSpot.models.controllers;

import com.reviewSpot.models.viewmodel.form.reaction.ReactionFormModel;
import jakarta.validation.Valid;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/reaction")
public interface ReactionController extends BaseController {
    @PostMapping
    String createReaction(@Valid @ModelAttribute("reaction") ReactionFormModel reactionFormModel, BindingResult bindingResult, RedirectAttributes redirectAttributes, @AuthenticationPrincipal UserDetails userDetails);

    @PostMapping("/delete")
    String deleteReaction(@Valid @ModelAttribute("reaction") ReactionFormModel reactionFormModel, BindingResult bindingResult, RedirectAttributes redirectAttributes, @AuthenticationPrincipal UserDetails userDetails);
}
