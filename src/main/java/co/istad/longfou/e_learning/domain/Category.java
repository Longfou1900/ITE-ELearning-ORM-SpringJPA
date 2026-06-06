package co.istad.longfou.e_learning.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String icon;

    @Column(nullable = false)
    private boolean is_Deleted;

    @Column(nullable = false, unique = true, length = 50)
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Course> courses;
}
