package ch.fhnw.algd1.converters.binary;

public class BinConverter {
	public static String toString(int x) {
		// TODO expect x to be in range [-128, 127], return string with 8 binary
		// digits representing x in 2-complement

		if(x < -128 || x > 127){
			throw new IllegalArgumentException();
		}




		return "00000000";
	}

	public static int fromString(String text) {
		// TODO expect text to contain 8 binary digits, parse to int value in
		// 2-complement
		if(text.length() != 8 || !text.matches("[01]+")){
			throw new IllegalArgumentException();
		}

		int value = Integer.parseInt(text, 2);

		if(value > 127){
			return value - 256;
		}

		return value;
	}
}