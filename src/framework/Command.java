package framework;

public abstract class Command<T,R> {
    private final String command;

    public Command(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    public abstract R execute(T r);
}