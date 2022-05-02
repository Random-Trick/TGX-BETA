package md;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import javax.xml.parsers.SAXParserFactory;
import nc.C7389v0;
import org.thunderdog.challegram.Log;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import p039d.C3563j;
import p108hb.C5070i;

public class C6820b {
    public static final Pattern f21357a = Pattern.compile("[\\s,]*");
    public static final RectF f21358b = new RectF();
    public static final Matrix f21359c = new Matrix();
    public static final Matrix f21360d = new Matrix();

    public static class C6821a {
        public ArrayList<Float> f21361a;
        public int f21362b;

        public C6821a(ArrayList<Float> arrayList, int i) {
            this.f21361a = arrayList;
            this.f21362b = i;
        }
    }

    public static class C6822b {
        public Attributes f21363a;
        public ArrayList<C6825d> f21364b;

        public C6822b(Attributes attributes, HashMap<String, C6825d> hashMap) {
            String[] split;
            this.f21364b = new ArrayList<>();
            this.f21363a = attributes;
            String m = C6820b.m18880m("style", attributes);
            if (m != null) {
                this.f21364b.add(new C6825d(m));
            }
            String m2 = C6820b.m18880m("class", attributes);
            if (m2 != null) {
                for (String str : m2.split(" ")) {
                    if (hashMap.containsKey(str)) {
                        this.f21364b.add(hashMap.get(str));
                    }
                }
            }
        }

        public String m18873a(String str) {
            String str2 = null;
            for (int i = 0; i < this.f21364b.size() && (str2 = this.f21364b.get(i).m18863a(str)) == null; i++) {
            }
            return str2 == null ? C6820b.m18880m(str, this.f21363a) : str2;
        }

        public Float m18872b(String str) {
            return m18871c(str, null);
        }

        public Float m18871c(String str, Float f) {
            String a = m18873a(str);
            if (a == null) {
                return f;
            }
            try {
                return Float.valueOf(Float.parseFloat(a));
            } catch (NumberFormatException unused) {
                return f;
            }
        }

        public Integer m18870d(String str) {
            String a = m18873a(str);
            if (a == null) {
                return null;
            }
            try {
                return Integer.valueOf(Integer.parseInt(a.substring(1), 16));
            } catch (NumberFormatException unused) {
                return 0;
            }
        }

        public String m18869e(String str) {
            return m18873a(str);
        }
    }

    public static class C6823c extends DefaultHandler {
        public Bitmap f21365a;
        public Canvas f21366b;
        public StringBuilder f21367c;
        public boolean f21368d;
        public boolean f21369e;
        public final HashMap<String, C6825d> f21370f = new HashMap<>();
        public final Paint f21371g = new Paint(1);
        public final RectF f21372h = new RectF();
        public final int f21373i;
        public final boolean f21374j;

        public static class C6824a extends IllegalArgumentException {
        }

        public C6823c(int i, boolean z) {
            this.f21373i = i;
            this.f21374j = z;
        }

        public final void m18868a(C6822b bVar, Integer num, boolean z) {
            this.f21371g.setColor((num.intValue() & 16777215) | (-16777216));
            Float b = bVar.m18872b("opacity");
            if (b == null) {
                b = bVar.m18872b(z ? "fill-opacity" : "stroke-opacity");
            }
            if (b == null) {
                this.f21371g.setAlpha(255);
            } else {
                this.f21371g.setAlpha((int) (b.floatValue() * 255.0f));
            }
        }

        public final boolean m18867b(C6822b bVar) {
            if ("none".equals(bVar.m18869e("display"))) {
                return false;
            }
            String e = bVar.m18869e("fill");
            if (e != null && (e.startsWith("url(#") || e.equals("none"))) {
                return false;
            }
            Integer d = bVar.m18870d("fill");
            if (d != null) {
                m18868a(bVar, d, true);
                this.f21371g.setStyle(Paint.Style.STROKE);
                return true;
            } else if (bVar.m18869e("fill") != null || bVar.m18869e("stroke") != null) {
                return false;
            } else {
                this.f21371g.setStyle(Paint.Style.FILL);
                this.f21371g.setColor(-16777216);
                return true;
            }
        }

        public final boolean m18866c(C6822b bVar) {
            Integer d;
            if ("none".equals(bVar.m18869e("display")) || (d = bVar.m18870d("stroke")) == null) {
                return false;
            }
            m18868a(bVar, d, false);
            Float b = bVar.m18872b("stroke-width");
            if (b != null) {
                this.f21371g.setStrokeWidth(b.floatValue());
            }
            String e = bVar.m18869e("stroke-linecap");
            if ("round".equals(e)) {
                this.f21371g.setStrokeCap(Paint.Cap.ROUND);
            } else if ("square".equals(e)) {
                this.f21371g.setStrokeCap(Paint.Cap.SQUARE);
            } else if ("butt".equals(e)) {
                this.f21371g.setStrokeCap(Paint.Cap.BUTT);
            }
            String e2 = bVar.m18869e("stroke-linejoin");
            if ("miter".equals(e2)) {
                this.f21371g.setStrokeJoin(Paint.Join.MITER);
            } else if ("round".equals(e2)) {
                this.f21371g.setStrokeJoin(Paint.Join.ROUND);
            } else if ("bevel".equals(e2)) {
                this.f21371g.setStrokeJoin(Paint.Join.BEVEL);
            }
            this.f21371g.setStyle(Paint.Style.STROKE);
            return true;
        }

        @Override
        public void characters(char[] cArr, int i, int i2) {
            StringBuilder sb2 = this.f21367c;
            if (sb2 != null) {
                sb2.append(cArr, i, i2);
            }
        }

        public final void m18865d() {
            if (this.f21369e) {
                this.f21366b.restore();
            }
        }

        public final void m18864e(Attributes attributes) {
            String m = C6820b.m18880m("transform", attributes);
            boolean z = m != null;
            this.f21369e = z;
            if (z) {
                this.f21366b.save();
                this.f21366b.concat(C6820b.m18877p(m));
            }
        }

        @Override
        public void endElement(String str, String str2, String str3) {
            int indexOf;
            str2.hashCode();
            char c = 65535;
            switch (str2.hashCode()) {
                case 103:
                    if (str2.equals("g")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3079438:
                    if (str2.equals("defs")) {
                        c = 1;
                        break;
                    }
                    break;
                case 109780401:
                    if (str2.equals("style")) {
                        c = 2;
                        break;
                    }
                    break;
                case 917656469:
                    if (str2.equals("clipPath")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 3:
                    this.f21368d = false;
                    return;
                case 2:
                    StringBuilder sb2 = this.f21367c;
                    if (sb2 != null) {
                        String[] split = sb2.toString().split("\\}");
                        for (int i = 0; i < split.length; i++) {
                            split[i] = split[i].trim().replace("\t", "").replace("\n", "");
                            if (split[i].length() != 0 && split[i].charAt(0) == '.' && (indexOf = split[i].indexOf(C3563j.f11972O0)) >= 0) {
                                this.f21370f.put(split[i].substring(1, indexOf).trim(), new C6825d(split[i].substring(indexOf + 1)));
                            }
                        }
                        this.f21367c = null;
                        return;
                    }
                    return;
                default:
                    return;
            }
        }

        @Override
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            if (!this.f21368d || str2.equals("style")) {
                str2.hashCode();
                char c = 65535;
                boolean z = true;
                switch (str2.hashCode()) {
                    case -1656480802:
                        if (str2.equals("ellipse")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1360216880:
                        if (str2.equals("circle")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -397519558:
                        if (str2.equals("polygon")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 103:
                        if (str2.equals("g")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 114276:
                        if (str2.equals("svg")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 3079438:
                        if (str2.equals("defs")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 3321844:
                        if (str2.equals("line")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 3433509:
                        if (str2.equals("path")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 3496420:
                        if (str2.equals("rect")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 109780401:
                        if (str2.equals("style")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 561938880:
                        if (str2.equals("polyline")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case 917656469:
                        if (str2.equals("clipPath")) {
                            c = 11;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        Float k = C6820b.m18882k("cx", attributes);
                        Float k2 = C6820b.m18882k("cy", attributes);
                        Float k3 = C6820b.m18882k("rx", attributes);
                        Float k4 = C6820b.m18882k("ry", attributes);
                        if (!(k == null || k2 == null || k3 == null || k4 == null)) {
                            m18864e(attributes);
                            C6822b bVar = new C6822b(attributes, this.f21370f);
                            this.f21372h.set(k.floatValue() - k3.floatValue(), k2.floatValue() - k4.floatValue(), k.floatValue() + k3.floatValue(), k2.floatValue() + k4.floatValue());
                            if (m18867b(bVar)) {
                                this.f21366b.drawOval(this.f21372h, this.f21371g);
                            }
                            if (m18866c(bVar)) {
                                this.f21366b.drawOval(this.f21372h, this.f21371g);
                            }
                            m18865d();
                            return;
                        }
                        return;
                    case 1:
                        Float k5 = C6820b.m18882k("cx", attributes);
                        Float k6 = C6820b.m18882k("cy", attributes);
                        Float k7 = C6820b.m18882k("r", attributes);
                        if (!(k5 == null || k6 == null || k7 == null)) {
                            m18864e(attributes);
                            C6822b bVar2 = new C6822b(attributes, this.f21370f);
                            if (m18867b(bVar2)) {
                                this.f21366b.drawCircle(k5.floatValue(), k6.floatValue(), k7.floatValue(), this.f21371g);
                            }
                            if (m18866c(bVar2)) {
                                this.f21366b.drawCircle(k5.floatValue(), k6.floatValue(), k7.floatValue(), this.f21371g);
                            }
                            m18865d();
                            return;
                        }
                        return;
                    case 2:
                    case '\n':
                        C6821a o = C6820b.m18878o(attributes.getValue("points"));
                        if (o != null) {
                            Path path = new Path();
                            ArrayList arrayList = o.f21361a;
                            if (arrayList.size() > 1) {
                                m18864e(attributes);
                                C6822b bVar3 = new C6822b(attributes, this.f21370f);
                                path.moveTo(((Float) arrayList.get(0)).floatValue(), ((Float) arrayList.get(1)).floatValue());
                                for (int i = 2; i < arrayList.size(); i += 2) {
                                    path.lineTo(((Float) arrayList.get(i)).floatValue(), ((Float) arrayList.get(i + 1)).floatValue());
                                }
                                if (str2.equals("polygon")) {
                                    path.close();
                                }
                                if (m18867b(bVar3)) {
                                    this.f21366b.drawPath(path, this.f21371g);
                                }
                                if (m18866c(bVar3)) {
                                    this.f21366b.drawPath(path, this.f21371g);
                                }
                                m18865d();
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        if ("bounds".equalsIgnoreCase(C6820b.m18880m("id", attributes))) {
                            this.f21368d = true;
                            return;
                        }
                        return;
                    case 4:
                        String m = C6820b.m18880m("viewBox", attributes);
                        if (!C5070i.m24062i(m)) {
                            String[] split = m.split(" ");
                            if (split.length == 4) {
                                float parseFloat = Float.parseFloat(split[2]);
                                float parseFloat2 = Float.parseFloat(split[3]);
                                int i2 = this.f21373i;
                                float min = Math.min(1.0f, Math.min(i2 / parseFloat, i2 / parseFloat2));
                                int i3 = (int) (parseFloat * min);
                                int i4 = (int) (parseFloat2 * min);
                                if (!this.f21374j || i3 == i4) {
                                    z = false;
                                }
                                if (z) {
                                    int min2 = Math.min(i3, i4);
                                    this.f21365a = Bitmap.createBitmap(min2, min2, Bitmap.Config.ARGB_8888);
                                } else {
                                    this.f21365a = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                                }
                                this.f21365a.eraseColor(0);
                                Canvas canvas = new Canvas(this.f21365a);
                                this.f21366b = canvas;
                                if (z) {
                                    if (i3 > i4) {
                                        canvas.translate((-(i3 - i4)) / 2.0f, 0.0f);
                                    } else {
                                        canvas.translate(0.0f, (-(i4 - i3)) / 2.0f);
                                    }
                                }
                                this.f21366b.scale(min, min, 0.0f, 0.0f);
                                return;
                            }
                            throw new C6824a();
                        }
                        throw new C6824a();
                    case 5:
                    case 11:
                        this.f21368d = true;
                        return;
                    case 6:
                        Float k8 = C6820b.m18882k("x1", attributes);
                        Float k9 = C6820b.m18882k("x2", attributes);
                        Float k10 = C6820b.m18882k("y1", attributes);
                        Float k11 = C6820b.m18882k("y2", attributes);
                        if (m18866c(new C6822b(attributes, this.f21370f))) {
                            m18864e(attributes);
                            this.f21366b.drawLine(k8.floatValue(), k10.floatValue(), k9.floatValue(), k11.floatValue(), this.f21371g);
                            m18865d();
                            return;
                        }
                        return;
                    case 7:
                        Path h = C6820b.m18885h(C6820b.m18880m("d", attributes));
                        m18864e(attributes);
                        C6822b bVar4 = new C6822b(attributes, this.f21370f);
                        if (m18867b(bVar4)) {
                            this.f21366b.drawPath(h, this.f21371g);
                        }
                        if (m18866c(bVar4)) {
                            this.f21366b.drawPath(h, this.f21371g);
                        }
                        m18865d();
                        return;
                    case '\b':
                        Float k12 = C6820b.m18882k("x", attributes);
                        if (k12 == null) {
                            k12 = Float.valueOf(0.0f);
                        }
                        Float k13 = C6820b.m18882k("y", attributes);
                        if (k13 == null) {
                            k13 = Float.valueOf(0.0f);
                        }
                        Float k14 = C6820b.m18882k("width", attributes);
                        Float k15 = C6820b.m18882k("height", attributes);
                        Float l = C6820b.m18881l("rx", attributes, null);
                        m18864e(attributes);
                        C6822b bVar5 = new C6822b(attributes, this.f21370f);
                        if (m18867b(bVar5)) {
                            if (l != null) {
                                this.f21372h.set(k12.floatValue(), k13.floatValue(), k12.floatValue() + k14.floatValue(), k13.floatValue() + k15.floatValue());
                                this.f21366b.drawRoundRect(this.f21372h, l.floatValue(), l.floatValue(), this.f21371g);
                            } else {
                                this.f21366b.drawRect(k12.floatValue(), k13.floatValue(), k12.floatValue() + k14.floatValue(), k13.floatValue() + k15.floatValue(), this.f21371g);
                            }
                        }
                        if (m18866c(bVar5)) {
                            if (l != null) {
                                this.f21372h.set(k12.floatValue(), k13.floatValue(), k12.floatValue() + k14.floatValue(), k13.floatValue() + k15.floatValue());
                                this.f21366b.drawRoundRect(this.f21372h, l.floatValue(), l.floatValue(), this.f21371g);
                            } else {
                                this.f21366b.drawRect(k12.floatValue(), k13.floatValue(), k12.floatValue() + k14.floatValue(), k13.floatValue() + k15.floatValue(), this.f21371g);
                            }
                        }
                        m18865d();
                        return;
                    case '\t':
                        this.f21367c = new StringBuilder();
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public static class C6825d {
        public HashMap<String, String> f21375a;

        public C6825d(String str) {
            this.f21375a = new HashMap<>();
            for (String str2 : str.split(";")) {
                String[] split = str2.split(":");
                if (split.length == 2) {
                    this.f21375a.put(split[0], split[1]);
                }
            }
        }

        public String m18863a(String str) {
            return this.f21375a.get(str);
        }
    }

    public static float m18886g(float f, float f2, float f3, float f4) {
        return ((float) Math.toDegrees(Math.atan2(f, f2) - Math.atan2(f3, f4))) % 360.0f;
    }

    public static android.graphics.Path m18885h(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: md.C6820b.m18885h(java.lang.String):android.graphics.Path");
    }

    public static void m18884i(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2) {
        if (f5 == 0.0f || f6 == 0.0f) {
            path.lineTo(f3, f4);
        } else if (f3 != f || f4 != f2) {
            float abs = Math.abs(f5);
            float abs2 = Math.abs(f6);
            double d = (3.1415927f * f7) / 180.0f;
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            float f8 = (f - f3) / 2.0f;
            float f9 = (f2 - f4) / 2.0f;
            float f10 = (cos * f8) + (sin * f9);
            float f11 = ((-sin) * f8) + (f9 * cos);
            float f12 = f10 * f10;
            float f13 = f11 * f11;
            float f14 = abs * abs;
            float f15 = abs2 * abs2;
            float f16 = ((f12 / f14) + (f13 / f15)) * 1.001f;
            if (f16 > 1.0f) {
                float sqrt = (float) Math.sqrt(f16);
                abs *= sqrt;
                abs2 *= sqrt;
                f14 = abs * abs;
                f15 = abs2 * abs2;
            }
            float f17 = f14 * f15;
            float f18 = f14 * f13;
            float f19 = f15 * f12;
            float sqrt2 = (float) (Math.sqrt(((f17 - f18) - f19) / (f18 + f19)) * (i == i2 ? -1 : 1));
            float f20 = ((sqrt2 * abs) * f11) / abs2;
            float f21 = (((-sqrt2) * abs2) * f10) / abs;
            float f22 = ((cos * f20) - (sin * f21)) + ((f + f3) / 2.0f);
            float f23 = (sin * f20) + (cos * f21) + ((f2 + f4) / 2.0f);
            float f24 = (f10 - f20) / abs;
            float f25 = (f11 - f21) / abs2;
            float g = m18886g(1.0f, 0.0f, f24, f25);
            float g2 = m18886g(f24, f25, ((-f10) - f20) / abs, ((-f11) - f21) / abs2);
            if (i2 == 0 && g2 > 0.0f) {
                g2 -= 360.0f;
            } else if (i2 != 0 && g2 < 0.0f) {
                g2 += 360.0f;
            }
            if (f7 % 360.0f == 0.0f) {
                RectF rectF = f21358b;
                rectF.set(f22 - abs, f23 - abs2, f22 + abs, f23 + abs2);
                path.arcTo(rectF, g, g2);
                return;
            }
            RectF rectF2 = f21358b;
            rectF2.set(-abs, -abs2, abs, abs2);
            Matrix matrix = f21359c;
            matrix.reset();
            matrix.postRotate(f7);
            matrix.postTranslate(f22, f23);
            Matrix matrix2 = f21360d;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.arcTo(rectF2, g, g2);
            path.transform(matrix);
        }
    }

    public static Bitmap m18883j(int i, boolean z, String str) {
        return m18875r(i, z, C7389v0.m16652b1(str));
    }

    public static Float m18882k(String str, Attributes attributes) {
        return m18881l(str, attributes, null);
    }

    public static Float m18881l(String str, Attributes attributes, Float f) {
        return m18879n(m18880m(str, attributes), f);
    }

    public static String m18880m(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                return attributes.getValue(i);
            }
        }
        return null;
    }

    public static Float m18879n(String str, Float f) {
        if (str == null) {
            return f;
        }
        if (str.endsWith("px")) {
            str = str.substring(0, str.length() - 2);
        } else if (str.endsWith("%")) {
            return Float.valueOf(Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f);
        }
        return Float.valueOf(Float.parseFloat(str));
    }

    public static md.C6820b.C6821a m18878o(java.lang.String r10) {
        throw new UnsupportedOperationException("Method not decompiled: md.C6820b.m18878o(java.lang.String):md.b$a");
    }

    public static Matrix m18877p(String str) {
        int i;
        Matrix matrix = new Matrix();
        while (true) {
            m18876q(str, matrix);
            int indexOf = str.indexOf(")");
            if (indexOf <= 0 || str.length() <= (i = indexOf + 1)) {
                break;
            }
            str = f21357a.matcher(str.substring(i)).replaceFirst("");
        }
        return matrix;
    }

    public static Matrix m18876q(String str, Matrix matrix) {
        float f;
        float f2 = 0.0f;
        if (str.startsWith("matrix(")) {
            C6821a o = m18878o(str.substring(7));
            if (o.f21361a.size() == 6) {
                Matrix matrix2 = new Matrix();
                matrix2.setValues(new float[]{((Float) o.f21361a.get(0)).floatValue(), ((Float) o.f21361a.get(2)).floatValue(), ((Float) o.f21361a.get(4)).floatValue(), ((Float) o.f21361a.get(1)).floatValue(), ((Float) o.f21361a.get(3)).floatValue(), ((Float) o.f21361a.get(5)).floatValue(), 0.0f, 0.0f, 1.0f});
                matrix.preConcat(matrix2);
            }
        } else if (str.startsWith("translate(")) {
            C6821a o2 = m18878o(str.substring(10));
            if (o2.f21361a.size() > 0) {
                float floatValue = ((Float) o2.f21361a.get(0)).floatValue();
                if (o2.f21361a.size() > 1) {
                    f2 = ((Float) o2.f21361a.get(1)).floatValue();
                }
                matrix.preTranslate(floatValue, f2);
            }
        } else if (str.startsWith("scale(")) {
            C6821a o3 = m18878o(str.substring(6));
            if (o3.f21361a.size() > 0) {
                float floatValue2 = ((Float) o3.f21361a.get(0)).floatValue();
                matrix.preScale(floatValue2, o3.f21361a.size() > 1 ? ((Float) o3.f21361a.get(1)).floatValue() : floatValue2);
            }
        } else if (str.startsWith("skewX(")) {
            C6821a o4 = m18878o(str.substring(6));
            if (o4.f21361a.size() > 0) {
                matrix.preSkew((float) Math.tan(((Float) o4.f21361a.get(0)).floatValue()), 0.0f);
            }
        } else if (str.startsWith("skewY(")) {
            C6821a o5 = m18878o(str.substring(6));
            if (o5.f21361a.size() > 0) {
                matrix.preSkew(0.0f, (float) Math.tan(((Float) o5.f21361a.get(0)).floatValue()));
            }
        } else if (str.startsWith("rotate(")) {
            C6821a o6 = m18878o(str.substring(7));
            if (o6.f21361a.size() > 0) {
                float floatValue3 = ((Float) o6.f21361a.get(0)).floatValue();
                if (o6.f21361a.size() > 2) {
                    f2 = ((Float) o6.f21361a.get(1)).floatValue();
                    f = ((Float) o6.f21361a.get(2)).floatValue();
                } else {
                    f = 0.0f;
                }
                matrix.preTranslate(-f2, -f);
                matrix.preRotate(floatValue3);
                matrix.preTranslate(f2, f);
            }
        } else {
            Log.m14709w("SVG render: invalid transform (" + str + ")", new Object[0]);
        }
        return matrix;
    }

    public static Bitmap m18875r(int i, boolean z, String str) {
        try {
            C6823c cVar = new C6823c(i, z);
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            xMLReader.setContentHandler(cVar);
            xMLReader.parse(new InputSource(new StringReader(str)));
            return cVar.f21365a;
        } catch (Exception e) {
            Log.m14723e(e);
            return null;
        }
    }
}
