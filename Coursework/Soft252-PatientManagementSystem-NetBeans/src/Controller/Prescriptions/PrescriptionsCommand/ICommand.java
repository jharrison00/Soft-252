package Controller.Prescriptions.PrescriptionsCommand;

public interface ICommand {
    public void execute();
    public void undo();
}
