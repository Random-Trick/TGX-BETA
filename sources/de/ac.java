package de;

import ae.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.view.ViewGroup;
import ce.a0;
import ce.j0;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import de.ac;
import de.yb;
import h6.c;
import h6.e;
import he.i;
import j6.b;
import j6.d;
import ld.g;
import ld.h;
import ld.x;
import ld.y;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.loader.ImageLoader;
import zd.hj;
import zd.o6;

public class ac extends yb<MapView, a> implements e, c.f, c.d, c.e {
    public c L0;
    public j6.c M0;

    public static class a implements x, kb.c {
        public Canvas M;
        public Bitmap N;
        public Drawable O;
        public h Q;
        public final o6 f7456a;
        public d f7457b;
        public final y f7458c = new y(this);
        public boolean P = true;

        public a(o6 o6Var, c cVar, yb.g<a> gVar) {
            this.f7456a = o6Var;
            d a10 = cVar.a(h(gVar));
            this.f7457b = a10;
            a10.f(gVar);
        }

        public static void b(Canvas canvas, Bitmap bitmap) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            Matrix matrix = new Matrix();
            float i10 = a0.i(52.0f) / bitmap.getWidth();
            matrix.postTranslate(a0.i(5.0f), a0.i(5.0f));
            matrix.postScale(i10, i10);
            Paint paint = new Paint(1);
            paint.setShader(bitmapShader);
            bitmapShader.setLocalMatrix(matrix);
            RectF a02 = ce.y.a0();
            a02.set(a0.i(5.0f), a0.i(5.0f), a0.i(57.0f), a0.i(57.0f));
            canvas.drawRoundRect(a02, a0.i(26.0f), a0.i(26.0f), paint);
        }

        public void e(h hVar) {
            if (d(hVar)) {
                this.f7457b.d(b.a(this.N));
            }
        }

        @Override
        public void Q2() {
            j(null);
        }

        public final void c(a aVar, Canvas canvas, int i10, je.e eVar, TdApi.File file) {
            h hVar;
            int i11 = a0.i(62.0f) / 2;
            int i12 = a0.i(62.0f) / 2;
            int i13 = a0.i(26.0f);
            if (file != null) {
                hVar = new h(this.f7456a, file);
                hVar.v0(true);
                hVar.t0(wc.a.getDefaultAvatarCacheSize());
                synchronized (g.i()) {
                    Bitmap e10 = g.k().e(hVar);
                    if (v0.A1(e10)) {
                        b(canvas, e10);
                        return;
                    }
                }
            } else {
                hVar = null;
            }
            float f10 = i11;
            canvas.drawCircle(f10, i12, i13, ce.y.g(j.L(i10)));
            canvas.drawText(eVar.f15363a, f10 - (ce.y.v0(eVar, 19.0f) / 2.0f), i12 + a0.i(6.5f), ce.y.F0(19.0f, eVar.f15364b, false));
            aVar.j(hVar);
        }

        public final boolean d(h hVar) {
            h hVar2 = this.Q;
            return hVar2 != null && hVar2.s() == hVar.s() && this.Q.a() == hVar.a();
        }

        @Override
        public void d0(final h hVar, boolean z10, Bitmap bitmap) {
            if (z10 && d(hVar) && this.M != null && v0.A1(bitmap)) {
                b(this.M, bitmap);
                j0.d0(new Runnable() {
                    @Override
                    public final void run() {
                        ac.a.this.e(hVar);
                    }
                });
            }
        }

        public final Bitmap f(a aVar, int i10, je.e eVar, TdApi.File file) {
            Bitmap bitmap;
            Throwable th;
            boolean z10 = false;
            try {
                if (this.O == null) {
                    Drawable drawable = j0.B().getDrawable(R.drawable.bg_livepin);
                    this.O = drawable;
                    drawable.setBounds(0, 0, a0.i(62.0f), a0.i(76.0f));
                }
                bitmap = Bitmap.createBitmap(a0.i(62.0f), a0.i(76.0f), Bitmap.Config.ARGB_8888);
                try {
                    bitmap.eraseColor(0);
                    Canvas canvas = new Canvas(bitmap);
                    this.O.draw(canvas);
                    aVar.M = canvas;
                    aVar.N = bitmap;
                    c(aVar, canvas, i10, eVar, file);
                    z10 = true;
                } catch (Throwable th2) {
                    th = th2;
                    Log.w(th);
                    if (!z10) {
                    }
                    return bitmap;
                }
            } catch (Throwable th3) {
                th = th3;
                bitmap = null;
            }
            if (!z10 || bitmap == null) {
                return bitmap;
            }
            try {
                bitmap.recycle();
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        public final Bitmap g(a aVar, TdApi.Message message) {
            je.e eVar;
            int i10;
            TdApi.ProfilePhoto profilePhoto;
            TdApi.ChatPhotoInfo chatPhotoInfo;
            int constructor = message.senderId.getConstructor();
            TdApi.File file = null;
            if (constructor == -336109341) {
                TdApi.User u22 = this.f7456a.e2().u2(((TdApi.MessageSenderUser) message.senderId).userId);
                i10 = this.f7456a.e2().x2(u22);
                eVar = this.f7456a.e2().I2(u22);
                if (!(u22 == null || (profilePhoto = u22.profilePhoto) == null)) {
                    file = profilePhoto.small;
                }
            } else if (constructor == -239660751) {
                TdApi.Chat W2 = this.f7456a.W2(((TdApi.MessageSenderChat) message.senderId).chatId);
                i10 = this.f7456a.f3(W2);
                eVar = this.f7456a.n3(W2);
                if (!(W2 == null || (chatPhotoInfo = W2.photo) == null)) {
                    file = chatPhotoInfo.small;
                }
            } else {
                throw new IllegalArgumentException(message.senderId.toString());
            }
            return f(aVar, i10, eVar, file);
        }

        public final j6.e h(yb.g<a> gVar) {
            TdApi.ProfilePhoto profilePhoto;
            LatLng latLng = new LatLng(gVar.f10196a, gVar.f10197b);
            j6.e eVar = new j6.e();
            eVar.r(latLng);
            Bitmap bitmap = null;
            r2 = null;
            TdApi.File file = null;
            bitmap = null;
            if (gVar.f10204i) {
                TdApi.User da2 = this.f7456a.da();
                int x22 = this.f7456a.e2().x2(da2);
                je.e I2 = this.f7456a.e2().I2(da2);
                if (!(da2 == null || (profilePhoto = da2.profilePhoto) == null)) {
                    file = profilePhoto.small;
                }
                bitmap = f(this, x22, I2, file);
            } else if (gVar.f10203h && gVar.f10201f != null) {
                float f10 = 1.0f;
                eVar.s(1.0f);
                boolean z10 = ((TdApi.MessageLocation) gVar.f10201f.content).expiresIn > 0;
                this.P = z10;
                if (!z10) {
                    f10 = 0.6f;
                }
                eVar.b(f10);
                bitmap = g(this, gVar.f10201f);
            }
            if (bitmap != null) {
                eVar.n(b.a(bitmap));
                eVar.c(0.5f, 0.907f);
            }
            return eVar;
        }

        public void i() {
            this.f7457b.b();
        }

        public void j(h hVar) {
            h hVar2 = this.Q;
            if (hVar2 != null || hVar != null) {
                if (hVar2 == null || hVar == null || hVar2.a() != hVar.a() || this.Q.s() != hVar.s()) {
                    if (this.Q != null) {
                        ImageLoader.e().k(this.f7458c);
                    }
                    this.Q = hVar;
                    if (hVar != null) {
                        ImageLoader.e().l(hVar, this.f7458c);
                    }
                }
            }
        }

        public void k(boolean z10) {
            if (this.P != z10) {
                this.P = z10;
                this.f7457b.c(z10 ? 1.0f : 0.6f);
            }
        }

        public void l(yb.g<a> gVar) {
            this.f7457b.e(new LatLng(gVar.f10196a, gVar.f10197b));
            TdApi.Message message = gVar.f10201f;
            k(message == null || ((TdApi.MessageLocation) message.content).expiresIn > 0);
        }

        @Override
        public void n5(h hVar, float f10) {
        }
    }

    public ac(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public static double Pg(double d10) {
        return Math.toDegrees(d10 / 6366198.0d);
    }

    public static double Qg(double d10, double d11) {
        return Math.toDegrees(d10 / (Math.cos(Math.toRadians(d11)) * 6366198.0d));
    }

    public static LatLng Rg(LatLng latLng, double d10, double d11) {
        double Qg = Qg(d11, latLng.f5698a);
        return new LatLng(latLng.f5698a + Pg(d10), latLng.f5699b + Qg);
    }

    @Override
    public int[] Ef() {
        return new int[]{0, 1, 2, 3};
    }

    @Override
    public boolean Ig(int i10) {
        return (i10 == 2 || i10 == 4) ? false : true;
    }

    public final h6.a Jg(com.google.android.gms.maps.MapView r7, de.yb.g<de.ac.a> r8, boolean r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: de.ac.Jg(com.google.android.gms.maps.MapView, de.yb$g, boolean, boolean):h6.a");
    }

    @Override
    public void K3(int i10) {
        if (i10 == 1) {
            pg();
        }
    }

    public MapView zf(Context context, int i10) {
        MapView mapView = new MapView(context);
        mapView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        mapView.setPadding(0, 0, 0, i10);
        return mapView;
    }

    public void Bf(MapView mapView) {
        try {
            mapView.d();
        } catch (Throwable unused) {
        }
        try {
            mapView.c();
        } catch (Throwable unused2) {
        }
    }

    public boolean Df(MapView mapView) {
        c cVar = this.L0;
        if (cVar == null) {
            return false;
        }
        try {
            cVar.j(true);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final j6.c Ng() {
        if (this.M0 == null) {
            this.M0 = j6.c.b(this.f24493a, R.raw.maps_night);
        }
        return this.M0;
    }

    public void Kf(MapView mapView, boolean z10) {
        try {
            mapView.b(null);
            if (!z10) {
                mapView.a(this);
            }
        } catch (Throwable unused) {
        }
    }

    public boolean ag(MapView mapView) {
        return true;
    }

    public boolean fg(MapView mapView, double d10, double d11) {
        return false;
    }

    public void gg(MapView mapView) {
    }

    public boolean ng(MapView mapView, yb.g<a> gVar, boolean z10, boolean z11, boolean z12) {
        if (this.L0 == null) {
            return false;
        }
        h6.a Jg = Jg(mapView, gVar, z11, z12);
        if (z10) {
            this.L0.b(Jg);
            return true;
        }
        this.L0.g(Jg);
        return false;
    }

    public boolean og(MapView mapView) {
        return false;
    }

    public void qg(MapView mapView) {
        try {
            mapView.d();
        } catch (Throwable unused) {
        }
    }

    public void vg(MapView mapView) {
        try {
            mapView.e();
        } catch (Throwable unused) {
        }
    }

    @Override
    public void Z4(Location location) {
        i.c2().Z3(location.getLatitude(), location.getLongitude(), location.getAccuracy());
        Dg(location);
    }

    @Override
    public void c4(h6.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: de.ac.c4(h6.c):void");
    }

    @Override
    public void eg(int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: de.ac.eg(int, int):void");
    }

    @Override
    public void ig(yb.g<a> gVar, boolean z10) {
        a aVar = gVar.f10207l;
        if (aVar != null) {
            aVar.k(z10);
        }
    }

    @Override
    public void jg(yb.g<a> gVar, int i10) {
        c cVar = this.L0;
        if (cVar != null) {
            a aVar = gVar.f10207l;
            if (aVar != null) {
                aVar.l(gVar);
            } else {
                gVar.f10207l = new a(this.f24495b, cVar, gVar);
            }
        }
    }

    @Override
    public void kg(yb.g<a> gVar, int i10) {
        a aVar = gVar.f10207l;
        if (aVar != null) {
            aVar.l(gVar);
        }
    }

    @Override
    public void lg(yb.g<a> gVar, boolean z10) {
        a aVar = gVar.f10207l;
        if (aVar != null) {
            aVar.f7457b.g(z10 ? 10.0f : (!gVar.f10203h || gVar.f10201f == null) ? 0.0f : 1.0f);
        }
    }

    @Override
    public void mg(yb.g<a> gVar, int i10) {
        a aVar = gVar.f10207l;
        if (aVar != null) {
            aVar.i();
            gVar.f10207l = null;
        }
    }

    @Override
    public boolean t0(d dVar) {
        long j10;
        long j11;
        yb.g gVar = (yb.g) dVar.a();
        if (gVar == null) {
            return true;
        }
        TdApi.Message message = gVar.f10201f;
        if (message != null) {
            j11 = message.chatId;
            j10 = message.f19946id;
        } else if (gVar.f10204i) {
            j11 = x9().f10194k;
            TdApi.Message f02 = this.f24495b.e2().f0(j11);
            j10 = f02 != null ? f02.f19946id : 0L;
        } else {
            j11 = 0;
            j10 = 0;
        }
        if (j11 == 0 || j10 == 0) {
            return true;
        }
        this.f24495b.hd().h7(this, j11, new hj.j().e(new ob.d(j11, j10)).c());
        return true;
    }
}
