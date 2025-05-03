interface InvoiceDAO{
    public void save(Invoice invoice);
}
class DatabaseInvoiceDAO implements InvoiceDAO{

    @Override
    public void save(Invoice invoice) {
        // Save to DB
    }
}
class FileInvoiceDAO implements InvoiceDAO{

    @Override
    public void save(Invoice invoice) {
        // Save to File
    }
}
