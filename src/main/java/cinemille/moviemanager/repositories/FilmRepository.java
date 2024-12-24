package cinemille.moviemanager.repositories;

import cinemille.moviemanager.entities.Film;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface FilmRepository extends CrudRepository<Film, Long> {

}
