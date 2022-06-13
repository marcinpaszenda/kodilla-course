package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    private static final String invoiceNumber = "001/06/22";


    @Test
    void testInvoiceDaoSave() {

        //Given
        Product product1 = new Product("Product1");
        Item item1 = new Item(new BigDecimal(230), 2);
        Item item2 = new Item(new BigDecimal(55), 3);

        Invoice invoice = new Invoice(invoiceNumber);

        product1.getItems().add(item1);
        product1.getItems().add(item2);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        item1.setProduct(product1);
        item2.setProduct(product1);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        assertNotEquals(0, invoiceId);

        //CleanUp
        invoiceDao.deleteAll();
    }
}
