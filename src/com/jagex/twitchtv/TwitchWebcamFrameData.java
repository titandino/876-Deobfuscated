/* TwitchWebcamFrameData - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;

public class TwitchWebcamFrameData {
	public int width = 0;
	public int height = 0;
	public int[] buffer = null;

	public void SetData(int i, int i_0_, int[] is) {
		width = i;
		height = i_0_;
		buffer = is;
	}

	public void method14418() {
		for (int i = height - 1; i >= 0; i--) {
			int i_1_ = i * width;
			for (int i_2_ = width * (i + 1); i_1_ < i_2_; i_1_++) {
				i_2_--;
				int i_3_ = buffer[i_1_];
				buffer[i_1_] = buffer[i_2_];
				buffer[i_2_] = i_3_;
			}
		}
	}

	public void method14419() {
		for (int i = (height >> 1) - 1; i >= 0; i--) {
			int i_4_ = i * width;
			int i_5_ = width * (height - i - 1);
			for (int i_6_ = -width; i_6_ < 0; i_6_++) {
				int i_7_ = buffer[i_4_];
				buffer[i_4_] = buffer[i_5_];
				buffer[i_5_] = i_7_;
				i_4_++;
				i_5_++;
			}
		}
	}

	public void method14420() {
		for (int i = height - 1; i >= 0; i--) {
			int i_8_ = i * width;
			for (int i_9_ = width * (i + 1); i_8_ < i_9_; i_8_++) {
				i_9_--;
				int i_10_ = buffer[i_8_];
				buffer[i_8_] = buffer[i_9_];
				buffer[i_9_] = i_10_;
			}
		}
	}

	public void method14421() {
		for (int i = (height >> 1) - 1; i >= 0; i--) {
			int i_11_ = i * width;
			int i_12_ = width * (height - i - 1);
			for (int i_13_ = -width; i_13_ < 0; i_13_++) {
				int i_14_ = buffer[i_11_];
				buffer[i_11_] = buffer[i_12_];
				buffer[i_12_] = i_14_;
				i_11_++;
				i_12_++;
			}
		}
	}

	public void method14422() {
		for (int i = (height >> 1) - 1; i >= 0; i--) {
			int i_15_ = i * width;
			int i_16_ = width * (height - i - 1);
			for (int i_17_ = -width; i_17_ < 0; i_17_++) {
				int i_18_ = buffer[i_15_];
				buffer[i_15_] = buffer[i_16_];
				buffer[i_16_] = i_18_;
				i_15_++;
				i_16_++;
			}
		}
	}
}
