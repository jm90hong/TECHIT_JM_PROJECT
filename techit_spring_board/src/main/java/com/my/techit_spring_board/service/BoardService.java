package com.my.techit_spring_board.service;

import java.util.List;
import java.util.Optional;

import com.my.techit_spring_board.domain.Board;

public interface BoardService {
	Board save(Board board);
	Optional<Board> findById(Long id);
	List<Board> findAll();
	
	Board update(Long id,Board board);
	
}
