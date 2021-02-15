public class MolecularTest extends DiagnosticTest{

    private double sf;

    public MolecularTest(String date, String surname, String sample, boolean positive, double sf){
        super(date, surname, sample, positive);
        this.sf = sf;
    }

    public double getSf() {
        return sf;
    }

    @Override
    public String printDetails() {

        String output = "Molecular Test, date: " + super.getDate() + ", Type: " +
                super.getSample() + ", Result: " + super.isPositive() + ", Accuracy: " + sf*100 + "%";

        return output;
    }
}
