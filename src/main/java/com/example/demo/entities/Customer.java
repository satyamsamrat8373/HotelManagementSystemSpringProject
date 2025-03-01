package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;


@Entity
@Table(name="Customer")
public class Customer {

				@Id
				@GeneratedValue(strategy = GenerationType.IDENTITY)
				int Id;
				
				
				@Column
				String Name;
				
				@Column
				String email;
				
				@Column
				int Phone;
				
				@Column
				String Address;
				
				@Column
				int Roomid;
				
				@Column
				int Payment;

				public Customer(int id, String name, String email, int phone, String address, int roomid, int payment) {
					super();
					Id = id;
					Name = name;
					this.email = email;
					Phone = phone;
					Address = address;
					Roomid = roomid;
					Payment = payment;
				}

				public Customer(String name, String email, int phone, String address, int roomid, int payment) {
					super();
					Name = name;
					this.email = email;
					Phone = phone;
					Address = address;
					Roomid = roomid;
					Payment = payment;
				}

				public Customer() {
					super();
				}

				public int getId() {
					return Id;
				}

				public void setId(int id) {
					Id = id;
				}

				public String getName() {
					return Name;
				}

				public void setName(String name) {
					Name = name;
				}

				public String getEmail() {
					return email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public int getPhone() {
					return Phone;
				}

				public void setPhone(int phone) {
					Phone = phone;
				}

				public String getAddress() {
					return Address;
				}

				public void setAddress(String address) {
					Address = address;
				}

				public int getRoomid() {
					return Roomid;
				}

				public void setRoomid(int roomid) {
					Roomid = roomid;
				}

				public int getPayment() {
					return Payment;
				}

				public void setPayment(int payment) {
					Payment = payment;
				}
 
	
}
