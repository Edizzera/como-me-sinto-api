package comomesintoapi.comomesinto.App.api.controller;

import comomesintoapi.comomesinto.App.domain.model.Diary;
import comomesintoapi.comomesinto.App.domain.service.DiaryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/diary")
@AllArgsConstructor
public class DiaryController {

    private final DiaryService diaryService;

//    @GetMapping("/diary")
//    public String resp() {
//        return new String("teste");
//    }

    @PostMapping
    public ResponseEntity<Diary> create (Diary diary){
        return new ResponseEntity<>(diaryService.create(diary), HttpStatus.CREATED);
    }
}
