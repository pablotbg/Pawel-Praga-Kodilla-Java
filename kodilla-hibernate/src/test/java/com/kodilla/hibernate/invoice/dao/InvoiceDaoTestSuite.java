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
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product sugar = new Product("Sugar");
        Product flour = new Product("Flour");
        Product eggs = new Product("Eggs");
        Product butter = new Product("Butter");

        Item itemSugar = new Item(sugar, new BigDecimal(2.50), 1, new BigDecimal(2.50));
        Item itemFlour = new Item(flour, new BigDecimal(2.00), 2, new BigDecimal(4.00));
        Item itemEggs = new Item(eggs, new BigDecimal(0.50), 6, new BigDecimal(3.00));
        Item itemButter = new Item(butter, new BigDecimal(5.50), 1, new BigDecimal(5.50));

        Invoice invoiceOne = new Invoice("Fv0001/2021");

        itemSugar.setProduct(sugar);
        itemFlour.setProduct(flour);
        itemEggs.setProduct(eggs);
        itemButter.setProduct(butter);

        invoiceOne.getItems().add(itemSugar);
        invoiceOne.getItems().add(itemFlour);
        invoiceOne.getItems().add(itemEggs);
        invoiceOne.getItems().add(itemButter);

        itemSugar.setInvoice(invoiceOne);
        itemFlour.setInvoice(invoiceOne);
        itemEggs.setInvoice(invoiceOne);
        itemButter.setInvoice(invoiceOne);

        //When
        invoiceDao.save(invoiceOne);
        int invoiceOneId = invoiceOne.getId();

        //Then
        assertNotEquals(0, invoiceOneId);

        //CleanUp
        invoiceDao.deleteById(invoiceOneId);
    }
}
