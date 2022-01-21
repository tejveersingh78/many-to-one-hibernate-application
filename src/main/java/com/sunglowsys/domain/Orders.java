package com.sunglowsys.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Orders")
public class Orders implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "order_name",nullable = false)
        private String orderName;

        @Column(name = "brand")
        private String brand;

        @Column(name = "cetagory")
        private String cetagory;

        @Column(name = "price")
        private String price;

        @Column(name = "detail")
        private String detail;

        @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
        @JoinTable(name = "id")
        private Customer customer;

        public Orders() {
                this.orderName = orderName;
                this.brand = brand;
                this.cetagory = cetagory;
                this.price = price;
                this.detail = detail;
                this.customer = customer;
        }


        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getOrderName() {
                return orderName;
        }

        public void setOrderName(String orderName) {
                this.orderName = orderName;
        }

        public String getBrand() {
                return brand;
        }

        public void setBrand(String brand) {
                this.brand = brand;
        }

        public String getCetagory() {
                return cetagory;
        }

        public void setCetagory(String cetagory) {
                this.cetagory = cetagory;
        }

        public String getPrice() {
                return price;
        }

        public void setPrice(String price) {
                this.price = price;
        }

        public String getDetail() {
                return detail;
        }

        public void setDetail(String detail) {
                this.detail = detail;
        }

        public Customer getCustomer() {
                return customer;
        }

        public void setCustomer(Customer customer) {
                this.customer = customer;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Orders orders = (Orders) o;
                return Objects.equals(id, orders.id) && Objects.equals(orderName, orders.orderName) && Objects.equals(brand, orders.brand) && Objects.equals(cetagory, orders.cetagory) && Objects.equals(price, orders.price) && Objects.equals(detail, orders.detail) && Objects.equals(customer, orders.customer);
        }

        @Override
        public int hashCode() {
                return Objects.hash(id, orderName, brand, cetagory, price, detail, customer);
        }

        @Override
        public String toString() {
                return "Orders{" +
                        "id=" + id +
                        ", orderName='" + orderName + '\'' +
                        ", brand='" + brand + '\'' +
                        ", cetagory='" + cetagory + '\'' +
                        ", price='" + price + '\'' +
                        ", detail='" + detail + '\'' +
                        ", customer=" + customer +
                        '}';
        }
}
