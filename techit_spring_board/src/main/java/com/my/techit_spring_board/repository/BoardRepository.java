package com.my.techit_spring_board.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.my.techit_spring_board.domain.Board;




@Repository
public interface BoardRepository extends JpaRepository<Board, Long>{
	
	
	Optional<Board> findById(Long id);
	
}
