package framework;

import framework.commands.CreateComputerCommand;
import framework.commands.CreatePhoneCommand;

import java.util.Scanner;

/**
 * <p>Commander 类是一个命令管理类，用于管理命令对象。</p>
 * <p>该类中包含了创建命令对象的静态属性。</p>
 */
public class Commander {

    // 创建命令对象
    public static final Command<Scanner, Computer> createComputerCommand = new CreateComputerCommand("c");

    public static final Command<Scanner, Phone> createPhoneCommand = new CreatePhoneCommand("p");
}