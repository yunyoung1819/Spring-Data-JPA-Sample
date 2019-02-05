package org.zerock.persistence;

import org.springframework.data.repository.CrudRepository;
import org.zerock.domain.Board;

/**
 * Spring-JPA 데이터베이스 연동 
 *
 */
public interface BoardRepository extends CrudRepository<Board, Long> {

}
