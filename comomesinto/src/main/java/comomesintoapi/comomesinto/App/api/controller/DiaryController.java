package comomesintoapi.comomesinto.App.api.controller;

import comomesintoapi.comomesinto.App.domain.model.Diary;
import comomesintoapi.comomesinto.App.domain.service.DiaryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/diary")
@AllArgsConstructor
public class DiaryController {

    private final DiaryService diaryService;

    @GetMapping
    public ResponseEntity<List<Diary>> findAll() {
        return ResponseEntity.ok(diaryService.findAll());
    }

    @PostMapping
    public ResponseEntity<Diary> create (@RequestBody Diary diary){
        return new ResponseEntity<>(diaryService.create(diary), HttpStatus.CREATED);
    }
}
