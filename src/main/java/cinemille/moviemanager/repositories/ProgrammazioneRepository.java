package cinemille.moviemanager.repositories;

import cinemille.moviemanager.entities.Film;
import cinemille.moviemanager.entities.Programmazione;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ProgrammazioneRepository extends CrudRepository<Programmazione, Long> {

    @Query("select p.film from Programmazione p where p.dataValidita between :dataStart and :dataEnd")
    public List<Film> findAllByDataValiditaBetween(Date dataStart, Date dataEnd);
}
