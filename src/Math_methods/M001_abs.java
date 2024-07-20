package Math_methods;

public class M001_abs {

	public static void main(String[] args) {
		
		//Math.abs() returns the absolute value of a number 
//		public static int abs(int a)
//		public static long abs(long a)
//		public static float abs(float a)
//		public static double abs(double a)
//		
		    int negativeInt = -10;
	        int absoluteInt = Math.abs(negativeInt);
	        System.out.println("Absolute value of -10: " + absoluteInt);
		
		long negativeLong = -100000L;
        long absoluteLong = Math.abs(negativeLong);
        System.out.println("Absolute value of -100000: " + absoluteLong);

        float negativeFloat = -5.5f;
        float absoluteFloat = Math.abs(negativeFloat);
        System.out.println("Absolute value of -5.5: " + absoluteFloat);
        
        double negativeDouble = -123.456;
        double absoluteDouble = Math.abs(negativeDouble);
        System.out.println("Absolute value of -123.456: " + absoluteDouble);
        
        //output 
//        Absolute value of -10: 10
//        Absolute value of -100000: 100000
//        Absolute value of -5.5: 5.5
//        Absolute value of -123.456: 123.456

	}

}
