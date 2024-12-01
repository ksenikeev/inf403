package model;

public class Order {

    private int number;

    private Client client;

    private String orderTime;

    private Pizza[] pizzas;

    public Order() {}

    public Order(int number, Client client, String orderTime, Pizza[] pizzas) {
       this.number = number;
       this.client = client;
       this.orderTime = orderTime;
       this.pizzas = pizzas;
    }

    public int getNumber() {
        return number;
    }

    public Client getClient() {
        return client;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public void setPizzas(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }

    public float getCost() {
        float cost = 0;
        for (int i = 0; i < pizzas.length; i++) {
            cost += pizzas[i].getPrice();
        }
        return cost;
    }

    public int getDiscount() {
        return client.getDiscount();
    }

    public float getSumm() {
       return getCost() - getDiscount() * getCost() / 100;
    }
}