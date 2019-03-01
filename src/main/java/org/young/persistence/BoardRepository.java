package org.young.persistence;

import org.springframework.data.repository.CrudRepository;
import org.young.domain.Board;

/**
 * Spring-JPA 데이터베이스 연동 
 *
 */
public interface BoardRepository extends CrudRepository<Board, Long> {


}
