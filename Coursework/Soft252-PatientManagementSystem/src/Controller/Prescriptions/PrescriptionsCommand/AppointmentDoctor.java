package Controller.Prescriptions.PrescriptionsCommand;

public class AppointmentDoctor {
    private ICommand command;
    public void setCommand(ICommand command) {
        this.command = command;
    }
    public void executeCommand(){
        command.execute();
    }
    public void undoCommand(){
        command.undo();
    }
}
