package com.lithan.AbcCar.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="car_rating")
public class StoreRating {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="store_id")
    private Store store;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="rating_id")
    private Rating rating;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")
    private User user;

    @Column(name="review_time")
    private LocalDateTime reviewDateTime;

    public StoreRating() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getReviewDateTime() {
        return reviewDateTime;
    }

    public void setReviewDateTime(LocalDateTime reviewDateTime) {
        this.reviewDateTime = reviewDateTime;
    }
}
