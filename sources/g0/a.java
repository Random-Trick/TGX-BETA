package g0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.YuvImage;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.k1;
import androidx.camera.core.t1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class a {

    public static final class C0107a extends Exception {
        public EnumC0108a f12012a;

        public enum EnumC0108a {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        public C0107a(String str, EnumC0108a aVar) {
            super(str);
            this.f12012a = aVar;
        }

        public EnumC0108a a() {
            return this.f12012a;
        }
    }

    public static Rect a(Size size, Rational rational) {
        int i10;
        if (!f(rational)) {
            t1.k("ImageUtil", "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f10 = width;
        float f11 = height;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i11 = 0;
        if (rational.floatValue() > f10 / f11) {
            int round = Math.round((f10 / numerator) * denominator);
            i10 = (height - round) / 2;
            height = round;
        } else {
            int round2 = Math.round((f11 / denominator) * numerator);
            i11 = (width - round2) / 2;
            width = round2;
            i10 = 0;
        }
        return new Rect(i11, i10, width + i11, height + i10);
    }

    public static Rect b(Rect rect, int i10, Size size, int i11) {
        Matrix matrix = new Matrix();
        matrix.setRotate(i11 - i10);
        float[] o10 = o(size);
        matrix.mapPoints(o10);
        matrix.postTranslate(-k(o10[0], o10[2], o10[4], o10[6]), -k(o10[1], o10[3], o10[5], o10[7]));
        matrix.invert(matrix);
        RectF rectF = new RectF();
        matrix.mapRect(rectF, new RectF(rect));
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    public static byte[] c(byte[] bArr, Rect rect, int i10) {
        try {
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false);
            Bitmap decodeRegion = newInstance.decodeRegion(rect, new BitmapFactory.Options());
            newInstance.recycle();
            if (decodeRegion != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (decodeRegion.compress(Bitmap.CompressFormat.JPEG, i10, byteArrayOutputStream)) {
                    decodeRegion.recycle();
                    return byteArrayOutputStream.toByteArray();
                }
                throw new C0107a("Encode bitmap failed.", C0107a.EnumC0108a.ENCODE_FAILED);
            }
            throw new C0107a("Decode byte array failed.", C0107a.EnumC0108a.DECODE_FAILED);
        } catch (IOException unused) {
            throw new C0107a("Decode byte array failed.", C0107a.EnumC0108a.DECODE_FAILED);
        } catch (IllegalArgumentException e10) {
            throw new C0107a("Decode byte array failed with illegal argument." + e10, C0107a.EnumC0108a.DECODE_FAILED);
        }
    }

    public static Rational d(int i10, Rational rational) {
        if (i10 == 90 || i10 == 270) {
            return e(rational);
        }
        return new Rational(rational.getNumerator(), rational.getDenominator());
    }

    public static Rational e(Rational rational) {
        return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
    }

    public static boolean f(Rational rational) {
        return rational != null && rational.floatValue() > 0.0f && !rational.isNaN();
    }

    public static boolean g(Size size, Rational rational) {
        return rational != null && rational.floatValue() > 0.0f && h(size, rational) && !rational.isNaN();
    }

    public static boolean h(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        float numerator = rational.getNumerator();
        float denominator = rational.getDenominator();
        return (height == Math.round((((float) width) / numerator) * denominator) && width == Math.round((((float) height) / denominator) * numerator)) ? false : true;
    }

    public static byte[] i(k1 k1Var) {
        if (k1Var.x0() == 256) {
            ByteBuffer a10 = k1Var.j()[0].a();
            byte[] bArr = new byte[a10.capacity()];
            a10.rewind();
            a10.get(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + k1Var.x0());
    }

    public static byte[] j(k1 k1Var, Rect rect, int i10) {
        if (k1Var.x0() == 256) {
            return c(i(k1Var), rect, i10);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + k1Var.x0());
    }

    public static float k(float f10, float f11, float f12, float f13) {
        return Math.min(Math.min(f10, f11), Math.min(f12, f13));
    }

    public static byte[] l(byte[] bArr, int i10, int i11, Rect rect, int i12) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        YuvImage yuvImage = new YuvImage(bArr, 17, i10, i11, null);
        if (rect == null) {
            rect = new Rect(0, 0, i10, i11);
        }
        if (yuvImage.compressToJpeg(rect, i12, byteArrayOutputStream)) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new C0107a("YuvImage failed to encode jpeg.", C0107a.EnumC0108a.ENCODE_FAILED);
    }

    public static boolean m(int i10, int i11, int i12, int i13) {
        return (i10 == i12 && i11 == i13) ? false : true;
    }

    public static boolean n(k1 k1Var) {
        return m(k1Var.getWidth(), k1Var.getHeight(), k1Var.B().width(), k1Var.B().height());
    }

    public static float[] o(Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    public static byte[] p(k1 k1Var, Rect rect, int i10) {
        if (k1Var.x0() == 35) {
            return l(q(k1Var), k1Var.getWidth(), k1Var.getHeight(), rect, i10);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + k1Var.x0());
    }

    public static byte[] q(k1 k1Var) {
        k1.a aVar = k1Var.j()[0];
        k1.a aVar2 = k1Var.j()[1];
        k1.a aVar3 = k1Var.j()[2];
        ByteBuffer a10 = aVar.a();
        ByteBuffer a11 = aVar2.a();
        ByteBuffer a12 = aVar3.a();
        a10.rewind();
        a11.rewind();
        a12.rewind();
        int remaining = a10.remaining();
        byte[] bArr = new byte[((k1Var.getWidth() * k1Var.getHeight()) / 2) + remaining];
        int i10 = 0;
        for (int i11 = 0; i11 < k1Var.getHeight(); i11++) {
            a10.get(bArr, i10, k1Var.getWidth());
            i10 += k1Var.getWidth();
            a10.position(Math.min(remaining, (a10.position() - k1Var.getWidth()) + aVar.b()));
        }
        int height = k1Var.getHeight() / 2;
        int width = k1Var.getWidth() / 2;
        int b10 = aVar3.b();
        int b11 = aVar2.b();
        int c10 = aVar3.c();
        int c11 = aVar2.c();
        byte[] bArr2 = new byte[b10];
        byte[] bArr3 = new byte[b11];
        for (int i12 = 0; i12 < height; i12++) {
            a12.get(bArr2, 0, Math.min(b10, a12.remaining()));
            a11.get(bArr3, 0, Math.min(b11, a11.remaining()));
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < width; i15++) {
                int i16 = i10 + 1;
                bArr[i10] = bArr2[i13];
                i10 = i16 + 1;
                bArr[i16] = bArr3[i14];
                i13 += c10;
                i14 += c11;
            }
        }
        return bArr;
    }
}
