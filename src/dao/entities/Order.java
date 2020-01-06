package dao.entities;


import java.util.Date;


public class Order {
    private long idOrder;
    private long idUser;
    private String inputLang;
    private String outputLang;
    private String orderDate;
    private String deadline;


    public Order() {

    }

    public Order(long idOrder, long idUser, String inputLang, String outputLang, String orderDate, String deadline) {
        this.idOrder = idOrder;
        this.idUser = idUser;
        this.inputLang = inputLang;
        this.outputLang = outputLang;
        this.orderDate = orderDate;
        this.deadline = deadline;
    }

    public Order (long idUser, String inputLang, String outputLang){
        this.idUser = idUser;
        this.inputLang = inputLang;
        this.outputLang = outputLang;
    }

    //конструктор для вывода без заказчика)
    public Order (String orderDate, String deadline, String inputLang, String outputLang){
        this.orderDate = orderDate;
        this.deadline = deadline;
        this.inputLang = inputLang;
        this.outputLang = outputLang;
    }

    public long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(long idOrder) {
        this.idOrder = idOrder;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getInputLang() {
        return inputLang;
    }

    public void setInputLang(String inputLang) {
        this.inputLang = inputLang;
    }

    public String getOutputLang() {
        return outputLang;
    }

    public void setOutputLang(String outputLang) {
        this.outputLang = outputLang;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}