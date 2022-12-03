package comomesintoapi.comomesinto.App.domain.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@With
@Entity
@Table(name = "tb_diary")
public class Diary {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private String note;
//    private SleepTime sleepTime;
    @Enumerated(EnumType.STRING)
    private Humor humors;
    private String feed;
//    private List<PersonalActivitie> personalActivities;

}
