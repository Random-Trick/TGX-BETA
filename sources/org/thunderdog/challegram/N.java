package org.thunderdog.challegram;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.Keep;
import fd.a;
import he.c;
import java.nio.ByteBuffer;

public final class N {

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

    private N() {
    }

    public static native int blurBitmap(Bitmap bitmap, int i10, int i11, int i12);

    public static native void calcCDT(ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2);

    public static native void cancelLottieDecoder(long j10);

    public static native long createDecoder(String str, int[] iArr);

    public static native int createLottieCache(long j10, String str, Bitmap bitmap, Bitmap bitmap2, boolean z10, boolean z11);

    public static native long createLottieDecoder(String str, String str2, double[] dArr, int i10);

    public static native boolean decodeLottieFirstFrame(String str, String str2, Bitmap bitmap);

    public static native void destroyDecoder(long j10);

    public static native void destroyLottieDecoder(long j10);

    public static native int getEmojiSuggestionMaxLength();

    public static native Suggestion[] getEmojiSuggestions(String str);

    public static native boolean getLottieFrame(long j10, Bitmap bitmap, long j11);

    public static native void getLottieSize(long j10, int[] iArr);

    public static native long getTotalPcmDuration();

    public static native int getVideoFrame(long j10, Bitmap bitmap, int[] iArr);

    public static native byte[] getWaveform(String str);

    public static native byte[] getWaveform2(short[] sArr, int i10);

    public static native void gifInit();

    public static native boolean hasBuiltInWebpSupport();

    public static native float iimg(float f10);

    public static boolean init() {
        return c.d();
    }

    public static native int isOpusFile(String str);

    public static native boolean isVideoBroken(long j10);

    public static native boolean loadWebpImage(Bitmap bitmap, ByteBuffer byteBuffer, int i10, BitmapFactory.Options options, boolean z10);

    public static native void onDrawFrame();

    public static native void onFatalError(String str, int i10);

    public static native void onSurfaceChanged(int i10, int i11, float f10, int i12);

    public static native void onSurfaceCreated();

    public static native int openOpusFile(String str);

    public static native int pinBitmap(Bitmap bitmap);

    public static int pinBitmapIfNeeded(Bitmap bitmap) {
        if (a.f11884f) {
            return pinBitmap(bitmap);
        }
        return 0;
    }

    public static native void readOpusFile(ByteBuffer byteBuffer, int i10, int[] iArr);

    public static native String readlink(String str);

    public static native int seekOpusFile(float f10);

    public static native boolean seekVideoToStart(long j10);

    public static native void setColor(float f10, float f11, float f12);

    public static native void setDate(float f10);

    public static native void setFastTextures(int i10, int i11, int i12, int i13);

    public static native void setFreeTextures(int i10, int i11);

    public static native void setIcTextures(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18);

    public static native void setPage(int i10);

    public static native void setPowerfulTextures(int i10, int i11, int i12, int i13);

    public static native void setPrivateTextures(int i10, int i11);

    public static native void setScrollOffset(float f10);

    public static native void setTelegramTextures(int i10, int i11);

    public static native int startRecord(String str);

    public static native void stopRecord();

    public static native void throwDirect(String str);

    public static native int writeFrame(ByteBuffer byteBuffer, int i10);
}
