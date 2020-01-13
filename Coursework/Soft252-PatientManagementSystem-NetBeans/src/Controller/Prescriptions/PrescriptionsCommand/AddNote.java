package Controller.Prescriptions.PrescriptionsCommand;

import Model.Prescriptions.Prescription;

/**
 * Command pattern for adding and removing note from prescription
 * @author jonat
 */
public class AddNote implements ICommand {

    private Prescription prescription;
    private String note;

    /**
     * Constructor for getting note and prescription
     * @param prescription
     * @param note 
     */
    public AddNote(Prescription prescription,String note){
        this.prescription = prescription;
        this.note = note;
    }

    /**
     * Executes command and adds note to prescription
     */
    @Override
    public void execute() {
        prescription.setNote(note);
    }

    /**
     * Undo command removes note from prescription
     */
    @Override
    public void undo() {
        prescription.setNote("No note");
    }
}
