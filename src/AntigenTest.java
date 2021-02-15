public class AntigenTest extends DiagnosticTest{

    private int resultTime;

    public AntigenTest(String date, String surname, String sample, boolean positive, int resultTime){
        super(date, surname, sample, positive);
        this.resultTime = resultTime;
    }

    public int getResultTime() {
        return resultTime;
    }

    @Override
    public String printDetails() {

        String output = "Antigen Test, date: " + super.getDate() + ", Type: " +
                super.getSample() + ", Result: " + super.isPositive() + ", Time: " + resultTime + "mins";

        return output;
    }
}
