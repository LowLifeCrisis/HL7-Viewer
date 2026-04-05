package hl7Viewer.nonGui.parser;

import java.io.IOException;

public interface IMessageParser {

    HL7Message parse(final String message) throws IllegalArgumentException;
}
