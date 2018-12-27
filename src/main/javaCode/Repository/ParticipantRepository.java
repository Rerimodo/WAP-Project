package javacode.repository;

import javacode.databasemodel.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ParticipantRepository extends CrudRepository<Participant, Integer> {

    List<Participant> findAll();
    List<Participant> findByPerson(Person person);
    List<Participant> findByTeam(Team team);
    List<Participant> findByRole(Role role);
    List<Participant> findByPosition(Position position);
    List<Participant> findByNumber(int number);

    List<Participant> findAllByBeginLesserThanEqual(sql.Date begin);
    List<Participant> findAllByBeginGreaterThanEqual(sql.Date begin);
    List<Participant> findAllByEndLesserThanEqual(sql.Date end);
    List<Participant> findAllByEndGreaterThanEqual(sql.Date end);

    @Query("select p from Participant as p where p.begin >= ?1 and p.end <= ?2")
    List<Participant> findBetweenDates(sql.Date begin, sql.Date end);
}