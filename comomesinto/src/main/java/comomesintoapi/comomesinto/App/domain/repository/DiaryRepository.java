package comomesintoapi.comomesinto.App.domain.repository;

import comomesintoapi.comomesinto.App.domain.model.Diary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaryRepository extends JpaRepository<Diary,Long> {

//    Diary create(Diary diary);
}
