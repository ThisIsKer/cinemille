package cinemille.moviemanager.entities;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "film")
@Getter
@Setter
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "titolo")
    private String titolo;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_uscita")
    private Date dataUscita;
}