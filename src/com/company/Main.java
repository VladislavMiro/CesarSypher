package com.company;

public class Main {

    public static void main(String[] args) {
	    String originText = "абвг";
	    String orTxt = "abcd";

	    Cesar cesar = new Cesar(3, 1040, 1071, 1072, 1103, 32);

	    String newText = cesar.encrypt(originText);

	    System.out.println(newText);

	    System.out.println(cesar.decrypt(newText));

		cesar = new Cesar(3, 65, 90, 97, 122, 26);

		newText = cesar.encrypt(orTxt);

		System.out.println(newText);

		System.out.println(cesar.decrypt(newText));

    }
}
