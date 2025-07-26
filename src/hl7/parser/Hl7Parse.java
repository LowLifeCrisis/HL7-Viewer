package hl7.parser;

public class Hl7Parse {
    private String message;
    private final String fieldSeparator = "|";
    private final String  encodingChar = "^~\\&";



    public Hl7Parse(String message)  {
        if (message == null) { //simple input validation
            throw new IllegalArgumentException("HL7 message cannot be null");
        }
        this.message = message;
    }

    private String[] getSegments() {
        return this.message.split("[\\r\\n]");
    }




}
