package nd;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import d.j;
import ib.i;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import javax.xml.parsers.SAXParserFactory;
import oc.v0;
import org.thunderdog.challegram.Log;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

public class b {
    public static final Pattern f17834a = Pattern.compile("[\\s,]*");
    public static final RectF f17835b = new RectF();
    public static final Matrix f17836c = new Matrix();
    public static final Matrix f17837d = new Matrix();

    public static class a {
        public ArrayList<Float> f17838a;
        public int f17839b;

        public a(ArrayList<Float> arrayList, int i10) {
            this.f17838a = arrayList;
            this.f17839b = i10;
        }
    }

    public static class C0163b {
        public Attributes f17840a;
        public ArrayList<d> f17841b;

        public C0163b(Attributes attributes, HashMap<String, d> hashMap) {
            String[] split;
            this.f17841b = new ArrayList<>();
            this.f17840a = attributes;
            String m10 = b.m("style", attributes);
            if (m10 != null) {
                this.f17841b.add(new d(m10));
            }
            String m11 = b.m("class", attributes);
            if (m11 != null) {
                for (String str : m11.split(" ")) {
                    if (hashMap.containsKey(str)) {
                        this.f17841b.add(hashMap.get(str));
                    }
                }
            }
        }

        public String a(String str) {
            String str2 = null;
            for (int i10 = 0; i10 < this.f17841b.size() && (str2 = this.f17841b.get(i10).a(str)) == null; i10++) {
            }
            return str2 == null ? b.m(str, this.f17840a) : str2;
        }

        public Float b(String str) {
            return c(str, null);
        }

        public Float c(String str, Float f10) {
            String a10 = a(str);
            if (a10 == null) {
                return f10;
            }
            try {
                return Float.valueOf(Float.parseFloat(a10));
            } catch (NumberFormatException unused) {
                return f10;
            }
        }

        public Integer d(String str) {
            String a10 = a(str);
            if (a10 == null) {
                return null;
            }
            try {
                return Integer.valueOf(Integer.parseInt(a10.substring(1), 16));
            } catch (NumberFormatException unused) {
                return 0;
            }
        }

        public String e(String str) {
            return a(str);
        }
    }

    public static class c extends DefaultHandler {
        public Bitmap f17842a;
        public Canvas f17843b;
        public StringBuilder f17844c;
        public boolean f17845d;
        public boolean f17846e;
        public final HashMap<String, d> f17847f = new HashMap<>();
        public final Paint f17848g = new Paint(1);
        public final RectF f17849h = new RectF();
        public final int f17850i;
        public final boolean f17851j;

        public static class a extends IllegalArgumentException {
        }

        public c(int i10, boolean z10) {
            this.f17850i = i10;
            this.f17851j = z10;
        }

        public final void a(C0163b bVar, Integer num, boolean z10) {
            this.f17848g.setColor((num.intValue() & 16777215) | (-16777216));
            Float b10 = bVar.b("opacity");
            if (b10 == null) {
                b10 = bVar.b(z10 ? "fill-opacity" : "stroke-opacity");
            }
            if (b10 == null) {
                this.f17848g.setAlpha(255);
            } else {
                this.f17848g.setAlpha((int) (b10.floatValue() * 255.0f));
            }
        }

        public final boolean b(C0163b bVar) {
            if ("none".equals(bVar.e("display"))) {
                return false;
            }
            String e10 = bVar.e("fill");
            if (e10 != null && (e10.startsWith("url(#") || e10.equals("none"))) {
                return false;
            }
            Integer d10 = bVar.d("fill");
            if (d10 != null) {
                a(bVar, d10, true);
                this.f17848g.setStyle(Paint.Style.STROKE);
                return true;
            } else if (bVar.e("fill") != null || bVar.e("stroke") != null) {
                return false;
            } else {
                this.f17848g.setStyle(Paint.Style.FILL);
                this.f17848g.setColor(-16777216);
                return true;
            }
        }

        public final boolean c(C0163b bVar) {
            Integer d10;
            if ("none".equals(bVar.e("display")) || (d10 = bVar.d("stroke")) == null) {
                return false;
            }
            a(bVar, d10, false);
            Float b10 = bVar.b("stroke-width");
            if (b10 != null) {
                this.f17848g.setStrokeWidth(b10.floatValue());
            }
            String e10 = bVar.e("stroke-linecap");
            if ("round".equals(e10)) {
                this.f17848g.setStrokeCap(Paint.Cap.ROUND);
            } else if ("square".equals(e10)) {
                this.f17848g.setStrokeCap(Paint.Cap.SQUARE);
            } else if ("butt".equals(e10)) {
                this.f17848g.setStrokeCap(Paint.Cap.BUTT);
            }
            String e11 = bVar.e("stroke-linejoin");
            if ("miter".equals(e11)) {
                this.f17848g.setStrokeJoin(Paint.Join.MITER);
            } else if ("round".equals(e11)) {
                this.f17848g.setStrokeJoin(Paint.Join.ROUND);
            } else if ("bevel".equals(e11)) {
                this.f17848g.setStrokeJoin(Paint.Join.BEVEL);
            }
            this.f17848g.setStyle(Paint.Style.STROKE);
            return true;
        }

        @Override
        public void characters(char[] cArr, int i10, int i11) {
            StringBuilder sb2 = this.f17844c;
            if (sb2 != null) {
                sb2.append(cArr, i10, i11);
            }
        }

        public final void d() {
            if (this.f17846e) {
                this.f17843b.restore();
            }
        }

        public final void e(Attributes attributes) {
            String m10 = b.m("transform", attributes);
            boolean z10 = m10 != null;
            this.f17846e = z10;
            if (z10) {
                this.f17843b.save();
                this.f17843b.concat(b.p(m10));
            }
        }

        @Override
        public void endElement(String str, String str2, String str3) {
            int indexOf;
            str2.hashCode();
            char c10 = 65535;
            switch (str2.hashCode()) {
                case 103:
                    if (str2.equals("g")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3079438:
                    if (str2.equals("defs")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 109780401:
                    if (str2.equals("style")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 917656469:
                    if (str2.equals("clipPath")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                case 3:
                    this.f17845d = false;
                    return;
                case 2:
                    StringBuilder sb2 = this.f17844c;
                    if (sb2 != null) {
                        String[] split = sb2.toString().split("\\}");
                        for (int i10 = 0; i10 < split.length; i10++) {
                            split[i10] = split[i10].trim().replace("\t", "").replace("\n", "");
                            if (split[i10].length() != 0 && split[i10].charAt(0) == '.' && (indexOf = split[i10].indexOf(j.O0)) >= 0) {
                                this.f17847f.put(split[i10].substring(1, indexOf).trim(), new d(split[i10].substring(indexOf + 1)));
                            }
                        }
                        this.f17844c = null;
                        return;
                    }
                    return;
                default:
                    return;
            }
        }

        @Override
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            if (!this.f17845d || str2.equals("style")) {
                str2.hashCode();
                char c10 = 65535;
                boolean z10 = true;
                switch (str2.hashCode()) {
                    case -1656480802:
                        if (str2.equals("ellipse")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1360216880:
                        if (str2.equals("circle")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -397519558:
                        if (str2.equals("polygon")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 103:
                        if (str2.equals("g")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 114276:
                        if (str2.equals("svg")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 3079438:
                        if (str2.equals("defs")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 3321844:
                        if (str2.equals("line")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 3433509:
                        if (str2.equals("path")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case 3496420:
                        if (str2.equals("rect")) {
                            c10 = '\b';
                            break;
                        }
                        break;
                    case 109780401:
                        if (str2.equals("style")) {
                            c10 = '\t';
                            break;
                        }
                        break;
                    case 561938880:
                        if (str2.equals("polyline")) {
                            c10 = '\n';
                            break;
                        }
                        break;
                    case 917656469:
                        if (str2.equals("clipPath")) {
                            c10 = 11;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        Float k10 = b.k("cx", attributes);
                        Float k11 = b.k("cy", attributes);
                        Float k12 = b.k("rx", attributes);
                        Float k13 = b.k("ry", attributes);
                        if (!(k10 == null || k11 == null || k12 == null || k13 == null)) {
                            e(attributes);
                            C0163b bVar = new C0163b(attributes, this.f17847f);
                            this.f17849h.set(k10.floatValue() - k12.floatValue(), k11.floatValue() - k13.floatValue(), k10.floatValue() + k12.floatValue(), k11.floatValue() + k13.floatValue());
                            if (b(bVar)) {
                                this.f17843b.drawOval(this.f17849h, this.f17848g);
                            }
                            if (c(bVar)) {
                                this.f17843b.drawOval(this.f17849h, this.f17848g);
                            }
                            d();
                            return;
                        }
                        return;
                    case 1:
                        Float k14 = b.k("cx", attributes);
                        Float k15 = b.k("cy", attributes);
                        Float k16 = b.k("r", attributes);
                        if (!(k14 == null || k15 == null || k16 == null)) {
                            e(attributes);
                            C0163b bVar2 = new C0163b(attributes, this.f17847f);
                            if (b(bVar2)) {
                                this.f17843b.drawCircle(k14.floatValue(), k15.floatValue(), k16.floatValue(), this.f17848g);
                            }
                            if (c(bVar2)) {
                                this.f17843b.drawCircle(k14.floatValue(), k15.floatValue(), k16.floatValue(), this.f17848g);
                            }
                            d();
                            return;
                        }
                        return;
                    case 2:
                    case '\n':
                        a o10 = b.o(attributes.getValue("points"));
                        if (o10 != null) {
                            Path path = new Path();
                            ArrayList arrayList = o10.f17838a;
                            if (arrayList.size() > 1) {
                                e(attributes);
                                C0163b bVar3 = new C0163b(attributes, this.f17847f);
                                path.moveTo(((Float) arrayList.get(0)).floatValue(), ((Float) arrayList.get(1)).floatValue());
                                for (int i10 = 2; i10 < arrayList.size(); i10 += 2) {
                                    path.lineTo(((Float) arrayList.get(i10)).floatValue(), ((Float) arrayList.get(i10 + 1)).floatValue());
                                }
                                if (str2.equals("polygon")) {
                                    path.close();
                                }
                                if (b(bVar3)) {
                                    this.f17843b.drawPath(path, this.f17848g);
                                }
                                if (c(bVar3)) {
                                    this.f17843b.drawPath(path, this.f17848g);
                                }
                                d();
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        if ("bounds".equalsIgnoreCase(b.m("id", attributes))) {
                            this.f17845d = true;
                            return;
                        }
                        return;
                    case 4:
                        String m10 = b.m("viewBox", attributes);
                        if (!i.i(m10)) {
                            String[] split = m10.split(" ");
                            if (split.length == 4) {
                                float parseFloat = Float.parseFloat(split[2]);
                                float parseFloat2 = Float.parseFloat(split[3]);
                                int i11 = this.f17850i;
                                float min = Math.min(1.0f, Math.min(i11 / parseFloat, i11 / parseFloat2));
                                int i12 = (int) (parseFloat * min);
                                int i13 = (int) (parseFloat2 * min);
                                if (!this.f17851j || i12 == i13) {
                                    z10 = false;
                                }
                                if (z10) {
                                    int min2 = Math.min(i12, i13);
                                    this.f17842a = Bitmap.createBitmap(min2, min2, Bitmap.Config.ARGB_8888);
                                } else {
                                    this.f17842a = Bitmap.createBitmap(i12, i13, Bitmap.Config.ARGB_8888);
                                }
                                this.f17842a.eraseColor(0);
                                Canvas canvas = new Canvas(this.f17842a);
                                this.f17843b = canvas;
                                if (z10) {
                                    if (i12 > i13) {
                                        canvas.translate((-(i12 - i13)) / 2.0f, 0.0f);
                                    } else {
                                        canvas.translate(0.0f, (-(i13 - i12)) / 2.0f);
                                    }
                                }
                                this.f17843b.scale(min, min, 0.0f, 0.0f);
                                return;
                            }
                            throw new a();
                        }
                        throw new a();
                    case 5:
                    case 11:
                        this.f17845d = true;
                        return;
                    case 6:
                        Float k17 = b.k("x1", attributes);
                        Float k18 = b.k("x2", attributes);
                        Float k19 = b.k("y1", attributes);
                        Float k20 = b.k("y2", attributes);
                        if (c(new C0163b(attributes, this.f17847f))) {
                            e(attributes);
                            this.f17843b.drawLine(k17.floatValue(), k19.floatValue(), k18.floatValue(), k20.floatValue(), this.f17848g);
                            d();
                            return;
                        }
                        return;
                    case 7:
                        Path h10 = b.h(b.m("d", attributes));
                        e(attributes);
                        C0163b bVar4 = new C0163b(attributes, this.f17847f);
                        if (b(bVar4)) {
                            this.f17843b.drawPath(h10, this.f17848g);
                        }
                        if (c(bVar4)) {
                            this.f17843b.drawPath(h10, this.f17848g);
                        }
                        d();
                        return;
                    case '\b':
                        Float k21 = b.k("x", attributes);
                        if (k21 == null) {
                            k21 = Float.valueOf(0.0f);
                        }
                        Float k22 = b.k("y", attributes);
                        if (k22 == null) {
                            k22 = Float.valueOf(0.0f);
                        }
                        Float k23 = b.k("width", attributes);
                        Float k24 = b.k("height", attributes);
                        Float l10 = b.l("rx", attributes, null);
                        e(attributes);
                        C0163b bVar5 = new C0163b(attributes, this.f17847f);
                        if (b(bVar5)) {
                            if (l10 != null) {
                                this.f17849h.set(k21.floatValue(), k22.floatValue(), k21.floatValue() + k23.floatValue(), k22.floatValue() + k24.floatValue());
                                this.f17843b.drawRoundRect(this.f17849h, l10.floatValue(), l10.floatValue(), this.f17848g);
                            } else {
                                this.f17843b.drawRect(k21.floatValue(), k22.floatValue(), k21.floatValue() + k23.floatValue(), k22.floatValue() + k24.floatValue(), this.f17848g);
                            }
                        }
                        if (c(bVar5)) {
                            if (l10 != null) {
                                this.f17849h.set(k21.floatValue(), k22.floatValue(), k21.floatValue() + k23.floatValue(), k22.floatValue() + k24.floatValue());
                                this.f17843b.drawRoundRect(this.f17849h, l10.floatValue(), l10.floatValue(), this.f17848g);
                            } else {
                                this.f17843b.drawRect(k21.floatValue(), k22.floatValue(), k21.floatValue() + k23.floatValue(), k22.floatValue() + k24.floatValue(), this.f17848g);
                            }
                        }
                        d();
                        return;
                    case '\t':
                        this.f17844c = new StringBuilder();
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public static class d {
        public HashMap<String, String> f17852a;

        public d(String str) {
            this.f17852a = new HashMap<>();
            for (String str2 : str.split(";")) {
                String[] split = str2.split(":");
                if (split.length == 2) {
                    this.f17852a.put(split[0], split[1]);
                }
            }
        }

        public String a(String str) {
            return this.f17852a.get(str);
        }
    }

    public static float g(float f10, float f11, float f12, float f13) {
        return ((float) Math.toDegrees(Math.atan2(f10, f11) - Math.atan2(f12, f13))) % 360.0f;
    }

    public static android.graphics.Path h(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: nd.b.h(java.lang.String):android.graphics.Path");
    }

    public static void i(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i10, int i11) {
        if (f14 == 0.0f || f15 == 0.0f) {
            path.lineTo(f12, f13);
        } else if (f12 != f10 || f13 != f11) {
            float abs = Math.abs(f14);
            float abs2 = Math.abs(f15);
            double d10 = (3.1415927f * f16) / 180.0f;
            float sin = (float) Math.sin(d10);
            float cos = (float) Math.cos(d10);
            float f17 = (f10 - f12) / 2.0f;
            float f18 = (f11 - f13) / 2.0f;
            float f19 = (cos * f17) + (sin * f18);
            float f20 = ((-sin) * f17) + (f18 * cos);
            float f21 = f19 * f19;
            float f22 = f20 * f20;
            float f23 = abs * abs;
            float f24 = abs2 * abs2;
            float f25 = ((f21 / f23) + (f22 / f24)) * 1.001f;
            if (f25 > 1.0f) {
                float sqrt = (float) Math.sqrt(f25);
                abs *= sqrt;
                abs2 *= sqrt;
                f23 = abs * abs;
                f24 = abs2 * abs2;
            }
            float f26 = f23 * f24;
            float f27 = f23 * f22;
            float f28 = f24 * f21;
            float sqrt2 = (float) (Math.sqrt(((f26 - f27) - f28) / (f27 + f28)) * (i10 == i11 ? -1 : 1));
            float f29 = ((sqrt2 * abs) * f20) / abs2;
            float f30 = (((-sqrt2) * abs2) * f19) / abs;
            float f31 = ((cos * f29) - (sin * f30)) + ((f10 + f12) / 2.0f);
            float f32 = (sin * f29) + (cos * f30) + ((f11 + f13) / 2.0f);
            float f33 = (f19 - f29) / abs;
            float f34 = (f20 - f30) / abs2;
            float g10 = g(1.0f, 0.0f, f33, f34);
            float g11 = g(f33, f34, ((-f19) - f29) / abs, ((-f20) - f30) / abs2);
            if (i11 == 0 && g11 > 0.0f) {
                g11 -= 360.0f;
            } else if (i11 != 0 && g11 < 0.0f) {
                g11 += 360.0f;
            }
            if (f16 % 360.0f == 0.0f) {
                RectF rectF = f17835b;
                rectF.set(f31 - abs, f32 - abs2, f31 + abs, f32 + abs2);
                path.arcTo(rectF, g10, g11);
                return;
            }
            RectF rectF2 = f17835b;
            rectF2.set(-abs, -abs2, abs, abs2);
            Matrix matrix = f17836c;
            matrix.reset();
            matrix.postRotate(f16);
            matrix.postTranslate(f31, f32);
            Matrix matrix2 = f17837d;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.arcTo(rectF2, g10, g11);
            path.transform(matrix);
        }
    }

    public static Bitmap j(int i10, boolean z10, String str) {
        return r(i10, z10, v0.b1(str));
    }

    public static Float k(String str, Attributes attributes) {
        return l(str, attributes, null);
    }

    public static Float l(String str, Attributes attributes, Float f10) {
        return n(m(str, attributes), f10);
    }

    public static String m(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            if (attributes.getLocalName(i10).equals(str)) {
                return attributes.getValue(i10);
            }
        }
        return null;
    }

    public static Float n(String str, Float f10) {
        if (str == null) {
            return f10;
        }
        if (str.endsWith("px")) {
            str = str.substring(0, str.length() - 2);
        } else if (str.endsWith("%")) {
            return Float.valueOf(Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f);
        }
        return Float.valueOf(Float.parseFloat(str));
    }

    public static nd.b.a o(java.lang.String r10) {
        throw new UnsupportedOperationException("Method not decompiled: nd.b.o(java.lang.String):nd.b$a");
    }

    public static Matrix p(String str) {
        int i10;
        Matrix matrix = new Matrix();
        while (true) {
            q(str, matrix);
            int indexOf = str.indexOf(")");
            if (indexOf <= 0 || str.length() <= (i10 = indexOf + 1)) {
                break;
            }
            str = f17834a.matcher(str.substring(i10)).replaceFirst("");
        }
        return matrix;
    }

    public static Matrix q(String str, Matrix matrix) {
        float f10;
        float f11 = 0.0f;
        if (str.startsWith("matrix(")) {
            a o10 = o(str.substring(7));
            if (o10.f17838a.size() == 6) {
                Matrix matrix2 = new Matrix();
                matrix2.setValues(new float[]{((Float) o10.f17838a.get(0)).floatValue(), ((Float) o10.f17838a.get(2)).floatValue(), ((Float) o10.f17838a.get(4)).floatValue(), ((Float) o10.f17838a.get(1)).floatValue(), ((Float) o10.f17838a.get(3)).floatValue(), ((Float) o10.f17838a.get(5)).floatValue(), 0.0f, 0.0f, 1.0f});
                matrix.preConcat(matrix2);
            }
        } else if (str.startsWith("translate(")) {
            a o11 = o(str.substring(10));
            if (o11.f17838a.size() > 0) {
                float floatValue = ((Float) o11.f17838a.get(0)).floatValue();
                if (o11.f17838a.size() > 1) {
                    f11 = ((Float) o11.f17838a.get(1)).floatValue();
                }
                matrix.preTranslate(floatValue, f11);
            }
        } else if (str.startsWith("scale(")) {
            a o12 = o(str.substring(6));
            if (o12.f17838a.size() > 0) {
                float floatValue2 = ((Float) o12.f17838a.get(0)).floatValue();
                matrix.preScale(floatValue2, o12.f17838a.size() > 1 ? ((Float) o12.f17838a.get(1)).floatValue() : floatValue2);
            }
        } else if (str.startsWith("skewX(")) {
            a o13 = o(str.substring(6));
            if (o13.f17838a.size() > 0) {
                matrix.preSkew((float) Math.tan(((Float) o13.f17838a.get(0)).floatValue()), 0.0f);
            }
        } else if (str.startsWith("skewY(")) {
            a o14 = o(str.substring(6));
            if (o14.f17838a.size() > 0) {
                matrix.preSkew(0.0f, (float) Math.tan(((Float) o14.f17838a.get(0)).floatValue()));
            }
        } else if (str.startsWith("rotate(")) {
            a o15 = o(str.substring(7));
            if (o15.f17838a.size() > 0) {
                float floatValue3 = ((Float) o15.f17838a.get(0)).floatValue();
                if (o15.f17838a.size() > 2) {
                    f11 = ((Float) o15.f17838a.get(1)).floatValue();
                    f10 = ((Float) o15.f17838a.get(2)).floatValue();
                } else {
                    f10 = 0.0f;
                }
                matrix.preTranslate(-f11, -f10);
                matrix.preRotate(floatValue3);
                matrix.preTranslate(f11, f10);
            }
        } else {
            Log.w("SVG render: invalid transform (" + str + ")", new Object[0]);
        }
        return matrix;
    }

    public static Bitmap r(int i10, boolean z10, String str) {
        try {
            c cVar = new c(i10, z10);
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            xMLReader.setContentHandler(cVar);
            xMLReader.parse(new InputSource(new StringReader(str)));
            return cVar.f17842a;
        } catch (Exception e10) {
            Log.e(e10);
            return null;
        }
    }
}
