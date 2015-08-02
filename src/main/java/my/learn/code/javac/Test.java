package my.learn.code.javac;


/**
 * @Description:TODO
 * @author 张小伟
 * @date Aug 2, 2015 2:44:38 PM
 * @version V1.0
 */
public class Test {

	/**
	 * @Description:TODO
	 * @param @param args
	 * @return void
	 */
	public static void main(String[] args) {
		new Test().checkCamelCase("getid", false);

	}
	
    /**
     * 检查传入的Element是否符合驼式命名法，如果不符合，则输出警告信息
     */
    private void checkCamelCase(String name, boolean initialCaps) {
        boolean previousUpper = false;
        boolean conventional = true;
        int firstCodePoint = name.codePointAt(0);

        if (Character.isUpperCase(firstCodePoint)) {
            previousUpper = true;
            if (!initialCaps) {
            	System.out.println("名称“" + name + "”应当以小写字母开头");
                return;
            }
        } else if (Character.isLowerCase(firstCodePoint)) {
            if (initialCaps) {
            	System.out.println("名称“" + name + "”应当以大写字母开头");
                return;
            }
        } else
            conventional = false;

        if (conventional) {
            int cp = firstCodePoint;
            for (int i = Character.charCount(cp); i < name.length(); i += Character.charCount(cp)) {
                cp = name.codePointAt(i);
                System.out.println((char)cp);
                if (Character.isUpperCase(cp)) {
                    if (previousUpper) {
                        conventional = false;
                        break;
                    }
                    previousUpper = true;
                } else
                    previousUpper = false;
            }
        }

        if (!conventional)
        	System.out.println("名称“" + name + "”应当符合驼式命名法（Camel Case Names）");
    }

}
