package Controller.Prescriptions.PrescriptionsCommand;

import Model.Prescriptions.Prescription;

public class AddNote implements ICommand {

    private Prescription prescription;
    private String note;

    public AddNote(Prescription prescription,String note){
        this.prescription = prescription;
        this.note = note;
    }

    @Override
    public void execute() {
        prescription.setNote(note);
    }

    @Override
    public void undo() {
        prescription.setNote("No note");
    }
}
