package com.my.techit_spring_board.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.techit_spring_board.domain.Board;
import com.my.techit_spring_board.service.BoardServiceImpl;


@CrossOrigin("*")
@RestController
@RequestMapping(value="/api/board")
public class BoardController {

	
	@Autowired
	BoardServiceImpl boardServiceImpl;
	
	
	//게시글 추가
	@PostMapping("write")
	public ResponseEntity<Board> write(
				@RequestBody Board board
			) {
		
		
		try {
			
			
			Board result = boardServiceImpl.save(board);
			
			return ResponseEntity.status(HttpStatus.CREATED).body(result);
		
		}catch(Exception e) {
			 e.printStackTrace();
		}
		
		
		
		return null;
	}
	
	//전체 게시글 조회
	@GetMapping("all")
	public List<Board> all(){
		
		return  boardServiceImpl.findAll();
	}
	
	

	//게시글 1개 조회(id로 조회)
	@GetMapping("{id}")
	public Optional<Board> findByCode(@PathVariable(value="id") Long id){

        try {
            Optional<Board> boardData = boardServiceImpl.findById(id);
            if(boardData.isPresent()){
                return boardData;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return  null;
    }
	
	
	//게시글 수정
	@PostMapping("edit")
	public ResponseEntity<Board> edit(
				@RequestBody Board board
			) {
		
		System.out.println("====================");
		System.out.println(board.getId());
		System.out.println(board.getTitle());
		
		System.out.println(board.getContent());
		
		
		Board result = boardServiceImpl.update(board.getId(), board);
		
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(result);
		
	}
	
	
	
}
