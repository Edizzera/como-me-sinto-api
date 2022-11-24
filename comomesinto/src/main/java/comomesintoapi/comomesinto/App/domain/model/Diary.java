package comomesintoapi.comomesinto.App.domain.model;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@With
public class Diary {

    private LocalDate date;
    private String note;
    private SleepTime sleepTime;
    private List<Humor> humors;
    private String feed;
    private List<PersonalActivitie> personalActivities;

}
