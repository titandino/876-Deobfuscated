/* Class554 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class554 {
	Class199 aClass199_7483 = new Class199(20);
	JS5ResourceProvider aClass461_7484;

	void method6771() {
		synchronized (aClass199_7483) {
			aClass199_7483.method2892(-1438078135);
		}
	}

	void method6772(int i) {
		synchronized (aClass199_7483) {
			aClass199_7483.method2884((byte) -45);
		}
	}

	Class554(JS5ResourceProvider class461) {
		aClass461_7484 = class461;
	}

	void method6773(byte i) {
		synchronized (aClass199_7483) {
			aClass199_7483.method2892(1593515949);
		}
	}

	void method6774() {
		synchronized (aClass199_7483) {
			aClass199_7483.method2884((byte) -79);
		}
	}

	void method6775() {
		synchronized (aClass199_7483) {
			aClass199_7483.method2884((byte) -94);
		}
	}

	void method6776(int i) {
		synchronized (aClass199_7483) {
			aClass199_7483.method2883(i, -1222521765);
		}
	}

	void method6777(int i) {
		synchronized (aClass199_7483) {
			aClass199_7483.method2883(i, -1406944062);
		}
	}

	void method6778() {
		synchronized (aClass199_7483) {
			aClass199_7483.method2884((byte) -62);
		}
	}

	void method6779(int i) {
		synchronized (aClass199_7483) {
			aClass199_7483.method2883(i, -1275332742);
		}
	}

	void method6780(int i, int i_0_) {
		synchronized (aClass199_7483) {
			aClass199_7483.method2883(i, -999872783);
		}
	}

	void method6781() {
		synchronized (aClass199_7483) {
			aClass199_7483.method2892(339473716);
		}
	}

	public static int method6782(GraphicalRenderer class167, byte i) {
		Class382.method4821((short) 27351);
		return Class536_Sub42.aTwitchTV10811.StopStreaming();
	}

	public static void method6783(byte i) {
		if (Class225.method3218(-110920746))
			IComponentSettings.method9498(new Class629(), (byte) -99);
	}

	static final void method6784(Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4516, client.aClass106_11322.aClass15_1258, 1207388917);
		class536_sub23.stream.writeByte(string.length() + 1);
		class536_sub23.stream.writeString(string);
		client.aClass106_11322.writePacket(class536_sub23, 1985123058);
	}

	static String method6785(IComponentDefinitions class251, int i) {
		if (client.getIComponentSettings(class251).method9474() == 0)
			return null;
		if (null == class251.targetVerb || class251.targetVerb.trim().length() == 0) {
			if (client.aBool11010)
				return "Hidden-use";
			return null;
		}
		return class251.targetVerb;
	}

	public static boolean method6786(int i, String string, int i_1_, int i_2_, int i_3_) {
		Class23.aClass5_221 = new Class5();
		Class23.aClass5_221.anInt111 = 1232605419 * i;
		Class23.aClass5_221.aString112 = string;
		Class23.aClass5_221.anInt110 = i_1_ * -1803928197;
		Class23.aClass5_221.anInt108 = i_2_ * -1753280203;
		return true;
	}
}
