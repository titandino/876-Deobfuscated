/* Class16_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class16_Sub1 extends Class16 {
	static int[] anIntArray10976;

	public Class method51(int i) {
		return com.jagex.ItemDecoder.class;
	}

	public ConfigType method55(int i, Interface12 interface12, int i_0_) {
		return new ItemDecoder(i, interface12, this);
	}

	Class16_Sub1(GameMode class670, Language class664, boolean bool, JS5ResourceProvider class461, Interface12 interface12) {
		super(class670, class664, bool, class461, interface12);
	}

	public ConfigType method53(int i, Interface12 interface12) {
		return new ItemDecoder(i, interface12, this);
	}

	public ConfigType method54(int i, Interface12 interface12) {
		return new ItemDecoder(i, interface12, this);
	}

	public Class method52() {
		return com.jagex.ItemDecoder.class;
	}

	public static boolean method10359(int i, int i_1_) {
		return 1 != i && i != 7;
	}
}
