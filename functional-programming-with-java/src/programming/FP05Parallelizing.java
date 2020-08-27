package programming;

import java.util.stream.LongStream;

public class FP05Parallelizing {
	
	public static void main(String[] args) {

		long time = System.currentTimeMillis();
		//it took 2177 ms
//		System.out.println(LongStream.range(0,1000000000).sum());

		//it took about 500 ms
		System.out.println(LongStream.range(0,1000000000).parallel().sum());
		
		System.out.println(System.currentTimeMillis() - time);
		
	}
	
	

}
