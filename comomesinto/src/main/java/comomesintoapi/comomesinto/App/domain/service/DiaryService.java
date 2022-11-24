package comomesintoapi.comomesinto.App.domain.service;

import comomesintoapi.comomesinto.App.domain.model.Diary;
import comomesintoapi.comomesinto.App.domain.repository.DiaryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DiaryService {

    private final DiaryRepository diaryrepository;


    public Diary create (Diary diary) {

       return diaryrepository.create(diary);
    }
}
