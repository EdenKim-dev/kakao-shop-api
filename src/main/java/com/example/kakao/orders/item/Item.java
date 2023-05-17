package com.example.kakao.orders.item;

import com.example.kakao.options.Option;
import com.example.kakao.orders.Order;
import com.example.kakao.products.Product;
import lombok.*;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="item_tb")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private Option option;
    @ManyToOne
    private Order order;

    private int quantity;
    private int price;


    @Builder
    public Item(int id, Option option, Order order, int quantity, int price) {
        this.id = id;
        this.option = option;
        this.order = order;
        this.quantity = quantity;
        this.price = price;
    }
}
