package za.ac.cput.domain;

import java.util.Objects;

public class Transaction {
    private int transactionID;
    private int ISBN;
    private int sellerID;
    private int buyerID;
    private String transactionDate;
    private int quantity;
    private double totalPayment;
    private String transactionStatus;

  private Transaction(){

  }
    private Transaction(Builder builder) {
        this.transactionID = builder.transactionID;
        this.ISBN = builder.ISBN;
        this.sellerID = builder.sellerID;
        this.transactionDate = builder.transactionDate;
        this.quantity = builder.quantity;
        this.totalPayment= builder.totalPayment;
        this.transactionStatus = builder.transactionStatus;


    }

    public String getTransactionID() {
        return transactionID;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getSellerID() {
        return sellerID;
    }

    public int getBuyerID() {
        return buyerID;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction that)) return false;
        return getQuantity() == that.getQuantity() && Double.compare(getTotalPayment(), that.getTotalPayment()) == 0 && Objects.equals(getTransactionID(), that.getTransactionID()) && Objects.equals(getISBN(), that.getISBN()) && Objects.equals(getSellerID(), that.getSellerID()) && Objects.equals(getBuyerID(), that.getBuyerID()) && Objects.equals(getTransactionDate(), that.getTransactionDate()) && Objects.equals(getTransactionStatus(), that.getTransactionStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTransactionID(), getISBN(), getSellerID(), getBuyerID(), getTransactionDate(), getQuantity(), getTotalPayment(), getTransactionStatus());
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionID='" + transactionID + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", sellerID='" + sellerID + '\'' +
                ", buyerID='" + buyerID + '\'' +
                ", transactionDate='" + transactionDate + '\'' +
                ", quantity=" + quantity +
                ", totalPayment=" + totalPayment +
                ", transactionStatus='" + transactionStatus + '\'' +
                '}';
    }
    public static class Builder{
        private int transactionID;
        private int ISBN;
        private int sellerID;
        private int buyerID;
        private String transactionDate;
        private int quantity;
        private double totalPayment;
        private String transactionStatus;

        public Builder setTransactionID(int transactionID) {
            this.transactionID = transactionID;
            return this;
        }

        public Builder setISBN(int ISBN) {
            this.ISBN = ISBN;
            return this;
        }

        public Builder setSellerID(int sellerID) {
            this.sellerID = sellerID;
            return this;
        }

        public Builder setBuyerID(int buyerID) {
            this.buyerID = buyerID;
            return this;
        }

        public Builder setTransactionDate(String transactionDate) {
            this.transactionDate = transactionDate;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setTotalPayment(double totalPayment) {
            this.totalPayment = totalPayment;
            return this;
        }

        public Builder setTransactionStatus(String transactionStatus) {
            this.transactionStatus = transactionStatus;
            return this;
        }
        public Builder copy(Transaction t){

            this.transactionID = t.transactionID;
            this.ISBN = t.ISBN;
            this.sellerID = t.sellerID;
            this.buyerID = t.buyerID;
            this.transactionDate = t.transactionDate;
            this.quantity = t.quantity;
            this.totalPayment = t.totalPayment;
            this.transactionStatus = t.transactionStatus;
            return this;
        }
        public Transaction build(){return new Transaction(this);
        }

    }
}

