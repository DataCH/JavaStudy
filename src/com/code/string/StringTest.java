package com.code.string;

public class StringTest {

	public static String charArrayString(char[] a) {
		StringBuilder res = new StringBuilder("[");
		for (int i = 0; i < a.length; i++) {
			if ('\0' == a[i]) {
				break;
			} else {
				res.append(a[i]);
				res.append(",");
			}
		}
		res.delete(res.length() - 1, res.length());
		res.append("]");
		return res.toString();
	}

	public static void main(String[] args) {
		String str = "This is a string!";
		System.out.println(str);

		System.out.println("1、字符的个数：" + str.length());
		System.out.println("2、取得tring中索引位置上的char：" + str.charAt(0));
		char[] strCopy = new char[10];
		str.getChars(0, 3, strCopy, 0);
		System.out.println("3、复制char到目标数组中：" + charArrayString(strCopy)); // 注意此处不能写成strCopy.toString()，否则输出的数组的内存地址
		System.out.println("4、生成一个char[]，包含String中的所有字符："
				+ charArrayString(str.toCharArray()));
		String newStr = "This is a new string! ";
		System.out.println("5、比较String的内容是否相同：" + str.equals(newStr));
		System.out.println("6、按字典顺序比较String的内容：" + str.compareTo(newStr));
		System.out.println("7、String对象是否包含参数的内容：" + str.contains("str"));
		System.out.println("8、String对象是否以参数起始：" + str.startsWith("This"));
		System.out.println("9、String对象是否以参数结束：" + str.endsWith("!"));
		System.out.println("10、参数的第一个索引位置：" + str.indexOf("i"));
		System.out.println("11、参数的最后一个索引位置：" + str.lastIndexOf("i"));
		System.out.println("12、返回String的子串：" + str.substring(3));
		System.out.println("13、字符串连接(返回一个新的字符串)：" + str.concat(" concat")); // 注意原始的字符串不会改变
		System.out.println("14、字符替换(返回一个新的字符串对象)：" + str.replace('a', 'A'));// 注意原始的字符串不会改变
		System.out.println("15、大写转换：" + str.toUpperCase());
		System.out.println("16、小写转换：" + str.toLowerCase());
		System.out.println("17、删除字符串两端的空白字符：" + str.trim());

		String replaceNewStr = newStr.replace('a', 'a');
		System.out.println(newStr == replaceNewStr);

		replaceNewStr = newStr.replace('a', 'A');
		System.out.println(newStr == replaceNewStr);

		// 总结：当需要改变字符串的内容时，String类的方法都会返回一个新的String对象。
		// 同时，如果内容没有发生改变，String的方法只是返回指向原来对象的引用而已，从而节约存储空间.
	}

}
