package za.ac.cput.factory;
import za.ac.cput.domain.Cart;
import za.ac.cput.util.Helper;

public class CartFactory {
    public static Cart createCart( int cartId, int userId,  int bookId,  int quantity,  double price,  double totalPrice) {
        if (Helper.isNullOrEmpty(String.valueOf(cartId)) || Helper.isNullOrEmpty(String.valueOf(userId))
                || Helper.isNullOrEmpty(String.valueOf(bookId)) || Helper.isNullOrEmpty(String.valueOf(quantity)) || Helper.isNullOrEmpty(String.valueOf(price))
                || Helper.isNullOrEmpty(String.valueOf(totalPrice)))
            return null;

        return new Cart.Builder().setCartId(cartId)
                .setUserId(userId)
                .setBookId(bookId)
                .setQuantity(quantity)
                .setPrice(price)
                .setTotalPrice(totalPrice)
                .build();
    }
}
