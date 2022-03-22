package com.israel.upload_csv_spring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtrativoRepository extends JpaRepository<Atrativo, Integer>{
}
