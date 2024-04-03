package framework;
public class Computer extends Electronics {  
    private String memory;  // 内存  
    private String cpuModel; // CPU 型号  
  
    // 构造方法  
    public Computer(double weight, double price, double powerConsumption, String manufacturer, String memory, String cpuModel) {  
        super(weight, price, powerConsumption, manufacturer);  
        this.memory = memory;  
        this.cpuModel = cpuModel;  
    }  
  
    // Getter 和 Setter 方法  
    public String getMemory() {  
        return memory;  
    }  
  
    public void setMemory(String memory) {  
        this.memory = memory;  
    }  
  
    public String getCpuModel() {  
        return cpuModel;  
    }  
  
    public void setCpuModel(String cpuModel) {  
        this.cpuModel = cpuModel;  
    }  
  
    // 覆盖父类的输出设备信息的方法，增加计算机特有的属性  
    @Override  
    public void displayInfo() {  
        super.displayInfo();  
        System.out.println("Memory: " + memory);  
        System.out.println("CPU Model: " + cpuModel);  
    }  
}