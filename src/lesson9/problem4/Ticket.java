package lesson9.problem4;

public class Ticket {
    int id;
    String description;

    public Ticket(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
