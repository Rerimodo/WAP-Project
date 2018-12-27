package javacode.repository;

import javacode.databasemodel.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface VotingRepository extends CrudRepository<Voting, Integer> {

    List<Voting> findAll();
    List<Voting> findBySeason(Season season);
    List<Voting> findByVoter(Person voter);
    List<Voting> findByAward(Award award);
    List<Voting> findByPlayer(Person player);
}




