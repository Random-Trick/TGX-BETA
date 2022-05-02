package p110hd;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.os.Build;
import be.C1357a0;
import be.C1379j0;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Locale;
import nc.C7389v0;
import org.thunderdog.challegram.Log;
import p082fd.C4356b0;

public class C5085g {
    public final String f17113a;
    public final Bitmap[][] f17114b = (Bitmap[][]) Array.newInstance(Bitmap.class, 5, 4);
    public final boolean[][] f17115c = (boolean[][]) Array.newInstance(boolean.class, 5, 4);
    public boolean f17116d;
    public final float f17117e;

    public class C5086a implements ImageDecoder.OnHeaderDecodedListener {
        public final int f17118a;

        public C5086a(int i) {
            this.f17118a = i;
        }

        @Override
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            int i = this.f17118a;
            if (i != 1) {
                imageDecoder.setTargetSampleSize(i);
            }
            imageDecoder.setAllocator(1);
        }
    }

    public C5085g(String str) {
        this.f17113a = str;
        str.hashCode();
        if (str.equals("twitter")) {
            this.f17117e = 2.0f;
        } else if (!str.equals("openmoji")) {
            this.f17117e = 0.0f;
        } else {
            this.f17117e = -2.0f;
        }
    }

    public static int m23979c() {
        return C1357a0.m37545h() <= 1.0f ? 2 : 1;
    }

    public void m23975g(Bitmap bitmap, int i, int i2) {
        if (!this.f17116d) {
            this.f17114b[i][i2] = bitmap;
        } else if (bitmap != null) {
            bitmap.recycle();
        }
        C1379j0.m37326j(false);
    }

    public static Bitmap m23974h(String str, boolean z) {
        ImageDecoder.Source source;
        int c = m23979c();
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                if (z) {
                    source = ImageDecoder.createSource(C1379j0.m37318n().getAssets(), str);
                } else {
                    source = ImageDecoder.createSource(new File(str));
                }
                return ImageDecoder.decodeBitmap(source, new C5086a(c));
            } catch (Throwable th) {
                Log.m14725e("Cannot load emoji bitmap (Pie)", th, new Object[0]);
            }
        } else {
            try {
                InputStream open = z ? C1379j0.m37318n().getAssets().open(str) : C7389v0.m16599o2(str);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = false;
                options.inSampleSize = c;
                Bitmap decodeStream = BitmapFactory.decodeStream(open, null, options);
                if (open != null) {
                    open.close();
                }
                return decodeStream;
            } catch (Throwable th2) {
                Log.m14725e("Cannot load emoji bitmap", th2, new Object[0]);
            }
        }
        return null;
    }

    public Bitmap m23978d(int i, int i2) {
        if (m23977e(i, i2)) {
            return this.f17114b[i][i2];
        }
        return null;
    }

    public final boolean m23977e(final int i, final int i2) {
        if (this.f17116d) {
            return false;
        }
        if (C7389v0.m16756A1(this.f17114b[i][i2])) {
            return true;
        }
        boolean[][] zArr = this.f17115c;
        if (!zArr[i][i2]) {
            zArr[i][i2] = true;
            C4356b0.m28203k().m28197q(new Runnable() {
                @Override
                public final void run() {
                    C5085g.this.m23976f(i, i2);
                }
            });
        }
        return false;
    }

    public final void m23976f(final int i, final int i2) {
        Locale locale = Locale.US;
        String format = String.format(locale, "%d_%d.png", Integer.valueOf(i), Integer.valueOf(i2));
        final Bitmap h = !"apple".equals(this.f17113a) ? m23974h(new File(new File(C5078d.m23994s(), this.f17113a), format).getPath(), false) : null;
        if (h == null) {
            h = m23974h(String.format(locale, "emoji/v%d_%s", 16, format), true);
        }
        C1379j0.m37337d0(new Runnable() {
            @Override
            public final void run() {
                C5085g.this.m23975g(h, i, i2);
            }
        });
    }

    public void m23972j() {
        Bitmap[][] bitmapArr;
        if (!this.f17116d) {
            this.f17116d = true;
            for (Bitmap[] bitmapArr2 : this.f17114b) {
                int i = 0;
                for (Bitmap bitmap : bitmapArr2) {
                    C7389v0.m16575u2(bitmap);
                    bitmapArr2[i] = null;
                    i++;
                }
            }
        }
    }
}
