package com.reviewSpot.models.controllers.adminPanel;

import com.reviewSpot.models.controllers.BaseController;
import com.reviewSpot.models.viewmodel.form.client.ClientEditForm;
import com.reviewSpot.models.viewmodel.form.client.ClientFormModel;
import com.reviewSpot.models.viewmodel.form.genre.GenreFormModel;
import com.reviewSpot.models.viewmodel.form.media.MediaFormModel;
import jakarta.validation.Valid;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/admin/edit")
public interface AdminControllerEdit extends BaseController {
    @GetMapping("/{id}/client")
    String editClient(@PathVariable int id, Model model, RedirectAttributes redirectAttributes, @AuthenticationPrincipal UserDetails userDetails);

    @GetMapping("/{id}/genre")
    String editGenre(@PathVariable int id, Model model, RedirectAttributes redirectAttributes, @AuthenticationPrincipal UserDetails userDetails);

    @GetMapping("/{id}/media")
    String editMedia(@PathVariable int id, Model model, RedirectAttributes redirectAttributes, @AuthenticationPrincipal UserDetails userDetails);

    @PostMapping("/{id}/client")
    String createClient(@PathVariable int id, @Valid @ModelAttribute("clientForm") ClientEditForm clientEditForm,
                        BindingResult bindingResult, RedirectAttributes redirectAttributes, @AuthenticationPrincipal UserDetails userDetails);

    @PostMapping("/{id}/genre")
    String createGenre(@PathVariable int id, @Valid @ModelAttribute("genreForm") GenreFormModel genreFormModel,
                       BindingResult bindingResult, RedirectAttributes redirectAttributes, @AuthenticationPrincipal UserDetails userDetails);

    @PostMapping("/{id}/media")
    String createMedia(@PathVariable int id, @Valid @ModelAttribute("mediaForm") MediaFormModel mediaFormModel,
                       BindingResult bindingResult, RedirectAttributes redirectAttributes, @AuthenticationPrincipal UserDetails userDetails);
}
