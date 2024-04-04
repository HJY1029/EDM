package framework.commands;

import framework.Command;
import framework.Phone;

import java.util.Scanner;

/**
 * <p>CreatePhoneCommand 类是一个命令类，用于创建 Phone 对象。</p>
 * <p>该类继承自 Command 类，实现了 execute 方法，用于从用户处读取 Phone 信息并创建 Phone 对象。</p>
 */
public class CreatePhoneCommand extends Command<Scanner, Phone> {
    public CreatePhoneCommand(String command) {
        super(command);
    }

    @Override
    public Phone execute(Scanner scanner) {
        // 从用户处读取 Phone 信息
        System.out.println("请输入 Phone 的重量:");
        double phoneWeight = scanner.nextDouble();
        System.out.println("请输入 Phone 的价格:");
        double phonePrice = scanner.nextDouble();
        System.out.println("请输入 Phone 的耗电量:");
        double phonePowerConsumption = scanner.nextDouble();
        System.out.println("请输入 Phone 的制造商:");
        String phoneManufacturer = scanner.next();
        System.out.println("请输入 Phone 的系统:");
        String phoneSystem = scanner.next();
        System.out.println("请输入 Phone 的存储空间:");
        int phoneStorage = scanner.nextInt();

        // 创建 Phone 对象
        return new Phone(phoneWeight, phonePrice, phonePowerConsumption, phoneManufacturer, phoneSystem,
                phoneStorage);
    }
}
