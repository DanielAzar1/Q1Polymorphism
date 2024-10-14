public class Clothing extends Product
{

    public Clothing(String name, int price) {
        super(name, price, "A piece of clothing");
    }

    public void Wear()
    {
        System.out.println("Wearing clothing");
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
