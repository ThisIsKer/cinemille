package cinemille.moviemanager.controllers;


import cinemille.moviemanager.entities.Film;
import cinemille.moviemanager.entities.Programmazione;
import cinemille.moviemanager.repositories.ProgrammazioneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "/programmazione")
@Slf4j
public class ProgrammazioneController {

    @Autowired
    private ProgrammazioneRepository programmazioneRepository;

    @GetMapping("/findPastProgramming")
    public List<Programmazione> findPastProgramming() {
        Date currentDate = new Date();
        return programmazioneRepository.findAllByDataValiditaBefore(currentDate);
    }
}
