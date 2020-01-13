package Controller.Prescriptions.PrescriptionsCommand;

/**
 * Interface that all commands implement so they can execute and undo
 * @author jonat
 */
public interface ICommand {
    public void execute();
    public void undo();
}
