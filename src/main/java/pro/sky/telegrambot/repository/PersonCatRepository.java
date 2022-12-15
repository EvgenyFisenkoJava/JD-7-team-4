package pro.sky.telegrambot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.telegrambot.model.PersonCat;

public interface PersonCatRepository extends JpaRepository<PersonCat, Long> {
    /**
     * ищет пользователя из таблицы person в базе данных aaktdjun
     *
     * @param id - уникальный идентификатор пользователя в приложении telegram
     * @return возвращает пользователя
     */
    PersonCat findByChatId(Long id);


}
