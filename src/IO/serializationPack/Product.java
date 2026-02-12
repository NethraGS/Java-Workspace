package IO.serializationPack;



import java.io.Serializable;

public class Product implements Serializable {

    private int id;

    private String name;

    private int price;

    public Product() {

    }

    public Product(int id, String name, int price) {

        this.id = id;

        this.name = name;

        this.price = price;

    }

    public int getId() {

        return id;

    }

    public void setId(int id) {

        this.id = id;

    }

}

