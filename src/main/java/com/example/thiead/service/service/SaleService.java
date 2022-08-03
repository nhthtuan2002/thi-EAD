package com.example.thiead.service.service;

import com.example.thiead.entity.entity.Sale;
import com.example.thiead.repository.repository.SaleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SaleService {
    final SaleRepository saleRepository;

    public Sale save(Sale sale) {
        return saleRepository.save(sale);
    }
    public Page<Sale> findAll(int page, int limit){
        return saleRepository.findAll(
                PageRequest.of(page-1, limit, Sort.Direction.ASC,"id"));
    }
    public Optional<Sale> findById(Long id) {
        return saleRepository.findById(id);
    }
    public void deleteById(Long id) {
        saleRepository.deleteById(id);
    }

}
