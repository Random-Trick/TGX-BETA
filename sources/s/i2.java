package s;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.t1;
import b1.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.thunderdog.challegram.Log;
import t.f;
import t.m0;
import t.z;
import w.d;
import w.e;
import w.k;
import w.m;
import y.e1;
import y.f2;
import y.g2;
import y.h2;
import y.n2;
import z.b;
import z.c;

public final class i2 {
    public static final Size f22089q = new Size(640, 480);
    public static final Size f22090r = new Size(0, 0);
    public static final Size f22091s = new Size(1920, 1080);
    public static final Size f22092t = new Size(720, 480);
    public static final Rational f22093u = new Rational(4, 3);
    public static final Rational f22094v = new Rational(3, 4);
    public static final Rational f22095w = new Rational(16, 9);
    public static final Rational f22096x = new Rational(9, 16);
    public final String f22099c;
    public final c f22100d;
    public final z f22101e;
    public final d f22102f;
    public final int f22104h;
    public final boolean f22105i;
    public h2 f22109m;
    public final v1 f22111o;
    public final List<f2> f22097a = new ArrayList();
    public final Map<Integer, Size> f22098b = new HashMap();
    public final Map<Integer, List<Size>> f22106j = new HashMap();
    public boolean f22107k = false;
    public boolean f22108l = false;
    public Map<Integer, Size[]> f22110n = new HashMap();
    public final k f22112p = new k();
    public final e f22103g = new e();

    public static final class a implements Comparator<Rational> {
        public Rational f22113a;

        public a(Rational rational) {
            this.f22113a = rational;
        }

        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            return (int) Math.signum(Float.valueOf(Math.abs(rational.floatValue() - this.f22113a.floatValue())).floatValue() - Float.valueOf(Math.abs(rational2.floatValue() - this.f22113a.floatValue())).floatValue());
        }
    }

    public i2(Context context, String str, m0 m0Var, c cVar) {
        String str2 = (String) h.e(str);
        this.f22099c = str2;
        this.f22100d = (c) h.e(cVar);
        this.f22102f = new d(str);
        this.f22111o = v1.b(context);
        try {
            z c10 = m0Var.c(str2);
            this.f22101e = c10;
            Integer num = (Integer) c10.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f22104h = num != null ? num.intValue() : 2;
            this.f22105i = H();
            h();
            i();
            a();
        } catch (f e10) {
            throw j1.a(e10);
        }
    }

    public static boolean E(Size size, Rational rational) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (l(size) >= l(f22089q)) {
            return F(size, rational);
        }
        return false;
    }

    public static boolean F(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i10 = width % 16;
        if (i10 == 0 && height % 16 == 0) {
            return I(Math.max(0, height + (-16)), width, rational) || I(Math.max(0, width + (-16)), height, rational2);
        }
        if (i10 == 0) {
            return I(height, width, rational);
        }
        if (height % 16 == 0) {
            return I(width, height, rational2);
        }
        return false;
    }

    public static boolean I(int i10, int i11, Rational rational) {
        h.a(i11 % 16 == 0);
        double numerator = (i10 * rational.getNumerator()) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i11 + (-16))) && numerator < ((double) (i11 + 16));
    }

    public static int l(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public final Rational A(e1 e1Var) {
        Rational rational;
        int a10 = new m().a(this.f22099c, this.f22101e);
        if (a10 == 0) {
            rational = this.f22105i ? f22093u : f22094v;
        } else if (a10 == 1) {
            rational = this.f22105i ? f22095w : f22096x;
        } else if (a10 == 2) {
            Size f10 = f(Log.TAG_CRASH);
            return new Rational(f10.getWidth(), f10.getHeight());
        } else if (a10 != 3) {
            return null;
        } else {
            Size B = B(e1Var);
            if (e1Var.u()) {
                int w10 = e1Var.w();
                if (w10 == 0) {
                    rational = this.f22105i ? f22093u : f22094v;
                } else if (w10 != 1) {
                    t1.c("SupportedSurfaceCombination", "Undefined target aspect ratio: " + w10);
                    return null;
                } else {
                    rational = this.f22105i ? f22095w : f22096x;
                }
            } else if (B != null) {
                return new Rational(B.getWidth(), B.getHeight());
            } else {
                return null;
            }
        }
        return rational;
    }

    public final Size B(e1 e1Var) {
        return g(e1Var.p(null), e1Var.E(0));
    }

    public final List<Integer> C(List<n2<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Integer> arrayList2 = new ArrayList();
        for (n2<?> n2Var : list) {
            int v10 = n2Var.v(0);
            if (!arrayList2.contains(Integer.valueOf(v10))) {
                arrayList2.add(Integer.valueOf(v10));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        for (Integer num : arrayList2) {
            int intValue = num.intValue();
            for (n2<?> n2Var2 : list) {
                if (intValue == n2Var2.v(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(n2Var2)));
                }
            }
        }
        return arrayList;
    }

    public final Map<Rational, List<Size>> D(List<Size> list) {
        HashMap hashMap = new HashMap();
        hashMap.put(f22093u, new ArrayList());
        hashMap.put(f22095w, new ArrayList());
        for (Size size : list) {
            Rational rational = null;
            for (Rational rational2 : hashMap.keySet()) {
                if (E(size, rational2)) {
                    List list2 = (List) hashMap.get(rational2);
                    if (!list2.contains(size)) {
                        list2.add(size);
                    }
                    rational = rational2;
                }
            }
            if (rational == null) {
                hashMap.put(new Rational(size.getWidth(), size.getHeight()), new ArrayList(Collections.singleton(size)));
            }
        }
        return hashMap;
    }

    public final boolean G(int i10) {
        Integer num = (Integer) this.f22101e.a(CameraCharacteristics.SENSOR_ORIENTATION);
        h.f(num, "Camera HAL in bad state, unable to retrieve the SENSOR_ORIENTATION");
        int b10 = b.b(i10);
        Integer num2 = (Integer) this.f22101e.a(CameraCharacteristics.LENS_FACING);
        h.f(num2, "Camera HAL in bad state, unable to retrieve the LENS_FACING");
        int a10 = b.a(b10, num.intValue(), 1 == num2.intValue());
        return a10 == 90 || a10 == 270;
    }

    public final boolean H() {
        Size size = (Size) this.f22101e.a(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        return size == null || size.getWidth() >= size.getHeight();
    }

    public final void J() {
        this.f22111o.e();
        if (this.f22109m == null) {
            i();
            return;
        }
        this.f22109m = h2.a(this.f22109m.b(), this.f22111o.d(), this.f22109m.d());
    }

    public final void K(List<Size> list, Size size) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            int i11 = -1;
            while (i10 < list.size()) {
                Size size2 = list.get(i10);
                if (size2.getWidth() < size.getWidth() || size2.getHeight() < size.getHeight()) {
                    break;
                }
                if (i11 >= 0) {
                    arrayList.add(list.get(i11));
                }
                i10++;
                i11 = i10;
            }
            list.removeAll(arrayList);
        }
    }

    public g2 L(int i10, Size size) {
        g2.b n10 = n(i10);
        g2.a aVar = g2.a.NOT_SUPPORT;
        Size f10 = f(i10);
        if (size.getWidth() * size.getHeight() <= this.f22109m.b().getWidth() * this.f22109m.b().getHeight()) {
            aVar = g2.a.ANALYSIS;
        } else if (size.getWidth() * size.getHeight() <= this.f22109m.c().getWidth() * this.f22109m.c().getHeight()) {
            aVar = g2.a.PREVIEW;
        } else if (size.getWidth() * size.getHeight() <= this.f22109m.d().getWidth() * this.f22109m.d().getHeight()) {
            aVar = g2.a.RECORD;
        } else if (size.getWidth() * size.getHeight() <= f10.getWidth() * f10.getHeight()) {
            aVar = g2.a.MAXIMUM;
        }
        return g2.a(n10, aVar);
    }

    public final void a() {
    }

    public boolean b(List<g2> list) {
        Iterator<f2> it = this.f22097a.iterator();
        boolean z10 = false;
        while (it.hasNext() && !(z10 = it.next().d(list))) {
        }
        return z10;
    }

    public final Size[] c(int i10) {
        Size[] sizeArr;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f22101e.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            if (Build.VERSION.SDK_INT >= 23 || i10 != 34) {
                sizeArr = streamConfigurationMap.getOutputSizes(i10);
            } else {
                sizeArr = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
            }
            if (sizeArr != null) {
                Size[] d10 = d(sizeArr, i10);
                Arrays.sort(d10, new c(true));
                return d10;
            }
            throw new IllegalArgumentException("Can not get supported output size for the format: " + i10);
        }
        throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    public final Size[] d(Size[] sizeArr, int i10) {
        List<Size> e10 = e(i10);
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        arrayList.removeAll(e10);
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    public final List<Size> e(int i10) {
        List<Size> list = this.f22106j.get(Integer.valueOf(i10));
        if (list != null) {
            return list;
        }
        List<Size> a10 = this.f22102f.a(i10);
        this.f22106j.put(Integer.valueOf(i10), a10);
        return a10;
    }

    public final Size f(int i10) {
        Size size = this.f22098b.get(Integer.valueOf(i10));
        if (size != null) {
            return size;
        }
        Size t10 = t(i10);
        this.f22098b.put(Integer.valueOf(i10), t10);
        return t10;
    }

    public final Size g(Size size, int i10) {
        return (size == null || !G(i10)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    public final void h() {
        this.f22097a.addAll(q());
        int i10 = this.f22104h;
        if (i10 == 0 || i10 == 1 || i10 == 3) {
            this.f22097a.addAll(s());
        }
        int i11 = this.f22104h;
        if (i11 == 1 || i11 == 3) {
            this.f22097a.addAll(p());
        }
        int[] iArr = (int[]) this.f22101e.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i12 : iArr) {
                if (i12 == 3) {
                    this.f22107k = true;
                } else if (i12 == 6) {
                    this.f22108l = true;
                }
            }
        }
        if (this.f22107k) {
            this.f22097a.addAll(u());
        }
        if (this.f22108l && this.f22104h == 0) {
            this.f22097a.addAll(m());
        }
        if (this.f22104h == 3) {
            this.f22097a.addAll(r());
        }
        this.f22097a.addAll(this.f22103g.a(this.f22099c, this.f22104h));
    }

    public final void i() {
        this.f22109m = h2.a(new Size(640, 480), this.f22111o.d(), v());
    }

    public final Size[] j(int i10) {
        Size[] sizeArr = this.f22110n.get(Integer.valueOf(i10));
        if (sizeArr != null) {
            return sizeArr;
        }
        Size[] c10 = c(i10);
        this.f22110n.put(Integer.valueOf(i10), c10);
        return c10;
    }

    public final List<List<Size>> k(List<List<Size>> list) {
        int i10 = 1;
        for (List<Size> list2 : list) {
            i10 *= list2.size();
        }
        if (i10 != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new ArrayList());
            }
            int size = i10 / list.get(0).size();
            int i12 = i10;
            for (int i13 = 0; i13 < list.size(); i13++) {
                List<Size> list3 = list.get(i13);
                for (int i14 = 0; i14 < i10; i14++) {
                    ((List) arrayList.get(i14)).add(list3.get((i14 % i12) / size));
                }
                if (i13 < list.size() - 1) {
                    size /= list.get(i13 + 1).size();
                    i12 = size;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Failed to find supported resolutions.");
    }

    public List<f2> m() {
        ArrayList arrayList = new ArrayList();
        f2 f2Var = new f2();
        g2.b bVar = g2.b.PRIV;
        g2.a aVar = g2.a.PREVIEW;
        f2Var.a(g2.a(bVar, aVar));
        g2.a aVar2 = g2.a.MAXIMUM;
        f2Var.a(g2.a(bVar, aVar2));
        arrayList.add(f2Var);
        f2 f2Var2 = new f2();
        f2Var2.a(g2.a(bVar, aVar));
        g2.b bVar2 = g2.b.YUV;
        f2Var2.a(g2.a(bVar2, aVar2));
        arrayList.add(f2Var2);
        f2 f2Var3 = new f2();
        f2Var3.a(g2.a(bVar2, aVar));
        f2Var3.a(g2.a(bVar2, aVar2));
        arrayList.add(f2Var3);
        return arrayList;
    }

    public final g2.b n(int i10) {
        if (i10 == 35) {
            return g2.b.YUV;
        }
        if (i10 == 256) {
            return g2.b.JPEG;
        }
        if (i10 == 32) {
            return g2.b.RAW;
        }
        return g2.b.PRIV;
    }

    public final Size[] o(int i10, e1 e1Var) {
        Size[] sizeArr = null;
        List<Pair<Integer, Size[]>> i11 = e1Var.i(null);
        if (i11 != null) {
            Iterator<Pair<Integer, Size[]>> it = i11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Pair<Integer, Size[]> next = it.next();
                if (((Integer) next.first).intValue() == i10) {
                    sizeArr = (Size[]) next.second;
                    break;
                }
            }
        }
        if (sizeArr == null) {
            return sizeArr;
        }
        Size[] d10 = d(sizeArr, i10);
        Arrays.sort(d10, new c(true));
        return d10;
    }

    public List<f2> p() {
        ArrayList arrayList = new ArrayList();
        f2 f2Var = new f2();
        g2.b bVar = g2.b.PRIV;
        g2.a aVar = g2.a.PREVIEW;
        f2Var.a(g2.a(bVar, aVar));
        g2.a aVar2 = g2.a.MAXIMUM;
        f2Var.a(g2.a(bVar, aVar2));
        arrayList.add(f2Var);
        f2 f2Var2 = new f2();
        f2Var2.a(g2.a(bVar, aVar));
        g2.b bVar2 = g2.b.YUV;
        f2Var2.a(g2.a(bVar2, aVar2));
        arrayList.add(f2Var2);
        f2 f2Var3 = new f2();
        f2Var3.a(g2.a(bVar2, aVar));
        f2Var3.a(g2.a(bVar2, aVar2));
        arrayList.add(f2Var3);
        f2 f2Var4 = new f2();
        f2Var4.a(g2.a(bVar, aVar));
        f2Var4.a(g2.a(bVar, aVar));
        f2Var4.a(g2.a(g2.b.JPEG, aVar2));
        arrayList.add(f2Var4);
        f2 f2Var5 = new f2();
        g2.a aVar3 = g2.a.ANALYSIS;
        f2Var5.a(g2.a(bVar2, aVar3));
        f2Var5.a(g2.a(bVar, aVar));
        f2Var5.a(g2.a(bVar2, aVar2));
        arrayList.add(f2Var5);
        f2 f2Var6 = new f2();
        f2Var6.a(g2.a(bVar2, aVar3));
        f2Var6.a(g2.a(bVar2, aVar));
        f2Var6.a(g2.a(bVar2, aVar2));
        arrayList.add(f2Var6);
        return arrayList;
    }

    public List<f2> q() {
        ArrayList arrayList = new ArrayList();
        f2 f2Var = new f2();
        g2.b bVar = g2.b.PRIV;
        g2.a aVar = g2.a.MAXIMUM;
        f2Var.a(g2.a(bVar, aVar));
        arrayList.add(f2Var);
        f2 f2Var2 = new f2();
        g2.b bVar2 = g2.b.JPEG;
        f2Var2.a(g2.a(bVar2, aVar));
        arrayList.add(f2Var2);
        f2 f2Var3 = new f2();
        g2.b bVar3 = g2.b.YUV;
        f2Var3.a(g2.a(bVar3, aVar));
        arrayList.add(f2Var3);
        f2 f2Var4 = new f2();
        g2.a aVar2 = g2.a.PREVIEW;
        f2Var4.a(g2.a(bVar, aVar2));
        f2Var4.a(g2.a(bVar2, aVar));
        arrayList.add(f2Var4);
        f2 f2Var5 = new f2();
        f2Var5.a(g2.a(bVar3, aVar2));
        f2Var5.a(g2.a(bVar2, aVar));
        arrayList.add(f2Var5);
        f2 f2Var6 = new f2();
        f2Var6.a(g2.a(bVar, aVar2));
        f2Var6.a(g2.a(bVar, aVar2));
        arrayList.add(f2Var6);
        f2 f2Var7 = new f2();
        f2Var7.a(g2.a(bVar, aVar2));
        f2Var7.a(g2.a(bVar3, aVar2));
        arrayList.add(f2Var7);
        f2 f2Var8 = new f2();
        f2Var8.a(g2.a(bVar, aVar2));
        f2Var8.a(g2.a(bVar3, aVar2));
        f2Var8.a(g2.a(bVar2, aVar));
        arrayList.add(f2Var8);
        return arrayList;
    }

    public List<f2> r() {
        ArrayList arrayList = new ArrayList();
        f2 f2Var = new f2();
        g2.b bVar = g2.b.PRIV;
        g2.a aVar = g2.a.PREVIEW;
        f2Var.a(g2.a(bVar, aVar));
        g2.a aVar2 = g2.a.ANALYSIS;
        f2Var.a(g2.a(bVar, aVar2));
        g2.b bVar2 = g2.b.YUV;
        g2.a aVar3 = g2.a.MAXIMUM;
        f2Var.a(g2.a(bVar2, aVar3));
        g2.b bVar3 = g2.b.RAW;
        f2Var.a(g2.a(bVar3, aVar3));
        arrayList.add(f2Var);
        f2 f2Var2 = new f2();
        f2Var2.a(g2.a(bVar, aVar));
        f2Var2.a(g2.a(bVar, aVar2));
        f2Var2.a(g2.a(g2.b.JPEG, aVar3));
        f2Var2.a(g2.a(bVar3, aVar3));
        arrayList.add(f2Var2);
        return arrayList;
    }

    public List<f2> s() {
        ArrayList arrayList = new ArrayList();
        f2 f2Var = new f2();
        g2.b bVar = g2.b.PRIV;
        g2.a aVar = g2.a.PREVIEW;
        f2Var.a(g2.a(bVar, aVar));
        g2.a aVar2 = g2.a.RECORD;
        f2Var.a(g2.a(bVar, aVar2));
        arrayList.add(f2Var);
        f2 f2Var2 = new f2();
        f2Var2.a(g2.a(bVar, aVar));
        g2.b bVar2 = g2.b.YUV;
        f2Var2.a(g2.a(bVar2, aVar2));
        arrayList.add(f2Var2);
        f2 f2Var3 = new f2();
        f2Var3.a(g2.a(bVar2, aVar));
        f2Var3.a(g2.a(bVar2, aVar2));
        arrayList.add(f2Var3);
        f2 f2Var4 = new f2();
        f2Var4.a(g2.a(bVar, aVar));
        f2Var4.a(g2.a(bVar, aVar2));
        g2.b bVar3 = g2.b.JPEG;
        f2Var4.a(g2.a(bVar3, aVar2));
        arrayList.add(f2Var4);
        f2 f2Var5 = new f2();
        f2Var5.a(g2.a(bVar, aVar));
        f2Var5.a(g2.a(bVar2, aVar2));
        f2Var5.a(g2.a(bVar3, aVar2));
        arrayList.add(f2Var5);
        f2 f2Var6 = new f2();
        f2Var6.a(g2.a(bVar2, aVar));
        f2Var6.a(g2.a(bVar2, aVar));
        f2Var6.a(g2.a(bVar3, g2.a.MAXIMUM));
        arrayList.add(f2Var6);
        return arrayList;
    }

    public Size t(int i10) {
        return (Size) Collections.max(Arrays.asList(j(i10)), new c());
    }

    public List<f2> u() {
        ArrayList arrayList = new ArrayList();
        f2 f2Var = new f2();
        g2.b bVar = g2.b.RAW;
        g2.a aVar = g2.a.MAXIMUM;
        f2Var.a(g2.a(bVar, aVar));
        arrayList.add(f2Var);
        f2 f2Var2 = new f2();
        g2.b bVar2 = g2.b.PRIV;
        g2.a aVar2 = g2.a.PREVIEW;
        f2Var2.a(g2.a(bVar2, aVar2));
        f2Var2.a(g2.a(bVar, aVar));
        arrayList.add(f2Var2);
        f2 f2Var3 = new f2();
        g2.b bVar3 = g2.b.YUV;
        f2Var3.a(g2.a(bVar3, aVar2));
        f2Var3.a(g2.a(bVar, aVar));
        arrayList.add(f2Var3);
        f2 f2Var4 = new f2();
        f2Var4.a(g2.a(bVar2, aVar2));
        f2Var4.a(g2.a(bVar2, aVar2));
        f2Var4.a(g2.a(bVar, aVar));
        arrayList.add(f2Var4);
        f2 f2Var5 = new f2();
        f2Var5.a(g2.a(bVar2, aVar2));
        f2Var5.a(g2.a(bVar3, aVar2));
        f2Var5.a(g2.a(bVar, aVar));
        arrayList.add(f2Var5);
        f2 f2Var6 = new f2();
        f2Var6.a(g2.a(bVar3, aVar2));
        f2Var6.a(g2.a(bVar3, aVar2));
        f2Var6.a(g2.a(bVar, aVar));
        arrayList.add(f2Var6);
        f2 f2Var7 = new f2();
        f2Var7.a(g2.a(bVar2, aVar2));
        g2.b bVar4 = g2.b.JPEG;
        f2Var7.a(g2.a(bVar4, aVar));
        f2Var7.a(g2.a(bVar, aVar));
        arrayList.add(f2Var7);
        f2 f2Var8 = new f2();
        f2Var8.a(g2.a(bVar3, aVar2));
        f2Var8.a(g2.a(bVar4, aVar));
        f2Var8.a(g2.a(bVar, aVar));
        arrayList.add(f2Var8);
        return arrayList;
    }

    public final Size v() {
        try {
            int parseInt = Integer.parseInt(this.f22099c);
            CamcorderProfile camcorderProfile = null;
            if (this.f22100d.b(parseInt, 1)) {
                camcorderProfile = this.f22100d.a(parseInt, 1);
            }
            if (camcorderProfile != null) {
                return new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            }
            return w(parseInt);
        } catch (NumberFormatException unused) {
            return x();
        }
    }

    public final Size w(int i10) {
        CamcorderProfile camcorderProfile;
        Size size = f22092t;
        if (this.f22100d.b(i10, 10)) {
            camcorderProfile = this.f22100d.a(i10, 10);
        } else if (this.f22100d.b(i10, 8)) {
            camcorderProfile = this.f22100d.a(i10, 8);
        } else if (this.f22100d.b(i10, 12)) {
            camcorderProfile = this.f22100d.a(i10, 12);
        } else if (this.f22100d.b(i10, 6)) {
            camcorderProfile = this.f22100d.a(i10, 6);
        } else if (this.f22100d.b(i10, 5)) {
            camcorderProfile = this.f22100d.a(i10, 5);
        } else {
            camcorderProfile = this.f22100d.b(i10, 4) ? this.f22100d.a(i10, 4) : null;
        }
        return camcorderProfile != null ? new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight) : size;
    }

    public final Size x() {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f22101e.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            Size[] outputSizes = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
            if (outputSizes == null) {
                return f22092t;
            }
            Arrays.sort(outputSizes, new c(true));
            for (Size size : outputSizes) {
                int width = size.getWidth();
                Size size2 = f22091s;
                if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                    return size;
                }
            }
            return f22092t;
        }
        throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    public Map<n2<?>, Size> y(List<g2> list, List<n2<?>> list2) {
        J();
        ArrayList arrayList = new ArrayList(list);
        for (n2<?> n2Var : list2) {
            arrayList.add(L(n2Var.m(), new Size(640, 480)));
        }
        if (b(arrayList)) {
            List<Integer> C = C(list2);
            ArrayList arrayList2 = new ArrayList();
            for (Integer num : C) {
                arrayList2.add(z(list2.get(num.intValue())));
            }
            HashMap hashMap = null;
            Iterator<List<Size>> it = k(arrayList2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                List<Size> next = it.next();
                ArrayList arrayList3 = new ArrayList(list);
                for (int i10 = 0; i10 < next.size(); i10++) {
                    arrayList3.add(L(list2.get(C.get(i10).intValue()).m(), next.get(i10)));
                }
                if (b(arrayList3)) {
                    hashMap = new HashMap();
                    for (n2<?> n2Var2 : list2) {
                        hashMap.put(n2Var2, next.get(C.indexOf(Integer.valueOf(list2.indexOf(n2Var2)))));
                    }
                }
            }
            if (hashMap != null) {
                return hashMap;
            }
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f22099c + " and Hardware level: " + this.f22104h + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + " New configs: " + list2);
        }
        throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f22099c + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + list2);
    }

    public List<Size> z(n2<?> n2Var) {
        int m10 = n2Var.m();
        e1 e1Var = (e1) n2Var;
        Size[] o10 = o(m10, e1Var);
        if (o10 == null) {
            o10 = j(m10);
        }
        ArrayList arrayList = new ArrayList();
        Size f10 = e1Var.f(null);
        Size t10 = t(m10);
        if (f10 == null || l(t10) < l(f10)) {
            f10 = t10;
        }
        Arrays.sort(o10, new c(true));
        Size B = B(e1Var);
        Size size = f22089q;
        int l10 = l(size);
        if (l(f10) < l10) {
            size = f22090r;
        } else if (B != null && l(B) < l10) {
            size = B;
        }
        for (Size size2 : o10) {
            if (l(size2) <= l(f10) && l(size2) >= l(size) && !arrayList.contains(size2)) {
                arrayList.add(size2);
            }
        }
        if (!arrayList.isEmpty()) {
            Rational A = A(e1Var);
            if (B == null) {
                B = e1Var.o(null);
            }
            List<Size> arrayList2 = new ArrayList<>();
            new HashMap();
            if (A == null) {
                arrayList2.addAll(arrayList);
                if (B != null) {
                    K(arrayList2, B);
                }
            } else {
                Map<Rational, List<Size>> D = D(arrayList);
                if (B != null) {
                    for (Rational rational : D.keySet()) {
                        K(D.get(rational), B);
                    }
                }
                ArrayList<Rational> arrayList3 = new ArrayList(D.keySet());
                Collections.sort(arrayList3, new a(A));
                for (Rational rational2 : arrayList3) {
                    for (Size size3 : D.get(rational2)) {
                        if (!arrayList2.contains(size3)) {
                            arrayList2.add(size3);
                        }
                    }
                }
            }
            return this.f22112p.a(n(n2Var.m()), arrayList2);
        }
        throw new IllegalArgumentException("Can not get supported output size under supported maximum for the format: " + m10);
    }
}
