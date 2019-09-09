package com.example.comn.configuration;


import java.sql.Connection;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StartH2Database implements ApplicationRunner{
    @Autowired
    DataSource dataSource;
    
    final String createTableSql = "CREATE TABLE t_board(\r\n" + 
    		"board_idx INT(11) NOT NULL AUTO_INCREMENT\r\n" + 
    		",title VARCHAR(300) NOT NULL\r\n" + 
    		",contents VARCHAR(5000) NOT NULL \r\n" + 
    		",hit_cnt INT(10) NOT NULL DEFAULT '0' \r\n" + 
    		",created_datetime DATETIME NOT NULL \r\n" + 
    		",creator_id VARCHAR(50) NOT NULL\r\n" + 
    		",updated_datetime DATETIME DEFAULT NULL\r\n" + 
    		" ,updater_id VARCHAR(50) DEFAULT NULL \r\n" + 
    		",deleted_yn CHAR(1) NOT NULL DEFAULT 'N' \r\n" + 
    		",PRIMARY KEY(board_idx)"
    		+ ")";
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
    
	   try(Connection connection = dataSource.getConnection()){
		   Statement statement =  connection.createStatement();
		   statement.executeUpdate(createTableSql);
	   }

    }
    
}
