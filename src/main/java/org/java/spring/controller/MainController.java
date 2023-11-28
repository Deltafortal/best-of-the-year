package org.java.spring.controller;


import java.util.ArrayList;
import java.util.List;

import org.java.spring.pojo.Movie;
import org.java.spring.pojo.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@Controller
public class MainController {

	
	///****** Routes ******///
	
	@GetMapping("/")
	public String bestOfYear(Model model) {
		
		
		String name = "Aldo";
		
		model.addAttribute("name", name);
		
		return "Index";
	}
	
	
	@GetMapping("/movies")
	public String getBestMovies(Model model) {
		
		
		model.addAttribute("movies", getBestMovies());
		
		return "Movies";
		
	}
	
	
	
	@GetMapping("/songs")
	public String getBestSongs(Model model) {
		
		
		model.addAttribute("songs", getBestSongs());
		
		return "Songs";
		
	}
	
	
	
	@GetMapping("/movies/{id}")
	public String getMoviesWithId(Model model, @PathVariable int id) {
	
			 
		 for (Movie movie : getBestMovies()) {
	            
			 if(movie.getId() == id) {
				 model.addAttribute("movie", movie.getTitle());
				 model.addAttribute("id", id);
			 }
	            
		 }
		
		return "MovieById";
	}
	
	
	
	@GetMapping("/songs/{id}")
	public String getSongsWithId(Model model, @PathVariable int id) {
	
			 
		 for (Song song : getBestSongs()) {
	            
			 if(song.getId() == id) {
				 model.addAttribute("song", song.getTitle());
				 model.addAttribute("id", id);
			 }
	            
		 }
		
		return "SongById";
	}
	
	
	
	
	///****** Functions ******///
	
	//Get movies
	private List<Movie> getBestMovies() {
		
		List<Movie> movies = new ArrayList<>();
		
		movies.add(new Movie(1, "Il Signore degli Anelli"));
		movies.add(new Movie(2, "Interstellar"));
		movies.add(new Movie(3, "The Wolf of Wall Street"));
		
		return movies;
		
	}
	
	
	
	//Get Songs
    private static List<Song> getBestSongs() {
    	
        List<Song> songs = new ArrayList<>();
        
        songs.add(new Song(1, "Bohemian Rhapsody"));
        songs.add(new Song(2, "Shape of You"));
        songs.add(new Song(3, "Billie Jean"));
        
        return songs;
    }
}
