/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.entity;

/**
 *
 * @author ASUS
 */
public class OrderDetailEntity {
    
    private String orderId;
    private String itemId;
    private Double discount;
    private Integer qty;

    public OrderDetailEntity() {
    }

    public OrderDetailEntity(String orderId, String itemId, Double discount, Integer qty) {
        this.orderId = orderId;
        this.itemId = itemId;
        this.discount = discount;
        this.qty = qty;
    }

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the itemId
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * @param itemId the itemId to set
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * @return the discount
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    /**
     * @return the qty
     */
    public Integer getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(Integer qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "OrderDetailEntity{" + "orderId=" + orderId + ", itemId=" + itemId + ", discount=" + discount + ", qty=" + qty + '}';
    }
    
    
}
