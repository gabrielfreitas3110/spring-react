package com.example.gvendas.repositories;

import com.example.gvendas.dto.SaleSuccessDTO;
import com.example.gvendas.dto.SaleSumDTO;
import com.example.gvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.example.gvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) " +
            " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.example.gvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) " +
            " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDTO> sucessGroupedBySeller();
}
