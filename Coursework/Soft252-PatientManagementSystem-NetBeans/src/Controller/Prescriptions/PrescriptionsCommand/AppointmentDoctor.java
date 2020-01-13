package Controller.Prescriptions.PrescriptionsCommand;

/**
 * Class for invoker of prescription commands 
 * @author jonat
 */
public class AppointmentDoctor {
    private ICommand command;
    /**
     * Constructor used to set command
     * @param command 
     */
    public void setCommand(ICommand command) {
        this.command = command;
    }

    /**
     * Method used so invoker can execute command
     */
    public void executeCommand(){
        command.execute();
    }
    
    /**
     * Method used so invoker can undo command
     */
    public void undoCommand(){
        command.undo();
    }
}
