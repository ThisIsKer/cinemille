package cinemille.moviemanager.controllers;


import cinemille.moviemanager.entities.Film;
import cinemille.moviemanager.repositories.ProgrammazioneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "/film")
@Slf4j
public class FilmController {

    @Autowired
    private ProgrammazioneRepository programmazioneRepository;

    @GetMapping("/findInPeriod")
    public List<Film> findInPeriod(
            @RequestParam Date dataStart,
            @RequestParam Date dataEnd
    ) {
        return programmazioneRepository.findAllByDataValiditaBetween(dataStart, dataEnd);
    }
}
