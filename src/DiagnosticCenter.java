import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class DiagnosticCenter {

    ArrayList<Test> tests;

    public DiagnosticCenter() {
        tests = new ArrayList<Test>();
    }

    public void addTest(Test t) {
        tests.add(t);
    }

    public void checkPrintTests(ArrayList<String> names) {
        Collections.sort(names);
        boolean found = false;
        try {
            FileOutputStream fout = new FileOutputStream("TestResultSummary.txt");
            for(int i=0; i<names.size(); i++){
                found = false;
                for(Test t: tests){
                    if(t.getSurname().equals(names.get(i))){
                        found = true;
                        String message = t.getSurname() + " has performed a test. Results:\n" + t.printDetails() + "\n";
                        fout.write(message.getBytes());
                    }
                }
                if(!found){
                    String message = names.get(i) + " has not performed a test.\n";
                    fout.write(message.getBytes());
                }
                if(i!=names.size()-1){
                    String horizontalLines = "----------\n";
                    fout.write(horizontalLines.getBytes());
                }
                fout.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Test> getTests(){
        return tests;
    }
}