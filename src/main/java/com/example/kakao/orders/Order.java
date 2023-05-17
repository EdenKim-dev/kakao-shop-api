package com.example.kakao.orders;

import com.example.kakao.users.User;
import lombok.*;

import javax.persistence.*;

@Setter // 삭제 예정
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="order_tb")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private User user;

    @Builder
    public Order(int id, User user) {
        this.id = id;
        this.user = user;
    }
}
