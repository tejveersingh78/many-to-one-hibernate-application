package com.sunglowsys.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Customers")
public class Customer implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "first_name",nullable = false)
        private String firstName;

        @Column(name = "last_name")
        private String lastName;

        @Column(name = "emali")
        private String email;

        @Column(name = "mobile")
        private String mobile;

        @Column(name = "gender")
        private String gender;

        @OneToMany
        List<Orders> ordersList = new ArrayList<>();


        public Customer() {}

        public Customer(String firstName, String lastName, String email, String mobile, String gender) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.email = email;
                this.mobile = mobile;
                this.gender = gender;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getMobile() {
                return mobile;
        }

        public void setMobile(String mobile) {
                this.mobile = mobile;
        }

        public String getGender() {
                return gender;
        }

        public void setGender(String gender) {
                this.gender = gender;
        }

        public List<Orders> getOrdersList() {
                return ordersList;
        }

        public void setOrdersList(List<Orders> ordersList) {
                this.ordersList = ordersList;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Customer customer = (Customer) o;
                return Objects.equals(id, customer.id) && Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(email, customer.email) && Objects.equals(mobile, customer.mobile) && Objects.equals(gender, customer.gender);
        }

        @Override
        public int hashCode() {
                return Objects.hash(id, firstName, lastName, email, mobile, gender);
        }

        @Override
        public String toString() {
                return "Customer{" +
                        "id=" + id +
                        ", firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", email='" + email + '\'' +
                        ", mobile='" + mobile + '\'' +
                        ", gender='" + gender + '\'' +
                        '}';
        }
}
