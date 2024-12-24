package cinemille.moviemanager.repositories;

import cinemille.moviemanager.entities.Sala;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SalaRepository extends CrudRepository<Sala, Long> {

    public Optional<Sala> findById(Long id);

    public Iterable<Sala> findAll();

    public Optional<List<Sala>> findAllByImaxIsTrue();
}
