package com.example.controller;
import com.example.exception.ResourceNotFoundException;
import com.example.model.Laptop;
import com.example.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/laptop")
public class LaptopController {
    @Autowired
    LaptopRepository lr;
    @PostMapping("/add")
    public void add(@RequestBody Laptop lp) {
        lr.save(lp);
    }

    @GetMapping("/list")
    public List<Laptop> list() {
        return lr.findAll();
    }

    /*@GetMapping("/findOne/{index}")
    public Optional<Laptop> findOne(@PathVariable int index) {
        return lr.findById(index);
    }*/

    @PutMapping("/update/{index}")
    public ResponseEntity<Laptop> update(@PathVariable int index, @RequestBody Laptop newLaptop) {
        Laptop oldLaptop = lr.findById(index)
                .orElseThrow(() -> new ResourceNotFoundException("Laptop not found with id: " + index));

        oldLaptop.setModel(newLaptop.getModel());
        oldLaptop.setBrand(newLaptop.getBrand());
        oldLaptop.setPrice(newLaptop.getPrice());
        oldLaptop.setRam(newLaptop.getRam());

        Laptop updatedLaptop = lr.save(oldupdatedLaptopLaptop);
        return ResponseEntity.ok();
    }
    @GetMapping("/findOne/{index}")
    public ResponseEntity<Laptop> findOne(@PathVariable int index) {
        Laptop lt = lr.findById(index)
                .orElseThrow(() -> new ResourceNotFoundException("Laptop not found with id: " + index));
        return ResponseEntity.ok(lt);
    }
    @GetMapping("/findByBrand/{brand}")
    public List<Laptop> findByBrandName(@PathVariable String brand) {
        return lr.findByBrand(brand);
    }

    @DeleteMapping("/delete/{index}")
    public void delete(@PathVariable int index) {
        lr.deleteById(index);
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



