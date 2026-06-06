package co.istad.longfou.e_learning.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "studentProfiles")
public class StudentProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;

    private String biology;
    private String facebookLink;
    private String githubLink;
    private String major;
    private String phoneNumber;
    private String university;

}
