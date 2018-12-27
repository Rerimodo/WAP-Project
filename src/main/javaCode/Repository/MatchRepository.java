package javacode.repository;

import javacode.databasemodel.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface MatchRepository extends CrudRepository<Match, Integer> {

    List<Match> findAll();
    Optional<Match> findById(int id);
    List<Match> findAllByMatchtype(MatchType matchType);
    List<Match> findAllByArena(Arena arena);
    List<Match> findAllByWinner(Team winner);
    List<Match> findAllByLoser(Team loser);
    List<Match> findAllByDate(sql.Date date);

}