package com.reviewSpot.models.controllers.adminPanel;

import com.reviewSpot.models.controllers.BaseController;
import com.reviewSpot.models.viewmodel.form.client.ClientPageFormModel;
import com.reviewSpot.models.viewmodel.form.comment.CommentPageFormModel;
import com.reviewSpot.models.viewmodel.form.genre.GenrePageFormModel;
import com.reviewSpot.models.viewmodel.form.media.MediaPageFormModel;
import com.reviewSpot.models.viewmodel.form.review.ReviewPageFormModel;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public interface AdminController extends BaseController {

    @GetMapping
    String adminPanel(Model model, @AuthenticationPrincipal UserDetails userDetails);

    @GetMapping("/client")
    String adminPanelClient(@ModelAttribute("clientForm") ClientPageFormModel clientForm, Model model, @AuthenticationPrincipal UserDetails userDetails);

    @GetMapping("/genre")
    String adminPanelGenre(@ModelAttribute("genreForm") GenrePageFormModel genreForm, Model model, @AuthenticationPrincipal UserDetails userDetails);

    @GetMapping("/media")
    String adminPanelMedia(@ModelAttribute("mediaForm") MediaPageFormModel mediaForm, Model model, @AuthenticationPrincipal UserDetails userDetails);

    @GetMapping("/comment")
    String adminPanelComment(@ModelAttribute("commentForm") CommentPageFormModel commentForm, Model model, @AuthenticationPrincipal UserDetails userDetails);

    @GetMapping("/review")
    String adminPanelReview(@ModelAttribute("reviewForm") ReviewPageFormModel reviewPageFormModel, Model model, @AuthenticationPrincipal UserDetails userDetails);
}
