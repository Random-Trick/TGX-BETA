package s;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import androidx.camera.core.l3;
import androidx.camera.core.t;
import androidx.camera.core.t1;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.l;
import androidx.lifecycle.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import s.j0;
import t.m0;
import t.z;
import y.a0;
import y.g;
import y.h;
import y.x1;
import z.b;

public final class j0 implements a0 {
    public final String f22117a;
    public final z f22118b;
    public t f22121e;
    public final x1 f22126j;
    public final g f22127k;
    public final m0 f22128l;
    public final Object f22120d = new Object();
    public a<Integer> f22122f = null;
    public a<l3> f22123g = null;
    public List<Pair<h, Executor>> f22125i = null;
    public final x.h f22119c = new x.h(this);
    public final a<t> f22124h = new a<>(t.a(t.b.CLOSED));

    public static class a<T> extends l<T> {
        public LiveData<T> f22129m;
        public T f22130n;

        public a(T t10) {
            this.f22130n = t10;
        }

        @Override
        public T e() {
            LiveData<T> liveData = this.f22129m;
            return liveData == null ? this.f22130n : liveData.e();
        }

        @Override
        public <S> void n(LiveData<S> liveData, o<? super S> oVar) {
            throw new UnsupportedOperationException();
        }

        public void p(LiveData<T> liveData) {
            LiveData liveData2 = (LiveData<T>) this.f22129m;
            if (liveData2 != null) {
                super.o(liveData2);
            }
            this.f22129m = liveData;
            super.n(liveData, new o() {
                @Override
                public final void a(Object obj) {
                    j0.a.this.m(obj);
                }
            });
        }
    }

    public j0(String str, m0 m0Var) {
        String str2 = (String) b1.h.e(str);
        this.f22117a = str2;
        this.f22128l = m0Var;
        z c10 = m0Var.c(str2);
        this.f22118b = c10;
        this.f22126j = v.g.a(str, c10);
        this.f22127k = new d(str, c10);
    }

    @Override
    public String a() {
        return this.f22117a;
    }

    @Override
    public void b(Executor executor, h hVar) {
        synchronized (this.f22120d) {
            t tVar = this.f22121e;
            if (tVar == null) {
                if (this.f22125i == null) {
                    this.f22125i = new ArrayList();
                }
                this.f22125i.add(new Pair<>(hVar, executor));
                return;
            }
            tVar.t(executor, hVar);
        }
    }

    @Override
    public Integer c() {
        Integer num = (Integer) this.f22118b.a(CameraCharacteristics.LENS_FACING);
        b1.h.e(num);
        int intValue = num.intValue();
        if (intValue != 0) {
            return intValue != 1 ? null : 1;
        }
        return 0;
    }

    @Override
    public String d() {
        return l() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override
    public int e(int i10) {
        Integer valueOf = Integer.valueOf(k());
        int b10 = b.b(i10);
        Integer c10 = c();
        boolean z10 = true;
        if (c10 == null || 1 != c10.intValue()) {
            z10 = false;
        }
        return b.a(b10, valueOf.intValue(), z10);
    }

    @Override
    public boolean f() {
        Boolean bool = (Boolean) this.f22118b.a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        b1.h.e(bool);
        return bool.booleanValue();
    }

    @Override
    public void g(h hVar) {
        synchronized (this.f22120d) {
            t tVar = this.f22121e;
            if (tVar == null) {
                List<Pair<h, Executor>> list = this.f22125i;
                if (list != null) {
                    Iterator<Pair<h, Executor>> it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next().first == hVar) {
                            it.remove();
                        }
                    }
                    return;
                }
                return;
            }
            tVar.W(hVar);
        }
    }

    @Override
    public x1 h() {
        return this.f22126j;
    }

    @Override
    public LiveData<l3> i() {
        synchronized (this.f22120d) {
            t tVar = this.f22121e;
            if (tVar == null) {
                if (this.f22123g == null) {
                    this.f22123g = new a<>(c3.e(this.f22118b));
                }
                return this.f22123g;
            }
            a<l3> aVar = this.f22123g;
            if (aVar != null) {
                return aVar;
            }
            return tVar.F().f();
        }
    }

    public z j() {
        return this.f22118b;
    }

    public int k() {
        Integer num = (Integer) this.f22118b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        b1.h.e(num);
        return num.intValue();
    }

    public int l() {
        Integer num = (Integer) this.f22118b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        b1.h.e(num);
        return num.intValue();
    }

    public void m(t tVar) {
        synchronized (this.f22120d) {
            this.f22121e = tVar;
            a<l3> aVar = this.f22123g;
            if (aVar != null) {
                aVar.p(tVar.F().f());
            }
            a<Integer> aVar2 = this.f22122f;
            if (aVar2 != null) {
                aVar2.p(this.f22121e.D().f());
            }
            List<Pair<h, Executor>> list = this.f22125i;
            if (list != null) {
                for (Pair<h, Executor> pair : list) {
                    this.f22121e.t((Executor) pair.second, (h) pair.first);
                }
                this.f22125i = null;
            }
        }
        n();
    }

    public final void n() {
        o();
    }

    public final void o() {
        String str;
        int l10 = l();
        if (l10 == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (l10 == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (l10 == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (l10 == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (l10 != 4) {
            str = "Unknown value: " + l10;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        t1.e("Camera2CameraInfo", "Device Level: " + str);
    }

    public void p(LiveData<t> liveData) {
        this.f22124h.p(liveData);
    }
}
