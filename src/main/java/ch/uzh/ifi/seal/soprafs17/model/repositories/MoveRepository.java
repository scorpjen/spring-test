package ch.uzh.ifi.seal.soprafs17.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ch.uzh.ifi.seal.soprafs17.model.Move;

@Repository("moveRepository")
public interface MoveRepository extends CrudRepository<Move, Long> {
}
