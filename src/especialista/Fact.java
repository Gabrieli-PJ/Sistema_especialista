package especialista;

import model.Client;

public class Fact {
    private Client client;

    public Fact(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }
}
