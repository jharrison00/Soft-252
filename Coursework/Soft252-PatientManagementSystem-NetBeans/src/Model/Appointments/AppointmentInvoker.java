package Model.Appointments;

import Controller.Prescriptions.PrescriptionsCommand.ICommand;

/**
 * Command pattern invoker class allowing invoker to execute prescription commands
 * @author jonat
 */
public class AppointmentInvoker  {

    private ICommand command;

    /**
     * Sets command to use
     * @param command 
     */
    public void setCommand(ICommand command){
        this.command= command;
    }
    
    /**
     * Executes command
     */
    public void executeCommand(){
        command.execute();
    }
    
    /**
     * Undoes command
     */
    public void undoCommand(){
        command.undo();
    }
}
