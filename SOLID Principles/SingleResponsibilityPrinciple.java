class Marker{
    String name;
    String color;
    int price;
    public Marker(String name , String color , int price){
        this.name = name;
        this.color = color;
        this.price = price;
    }
}
class Invoice{
    Marker marker;
    int quantity;
    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }
    public int calculateTotal(){
        int total = ((marker.price) * this.quantity);
        return total;
    }
}
class InvoiceDao{
    private Invoice invoice;
    public InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }
    public void saveToDB(){
        // Save to DB
    }
}
class InvoicePrinter{
    private Invoice invoice;
    public InvoicePrinter(Invoice invoice){
        this.invoice = invoice;
    }
    public void print(){
        // Print the Invoice
    }
}
