package p255s;

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
import androidx.camera.core.C0662u1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.thunderdog.challegram.Log;
import p016b1.C1132h;
import p266t.C8887f;
import p266t.C8906m0;
import p266t.C8927z;
import p306w.C9926d;
import p306w.C9927e;
import p306w.C9933k;
import p306w.C9935m;
import p336y.AbstractC10219e1;
import p336y.AbstractC10231g2;
import p336y.AbstractC10238h2;
import p336y.AbstractC10273n2;
import p336y.C10226f2;
import p351z.C11179b;
import p351z.C11180c;

public final class C8502i2 {
    public static final Size f27570q = new Size(640, 480);
    public static final Size f27571r = new Size(0, 0);
    public static final Size f27572s = new Size(1920, 1080);
    public static final Size f27573t = new Size(720, 480);
    public static final Rational f27574u = new Rational(4, 3);
    public static final Rational f27575v = new Rational(3, 4);
    public static final Rational f27576w = new Rational(16, 9);
    public static final Rational f27577x = new Rational(9, 16);
    public final String f27580c;
    public final AbstractC8447c f27581d;
    public final C8927z f27582e;
    public final C9926d f27583f;
    public final int f27585h;
    public final boolean f27586i;
    public AbstractC10238h2 f27590m;
    public final C8581v1 f27592o;
    public final List<C10226f2> f27578a = new ArrayList();
    public final Map<Integer, Size> f27579b = new HashMap();
    public final Map<Integer, List<Size>> f27587j = new HashMap();
    public boolean f27588k = false;
    public boolean f27589l = false;
    public Map<Integer, Size[]> f27591n = new HashMap();
    public final C9933k f27593p = new C9933k();
    public final C9927e f27584g = new C9927e();

    public static final class C8503a implements Comparator<Rational> {
        public Rational f27594a;

        public C8503a(Rational rational) {
            this.f27594a = rational;
        }

        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            return (int) Math.signum(Float.valueOf(Math.abs(rational.floatValue() - this.f27594a.floatValue())).floatValue() - Float.valueOf(Math.abs(rational2.floatValue() - this.f27594a.floatValue())).floatValue());
        }
    }

    public C8502i2(Context context, String str, C8906m0 m0Var, AbstractC8447c cVar) {
        String str2 = (String) C1132h.m38325e(str);
        this.f27580c = str2;
        this.f27581d = (AbstractC8447c) C1132h.m38325e(cVar);
        this.f27583f = new C9926d(str);
        this.f27592o = C8581v1.m12041b(context);
        try {
            C8927z c = m0Var.m10978c(str2);
            this.f27582e = c;
            Integer num = (Integer) c.m10951a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f27585h = num != null ? num.intValue() : 2;
            this.f27586i = m12294H();
            m12282h();
            m12281i();
            m12289a();
        } catch (C8887f e) {
            throw C8507j1.m12248a(e);
        }
    }

    public static boolean m12297E(Size size, Rational rational) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (m12278l(size) >= m12278l(f27570q)) {
            return m12296F(size, rational);
        }
        return false;
    }

    public static boolean m12296F(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i = width % 16;
        if (i == 0 && height % 16 == 0) {
            return m12293I(Math.max(0, height + (-16)), width, rational) || m12293I(Math.max(0, width + (-16)), height, rational2);
        }
        if (i == 0) {
            return m12293I(height, width, rational);
        }
        if (height % 16 == 0) {
            return m12293I(width, height, rational2);
        }
        return false;
    }

    public static boolean m12293I(int i, int i2, Rational rational) {
        C1132h.m38329a(i2 % 16 == 0);
        double numerator = (i * rational.getNumerator()) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i2 + (-16))) && numerator < ((double) (i2 + 16));
    }

    public static int m12278l(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public final Rational m12301A(AbstractC10219e1 e1Var) {
        Rational rational;
        int a = new C9935m().m6464a(this.f27580c, this.f27582e);
        if (a == 0) {
            rational = this.f27586i ? f27574u : f27575v;
        } else if (a == 1) {
            rational = this.f27586i ? f27576w : f27577x;
        } else if (a == 2) {
            Size f = m12284f(Log.TAG_CRASH);
            return new Rational(f.getWidth(), f.getHeight());
        } else if (a != 3) {
            return null;
        } else {
            Size B = m12300B(e1Var);
            if (e1Var.mo5430u()) {
                int w = e1Var.mo5428w();
                if (w == 0) {
                    rational = this.f27586i ? f27574u : f27575v;
                } else if (w != 1) {
                    C0662u1.m40654c("SupportedSurfaceCombination", "Undefined target aspect ratio: " + w);
                    return null;
                } else {
                    rational = this.f27586i ? f27576w : f27577x;
                }
            } else if (B != null) {
                return new Rational(B.getWidth(), B.getHeight());
            } else {
                return null;
            }
        }
        return rational;
    }

    public final Size m12300B(AbstractC10219e1 e1Var) {
        return m12283g(e1Var.mo5433p(null), e1Var.mo5452E(0));
    }

    public final List<Integer> m12299C(List<AbstractC10273n2<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Integer> arrayList2 = new ArrayList();
        for (AbstractC10273n2<?> n2Var : list) {
            int v = n2Var.mo5429v(0);
            if (!arrayList2.contains(Integer.valueOf(v))) {
                arrayList2.add(Integer.valueOf(v));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        for (Integer num : arrayList2) {
            int intValue = num.intValue();
            for (AbstractC10273n2<?> n2Var2 : list) {
                if (intValue == n2Var2.mo5429v(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(n2Var2)));
                }
            }
        }
        return arrayList;
    }

    public final Map<Rational, List<Size>> m12298D(List<Size> list) {
        HashMap hashMap = new HashMap();
        hashMap.put(f27574u, new ArrayList());
        hashMap.put(f27576w, new ArrayList());
        for (Size size : list) {
            Rational rational = null;
            for (Rational rational2 : hashMap.keySet()) {
                if (m12297E(size, rational2)) {
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

    public final boolean m12295G(int i) {
        Integer num = (Integer) this.f27582e.m10951a(CameraCharacteristics.SENSOR_ORIENTATION);
        C1132h.m38324f(num, "Camera HAL in bad state, unable to retrieve the SENSOR_ORIENTATION");
        int b = C11179b.m1313b(i);
        Integer num2 = (Integer) this.f27582e.m10951a(CameraCharacteristics.LENS_FACING);
        C1132h.m38324f(num2, "Camera HAL in bad state, unable to retrieve the LENS_FACING");
        int a = C11179b.m1314a(b, num.intValue(), 1 == num2.intValue());
        return a == 90 || a == 270;
    }

    public final boolean m12294H() {
        Size size = (Size) this.f27582e.m10951a(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        return size == null || size.getWidth() >= size.getHeight();
    }

    public final void m12292J() {
        this.f27592o.m12038e();
        if (this.f27590m == null) {
            m12281i();
            return;
        }
        this.f27590m = AbstractC10238h2.m5673a(this.f27590m.mo5672b(), this.f27592o.m12039d(), this.f27590m.mo5670d());
    }

    public final void m12291K(List<Size> list, Size size) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            int i2 = -1;
            while (i < list.size()) {
                Size size2 = list.get(i);
                if (size2.getWidth() < size.getWidth() || size2.getHeight() < size.getHeight()) {
                    break;
                }
                if (i2 >= 0) {
                    arrayList.add(list.get(i2));
                }
                i++;
                i2 = i;
            }
            list.removeAll(arrayList);
        }
    }

    public AbstractC10231g2 m12290L(int i, Size size) {
        AbstractC10231g2.EnumC10233b n = m12276n(i);
        AbstractC10231g2.EnumC10232a aVar = AbstractC10231g2.EnumC10232a.NOT_SUPPORT;
        Size f = m12284f(i);
        if (size.getWidth() * size.getHeight() <= this.f27590m.mo5672b().getWidth() * this.f27590m.mo5672b().getHeight()) {
            aVar = AbstractC10231g2.EnumC10232a.ANALYSIS;
        } else if (size.getWidth() * size.getHeight() <= this.f27590m.mo5671c().getWidth() * this.f27590m.mo5671c().getHeight()) {
            aVar = AbstractC10231g2.EnumC10232a.PREVIEW;
        } else if (size.getWidth() * size.getHeight() <= this.f27590m.mo5670d().getWidth() * this.f27590m.mo5670d().getHeight()) {
            aVar = AbstractC10231g2.EnumC10232a.RECORD;
        } else if (size.getWidth() * size.getHeight() <= f.getWidth() * f.getHeight()) {
            aVar = AbstractC10231g2.EnumC10232a.MAXIMUM;
        }
        return AbstractC10231g2.m5679a(n, aVar);
    }

    public final void m12289a() {
    }

    public boolean m12288b(List<AbstractC10231g2> list) {
        Iterator<C10226f2> it = this.f27578a.iterator();
        boolean z = false;
        while (it.hasNext() && !(z = it.next().m5691d(list))) {
        }
        return z;
    }

    public final Size[] m12287c(int i) {
        Size[] sizeArr;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f27582e.m10951a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            if (Build.VERSION.SDK_INT >= 23 || i != 34) {
                sizeArr = streamConfigurationMap.getOutputSizes(i);
            } else {
                sizeArr = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
            }
            if (sizeArr != null) {
                Size[] d = m12286d(sizeArr, i);
                Arrays.sort(d, new C11180c(true));
                return d;
            }
            throw new IllegalArgumentException("Can not get supported output size for the format: " + i);
        }
        throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    public final Size[] m12286d(Size[] sizeArr, int i) {
        List<Size> e = m12285e(i);
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        arrayList.removeAll(e);
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    public final List<Size> m12285e(int i) {
        List<Size> list = this.f27587j.get(Integer.valueOf(i));
        if (list != null) {
            return list;
        }
        List<Size> a = this.f27583f.m6474a(i);
        this.f27587j.put(Integer.valueOf(i), a);
        return a;
    }

    public final Size m12284f(int i) {
        Size size = this.f27579b.get(Integer.valueOf(i));
        if (size != null) {
            return size;
        }
        Size t = m12270t(i);
        this.f27579b.put(Integer.valueOf(i), t);
        return t;
    }

    public final Size m12283g(Size size, int i) {
        return (size == null || !m12295G(i)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    public final void m12282h() {
        this.f27578a.addAll(m12273q());
        int i = this.f27585h;
        if (i == 0 || i == 1 || i == 3) {
            this.f27578a.addAll(m12271s());
        }
        int i2 = this.f27585h;
        if (i2 == 1 || i2 == 3) {
            this.f27578a.addAll(m12274p());
        }
        int[] iArr = (int[]) this.f27582e.m10951a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i3 : iArr) {
                if (i3 == 3) {
                    this.f27588k = true;
                } else if (i3 == 6) {
                    this.f27589l = true;
                }
            }
        }
        if (this.f27588k) {
            this.f27578a.addAll(m12269u());
        }
        if (this.f27589l && this.f27585h == 0) {
            this.f27578a.addAll(m12277m());
        }
        if (this.f27585h == 3) {
            this.f27578a.addAll(m12272r());
        }
        this.f27578a.addAll(this.f27584g.m6473a(this.f27580c, this.f27585h));
    }

    public final void m12281i() {
        this.f27590m = AbstractC10238h2.m5673a(new Size(640, 480), this.f27592o.m12039d(), m12268v());
    }

    public final Size[] m12280j(int i) {
        Size[] sizeArr = this.f27591n.get(Integer.valueOf(i));
        if (sizeArr != null) {
            return sizeArr;
        }
        Size[] c = m12287c(i);
        this.f27591n.put(Integer.valueOf(i), c);
        return c;
    }

    public final List<List<Size>> m12279k(List<List<Size>> list) {
        int i = 1;
        for (List<Size> list2 : list) {
            i *= list2.size();
        }
        if (i != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new ArrayList());
            }
            int size = i / list.get(0).size();
            int i3 = i;
            for (int i4 = 0; i4 < list.size(); i4++) {
                List<Size> list3 = list.get(i4);
                for (int i5 = 0; i5 < i; i5++) {
                    ((List) arrayList.get(i5)).add(list3.get((i5 % i3) / size));
                }
                if (i4 < list.size() - 1) {
                    size /= list.get(i4 + 1).size();
                    i3 = size;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Failed to find supported resolutions.");
    }

    public List<C10226f2> m12277m() {
        ArrayList arrayList = new ArrayList();
        C10226f2 f2Var = new C10226f2();
        AbstractC10231g2.EnumC10233b bVar = AbstractC10231g2.EnumC10233b.PRIV;
        AbstractC10231g2.EnumC10232a aVar = AbstractC10231g2.EnumC10232a.PREVIEW;
        f2Var.m5694a(AbstractC10231g2.m5679a(bVar, aVar));
        AbstractC10231g2.EnumC10232a aVar2 = AbstractC10231g2.EnumC10232a.MAXIMUM;
        f2Var.m5694a(AbstractC10231g2.m5679a(bVar, aVar2));
        arrayList.add(f2Var);
        C10226f2 f2Var2 = new C10226f2();
        f2Var2.m5694a(AbstractC10231g2.m5679a(bVar, aVar));
        AbstractC10231g2.EnumC10233b bVar2 = AbstractC10231g2.EnumC10233b.YUV;
        f2Var2.m5694a(AbstractC10231g2.m5679a(bVar2, aVar2));
        arrayList.add(f2Var2);
        C10226f2 f2Var3 = new C10226f2();
        f2Var3.m5694a(AbstractC10231g2.m5679a(bVar2, aVar));
        f2Var3.m5694a(AbstractC10231g2.m5679a(bVar2, aVar2));
        arrayList.add(f2Var3);
        return arrayList;
    }

    public final AbstractC10231g2.EnumC10233b m12276n(int i) {
        if (i == 35) {
            return AbstractC10231g2.EnumC10233b.YUV;
        }
        if (i == 256) {
            return AbstractC10231g2.EnumC10233b.JPEG;
        }
        if (i == 32) {
            return AbstractC10231g2.EnumC10233b.RAW;
        }
        return AbstractC10231g2.EnumC10233b.PRIV;
    }

    public final Size[] m12275o(int i, AbstractC10219e1 e1Var) {
        Size[] sizeArr = null;
        List<Pair<Integer, Size[]>> i2 = e1Var.mo5438i(null);
        if (i2 != null) {
            Iterator<Pair<Integer, Size[]>> it = i2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Pair<Integer, Size[]> next = it.next();
                if (((Integer) next.first).intValue() == i) {
                    sizeArr = (Size[]) next.second;
                    break;
                }
            }
        }
        if (sizeArr == null) {
            return sizeArr;
        }
        Size[] d = m12286d(sizeArr, i);
        Arrays.sort(d, new C11180c(true));
        return d;
    }

    public List<C10226f2> m12274p() {
        ArrayList arrayList = new ArrayList();
        C10226f2 f2Var = new C10226f2();
        AbstractC10231g2.EnumC10233b bVar = AbstractC10231g2.EnumC10233b.PRIV;
        AbstractC10231g2.EnumC10232a aVar = AbstractC10231g2.EnumC10232a.PREVIEW;
        f2Var.m5694a(AbstractC10231g2.m5679a(bVar, aVar));
        AbstractC10231g2.EnumC10232a aVar2 = AbstractC10231g2.EnumC10232a.MAXIMUM;
        f2Var.m5694a(AbstractC10231g2.m5679a(bVar, aVar2));
        arrayList.add(f2Var);
        C10226f2 f2Var2 = new C10226f2();
        f2Var2.m5694a(AbstractC10231g2.m5679a(bVar, aVar));
        AbstractC10231g2.EnumC10233b bVar2 = AbstractC10231g2.EnumC10233b.YUV;
        f2Var2.m5694a(AbstractC10231g2.m5679a(bVar2, aVar2));
        arrayList.add(f2Var2);
        C10226f2 f2Var3 = new C10226f2();
        f2Var3.m5694a(AbstractC10231g2.m5679a(bVar2, aVar));
        f2Var3.m5694a(AbstractC10231g2.m5679a(bVar2, aVar2));
        arrayList.add(f2Var3);
        C10226f2 f2Var4 = new C10226f2();
        f2Var4.m5694a(AbstractC10231g2.m5679a(bVar, aVar));
        f2Var4.m5694a(AbstractC10231g2.m5679a(bVar, aVar));
        f2Var4.m5694a(AbstractC10231g2.m5679a(AbstractC10231g2.EnumC10233b.JPEG, aVar2));
        arrayList.add(f2Var4);
        C10226f2 f2Var5 = new C10226f2();
        AbstractC10231g2.EnumC10232a aVar3 = AbstractC10231g2.EnumC10232a.ANALYSIS;
        f2Var5.m5694a(AbstractC10231g2.m5679a(bVar2, aVar3));
        f2Var5.m5694a(AbstractC10231g2.m5679a(bVar, aVar));
        f2Var5.m5694a(AbstractC10231g2.m5679a(bVar2, aVar2));
        arrayList.add(f2Var5);
        C10226f2 f2Var6 = new C10226f2();
        f2Var6.m5694a(AbstractC10231g2.m5679a(bVar2, aVar3));
        f2Var6.m5694a(AbstractC10231g2.m5679a(bVar2, aVar));
        f2Var6.m5694a(AbstractC10231g2.m5679a(bVar2, aVar2));
        arrayList.add(f2Var6);
        return arrayList;
    }

    public List<C10226f2> m12273q() {
        ArrayList arrayList = new ArrayList();
        C10226f2 f2Var = new C10226f2();
        AbstractC10231g2.EnumC10233b bVar = AbstractC10231g2.EnumC10233b.PRIV;
        AbstractC10231g2.EnumC10232a aVar = AbstractC10231g2.EnumC10232a.MAXIMUM;
        f2Var.m5694a(AbstractC10231g2.m5679a(bVar, aVar));
        arrayList.add(f2Var);
        C10226f2 f2Var2 = new C10226f2();
        AbstractC10231g2.EnumC10233b bVar2 = AbstractC10231g2.EnumC10233b.JPEG;
        f2Var2.m5694a(AbstractC10231g2.m5679a(bVar2, aVar));
        arrayList.add(f2Var2);
        C10226f2 f2Var3 = new C10226f2();
        AbstractC10231g2.EnumC10233b bVar3 = AbstractC10231g2.EnumC10233b.YUV;
        f2Var3.m5694a(AbstractC10231g2.m5679a(bVar3, aVar));
        arrayList.add(f2Var3);
        C10226f2 f2Var4 = new C10226f2();
        AbstractC10231g2.EnumC10232a aVar2 = AbstractC10231g2.EnumC10232a.PREVIEW;
        f2Var4.m5694a(AbstractC10231g2.m5679a(bVar, aVar2));
        f2Var4.m5694a(AbstractC10231g2.m5679a(bVar2, aVar));
        arrayList.add(f2Var4);
        C10226f2 f2Var5 = new C10226f2();
        f2Var5.m5694a(AbstractC10231g2.m5679a(bVar3, aVar2));
        f2Var5.m5694a(AbstractC10231g2.m5679a(bVar2, aVar));
        arrayList.add(f2Var5);
        C10226f2 f2Var6 = new C10226f2();
        f2Var6.m5694a(AbstractC10231g2.m5679a(bVar, aVar2));
        f2Var6.m5694a(AbstractC10231g2.m5679a(bVar, aVar2));
        arrayList.add(f2Var6);
        C10226f2 f2Var7 = new C10226f2();
        f2Var7.m5694a(AbstractC10231g2.m5679a(bVar, aVar2));
        f2Var7.m5694a(AbstractC10231g2.m5679a(bVar3, aVar2));
        arrayList.add(f2Var7);
        C10226f2 f2Var8 = new C10226f2();
        f2Var8.m5694a(AbstractC10231g2.m5679a(bVar, aVar2));
        f2Var8.m5694a(AbstractC10231g2.m5679a(bVar3, aVar2));
        f2Var8.m5694a(AbstractC10231g2.m5679a(bVar2, aVar));
        arrayList.add(f2Var8);
        return arrayList;
    }

    public List<C10226f2> m12272r() {
        ArrayList arrayList = new ArrayList();
        C10226f2 f2Var = new C10226f2();
        AbstractC10231g2.EnumC10233b bVar = AbstractC10231g2.EnumC10233b.PRIV;
        AbstractC10231g2.EnumC10232a aVar = AbstractC10231g2.EnumC10232a.PREVIEW;
        f2Var.m5694a(AbstractC10231g2.m5679a(bVar, aVar));
        AbstractC10231g2.EnumC10232a aVar2 = AbstractC10231g2.EnumC10232a.ANALYSIS;
        f2Var.m5694a(AbstractC10231g2.m5679a(bVar, aVar2));
        AbstractC10231g2.EnumC10233b bVar2 = AbstractC10231g2.EnumC10233b.YUV;
        AbstractC10231g2.EnumC10232a aVar3 = AbstractC10231g2.EnumC10232a.MAXIMUM;
        f2Var.m5694a(AbstractC10231g2.m5679a(bVar2, aVar3));
        AbstractC10231g2.EnumC10233b bVar3 = AbstractC10231g2.EnumC10233b.RAW;
        f2Var.m5694a(AbstractC10231g2.m5679a(bVar3, aVar3));
        arrayList.add(f2Var);
        C10226f2 f2Var2 = new C10226f2();
        f2Var2.m5694a(AbstractC10231g2.m5679a(bVar, aVar));
        f2Var2.m5694a(AbstractC10231g2.m5679a(bVar, aVar2));
        f2Var2.m5694a(AbstractC10231g2.m5679a(AbstractC10231g2.EnumC10233b.JPEG, aVar3));
        f2Var2.m5694a(AbstractC10231g2.m5679a(bVar3, aVar3));
        arrayList.add(f2Var2);
        return arrayList;
    }

    public List<C10226f2> m12271s() {
        ArrayList arrayList = new ArrayList();
        C10226f2 f2Var = new C10226f2();
        AbstractC10231g2.EnumC10233b bVar = AbstractC10231g2.EnumC10233b.PRIV;
        AbstractC10231g2.EnumC10232a aVar = AbstractC10231g2.EnumC10232a.PREVIEW;
        f2Var.m5694a(AbstractC10231g2.m5679a(bVar, aVar));
        AbstractC10231g2.EnumC10232a aVar2 = AbstractC10231g2.EnumC10232a.RECORD;
        f2Var.m5694a(AbstractC10231g2.m5679a(bVar, aVar2));
        arrayList.add(f2Var);
        C10226f2 f2Var2 = new C10226f2();
        f2Var2.m5694a(AbstractC10231g2.m5679a(bVar, aVar));
        AbstractC10231g2.EnumC10233b bVar2 = AbstractC10231g2.EnumC10233b.YUV;
        f2Var2.m5694a(AbstractC10231g2.m5679a(bVar2, aVar2));
        arrayList.add(f2Var2);
        C10226f2 f2Var3 = new C10226f2();
        f2Var3.m5694a(AbstractC10231g2.m5679a(bVar2, aVar));
        f2Var3.m5694a(AbstractC10231g2.m5679a(bVar2, aVar2));
        arrayList.add(f2Var3);
        C10226f2 f2Var4 = new C10226f2();
        f2Var4.m5694a(AbstractC10231g2.m5679a(bVar, aVar));
        f2Var4.m5694a(AbstractC10231g2.m5679a(bVar, aVar2));
        AbstractC10231g2.EnumC10233b bVar3 = AbstractC10231g2.EnumC10233b.JPEG;
        f2Var4.m5694a(AbstractC10231g2.m5679a(bVar3, aVar2));
        arrayList.add(f2Var4);
        C10226f2 f2Var5 = new C10226f2();
        f2Var5.m5694a(AbstractC10231g2.m5679a(bVar, aVar));
        f2Var5.m5694a(AbstractC10231g2.m5679a(bVar2, aVar2));
        f2Var5.m5694a(AbstractC10231g2.m5679a(bVar3, aVar2));
        arrayList.add(f2Var5);
        C10226f2 f2Var6 = new C10226f2();
        f2Var6.m5694a(AbstractC10231g2.m5679a(bVar2, aVar));
        f2Var6.m5694a(AbstractC10231g2.m5679a(bVar2, aVar));
        f2Var6.m5694a(AbstractC10231g2.m5679a(bVar3, AbstractC10231g2.EnumC10232a.MAXIMUM));
        arrayList.add(f2Var6);
        return arrayList;
    }

    public Size m12270t(int i) {
        return (Size) Collections.max(Arrays.asList(m12280j(i)), new C11180c());
    }

    public List<C10226f2> m12269u() {
        ArrayList arrayList = new ArrayList();
        C10226f2 f2Var = new C10226f2();
        AbstractC10231g2.EnumC10233b bVar = AbstractC10231g2.EnumC10233b.RAW;
        AbstractC10231g2.EnumC10232a aVar = AbstractC10231g2.EnumC10232a.MAXIMUM;
        f2Var.m5694a(AbstractC10231g2.m5679a(bVar, aVar));
        arrayList.add(f2Var);
        C10226f2 f2Var2 = new C10226f2();
        AbstractC10231g2.EnumC10233b bVar2 = AbstractC10231g2.EnumC10233b.PRIV;
        AbstractC10231g2.EnumC10232a aVar2 = AbstractC10231g2.EnumC10232a.PREVIEW;
        f2Var2.m5694a(AbstractC10231g2.m5679a(bVar2, aVar2));
        f2Var2.m5694a(AbstractC10231g2.m5679a(bVar, aVar));
        arrayList.add(f2Var2);
        C10226f2 f2Var3 = new C10226f2();
        AbstractC10231g2.EnumC10233b bVar3 = AbstractC10231g2.EnumC10233b.YUV;
        f2Var3.m5694a(AbstractC10231g2.m5679a(bVar3, aVar2));
        f2Var3.m5694a(AbstractC10231g2.m5679a(bVar, aVar));
        arrayList.add(f2Var3);
        C10226f2 f2Var4 = new C10226f2();
        f2Var4.m5694a(AbstractC10231g2.m5679a(bVar2, aVar2));
        f2Var4.m5694a(AbstractC10231g2.m5679a(bVar2, aVar2));
        f2Var4.m5694a(AbstractC10231g2.m5679a(bVar, aVar));
        arrayList.add(f2Var4);
        C10226f2 f2Var5 = new C10226f2();
        f2Var5.m5694a(AbstractC10231g2.m5679a(bVar2, aVar2));
        f2Var5.m5694a(AbstractC10231g2.m5679a(bVar3, aVar2));
        f2Var5.m5694a(AbstractC10231g2.m5679a(bVar, aVar));
        arrayList.add(f2Var5);
        C10226f2 f2Var6 = new C10226f2();
        f2Var6.m5694a(AbstractC10231g2.m5679a(bVar3, aVar2));
        f2Var6.m5694a(AbstractC10231g2.m5679a(bVar3, aVar2));
        f2Var6.m5694a(AbstractC10231g2.m5679a(bVar, aVar));
        arrayList.add(f2Var6);
        C10226f2 f2Var7 = new C10226f2();
        f2Var7.m5694a(AbstractC10231g2.m5679a(bVar2, aVar2));
        AbstractC10231g2.EnumC10233b bVar4 = AbstractC10231g2.EnumC10233b.JPEG;
        f2Var7.m5694a(AbstractC10231g2.m5679a(bVar4, aVar));
        f2Var7.m5694a(AbstractC10231g2.m5679a(bVar, aVar));
        arrayList.add(f2Var7);
        C10226f2 f2Var8 = new C10226f2();
        f2Var8.m5694a(AbstractC10231g2.m5679a(bVar3, aVar2));
        f2Var8.m5694a(AbstractC10231g2.m5679a(bVar4, aVar));
        f2Var8.m5694a(AbstractC10231g2.m5679a(bVar, aVar));
        arrayList.add(f2Var8);
        return arrayList;
    }

    public final Size m12268v() {
        try {
            int parseInt = Integer.parseInt(this.f27580c);
            CamcorderProfile camcorderProfile = null;
            if (this.f27581d.mo12443b(parseInt, 1)) {
                camcorderProfile = this.f27581d.mo12444a(parseInt, 1);
            }
            if (camcorderProfile != null) {
                return new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            }
            return m12267w(parseInt);
        } catch (NumberFormatException unused) {
            return m12266x();
        }
    }

    public final Size m12267w(int i) {
        CamcorderProfile camcorderProfile;
        Size size = f27573t;
        if (this.f27581d.mo12443b(i, 10)) {
            camcorderProfile = this.f27581d.mo12444a(i, 10);
        } else if (this.f27581d.mo12443b(i, 8)) {
            camcorderProfile = this.f27581d.mo12444a(i, 8);
        } else if (this.f27581d.mo12443b(i, 12)) {
            camcorderProfile = this.f27581d.mo12444a(i, 12);
        } else if (this.f27581d.mo12443b(i, 6)) {
            camcorderProfile = this.f27581d.mo12444a(i, 6);
        } else if (this.f27581d.mo12443b(i, 5)) {
            camcorderProfile = this.f27581d.mo12444a(i, 5);
        } else {
            camcorderProfile = this.f27581d.mo12443b(i, 4) ? this.f27581d.mo12444a(i, 4) : null;
        }
        return camcorderProfile != null ? new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight) : size;
    }

    public final Size m12266x() {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f27582e.m10951a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            Size[] outputSizes = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
            if (outputSizes == null) {
                return f27573t;
            }
            Arrays.sort(outputSizes, new C11180c(true));
            for (Size size : outputSizes) {
                int width = size.getWidth();
                Size size2 = f27572s;
                if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                    return size;
                }
            }
            return f27573t;
        }
        throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    public Map<AbstractC10273n2<?>, Size> m12265y(List<AbstractC10231g2> list, List<AbstractC10273n2<?>> list2) {
        m12292J();
        ArrayList arrayList = new ArrayList(list);
        for (AbstractC10273n2<?> n2Var : list2) {
            arrayList.add(m12290L(n2Var.mo5435m(), new Size(640, 480)));
        }
        if (m12288b(arrayList)) {
            List<Integer> C = m12299C(list2);
            ArrayList arrayList2 = new ArrayList();
            for (Integer num : C) {
                arrayList2.add(m12264z(list2.get(num.intValue())));
            }
            HashMap hashMap = null;
            Iterator<List<Size>> it = m12279k(arrayList2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                List<Size> next = it.next();
                ArrayList arrayList3 = new ArrayList(list);
                for (int i = 0; i < next.size(); i++) {
                    arrayList3.add(m12290L(list2.get(C.get(i).intValue()).mo5435m(), next.get(i)));
                }
                if (m12288b(arrayList3)) {
                    hashMap = new HashMap();
                    for (AbstractC10273n2<?> n2Var2 : list2) {
                        hashMap.put(n2Var2, next.get(C.indexOf(Integer.valueOf(list2.indexOf(n2Var2)))));
                    }
                }
            }
            if (hashMap != null) {
                return hashMap;
            }
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f27580c + " and Hardware level: " + this.f27585h + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + " New configs: " + list2);
        }
        throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f27580c + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + list2);
    }

    public List<Size> m12264z(AbstractC10273n2<?> n2Var) {
        int m = n2Var.mo5435m();
        AbstractC10219e1 e1Var = (AbstractC10219e1) n2Var;
        Size[] o = m12275o(m, e1Var);
        if (o == null) {
            o = m12280j(m);
        }
        ArrayList arrayList = new ArrayList();
        Size f = e1Var.mo5440f(null);
        Size t = m12270t(m);
        if (f == null || m12278l(t) < m12278l(f)) {
            f = t;
        }
        Arrays.sort(o, new C11180c(true));
        Size B = m12300B(e1Var);
        Size size = f27570q;
        int l = m12278l(size);
        if (m12278l(f) < l) {
            size = f27571r;
        } else if (B != null && m12278l(B) < l) {
            size = B;
        }
        for (Size size2 : o) {
            if (m12278l(size2) <= m12278l(f) && m12278l(size2) >= m12278l(size) && !arrayList.contains(size2)) {
                arrayList.add(size2);
            }
        }
        if (!arrayList.isEmpty()) {
            Rational A = m12301A(e1Var);
            if (B == null) {
                B = e1Var.mo5434o(null);
            }
            List<Size> arrayList2 = new ArrayList<>();
            new HashMap();
            if (A == null) {
                arrayList2.addAll(arrayList);
                if (B != null) {
                    m12291K(arrayList2, B);
                }
            } else {
                Map<Rational, List<Size>> D = m12298D(arrayList);
                if (B != null) {
                    for (Rational rational : D.keySet()) {
                        m12291K(D.get(rational), B);
                    }
                }
                ArrayList<Rational> arrayList3 = new ArrayList(D.keySet());
                Collections.sort(arrayList3, new C8503a(A));
                for (Rational rational2 : arrayList3) {
                    for (Size size3 : D.get(rational2)) {
                        if (!arrayList2.contains(size3)) {
                            arrayList2.add(size3);
                        }
                    }
                }
            }
            return this.f27593p.m6466a(m12276n(n2Var.mo5435m()), arrayList2);
        }
        throw new IllegalArgumentException("Can not get supported output size under supported maximum for the format: " + m);
    }
}
