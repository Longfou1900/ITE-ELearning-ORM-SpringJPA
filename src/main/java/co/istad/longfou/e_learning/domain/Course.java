package co.istad.longfou.e_learning.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer countRating;

    private LocalDateTime createdAt;

    private String description;
    private Float discountPercent;
    private boolean isDeleted;
    private boolean isPublished;
    private String keyword;
    private Integer level;

    @Column(precision = 38, scale = 2)
    private BigDecimal price;

    private Float starRating;
    private String thumbnail;
    private String title;
    private Float totalHour;

    private LocalDateTime updatedAt;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "course")
    private List<InstructorProfile> intructuorProfiles;

    @OneToMany(mappedBy = "course")
    private List<Enrolment> enrolments;
}
