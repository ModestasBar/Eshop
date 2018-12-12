package com.eShop.controller.admin;

import com.eShop.model.Movie;
import com.eShop.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


@Controller
@RequestMapping("/admin/movieInventory")
public class AdminMovie {

    private Path path;

    @Autowired
    private MovieService movieService;


    @RequestMapping("/{movieId}")
    public String movieInformation(@PathVariable ("movieId") int movieId, Model model){

        Movie movie = movieService.getMovieById(movieId);

        model.addAttribute("movie", movie);

        return "movieInfo";
    }

    @RequestMapping("/addMovie")
    public String addMovie(Model model){
        Movie movie = new Movie();
        movie.setMovieType("Action");
        movie.setMovieIMDB("<5");
        model.addAttribute("movie", movie);

        return "addMovie";
    }

    @RequestMapping(value = "/addMovie", method = RequestMethod.POST)
    public String addMoviePost(@Valid @ModelAttribute("movie") Movie movie, BindingResult result, HttpServletRequest request){

        if(result.hasErrors()){
            return "addMovie";
        }

        movieService.addMovie(movie);

        MultipartFile file = movie.getMovieImage();
        String rootDirectory = request.getSession().getServletContext().getRealPath("/");
        path = Paths.get(rootDirectory + "\\WEB-INF\\resources\\image\\" + movie.getMovieId() + ".png");

        if(file != null && !file.isEmpty()){
            try {
                file.transferTo(new File(path.toString()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return "redirect:/admin/movieInventory";
    }

    @RequestMapping("/editMovie/{movieId}")
    public String editMovie(@PathVariable ("movieId") int movieId, Model model){

        Movie movie = movieService.getMovieById(movieId);



        model.addAttribute("movie", movie);

        return "editMovie";
    }

    @RequestMapping(value = "/editMovie", method = RequestMethod.POST)
    public String editMoviePost(@Valid @ModelAttribute ("movie") Movie movie, BindingResult result, Model model, HttpServletRequest request){

        if(result.hasErrors()){
            return "editMovie";
        }

        MultipartFile file = movie.getMovieImage();

        String rootPath = request.getSession().getServletContext().getRealPath("/");
        path = Paths.get(rootPath + "\\WEB-INF\\resources\\image\\" + movie.getMovieId()+ ".png");

        if(!file.isEmpty() && file != null){
            try {
                file.transferTo(new File(path.toString()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        model.addAttribute("movie", movie);

        return "redirect:/admin/movieInventory";

    }

    @RequestMapping("/deleteMovie/{movieId}")
    public String deleteMovie(@PathVariable ("movieId") int movieId, HttpServletRequest request){

        String rootPath = request.getSession().getServletContext().getRealPath("/");
        path = Paths.get(rootPath + "\\WEB-INF\\resources\\image\\" + movieId + ".png");

        if(Files.exists(path)){
            try {
                Files.delete(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        movieService.deleteMovie(movieId);

        return "redirect:/admin/movieInventory";
    }
}
