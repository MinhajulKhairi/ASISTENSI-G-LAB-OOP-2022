class Product<T> {
    private String name;
    private T harga;
    private String expiryDate;

    public Product(String name, T harga, String expiryDate) {
        this.name = name;
        this.harga = harga;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public T getHarga() {
        return harga;
    }

    public String getExpiryDate() {
        return expiryDate;
    }
}