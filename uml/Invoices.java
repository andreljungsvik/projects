public interface Invoices {
    int getUniqueId();
    int getTotal();
    String getContactPerson();

    void markAsPaid();
    void markAsPending();
}
