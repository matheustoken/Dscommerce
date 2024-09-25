package com.devsuperior.dscommerce.entities;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_order_item")
public class OrderItem {

    @EmbeddedId
   private OrderItemPk id = new OrderItemPk();

   private Integer quantity;
   private Double price;

   public OrderItem(){
   }

    public OrderItem(Order order,Product product, Double price, Integer quantity) {
        id.setOrder(order);
        id.setProduct(product);
        this.price = price;
        this.quantity = quantity;
    }

    public OrderItemPk getId() {
        return id;
    }

    public void setId(OrderItemPk id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Order getOrder(){
       return id.getOrder();
    }
    public Product getProduct(){
       return id.getProduct();
    }
    public void setOrder(Product product){
       id.setProduct(product);
    }
    public void setProduct(Order order){
       id.setOrder(order);
    }


}
