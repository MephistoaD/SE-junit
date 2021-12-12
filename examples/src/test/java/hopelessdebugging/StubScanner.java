package hopelessdebugging;

import crazytest.scanner.Scanner;

public class StubScanner implements Scanner {
    private String certificateCode;
    public boolean allowPassage = false;
    public boolean denyPassage = false;

    public StubScanner(String certificateCode) {
        this.certificateCode = certificateCode;
    }

	@Override
    public String scan() {
        return this.certificateCode;
    }

    @Override
    public boolean hasNext() { // not implemented
        return false;
    }

    @Override
    public void allowPassage() {
        this.allowPassage = true;
    } // saves that the method got called

    @Override
    public void denyPassage() {
        this.denyPassage = true;
    } // saves that the method got called

}