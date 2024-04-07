package framework;

// Computer class representing a computer, inheriting from Electronics
public class Computer extends Electronics {  
    // Instance variables
    private String memory;  // 存储计算机的内存
    private String cpuModel; // 存储计算机的CPU型号
  
    // Constructor
    public Computer(double weight, double price, double powerConsumption, String manufacturer, String memory, String cpuModel) {  
        super(weight, price, powerConsumption, manufacturer); // 调用父类的构造方法
        this.memory = memory;  // 初始化内存
        this.cpuModel = cpuModel; // 初始化CPU型号
    }  
  
    // Getter method for memory
    public String getMemory() {  
        return memory;  
    }  
  
    // Setter method for memory
    public void setMemory(String memory) {  
        this.memory = memory;  
    }  
  
    // Getter method for cpuModel
    public String getCpuModel() {  
        return cpuModel;  
    }  
  
    // Setter method for cpuModel
    public void setCpuModel(String cpuModel) {  
        this.cpuModel = cpuModel;  
    }  
  
    // Method to override the displayInfo method of the parent class to include computer-specific attributes
    @Override  
    public void displayInfo() {  
        super.displayInfo();  // 调用父类的displayInfo方法显示通用信息
        System.out.println("Memory: " + memory);  // 显示内存
        System.out.println("CPU Model: " + cpuModel);  // 显示CPU型号
    }  
}