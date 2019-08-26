package com.example.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}

	/*
	 CREATE TABLE t_board(
    board_idx INT(11) NOT NULL AUTO_INCREMENT
    ,title VARCHAR(300) NOT NULL
    ,contents VARCHAR(5000) NOT NULL 
    ,hit_cnt INT(10) NOT NULL DEFAULT '0' 
    ,created_datetime DATETIME NOT NULL 
    ,creator_id VARCHAR(50) NOT NULL
    ,updated_datetime DATETIME DEFAULT NULL
    ,updater_id VARCHAR(50) DEFAULT NULL 
    ,deleted_yn CHAR(1) NOT NULL DEFAULT 'N' 
    ,PRIMARY KEY(board_idx)
);
	 */
}
