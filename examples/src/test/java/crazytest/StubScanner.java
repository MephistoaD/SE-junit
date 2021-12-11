package crazytest;

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
    public void allowPassage() {
        this.allowPassage = true;
    }

    @Override
    public void denyPassage() {
        this.denyPassage = true;
    }

}