package com.company;

public class Cesar {

    int shift;
    int upperStartSymbol;
    int upperEndSymbol;
    int lowerStartSymbol;
    int lowerEndSymbol;
    int numberOfsymbols;

    public Cesar(int shift, int upperStartSymbol, int upperEndSymbol, int lowerStartSymbol, int lowerEndSymbol, int numberOfsymbols) {
        this.shift = shift;
        this.upperStartSymbol = upperStartSymbol;
        this.upperEndSymbol = upperEndSymbol;
        this.lowerStartSymbol = lowerStartSymbol;
        this.lowerEndSymbol = lowerEndSymbol;
        this.numberOfsymbols = numberOfsymbols;
    }

    String encrypt(String originText) {

        StringBuilder newText = new StringBuilder();

        for(int i=0; i < originText.length(); i++) {
            char symbol = originText.charAt(i);
            if(symbol >= upperStartSymbol && symbol <= upperEndSymbol) {
                int newSymbol =  (symbol - upperStartSymbol + shift) % numberOfsymbols;
                newText.append((char) (newSymbol + upperStartSymbol));
            } else if((symbol >= lowerStartSymbol && symbol <= lowerEndSymbol)) {
                int newSymbol =  (symbol - lowerStartSymbol + shift) % numberOfsymbols;
                newText.append((char) (newSymbol + lowerStartSymbol));
            }
        }

        return newText.toString();
    }

    String decrypt(String encryptedText) {

        StringBuilder newText = new StringBuilder();

        for(int i=0; i < encryptedText.length(); i++) {
            char symbol = encryptedText.charAt(i);
            if((symbol >= upperStartSymbol && symbol <= upperEndSymbol)) {
                int newSymbol =  (symbol - upperStartSymbol - shift) % numberOfsymbols;
                newText.append((char) (newSymbol + upperStartSymbol));
            } else if((symbol >= lowerStartSymbol && symbol <= lowerEndSymbol)) {
                int newSymbol =  (symbol - lowerStartSymbol - shift) % numberOfsymbols;
                newText.append((char) (newSymbol + lowerStartSymbol));
            }
        }

        return newText.toString();
    }

}
