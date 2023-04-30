package org.example.impl;

public class LotteryLot {
    public int id;
    public Toy toy;
    public int quantity;
    public double luck;

    public LotteryLot(int id, Toy toy, int quantity) {
        this.id = id;
        this.toy = toy;
        this.quantity = quantity;
    }

    public LotteryLot() {
        this.setLuck(1.0);
    }

    public int getId() {
        return id;
    }

    public Toy getToy() {
        return toy;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getLuck() {
        return luck;
    }

    public void setLuck(double luck) {
        this.luck = luck;
    }

    public void decreaseQuantity() {
        this.setQuantity(this.getQuantity() - 1);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
