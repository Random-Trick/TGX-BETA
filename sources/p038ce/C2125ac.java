package p038ce;

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
import be.C1357a0;
import be.C1379j0;
import be.C1410y;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import ge.C4868i;
import ie.C5386e;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.loader.ImageLoader;
import p038ce.AbstractView$OnClickListenerC3344yb;
import p038ce.C2125ac;
import p091g6.AbstractC4489e;
import p091g6.C4479a;
import p091g6.C4481c;
import p119i6.C5241b;
import p119i6.C5242c;
import p119i6.C5243d;
import p119i6.C5244e;
import p139jb.AbstractC5911c;
import p156kd.AbstractC6266x;
import p156kd.C6244g;
import p156kd.C6246h;
import p156kd.C6267y;
import p193nb.C7319d;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import p364zd.C11524j;
import vc.C9903a;

public class C2125ac extends AbstractView$OnClickListenerC3344yb<MapView, C2126a> implements AbstractC4489e, C4481c.AbstractC4487f, C4481c.AbstractC4485d, C4481c.AbstractC4486e {
    public C4481c f7500L0;
    public C5242c f7501M0;

    public static class C2126a implements AbstractC6266x, AbstractC5911c {
        public Canvas f7502M;
        public Bitmap f7503N;
        public Drawable f7504O;
        public C6246h f7506Q;
        public final C10930q6 f7507a;
        public C5243d f7508b;
        public final C6267y f7509c = new C6267y(this);
        public boolean f7505P = true;

        public C2126a(C10930q6 q6Var, C4481c cVar, AbstractView$OnClickListenerC3344yb.C3352g<C2126a> gVar) {
            this.f7507a = q6Var;
            C5243d a = cVar.m27535a(m35492h(gVar));
            this.f7508b = a;
            a.m23547f(gVar);
        }

        public static void m35498b(Canvas canvas, Bitmap bitmap) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            Matrix matrix = new Matrix();
            float i = C1357a0.m37541i(52.0f) / bitmap.getWidth();
            matrix.postTranslate(C1357a0.m37541i(5.0f), C1357a0.m37541i(5.0f));
            matrix.postScale(i, i);
            Paint paint = new Paint(1);
            paint.setShader(bitmapShader);
            bitmapShader.setLocalMatrix(matrix);
            RectF a0 = C1410y.m37050a0();
            a0.set(C1357a0.m37541i(5.0f), C1357a0.m37541i(5.0f), C1357a0.m37541i(57.0f), C1357a0.m37541i(57.0f));
            canvas.drawRoundRect(a0, C1357a0.m37541i(26.0f), C1357a0.m37541i(26.0f), paint);
        }

        public void m35495e(C6246h hVar) {
            if (m35496d(hVar)) {
                this.f7508b.m23549d(C5241b.m23556a(this.f7503N));
            }
        }

        @Override
        public void mo4501a3() {
            m35490j(null);
        }

        public final void m35497c(C2126a aVar, Canvas canvas, int i, C5386e eVar, TdApi.File file) {
            C6246h hVar;
            int i2 = C1357a0.m37541i(62.0f) / 2;
            int i3 = C1357a0.m37541i(62.0f) / 2;
            int i4 = C1357a0.m37541i(26.0f);
            if (file != null) {
                hVar = new C6246h(this.f7507a, file);
                hVar.m20892v0(true);
                hVar.mo20767t0(C9903a.getDefaultAvatarCacheSize());
                synchronized (C6244g.m20962i()) {
                    Bitmap e = C6244g.m20960k().m20966e(hVar);
                    if (C7389v0.m16756A1(e)) {
                        m35498b(canvas, e);
                        return;
                    }
                }
            } else {
                hVar = null;
            }
            float f = i2;
            canvas.drawCircle(f, i3, i4, C1410y.m37039g(C11524j.m228N(i)));
            canvas.drawText(eVar.f17711a, f - (C1410y.m37008v0(eVar, 19.0f) / 2.0f), i3 + C1357a0.m37541i(6.5f), C1410y.m37071G0(19.0f, eVar.f17712b, false));
            aVar.m35490j(hVar);
        }

        public final boolean m35496d(C6246h hVar) {
            C6246h hVar2 = this.f7506Q;
            return hVar2 != null && hVar2.mo20825s() == hVar.mo20825s() && this.f7506Q.m20929a() == hVar.m20929a();
        }

        public final Bitmap m35494f(C2126a aVar, int i, C5386e eVar, TdApi.File file) {
            Bitmap bitmap;
            Throwable th;
            boolean z = false;
            try {
                if (this.f7504O == null) {
                    Drawable drawable = C1379j0.m37372B().getDrawable(R.drawable.bg_livepin);
                    this.f7504O = drawable;
                    drawable.setBounds(0, 0, C1357a0.m37541i(62.0f), C1357a0.m37541i(76.0f));
                }
                bitmap = Bitmap.createBitmap(C1357a0.m37541i(62.0f), C1357a0.m37541i(76.0f), Bitmap.Config.ARGB_8888);
                try {
                    bitmap.eraseColor(0);
                    Canvas canvas = new Canvas(bitmap);
                    this.f7504O.draw(canvas);
                    aVar.f7502M = canvas;
                    aVar.f7503N = bitmap;
                    m35497c(aVar, canvas, i, eVar, file);
                    z = true;
                } catch (Throwable th2) {
                    th = th2;
                    Log.m14708w(th);
                    if (!z) {
                    }
                    return bitmap;
                }
            } catch (Throwable th3) {
                th = th3;
                bitmap = null;
            }
            if (!z || bitmap == null) {
                return bitmap;
            }
            try {
                bitmap.recycle();
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        public final Bitmap m35493g(C2126a aVar, TdApi.Message message) {
            C5386e eVar;
            int i;
            TdApi.ProfilePhoto profilePhoto;
            TdApi.ChatPhotoInfo chatPhotoInfo;
            int constructor = message.senderId.getConstructor();
            TdApi.File file = null;
            if (constructor == -336109341) {
                TdApi.User v2 = this.f7507a.m2480e2().m1583v2(((TdApi.MessageSenderUser) message.senderId).userId);
                i = this.f7507a.m2480e2().m1571y2(v2);
                eVar = this.f7507a.m2480e2().m1725J2(v2);
                if (!(v2 == null || (profilePhoto = v2.profilePhoto) == null)) {
                    file = profilePhoto.small;
                }
            } else if (constructor == -239660751) {
                TdApi.Chat U2 = this.f7507a.m2632U2(((TdApi.MessageSenderChat) message.senderId).chatId);
                i = this.f7507a.m2495d3(U2);
                eVar = this.f7507a.m2383k3(U2);
                if (!(U2 == null || (chatPhotoInfo = U2.photo) == null)) {
                    file = chatPhotoInfo.small;
                }
            } else {
                throw new IllegalArgumentException(message.senderId.toString());
            }
            return m35494f(aVar, i, eVar, file);
        }

        public final C5244e m35492h(AbstractView$OnClickListenerC3344yb.C3352g<C2126a> gVar) {
            TdApi.ProfilePhoto profilePhoto;
            LatLng latLng = new LatLng(gVar.f11162a, gVar.f11163b);
            C5244e eVar = new C5244e();
            eVar.m23529r(latLng);
            Bitmap bitmap = null;
            r2 = null;
            TdApi.File file = null;
            bitmap = null;
            if (gVar.f11170i) {
                TdApi.User Z9 = this.f7507a.m2550Z9();
                int y2 = this.f7507a.m2480e2().m1571y2(Z9);
                C5386e J2 = this.f7507a.m2480e2().m1725J2(Z9);
                if (!(Z9 == null || (profilePhoto = Z9.profilePhoto) == null)) {
                    file = profilePhoto.small;
                }
                bitmap = m35494f(this, y2, J2, file);
            } else if (gVar.f11169h && gVar.f11167f != null) {
                float f = 1.0f;
                eVar.m23528s(1.0f);
                boolean z = ((TdApi.MessageLocation) gVar.f11167f.content).expiresIn > 0;
                this.f7505P = z;
                if (!z) {
                    f = 0.6f;
                }
                eVar.m23545b(f);
                bitmap = m35493g(this, gVar.f11167f);
            }
            if (bitmap != null) {
                eVar.m23533n(C5241b.m23556a(bitmap));
                eVar.m23544c(0.5f, 0.907f);
            }
            return eVar;
        }

        public void m35491i() {
            this.f7508b.m23551b();
        }

        public void m35490j(C6246h hVar) {
            C6246h hVar2 = this.f7506Q;
            if (hVar2 != null || hVar != null) {
                if (hVar2 == null || hVar == null || hVar2.m20929a() != hVar.m20929a() || this.f7506Q.mo20825s() != hVar.mo20825s()) {
                    if (this.f7506Q != null) {
                        ImageLoader.m14392e().m14386k(this.f7509c);
                    }
                    this.f7506Q = hVar;
                    if (hVar != null) {
                        ImageLoader.m14392e().m14385l(hVar, this.f7509c);
                    }
                }
            }
        }

        public void m35489k(boolean z) {
            if (this.f7505P != z) {
                this.f7505P = z;
                this.f7508b.m23550c(z ? 1.0f : 0.6f);
            }
        }

        @Override
        public void mo14384k0(final C6246h hVar, boolean z, Bitmap bitmap) {
            if (z && m35496d(hVar) && this.f7502M != null && C7389v0.m16756A1(bitmap)) {
                m35498b(this.f7502M, bitmap);
                C1379j0.m37334d0(new Runnable() {
                    @Override
                    public final void run() {
                        C2125ac.C2126a.this.m35495e(hVar);
                    }
                });
            }
        }

        public void m35488l(AbstractView$OnClickListenerC3344yb.C3352g<C2126a> gVar) {
            this.f7508b.m23548e(new LatLng(gVar.f11162a, gVar.f11163b));
            TdApi.Message message = gVar.f11167f;
            m35489k(message == null || ((TdApi.MessageLocation) message.content).expiresIn > 0);
        }

        @Override
        public void mo14383q5(C6246h hVar, float f) {
        }
    }

    public C2125ac(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public static double m35509Pg(double d) {
        return Math.toDegrees(d / 6366198.0d);
    }

    public static double m35508Qg(double d, double d2) {
        return Math.toDegrees(d / (Math.cos(Math.toRadians(d2)) * 6366198.0d));
    }

    public static LatLng m35507Rg(LatLng latLng, double d, double d2) {
        double Qg = m35508Qg(d2, latLng.f11674a);
        return new LatLng(latLng.f11674a + m35509Pg(d), latLng.f11675b + Qg);
    }

    @Override
    public int[] mo30797Ef() {
        return new int[]{0, 1, 2, 3};
    }

    @Override
    public boolean mo30788Ig(int i) {
        return (i == 2 || i == 4) ? false : true;
    }

    public final p091g6.C4479a m35515Jg(com.google.android.gms.maps.MapView r7, p038ce.AbstractView$OnClickListenerC3344yb.C3352g<p038ce.C2125ac.C2126a> r8, boolean r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.C2125ac.m35515Jg(com.google.android.gms.maps.MapView, ce.yb$g, boolean, boolean):g6.a");
    }

    public MapView mo30709zf(Context context, int i) {
        MapView mapView = new MapView(context);
        mapView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        mapView.setPadding(0, 0, 0, i);
        return mapView;
    }

    public void mo30803Bf(MapView mapView) {
        try {
            mapView.m30315d();
        } catch (Throwable unused) {
        }
        try {
            mapView.m30316c();
        } catch (Throwable unused2) {
        }
    }

    public boolean mo30799Df(MapView mapView) {
        C4481c cVar = this.f7500L0;
        if (cVar == null) {
            return false;
        }
        try {
            cVar.m27526j(true);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final C5242c m35511Ng() {
        if (this.f7501M0 == null) {
            this.f7501M0 = C5242c.m23553b(this.f30165a, R.raw.maps_night);
        }
        return this.f7501M0;
    }

    public void mo30786Kf(MapView mapView, boolean z) {
        try {
            mapView.m30317b(null);
            if (!z) {
                mapView.m30318a(this);
            }
        } catch (Throwable unused) {
        }
    }

    @Override
    public void mo11384S2(p091g6.C4481c r7) {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.C2125ac.mo11384S2(g6.c):void");
    }

    @Override
    public void mo11383S3(int i) {
        if (i == 1) {
            m30728pg();
        }
    }

    public boolean mo30758ag(MapView mapView) {
        return true;
    }

    @Override
    public boolean mo27519T2(C5243d dVar) {
        long j;
        long j2;
        AbstractView$OnClickListenerC3344yb.C3352g gVar = (AbstractView$OnClickListenerC3344yb.C3352g) dVar.m23552a();
        if (gVar == null) {
            return true;
        }
        TdApi.Message message = gVar.f11167f;
        if (message != null) {
            j2 = message.chatId;
            j = message.f25406id;
        } else if (gVar.f11170i) {
            j2 = m9131x9().f11160k;
            TdApi.Message f0 = this.f30167b.m2480e2().m1648f0(j2);
            j = f0 != null ? f0.f25406id : 0L;
        } else {
            j2 = 0;
            j = 0;
        }
        if (j2 == 0 || j == 0) {
            return true;
        }
        this.f30167b.m2485dd().m3569h7(this, j2, new HandlerC10770jj.C10780j().m3371e(new C7319d(j2, j)).m3373c());
        return true;
    }

    public boolean mo30748fg(MapView mapView, double d, double d2) {
        return false;
    }

    public void mo30746gg(MapView mapView) {
    }

    public boolean mo30732ng(MapView mapView, AbstractView$OnClickListenerC3344yb.C3352g<C2126a> gVar, boolean z, boolean z2, boolean z3) {
        if (this.f7500L0 == null) {
            return false;
        }
        C4479a Jg = m35515Jg(mapView, gVar, z2, z3);
        if (z) {
            this.f7500L0.m27534b(Jg);
            return true;
        }
        this.f7500L0.m27529g(Jg);
        return false;
    }

    public boolean mo30730og(MapView mapView) {
        return false;
    }

    public void mo30726qg(MapView mapView) {
        try {
            mapView.m30315d();
        } catch (Throwable unused) {
        }
    }

    public void mo30716vg(MapView mapView) {
        try {
            mapView.m30314e();
        } catch (Throwable unused) {
        }
    }

    @Override
    public void mo11366e5(Location location) {
        C4868i.m24726c2().m24748Z3(location.getLatitude(), location.getLongitude(), location.getAccuracy());
        m30798Dg(location);
    }

    @Override
    public void mo30750eg(int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.C2125ac.mo30750eg(int, int):void");
    }

    @Override
    public void mo30742ig(AbstractView$OnClickListenerC3344yb.C3352g<C2126a> gVar, boolean z) {
        C2126a aVar = gVar.f11173l;
        if (aVar != null) {
            aVar.m35489k(z);
        }
    }

    @Override
    public void mo30740jg(AbstractView$OnClickListenerC3344yb.C3352g<C2126a> gVar, int i) {
        C4481c cVar = this.f7500L0;
        if (cVar != null) {
            C2126a aVar = gVar.f11173l;
            if (aVar != null) {
                aVar.m35488l(gVar);
            } else {
                gVar.f11173l = new C2126a(this.f30167b, cVar, gVar);
            }
        }
    }

    @Override
    public void mo30738kg(AbstractView$OnClickListenerC3344yb.C3352g<C2126a> gVar, int i) {
        C2126a aVar = gVar.f11173l;
        if (aVar != null) {
            aVar.m35488l(gVar);
        }
    }

    @Override
    public void mo30736lg(AbstractView$OnClickListenerC3344yb.C3352g<C2126a> gVar, boolean z) {
        C2126a aVar = gVar.f11173l;
        if (aVar != null) {
            aVar.f7508b.m23546g(z ? 10.0f : (!gVar.f11169h || gVar.f11167f == null) ? 0.0f : 1.0f);
        }
    }

    @Override
    public void mo30734mg(AbstractView$OnClickListenerC3344yb.C3352g<C2126a> gVar, int i) {
        C2126a aVar = gVar.f11173l;
        if (aVar != null) {
            aVar.m35491i();
            gVar.f11173l = null;
        }
    }
}
