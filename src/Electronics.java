public class Electronics extends Product
{

    public Electronics(String name, int price) {
        super(name, price, "An electronic device");
    }

    public void Plug()
    {
        System.out.println("Plugging device");
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }
}
