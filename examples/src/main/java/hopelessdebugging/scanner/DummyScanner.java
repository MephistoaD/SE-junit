package hopelessdebugging.scanner;

public class DummyScanner implements Scanner {
    private String[] certs = {
            "valid certificate: DWJ88Is88X",
            "invalid certificate: 7fY1Sv5TBS",
            "valid certificate: uKfKBh2OTn",
            "valid vertificate: 0e4CyXVlB6",
            "valid certificate: 5XVoJOf3TR"
    };
    private int index = 0;

    @Override
    public String scan() {
        return certs[index++];
    }

    @Override
    public boolean hasNext() {
        return index < certs.length;
    }

    @Override
    public void allowPassage() {
        System.out.println("[Valid certificate] -- passage allowed");
    }

    @Override
    public void denyPassage() {
        System.out.println("[Invalid certificate] -- passage denied");
    }
}
