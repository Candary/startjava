package src.com.startjava.Lesson_1.test;

public class Variable {
	public static void main(String[] args) {
		byte numberOfCores = 4;
		short osBites = 64;
		int cpuMemoryShort = 16;
		long cpuMemoryFull = 16384;
		float cpuRateShort = 4.4f;
		double cpuRateFull = 4.42d;
		char indexModel = 'P';
		boolean isVectorChipsSuppert = true;

		System.out.println("Cores count - " + numberOfCores);	
		System.out.println("OS Bits - " + osBites);
		System.out.println("RAM, short - " + cpuMemoryShort);
		System.out.println("RAM, full - " + cpuMemoryFull);
		System.out.println("CPU rate, short - " + cpuRateShort);
		System.out.println("CPU rate, full  - " + cpuRateFull);
		System.out.println("Model index - " + indexModel);
		System.out.println("Vector chips support  - " + isVectorChipsSuppert);
	}
}
