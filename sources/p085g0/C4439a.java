package p085g0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.YuvImage;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.AbstractC0610l1;
import androidx.camera.core.C0662u1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class C4439a {

    public static final class C4440a extends Exception {
        public EnumC4441a f14696a;

        public enum EnumC4441a {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        public C4440a(String str, EnumC4441a aVar) {
            super(str);
            this.f14696a = aVar;
        }

        public EnumC4441a m27652a() {
            return this.f14696a;
        }
    }

    public static Rect m27669a(Size size, Rational rational) {
        int i;
        if (!m27664f(rational)) {
            C0662u1.m40643k("ImageUtil", "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f = width;
        float f2 = height;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i2 = 0;
        if (rational.floatValue() > f / f2) {
            int round = Math.round((f / numerator) * denominator);
            i = (height - round) / 2;
            height = round;
        } else {
            int round2 = Math.round((f2 / denominator) * numerator);
            i2 = (width - round2) / 2;
            width = round2;
            i = 0;
        }
        return new Rect(i2, i, width + i2, height + i);
    }

    public static Rect m27668b(Rect rect, int i, Size size, int i2) {
        Matrix matrix = new Matrix();
        matrix.setRotate(i2 - i);
        float[] o = m27655o(size);
        matrix.mapPoints(o);
        matrix.postTranslate(-m27659k(o[0], o[2], o[4], o[6]), -m27659k(o[1], o[3], o[5], o[7]));
        matrix.invert(matrix);
        RectF rectF = new RectF();
        matrix.mapRect(rectF, new RectF(rect));
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    public static byte[] m27667c(byte[] bArr, Rect rect, int i) {
        try {
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false);
            Bitmap decodeRegion = newInstance.decodeRegion(rect, new BitmapFactory.Options());
            newInstance.recycle();
            if (decodeRegion != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (decodeRegion.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream)) {
                    decodeRegion.recycle();
                    return byteArrayOutputStream.toByteArray();
                }
                throw new C4440a("Encode bitmap failed.", C4440a.EnumC4441a.ENCODE_FAILED);
            }
            throw new C4440a("Decode byte array failed.", C4440a.EnumC4441a.DECODE_FAILED);
        } catch (IOException unused) {
            throw new C4440a("Decode byte array failed.", C4440a.EnumC4441a.DECODE_FAILED);
        } catch (IllegalArgumentException e) {
            throw new C4440a("Decode byte array failed with illegal argument." + e, C4440a.EnumC4441a.DECODE_FAILED);
        }
    }

    public static Rational m27666d(int i, Rational rational) {
        if (i == 90 || i == 270) {
            return m27665e(rational);
        }
        return new Rational(rational.getNumerator(), rational.getDenominator());
    }

    public static Rational m27665e(Rational rational) {
        return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
    }

    public static boolean m27664f(Rational rational) {
        return rational != null && rational.floatValue() > 0.0f && !rational.isNaN();
    }

    public static boolean m27663g(Size size, Rational rational) {
        return rational != null && rational.floatValue() > 0.0f && m27662h(size, rational) && !rational.isNaN();
    }

    public static boolean m27662h(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        float numerator = rational.getNumerator();
        float denominator = rational.getDenominator();
        return (height == Math.round((((float) width) / numerator) * denominator) && width == Math.round((((float) height) / denominator) * numerator)) ? false : true;
    }

    public static byte[] m27661i(AbstractC0610l1 l1Var) {
        if (l1Var.mo40756x0() == 256) {
            ByteBuffer a = l1Var.mo40758j()[0].mo40755a();
            byte[] bArr = new byte[a.capacity()];
            a.rewind();
            a.get(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + l1Var.mo40756x0());
    }

    public static byte[] m27660j(AbstractC0610l1 l1Var, Rect rect, int i) {
        if (l1Var.mo40756x0() == 256) {
            return m27667c(m27661i(l1Var), rect, i);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + l1Var.mo40756x0());
    }

    public static float m27659k(float f, float f2, float f3, float f4) {
        return Math.min(Math.min(f, f2), Math.min(f3, f4));
    }

    public static byte[] m27658l(byte[] bArr, int i, int i2, Rect rect, int i3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
        if (rect == null) {
            rect = new Rect(0, 0, i, i2);
        }
        if (yuvImage.compressToJpeg(rect, i3, byteArrayOutputStream)) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new C4440a("YuvImage failed to encode jpeg.", C4440a.EnumC4441a.ENCODE_FAILED);
    }

    public static boolean m27657m(int i, int i2, int i3, int i4) {
        return (i == i3 && i2 == i4) ? false : true;
    }

    public static boolean m27656n(AbstractC0610l1 l1Var) {
        return m27657m(l1Var.getWidth(), l1Var.getHeight(), l1Var.mo40738A().width(), l1Var.mo40738A().height());
    }

    public static float[] m27655o(Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    public static byte[] m27654p(AbstractC0610l1 l1Var, Rect rect, int i) {
        if (l1Var.mo40756x0() == 35) {
            return m27658l(m27653q(l1Var), l1Var.getWidth(), l1Var.getHeight(), rect, i);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + l1Var.mo40756x0());
    }

    public static byte[] m27653q(AbstractC0610l1 l1Var) {
        AbstractC0610l1.AbstractC0611a aVar = l1Var.mo40758j()[0];
        AbstractC0610l1.AbstractC0611a aVar2 = l1Var.mo40758j()[1];
        AbstractC0610l1.AbstractC0611a aVar3 = l1Var.mo40758j()[2];
        ByteBuffer a = aVar.mo40755a();
        ByteBuffer a2 = aVar2.mo40755a();
        ByteBuffer a3 = aVar3.mo40755a();
        a.rewind();
        a2.rewind();
        a3.rewind();
        int remaining = a.remaining();
        byte[] bArr = new byte[((l1Var.getWidth() * l1Var.getHeight()) / 2) + remaining];
        int i = 0;
        for (int i2 = 0; i2 < l1Var.getHeight(); i2++) {
            a.get(bArr, i, l1Var.getWidth());
            i += l1Var.getWidth();
            a.position(Math.min(remaining, (a.position() - l1Var.getWidth()) + aVar.mo40754b()));
        }
        int height = l1Var.getHeight() / 2;
        int width = l1Var.getWidth() / 2;
        int b = aVar3.mo40754b();
        int b2 = aVar2.mo40754b();
        int c = aVar3.mo40753c();
        int c2 = aVar2.mo40753c();
        byte[] bArr2 = new byte[b];
        byte[] bArr3 = new byte[b2];
        for (int i3 = 0; i3 < height; i3++) {
            a3.get(bArr2, 0, Math.min(b, a3.remaining()));
            a2.get(bArr3, 0, Math.min(b2, a2.remaining()));
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < width; i6++) {
                int i7 = i + 1;
                bArr[i] = bArr2[i4];
                i = i7 + 1;
                bArr[i7] = bArr3[i5];
                i4 += c;
                i5 += c2;
            }
        }
        return bArr;
    }
}
