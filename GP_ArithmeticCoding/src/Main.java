
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

class arithmeticCoding{
	
	public static void start_enconding(String sourceFile, String resultFile) {
		//TODO Start encoding a stream of symbols
	}
	
	public static void start_decoding(String sourceFile, String resultFile) {
		//TODO Start decoding a stream of symbols
	}
	
	public static void encode_symbol(int symbol, int[] frequencies){
		//TODO Encode a symbol
	}
	
	public static int decode_symbol(int[] frequencies) {
		//TODO Decode next symbol
		return 0;
	}
	
	public static void done_encoding() {
		//TODO Finish encoding the stream
	}
	
	public static void bit_plus_follow(int bit) {
		//TODO Output bits plus following opposite bits
	}
	
	public static void start_inputing_bits() {
		//TODO Initialize bit input
	}
	
	public static int input_bit() {
		//TODO Input a bit
		return 0;
	}
	
	public static void output_bit(int bit) {
		//TODO Output a bit
	}
}

class model {
	
	public static void comp() {
		//TODO Set up other modules
	}
	
	public static void decomp() {
		//TODO Set up other modules
	}
	
	public static void start_model(){
		//TODO Initialize the model
	}
	
	public static void update_model(int symbol) {
		//TODO Update the model to account for a new symbol
	}
	
	public static void start_outputing_bits() {
		//TODO Initialize for bit output
	}
	
	public static void done_outputing_bits() {
		//TODO Flush out the last bits
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choiseStr;
		loop: while (true) {
			
			choiseStr = sc.next();
								
			switch (choiseStr) {
			// TODO Interface 
			case "comp":
				break;
			case "decomp":
				break;
			case "size":
				break;
			case "equal":
				break;
			case "about":
				break;
			case "exit":
				break loop;
			}
		}

		sc.close();
	}

	public static void size(String sourceFile) {
		try {
			FileInputStream f = new FileInputStream(sourceFile);
			System.out.println("size: " + f.available());
			f.close();
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	public static boolean equal(String firstFile, String secondFile) {
		try {
			FileInputStream f1 = new FileInputStream(firstFile);
			FileInputStream f2 = new FileInputStream(secondFile);
			int k1, k2;
			byte[] buf1 = new byte[1000];
			byte[] buf2 = new byte[1000];
			do {
				k1 = f1.read(buf1);
				k2 = f2.read(buf2);
				if (k1 != k2) {
					f1.close();
					f2.close();
					return false;
				}
				for (int i=0; i<k1; i++) {
					if (buf1[i] != buf2[i]) {
						f1.close();
						f2.close();
						return false;
					}
						
				}
			} while (k1 == 0 && k2 == 0);
			f1.close();
			f2.close();
			return true;
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
			return false;
		}
	}
	
	public static void about() {
		// TODO insert information about authors
	}
}
