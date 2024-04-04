package framework.commands;

import framework.Command;
import framework.Computer;

import java.util.Scanner;

/**
 * <p>CreateComputerCommand 类是一个命令类，用于创建 Computer 对象。</p>
 * <p>该类继承自 Command 类，实现了 execute 方法，用于从用户处读取 Computer 信息并创建 Computer 对象。</p>
 */
public class CreateComputerCommand extends Command<Scanner,Computer> {
    public CreateComputerCommand(String command) {
        super(command);
    }

    @Override
    public Computer execute(Scanner scanner) {
        // 从用户处读取 Computer 信息
        System.out.println("请输入 Computer 的重量:");
        double computerWeight = scanner.nextDouble();
        System.out.println("请输入 Computer 的价格:");
        double computerPrice = scanner.nextDouble();
        System.out.println("请输入 Computer 的耗电量:");
        double computerPowerConsumption = scanner.nextDouble();
        System.out.println("请输入 Computer 的制造商:");
        String computerManufacturer = scanner.next();
        System.out.println("请输入 Computer 的内存:");
        String computerMemory = scanner.next();
        System.out.println("请输入 Computer 的 CPU 型号:");
        String computerCpu = scanner.next();

        // 创建 Computer 对象
        return new Computer(computerWeight, computerPrice, computerPowerConsumption,
                computerManufacturer, computerMemory, computerCpu);
    }
}
