
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;
import java.util.Scanner;

abstract class ArithmeticCoderBase {

	public ArithmeticCoderBase(int numBits) {
		
	}

	protected void update(UpdateModel frequency, int symbol) throws IOException {

	}

	protected abstract void shift() throws IOException;

	protected abstract void underflow() throws IOException;	
}

class Encoder extends ArithmeticCoderBase {
	
	public Encoder(int numBits, BitOutputStream out) {
		super(numBits);
	}

	public void write(ModelBase frequency, int symbol) throws IOException {
		
	}

	public void write(UpdateModel frequency, int symbol) throws IOException {
		
	}

	public void finish() throws IOException {
		
	}
		
	protected void shift() throws IOException {
		
	}
		
	protected void underflow() {

	}	
}

class Decoder extends ArithmeticCoderBase {


	public Decoder(int numBits, BitInputStream in) throws IOException {
		super(numBits);
	}

	public int read(ModelBase frequency) throws IOException {
		return 0;
	}

	public int read(UpdateModel frequency) throws IOException {
		return 0;
	}
		
	protected void shift() throws IOException {

	}
		
	protected void underflow() throws IOException {

	}
	
	private int read_code_bit() throws IOException {
		return 0;
	}	
}

abstract class ModelBase {

	public abstract int get_symbol_limit();

	public abstract int get(int symbol);

	public abstract void increment(int symbol);

	public abstract int get_total();

	public abstract int get_low(int symbol);

	public abstract int get_high(int symbol);
	
}

class StartModel extends ModelBase {

	public StartModel(int numSyms) {

	}

	public int get_symbol_limit() {
		return 0;
	}

	public int get(int symbol) {
		return 0;
	}

	public int get_total() {
		return 0;
	}

	public int get_low(int symbol) {
		return 0;
	}

	public int get_high(int symbol) {
		return 0;
	}

	public void increment(int symbol) {
		
	}	
}

class UpdateModel extends ModelBase {

	public UpdateModel(int[] frequency) {

	}

	public UpdateModel(ModelBase frequency) {

	}

	public int get_symbol_limit() {
		return 0;
	}

	public int get(int symbol) {
		return 0;
	}

	public void set(int symbol, int freq) {		

	}

	public void increment(int symbol) {

	}

	public int get_total() {
		return 0;
	}

	public int get_low(int symbol) {
		return 0;
	}

	public int get_high(int symbol) {
		return 0;
	}

	private void init_sum_of_frequencies() {

	}

	public String to_string() {
		return null;
	}
		
	private int add_int(int x, int y) {
		return 0;
	}	
}

class BitInputStream implements AutoCloseable {

	public BitInputStream(InputStream in) {

	}

	public int read() throws IOException {
		return 0;
	}

	public int read_eof() throws IOException {
		return 0;
	}

	public void close() throws IOException {

	}	
}

class BitOutputStream implements AutoCloseable {

	public BitOutputStream(OutputStream out) {

	}

	public void write(int b) throws IOException {

	}

	public void close() throws IOException {

	}	
}

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String choiseStr;
		loop: while (true) {
			
			choiseStr = sc.next();
								
			switch (choiseStr) {
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
		
	static void comp(InputStream in, BitOutputStream out) throws IOException {

	}
	
	static void decomp(BitInputStream in, OutputStream out) throws IOException {

	}	
}