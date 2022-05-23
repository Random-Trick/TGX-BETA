package id;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.os.Build;
import ce.a0;
import ce.j0;
import gd.b0;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Locale;
import oc.v0;
import org.thunderdog.challegram.Log;

public class g {
    public final String f14205a;
    public final Bitmap[][] f14206b = (Bitmap[][]) Array.newInstance(Bitmap.class, 5, 4);
    public final boolean[][] f14207c = (boolean[][]) Array.newInstance(boolean.class, 5, 4);
    public boolean f14208d;
    public final float f14209e;

    public class a implements ImageDecoder.OnHeaderDecodedListener {
        public final int f14210a;

        public a(int i10) {
            this.f14210a = i10;
        }

        @Override
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            int i10 = this.f14210a;
            if (i10 != 1) {
                imageDecoder.setTargetSampleSize(i10);
            }
            imageDecoder.setAllocator(1);
        }
    }

    public g(String str) {
        this.f14205a = str;
        str.hashCode();
        if (str.equals("twitter")) {
            this.f14209e = 2.0f;
        } else if (!str.equals("openmoji")) {
            this.f14209e = 0.0f;
        } else {
            this.f14209e = -2.0f;
        }
    }

    public static int c() {
        return a0.h() <= 1.0f ? 2 : 1;
    }

    public void g(Bitmap bitmap, int i10, int i11) {
        if (!this.f14208d) {
            this.f14206b[i10][i11] = bitmap;
        } else if (bitmap != null) {
            bitmap.recycle();
        }
        j0.j(false);
    }

    public static Bitmap h(String str, boolean z10) {
        ImageDecoder.Source source;
        int c10 = c();
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                if (z10) {
                    source = ImageDecoder.createSource(j0.n().getAssets(), str);
                } else {
                    source = ImageDecoder.createSource(new File(str));
                }
                return ImageDecoder.decodeBitmap(source, new a(c10));
            } catch (Throwable th) {
                Log.e("Cannot load emoji bitmap (Pie)", th, new Object[0]);
            }
        } else {
            try {
                InputStream open = z10 ? j0.n().getAssets().open(str) : v0.o2(str);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = false;
                options.inSampleSize = c10;
                Bitmap decodeStream = BitmapFactory.decodeStream(open, null, options);
                if (open != null) {
                    open.close();
                }
                return decodeStream;
            } catch (Throwable th2) {
                Log.e("Cannot load emoji bitmap", th2, new Object[0]);
            }
        }
        return null;
    }

    public Bitmap d(int i10, int i11) {
        if (e(i10, i11)) {
            return this.f14206b[i10][i11];
        }
        return null;
    }

    public final boolean e(final int i10, final int i11) {
        if (this.f14208d) {
            return false;
        }
        if (v0.A1(this.f14206b[i10][i11])) {
            return true;
        }
        boolean[][] zArr = this.f14207c;
        if (!zArr[i10][i11]) {
            zArr[i10][i11] = true;
            b0.k().q(new Runnable() {
                @Override
                public final void run() {
                    g.this.f(i10, i11);
                }
            });
        }
        return false;
    }

    public final void f(final int i10, final int i11) {
        Locale locale = Locale.US;
        String format = String.format(locale, "%d_%d.png", Integer.valueOf(i10), Integer.valueOf(i11));
        final Bitmap h10 = !"apple".equals(this.f14205a) ? h(new File(new File(d.s(), this.f14205a), format).getPath(), false) : null;
        if (h10 == null) {
            h10 = h(String.format(locale, "emoji/v%d_%s", 17, format), true);
        }
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                g.this.g(h10, i10, i11);
            }
        });
    }

    public void j() {
        Bitmap[][] bitmapArr;
        if (!this.f14208d) {
            this.f14208d = true;
            for (Bitmap[] bitmapArr2 : this.f14206b) {
                int i10 = 0;
                for (Bitmap bitmap : bitmapArr2) {
                    v0.u2(bitmap);
                    bitmapArr2[i10] = null;
                    i10++;
                }
            }
        }
    }
}
