package com.reviewSpot.models.controllers.adminPanel;

import com.reviewSpot.models.controllers.BaseController;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/admin/delete")
public interface AdminControllerDelete extends BaseController {
    @PostMapping("/{id}/genre")
    String deleteGenre(@PathVariable int id, Model model, RedirectAttributes redirectAttributes, @AuthenticationPrincipal UserDetails userDetails);

    @PostMapping("/{id}/media")
    String deleteMedia(@PathVariable int id, Model model, RedirectAttributes redirectAttributes, @AuthenticationPrincipal UserDetails userDetails);

    @PostMapping("/{id}/comment")
    String deleteComment(@PathVariable int id, Model model, RedirectAttributes redirectAttributes, @AuthenticationPrincipal UserDetails userDetails);

    @PostMapping("/{id}/review")
    String deleteReview(@PathVariable int id, Model model, RedirectAttributes redirectAttributes, @AuthenticationPrincipal UserDetails userDetails);
}
