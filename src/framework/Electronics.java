package framework;
public class Electronics {  
    private double weight; // 重量  
    private double price;  // 价格  
    private double powerConsumption; // 耗电量  
    private String manufacturer; // 制造商  
  
    // 构造方法  
    public Electronics(double weight, double price, double powerConsumption, String manufacturer) {  
        this.weight = weight;  
        this.price = price;  
        this.powerConsumption = powerConsumption;  
        this.manufacturer = manufacturer;  
    }  
  
    // Getter 和 Setter 方法  
    public double getWeight() {  
        return weight;  
    }  
  
    public void setWeight(double weight) {  
        this.weight = weight;  
    }  
  
    public double getPrice() {  
        return price;  
    }  
  
    public void setPrice(double price) {  
        this.price = price;  
    }  
  
    public double getPowerConsumption() {  
        return powerConsumption;  
    }  
  
    public void setPowerConsumption(double powerConsumption) {  
        this.powerConsumption = powerConsumption;  
    }  
  
    public String getManufacturer() {  
        return manufacturer;  
    }  
  
    public void setManufacturer(String manufacturer) {  
        this.manufacturer = manufacturer;  
    }  
  
    // 输出设备信息的方法  
    public void displayInfo() {  
        System.out.println("Weight: " + weight + " kg");  
        System.out.println("Price: $" + price);  
        System.out.println("Power Consumption: " + powerConsumption + " W");  
        System.out.println("Manufacturer: " + manufacturer);  
    }  
}