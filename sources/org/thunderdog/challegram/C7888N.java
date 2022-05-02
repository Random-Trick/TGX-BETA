package org.thunderdog.challegram;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.Keep;
import ge.C4861c;
import java.nio.ByteBuffer;
import p067ed.C4183a;

public final class C7888N {

    @Keep
    public static class Suggestion {
        public final String emoji;
        public final String label;
        public final String replacement;

        public Suggestion(String str, String str2, String str3) {
            this.emoji = str;
            this.label = str2;
            this.replacement = str3;
        }
    }

    private C7888N() {
    }

    public static native int blurBitmap(Bitmap bitmap, int i, int i2, int i3);

    public static native void calcCDT(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2);

    public static native void cancelLottieDecoder(long j);

    public static native long createDecoder(String str, int[] iArr);

    public static native int createLottieCache(long j, String str, Bitmap bitmap, Bitmap bitmap2, boolean z, boolean z2);

    public static native long createLottieDecoder(String str, String str2, double[] dArr, int i);

    public static native boolean decodeLottieFirstFrame(String str, String str2, Bitmap bitmap);

    public static native void destroyDecoder(long j);

    public static native void destroyLottieDecoder(long j);

    public static native int getEmojiSuggestionMaxLength();

    public static native Suggestion[] getEmojiSuggestions(String str);

    public static native boolean getLottieFrame(long j, Bitmap bitmap, long j2);

    public static native void getLottieSize(long j, int[] iArr);

    public static native long getTotalPcmDuration();

    public static native int getVideoFrame(long j, Bitmap bitmap, int[] iArr);

    public static native byte[] getWaveform(String str);

    public static native byte[] getWaveform2(short[] sArr, int i);

    public static native void gifInit();

    public static native boolean hasBuiltInWebpSupport();

    public static native float iimg(float f);

    public static boolean init() {
        return C4861c.m24982d();
    }

    public static native int isOpusFile(String str);

    public static native boolean isVideoBroken(long j);

    public static native boolean loadWebpImage(Bitmap bitmap, ByteBuffer byteBuffer, int i, BitmapFactory.Options options, boolean z);

    public static native void onDrawFrame();

    public static native void onFatalError(String str, int i);

    public static native void onSurfaceChanged(int i, int i2, float f, int i3);

    public static native void onSurfaceCreated();

    public static native int openOpusFile(String str);

    public static native int pinBitmap(Bitmap bitmap);

    public static int pinBitmapIfNeeded(Bitmap bitmap) {
        if (C4183a.f14088f) {
            return pinBitmap(bitmap);
        }
        return 0;
    }

    public static native void readOpusFile(ByteBuffer byteBuffer, int i, int[] iArr);

    public static native String readlink(String str);

    public static native int seekOpusFile(float f);

    public static native boolean seekVideoToStart(long j);

    public static native void setColor(float f, float f2, float f3);

    public static native void setDate(float f);

    public static native void setFastTextures(int i, int i2, int i3, int i4);

    public static native void setFreeTextures(int i, int i2);

    public static native void setIcTextures(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    public static native void setPage(int i);

    public static native void setPowerfulTextures(int i, int i2, int i3, int i4);

    public static native void setPrivateTextures(int i, int i2);

    public static native void setScrollOffset(float f);

    public static native void setTelegramTextures(int i, int i2);

    public static native int startRecord(String str);

    public static native void stopRecord();

    public static native void throwDirect(String str);

    public static native int writeFrame(ByteBuffer byteBuffer, int i);
}
