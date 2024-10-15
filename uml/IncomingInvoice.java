public class IncomingInvoice implements Invoices {
    private int uniqueId;
    private int total;
    private String contactName;
    private String phoneNumber;
    private boolean isPaid;
    private boolean isPending;

    public IncomingInvoice(int uniqueId, int total, String contactName, String phoneNumber, boolean isPaid, boolean isPending) {
        this.uniqueId = uniqueId;
        this.total = total;
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
        this.isPaid = isPaid;
        this.isPending = isPending;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public int getTotal() {
        return total;
    }

    public void setContactPerson(String contactName, String phoneNumber) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
    }

    public String getContactPerson() {
        return "Contact name: " + contactName + "\n" + "Phone number: " + phoneNumber;
    }

    public void markAsPaid() {
        isPaid = true;
    }

    public void markAsPending() {
        isPending = true;
    }
}
