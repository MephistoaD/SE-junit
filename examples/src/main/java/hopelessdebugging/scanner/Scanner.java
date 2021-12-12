package hopelessdebugging.scanner;

public interface Scanner {
    public static Scanner create(){
        return new DummyScanner();
    }

    public String scan();

    public boolean hasNext();
    
    public void allowPassage();
    public void denyPassage();
}
