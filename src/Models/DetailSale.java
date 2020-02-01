/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author daniel
 */
public class DetailSale {
    
    int id;
    int idProduct;
    int idSale;
    int qty;
    Float subtotal;

    public DetailSale() {
    }

    public DetailSale(int id, int idProduct, int idSale, int qty, Float subtotal) {
        this.id = id;
        this.idProduct = idProduct;
        this.idSale = idSale;
        this.qty = qty;
        this.subtotal = subtotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getIdSale() {
        return idSale;
    }

    public void setIdSale(int idSale) {
        this.idSale = idSale;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }
    
    
    
}
