package Model.Appointments;

import Controller.Prescriptions.PrescriptionsCommand.ICommand;
import Model.Users.Doctor;

public class AppointmentInvoker  {

    private ICommand command;

    public void setCommand(ICommand command){
        this.command= command;
    }
    public void executeCommand(){
        command.execute();
    }
    public void undoCommand(){
        command.undo();
    }
}
