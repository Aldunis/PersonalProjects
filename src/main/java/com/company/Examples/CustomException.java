package com.company.Examples;

public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }

    static int parseNr(String BookNr) throws CustomException {
        int nrOfBooks;
        try {
            nrOfBooks = Integer.parseInt(BookNr);
        } catch (NumberFormatException e) {
            throw new CustomException("should be an int");
        }
        if (nrOfBooks < 0 || nrOfBooks > 150) {
            throw new CustomException("nrOfBooks should be between 0 and 150");
        }
        return nrOfBooks;

    }
    public static void main (String [] args) {
        try {
            int BookNr = parseNr(args[0]);
        } catch (CustomException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid nrOfBooks argument or Index out of Bounds" + " " + e.getMessage());
        }
    }
}
