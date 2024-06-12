package com.felipe.di.Factura.controllers;

import com.felipe.di.Factura.models.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {
    @Autowired
    private Invoice invoice;

    @GetMapping("/show")
    public Invoice show(){
        return invoice;
    }
}