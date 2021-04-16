package edu.kosta.restaurantapi.service;

import edu.kosta.restaurantapi.domain.Tablet;
import edu.kosta.restaurantapi.repository.TabletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TabletService {

    @Autowired
    TabletRepository tabletRepository;

    public List<Tablet> findAll() {
        return tabletRepository.findAll();
    }
    public Optional<Tablet> findById(Long id) {
        return tabletRepository.findById(id);
    }
    public Tablet saveTablet(Tablet tablet) {
        return tabletRepository.save(tablet);
    }
    public void deleteTablet(long id) {
        tabletRepository.deleteById(id);
    }

}
