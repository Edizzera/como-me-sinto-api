package comomesintoapi.comomesinto.App.domain.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@With
public class User {

    private String name;
    private String password;
    private Diary diary;

}
