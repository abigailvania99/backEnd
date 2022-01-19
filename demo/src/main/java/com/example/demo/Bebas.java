package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Bebas {
    @Autowired
    Repo repo;

//    private final List<Barang> barangList;
//    public Bebas(List<Barang> barangList) {
////        read file masukin ke variable
//        this.barangList = barangList;
//    }

    @PostMapping()
    public void add(@RequestBody Barang barang) {
//        tulis ke file
        this.repo.save(barang);
//        this.barangList.add(barang);
    }

    @GetMapping()
    public List<Barang> get() {
        return this.repo.findAll();
//        return this.barangList;
    }
    @DeleteMapping()
    public void delete() {
        this.repo.deleteAll();
    }

    @PutMapping("/{id}")
    public void put(@RequestBody BarangReq barang, @PathVariable String id){
//        barang.setId(id);

        Optional <Barang> entity = this.repo.findById(id);
        Barang a = entity.get();
        a.setHarga(barang.getHarga());
        a.setJumlah(barang.getJumlah());
        a.setNama(barang.getNama());

        this.repo.save(a);

    }


    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){

        Optional<Barang> b = this.repo.findById(id);
        if(b.isPresent()){
            this.repo.deleteById(id);
        }

    }

}
