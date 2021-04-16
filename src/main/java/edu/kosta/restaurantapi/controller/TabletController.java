package edu.kosta.restaurantapi.controller;

import edu.kosta.restaurantapi.domain.Tablet;
import edu.kosta.restaurantapi.service.TabletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tablets")
public class TabletController {

    @Autowired
    TabletService tabletService;

    @GetMapping
    public List<Tablet> getTabletList() {
        return tabletService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Tablet> getTablet(@PathVariable long id) {
        return tabletService.findById(id);
    }

    @PostMapping
    public Tablet saveTablet(@RequestBody Tablet tablet) {
        return tabletService.saveTablet(tablet);
    }

    @DeleteMapping("/{id}")
    public void deleteTablet(@PathVariable long id) {
        tabletService.deleteTablet(id);
    }
}
