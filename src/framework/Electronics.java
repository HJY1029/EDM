package framework;

// Electronics class representing electronic devices
public class Electronics {  
    // Instance variables
    private double weight; // 存储重量
    private double price;  // 存储价格
    private double powerConsumption; // 存储耗电量
    private String manufacturer; // 存储制造商
  
    // Constructor
    public Electronics(double weight, double price, double powerConsumption, String manufacturer) {  
        this.weight = weight;  // 初始化重量
        this.price = price;  // 初始化价格
        this.powerConsumption = powerConsumption;  // 初始化耗电量
        this.manufacturer = manufacturer;  // 初始化制造商
    }  
  
    // Getter method for weight
    public double getWeight() {  
        return weight;  
    }  
  
    // Setter method for weight
    public void setWeight(double weight) {  
        this.weight = weight;  
    }  
  
    // Getter method for price
    public double getPrice() {  
        return price;  
    }  
  
    // Setter method for price
    public void setPrice(double price) {  
        this.price = price;  
    }  
  
    // Getter method for powerConsumption
    public double getPowerConsumption() {  
        return powerConsumption;  
    }  
  
    // Setter method for powerConsumption
    public void setPowerConsumption(double powerConsumption) {  
        this.powerConsumption = powerConsumption;  
    }  
  
    // Getter method for manufacturer
    public String getManufacturer() {  
        return manufacturer;  
    }  
  
    // Setter method for manufacturer
    public void setManufacturer(String manufacturer) {  
        this.manufacturer = manufacturer;  
    }  
  
    // Method to display device information
    public void displayInfo() {  
        System.out.println("Weight: " + weight + " kg");  // 显示重量
        System.out.println("Price: $" + price);  // 显示价格
        System.out.println("Power Consumption: " + powerConsumption + " W");  // 显示耗电量
        System.out.println("Manufacturer: " + manufacturer);  // 显示制造商
    }  
}