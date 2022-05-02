package p224pc;

import android.graphics.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p208oc.C7848t;
import p267t0.C8929a;

public class C8105a {
    public long[] f26321a;
    public float[] f26322b;
    public String[] f26323c;
    public ArrayList<C8106a> f26324d = new ArrayList<>();
    public int f26325e = 0;
    public int f26326f = Integer.MAX_VALUE;
    public float f26327g = 0.0f;
    public long f26328h;

    public class C8106a {
        public int[] f26329a;
        public C7848t f26330b;
        public String f26331c;
        public String f26332d;
        public String f26335g;
        public int f26333e = 0;
        public int f26334f = Integer.MAX_VALUE;
        public int f26336h = -16777216;
        public int f26337i = -1;

        public C8106a() {
        }
    }

    public C8105a(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("columns");
        jSONArray.length();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            if (jSONArray2.getString(0).equals("x")) {
                int length = jSONArray2.length() - 1;
                this.f26321a = new long[length];
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2 + 1;
                    this.f26321a[i2] = jSONArray2.getLong(i3);
                    i2 = i3;
                }
            } else {
                C8106a aVar = new C8106a();
                this.f26324d.add(aVar);
                int length2 = jSONArray2.length() - 1;
                aVar.f26331c = jSONArray2.getString(0);
                aVar.f26329a = new int[length2];
                int i4 = 0;
                while (i4 < length2) {
                    int i5 = i4 + 1;
                    aVar.f26329a[i4] = jSONArray2.getInt(i5);
                    int[] iArr = aVar.f26329a;
                    if (iArr[i4] > aVar.f26333e) {
                        aVar.f26333e = iArr[i4];
                    }
                    if (iArr[i4] < aVar.f26334f) {
                        aVar.f26334f = iArr[i4];
                    }
                    i4 = i5;
                }
            }
            long[] jArr = this.f26321a;
            if (jArr.length > 1) {
                this.f26328h = jArr[1] - jArr[0];
            } else {
                this.f26328h = 86400000L;
            }
            mo13586e();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("colors");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("names");
        Pattern compile = Pattern.compile("(.*)(#.*)");
        for (int i6 = 0; i6 < this.f26324d.size(); i6++) {
            C8106a aVar2 = this.f26324d.get(i6);
            if (optJSONObject != null) {
                Matcher matcher = compile.matcher(optJSONObject.getString(aVar2.f26331c));
                if (matcher.matches()) {
                    if (matcher.group(1) != null) {
                        aVar2.f26335g = "statisticChartLine_" + matcher.group(1).toLowerCase();
                    }
                    int parseColor = Color.parseColor(matcher.group(2));
                    aVar2.f26336h = parseColor;
                    aVar2.f26337i = C8929a.m10945d(-1, parseColor, 0.85f);
                }
            }
            if (optJSONObject2 != null) {
                aVar2.f26332d = optJSONObject2.getString(aVar2.f26331c);
            }
        }
    }

    public int m13593a(int i, float f) {
        int length = this.f26322b.length;
        if (f == 1.0f) {
            return length - 1;
        }
        int i2 = length - 1;
        int i3 = i2;
        while (i <= i3) {
            int i4 = (i3 + i) >> 1;
            float[] fArr = this.f26322b;
            if ((f > fArr[i4] && (i4 == i2 || f < fArr[i4 + 1])) || f == fArr[i4]) {
                return i4;
            }
            if (f < fArr[i4]) {
                i3 = i4 - 1;
            } else if (f > fArr[i4]) {
                i = i4 + 1;
            }
        }
        return i3;
    }

    public int m13592b(int i, int i2, float f) {
        float[] fArr = this.f26322b;
        int length = fArr.length;
        if (f <= fArr[i]) {
            return i;
        }
        if (f >= fArr[i2]) {
            return i2;
        }
        while (i <= i2) {
            int i3 = (i2 + i) >> 1;
            float[] fArr2 = this.f26322b;
            if ((f > fArr2[i3] && (i3 == length - 1 || f < fArr2[i3 + 1])) || f == fArr2[i3]) {
                return i3;
            }
            if (f < fArr2[i3]) {
                i2 = i3 - 1;
            } else if (f > fArr2[i3]) {
                i = i3 + 1;
            }
        }
        return i2;
    }

    public int m13591c(float f) {
        int length;
        int i = 0;
        if (f == 0.0f || (length = this.f26322b.length) < 2) {
            return 0;
        }
        int i2 = length - 1;
        while (i <= i2) {
            int i3 = (i2 + i) >> 1;
            float[] fArr = this.f26322b;
            if ((f < fArr[i3] && (i3 == 0 || f > fArr[i3 - 1])) || f == fArr[i3]) {
                return i3;
            }
            if (f < fArr[i3]) {
                i2 = i3 - 1;
            } else if (f > fArr[i3]) {
                i = i3 + 1;
            }
        }
        return i;
    }

    public String m13590d(int i) {
        String[] strArr = this.f26323c;
        long[] jArr = this.f26321a;
        return strArr[(int) ((jArr[i] - jArr[0]) / this.f26328h)];
    }

    public void mo13586e() {
        SimpleDateFormat simpleDateFormat;
        long[] jArr = this.f26321a;
        int length = jArr.length;
        if (length != 0) {
            long j = jArr[0];
            long j2 = jArr[length - 1];
            float[] fArr = new float[length];
            this.f26322b = fArr;
            if (length == 1) {
                fArr[0] = 1.0f;
            } else {
                for (int i = 0; i < length; i++) {
                    this.f26322b[i] = ((float) (this.f26321a[i] - j)) / ((float) (j2 - j));
                }
            }
            for (int i2 = 0; i2 < this.f26324d.size(); i2++) {
                if (this.f26324d.get(i2).f26333e > this.f26325e) {
                    this.f26325e = this.f26324d.get(i2).f26333e;
                }
                if (this.f26324d.get(i2).f26334f < this.f26326f) {
                    this.f26326f = this.f26324d.get(i2).f26334f;
                }
                this.f26324d.get(i2).f26330b = new C7848t(this.f26324d.get(i2).f26329a);
            }
            long j3 = this.f26328h;
            this.f26323c = new String[((int) ((j2 - j) / j3)) + 10];
            if (j3 == 1) {
                simpleDateFormat = null;
            } else if (j3 < 86400000) {
                simpleDateFormat = new SimpleDateFormat("HH:mm");
            } else {
                simpleDateFormat = new SimpleDateFormat("MMM d");
            }
            int i3 = 0;
            while (true) {
                String[] strArr = this.f26323c;
                if (i3 < strArr.length) {
                    if (this.f26328h == 1) {
                        strArr[i3] = String.format(Locale.ENGLISH, "%02d:00", Integer.valueOf(i3));
                    } else {
                        strArr[i3] = simpleDateFormat.format(new Date((i3 * this.f26328h) + j));
                    }
                    i3++;
                } else {
                    long[] jArr2 = this.f26321a;
                    this.f26327g = ((float) this.f26328h) / ((float) (jArr2[jArr2.length - 1] - jArr2[0]));
                    return;
                }
            }
        }
    }
}
