package com.ocean.cleanup.service;

import com.ocean.cleanup.model.Barco;
import com.ocean.cleanup.repository.BarcoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BarcoService {

    @Autowired
    private BarcoRepository barcoRepository;

    public List<Barco> getAllBarcos() {
        return barcoRepository.findAll();
    }

    public Optional<Barco> getBarcoById(Long id) {
        return barcoRepository.findById(id);
    }

    public Barco saveBarco(Barco barco) {
        return barcoRepository.save(barco);
    }

    public void deleteBarco(Long id) {
        barcoRepository.deleteById(id);
    }

    public void atualizarCapacidadeAtual(Long id, double pesoLixo) {
        Optional<Barco> barcoOpt = barcoRepository.findById(id);
        if (barcoOpt.isPresent()) {
            Barco barco = barcoOpt.get();
            barco.setCapacidadeAtual(barco.getCapacidadeAtual() + pesoLixo);
            barcoRepository.save(barco);
        }
    }
}
