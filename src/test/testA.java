package test;

import java.lang.reflect.Field;

import org.junit.Test;

import sun.misc.Unsafe;
import MaQiao.Constants.Constants;

public class testA {
	private static final Unsafe UNSAFE = Constants.UNSAFE;
	private int a=15;
	@Test
	public void test() {
		A a = new A();
		System.out.println(a.toString());
		final Field[] fields = a.getClass().getDeclaredFields();
		try {
//			System.out.print("Field :A [");
//			for (int i = 0; i < fields.length; i++) {
//				final Field field = fields[i];
//				field.setAccessible(true);
//				System.out.print(field.getName() + "=" + System.identityHashCode(field.get(a)) + "\t");
//			}
//			System.out.println();
//			/*================*/
//
//			System.out.print("UNSAFE:A [");
//			for (int i = 0; i < fields.length; i++) {
//				final Field field = fields[i];
//				long offSet;
//					offSet = //UNSAFE.objectFieldOffset  
//					//(A.class.getDeclaredField(field.getName())); 
//						//A.class.getDeclaredField("value"));//
//							UNSAFE.objectFieldOffset(field);
//				System.out.print(field.getName());
//				//System.out.println("offSet:"+offSet);
//				//System.out.println("getName:"+field.getType());
//				Object obj=UNSAFE.getInt(a, offSet);
//				//System.out.println("offSet:"+obj.hashCode());
//				//if(obj.getClass() == Integer.class){
//					System.out.print("=" + System.identityHashCode(obj) + "\t");
//				//}
//				//System.out.print(field.getName() + "=" + System.identityHashCode() + " ");
//			}
//			System.out.println();
			
			

			System.out.print("Consta:A [");
			for (int i = 0; i < fields.length; i++) {
				final Field field = fields[i];
				System.out.print(field.getName());
				System.out.print("=" + Constants.getIdentityHashCode(a, field) + "\t\t");
			}
			System.out.println();

		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} /*catch (IllegalAccessException e) {
			e.printStackTrace();
		}catch (NoSuchFieldException e) {
			e.printStackTrace();
		}*/ catch (SecurityException e) {
			e.printStackTrace();
		}
	}

}
