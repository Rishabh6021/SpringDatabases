package com.example.demo.repos;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.example.demo.model.Catlog;

public interface CatalogRepository extends CassandraRepository<Catlog, Integer> {

}
