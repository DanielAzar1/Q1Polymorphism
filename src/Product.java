public class Product {
    String name;
    int price;
    String desc;

    public Product(String name, int price, String desc)
    {
        this.name = name;
        this.price = price;
        this.desc = desc;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
    public void setDesc(String desc)
    {
        this.desc = desc;
    }

    public String getName()
    {
        return this.name;
    }
    public int getPrice()
    {
        return this.price;
    }
    public String getDesc()
    {
        return this.desc;
    }

}
