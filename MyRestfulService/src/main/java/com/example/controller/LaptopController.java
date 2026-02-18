package com.example.controller;
import com.example.model.Laptop;
import com.example.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/laptop")
public class LaptopController {
    @Autowired
    LaptopRepository lr;

    @PostMapping("/add")
    public void add(@RequestBody Laptop lp) {
        lr.save(lp);
    }
}
/*@RestController
@RequestMapping("/api/laptops")
public class LaptopController {

    private List<Laptop> laptopList = new ArrayList<>();
    private Long idCounter = 1L;

    @PostMapping
    public Laptop addLaptop(@RequestBody Laptop laptop) {
        laptop.setId(idCounter++);
        laptopList.add(laptop);
        return laptop;
    }

    @GetMapping
    public List<Laptop> getAllLaptops() {
        return laptopList;
    }

    @GetMapping("/{id}")
    public Laptop getLaptopById(@PathVariable Long id) {
        return laptopList.stream()
                .filter(l -> l.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Laptop not found"));
    }

    @PutMapping("/{id}")
    public Laptop updateLaptop(@PathVariable Long id, @RequestBody Laptop updatedLaptop) {
        Laptop existingLaptop = laptopList.stream()
                .filter(l -> l.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Laptop not found"));

        existingLaptop.setBrand(updatedLaptop.getBrand());
        existingLaptop.setModel(updatedLaptop.getModel());
        existingLaptop.setPrice(updatedLaptop.getPrice());
        existingLaptop.setRam(updatedLaptop.getRam());
        existingLaptop.setProcessor(updatedLaptop.getProcessor());

        return existingLaptop;
    }

    @DeleteMapping("/{id}")
    public String deleteLaptop(@PathVariable Long id) {
        laptopList.removeIf(l -> l.getId().equals(id));
        return "Laptop deleted successfully";
    }
} */

