/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodcity.model;

/**
 *
 * @author ASUS
 */
public class ItemModel {
   private String id;
    private String itemName;
    private double itemPrice;
    private double qty;

    public ItemModel() {
    }

    public ItemModel(String id,String itemName, double itemPrice, int qty) {
       this.id=id;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.qty = qty;
    }

   

     /**
     * @return the id
     */
    public String getID() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setID(String id) {
        this.id = id;
    }
    
    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the itemPrice
     */
    public double getItemPrice() {
        return itemPrice;
    }

    /**
     * @param itemPrice the itemPrice to set
     */
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * @return the qty
     */
    public double getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "ItemModel{" +"id="+id+ "itemName=" + itemName + ", itemPrice=" + itemPrice + ", qty=" + qty + '}';
    }
    
}
