package com.my.techit_spring_board.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.techit_spring_board.domain.Board;
import com.my.techit_spring_board.repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService{

	
	
	@Autowired
	BoardRepository boardRepository;
	
	
	@Override
	public Board save(Board board) {
		// TODO Auto-generated method stub
		
		
		try {
			
			Board result = boardRepository.save(
						new Board(
							board.getTitle(),
							board.getContent()
						)
					);
			
			return result;
		}catch(Exception e) {
			return null;
		}
		
		
		
		
	}

	@Override
	public Optional<Board> findById(Long id) {
		// TODO Auto-generated method stub
		Optional<Board> result = boardRepository.findById(id);
		
		if(result.isPresent()) {
			return result;
		}else {
			return null;
		}
		
	}

	@Override
	public List<Board> findAll() {
		// TODO Auto-generated method stub
		
		
		return boardRepository.findAll();
	}

	@Override
	public Board update(Long id, Board board) {
		// TODO Auto-generated method stub
		 Optional<Board> b = boardRepository.findById(id);
		 
		 
		 if(b.isPresent()) {
			 Board _b = b.get();
			 _b.setTitle(board.getTitle());
			 _b.setContent(board.getContent());
			 Board result = boardRepository.save(_b);
			 return result;
		 }
		 
		 
		 
		 return null;
	                
	        
		
		
	}

	
	
}
