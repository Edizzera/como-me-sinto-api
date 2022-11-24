package comomesintoapi.comomesinto.App.domain.model;

import lombok.*;

import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@With
public class SleepTime {

    private LocalTime start;
    private LocalTime end;
}
