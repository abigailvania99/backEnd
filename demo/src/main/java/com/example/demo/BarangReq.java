package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
//utk build data
@AllArgsConstructor
@NoArgsConstructor

public class BarangReq {
    private String id;
    private int harga;
    private String nama;
    private int jumlah;
}
