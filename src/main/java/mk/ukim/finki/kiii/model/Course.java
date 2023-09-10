package mk.ukim.finki.kiii.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "semester")
    private String semester;

    @Column(name = "credits")
    private Long credits;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "hours")
    private Long hours;


}
