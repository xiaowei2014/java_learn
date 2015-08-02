package my.learn.code.console;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Description:TODO
 * @author 张小伟
 * @date Aug 1, 2015 10:48:41 PM
 * @version V1.0
 */
public class Main {

	/**
	 * @Description:TODO
	 * @param @param args
	 * @return void
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream input = new FileInputStream("target/classes/my/learn/code/console/Test.class");
		byte[] bytes=new byte[input.available()];
		input.read(bytes, 0, bytes.length);
		System.out.println(JavaClassExecuter.execute(bytes));

	}

}
