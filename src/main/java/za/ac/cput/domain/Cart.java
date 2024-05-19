package za.ac.cput.domain;

import java.util.Objects;

public class Cart {
    private int cartId;
    private int userId;
    private int bookId;
    private int quantity;
    private double price;
    private double totalPrice;
    private Cart(){

    }
    private Cart(Builder builder) {
        this.cartId = builder.cartId;
        this.userId = builder.userId;
        this.bookId = builder.bookId;
        this.quantity = builder.quantity;
        this.price = builder.price;
        this.totalPrice = builder.totalPrice;


    }



    public String getCartId() {
        return cartId;
    }

    public int getUserId() {
        return userId;
    }

    public int getBookId() {
        return bookId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cart cart)) return false;
        return getCartId() == cart.getCartId() && getUserId() == cart.getUserId() && getBookId() == cart.getBookId() && getQuantity() == cart.getQuantity() && Double.compare(getPrice(), cart.getPrice()) == 0 && Double.compare(totalPrice, cart.totalPrice) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCartId(), getUserId(), getBookId(), getQuantity(), getPrice(), totalPrice);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartId=" + cartId +
                ", userId=" + userId +
                ", bookId=" + bookId +
                ", quantity=" + quantity +
                ", price=" + price +
                ", totalPrice=" + totalPrice +
                '}';
    }

    public Cart orElse(Object o) {
        return null;
    }

    public static class Builder{
        private int cartId;
        private int userId;
        private int bookId;
        private int quantity;
        private double price;
        private double totalPrice;

        public Builder setCartId(int cartId) {
            this.cartId = cartId;
            return this;
        }

        public Builder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public Builder setBookId(int bookId) {
            this.bookId = bookId;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setTotalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Builder copy(Cart c){
            this.cartId = c.cartId;
            this.userId = c.userId;
            this.bookId = c.bookId;
            this.quantity = c.quantity;
            this.price = c.price;
            this.totalPrice = c.totalPrice;
            return this;
        }
        public Cart build(){return new Cart(this);
        }
    }
}


