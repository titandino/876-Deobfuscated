/* Class94 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class94 {
	public String aString1142;
	public String aString1143;
	String aString1144;
	public int anInt1145;
	public String aString1146;
	public byte aByte1147;
	static Thread aThread1148;
	static Class592[] worlds;

	Class94() {
		/* empty */
	}

	static void method1288(String string, int i) {
		Class4.aClass690_102 = Class690.aClass690_8698;
		Class45.aString528 = string;
	}

	static final void method1289(IComponentDefinitions class251, Class234 class234, Class668 class668, byte i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		Class73 class73 = (Class73) Class207.aClass34_Sub22_2244.method70(i_0_, (byte) -7);
		if (!class73.aString805.equals(string))
			class251.setStringParam(i_0_, string, -1747299055);
		else
			class251.method3497(i_0_, (byte) 57);
	}

	static final void method1290(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.bgSoundVolumeSetting.method10213(615150507);
	}

	static final void method1291(Class668 class668, byte i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_1_);
		Class234 class234 = Class463.aClass234Array5227[i_1_ >> 16];
		Class390.method4856(class251, class234, false, 2, class668, (byte) -85);
	}

	static final void method1292(IComponentDefinitions class251, Class234 class234, Class668 class668, int i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		int i_3_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (i_3_ >= 1 && i_3_ <= 10)
			class251.setOpCursor(i_3_ - 1, i_2_);
	}
}
