
import java.util.*;

public record Company(String name, String orgNum, Address address) {

    public Company {
        Objects.requireNonNull(name, "Namnet kan inte vara null");
        Objects.requireNonNull(orgNum, "Organisationsnummret kan inte vara null");
        Objects.requireNonNull(address, "Addressen kan inte vara null");
    }

    public Company(String name, String orgNum, String street, String zip, String city, String country) {
        this(name, orgNum, new Address(street, city, zip, country));
    }

    public record Address(String street, String city, String zip, String country) {
        public Address {
            Objects.requireNonNull(street, "street kan inte vara null");
            Objects.requireNonNull(city, "city kan inte vara null");
            Objects.requireNonNull(zip, "zip kan inte vara null");
            Objects.requireNonNull(country, "country kan inte vara null");
        }

        @Override
        public String toString() {
            return String.format("%s%n%s%n%s%n%s%n", street, city, zip,
                    country);
        }
    }

    public static void main(String[] args) {
        Address sigmaAddress = new Address("Sigmagatan 1337", "Göteborg", "42722", "Sverige");
        Company sigma = new Company("Sigma", "69420", sigmaAddress);

        System.out.printf("Företagsnamn: %s%nOrganisationsnummer: %s%nGatuaddress: %s%n", sigma.name(), sigma.orgNum(),
                sigma.address());
    }
}
