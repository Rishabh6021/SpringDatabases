package com.example.demo.model;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(value="catlog")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Catlog {
	
	@PrimaryKey
	private int id;
	@Column(value="catlog_name")
	private String catlogName;
	private String validity;
	private double amount;
	
	

}
