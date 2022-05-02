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
    public long[] f26324a;
    public float[] f26325b;
    public String[] f26326c;
    public ArrayList<C8106a> f26327d = new ArrayList<>();
    public int f26328e = 0;
    public int f26329f = Integer.MAX_VALUE;
    public float f26330g = 0.0f;
    public long f26331h;

    public class C8106a {
        public int[] f26332a;
        public C7848t f26333b;
        public String f26334c;
        public String f26335d;
        public String f26338g;
        public int f26336e = 0;
        public int f26337f = Integer.MAX_VALUE;
        public int f26339h = -16777216;
        public int f26340i = -1;

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
                this.f26324a = new long[length];
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2 + 1;
                    this.f26324a[i2] = jSONArray2.getLong(i3);
                    i2 = i3;
                }
            } else {
                C8106a aVar = new C8106a();
                this.f26327d.add(aVar);
                int length2 = jSONArray2.length() - 1;
                aVar.f26334c = jSONArray2.getString(0);
                aVar.f26332a = new int[length2];
                int i4 = 0;
                while (i4 < length2) {
                    int i5 = i4 + 1;
                    aVar.f26332a[i4] = jSONArray2.getInt(i5);
                    int[] iArr = aVar.f26332a;
                    if (iArr[i4] > aVar.f26336e) {
                        aVar.f26336e = iArr[i4];
                    }
                    if (iArr[i4] < aVar.f26337f) {
                        aVar.f26337f = iArr[i4];
                    }
                    i4 = i5;
                }
            }
            long[] jArr = this.f26324a;
            if (jArr.length > 1) {
                this.f26331h = jArr[1] - jArr[0];
            } else {
                this.f26331h = 86400000L;
            }
            mo13585e();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("colors");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("names");
        Pattern compile = Pattern.compile("(.*)(#.*)");
        for (int i6 = 0; i6 < this.f26327d.size(); i6++) {
            C8106a aVar2 = this.f26327d.get(i6);
            if (optJSONObject != null) {
                Matcher matcher = compile.matcher(optJSONObject.getString(aVar2.f26334c));
                if (matcher.matches()) {
                    if (matcher.group(1) != null) {
                        aVar2.f26338g = "statisticChartLine_" + matcher.group(1).toLowerCase();
                    }
                    int parseColor = Color.parseColor(matcher.group(2));
                    aVar2.f26339h = parseColor;
                    aVar2.f26340i = C8929a.m10944d(-1, parseColor, 0.85f);
                }
            }
            if (optJSONObject2 != null) {
                aVar2.f26335d = optJSONObject2.getString(aVar2.f26334c);
            }
        }
    }

    public int m13592a(int i, float f) {
        int length = this.f26325b.length;
        if (f == 1.0f) {
            return length - 1;
        }
        int i2 = length - 1;
        int i3 = i2;
        while (i <= i3) {
            int i4 = (i3 + i) >> 1;
            float[] fArr = this.f26325b;
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

    public int m13591b(int i, int i2, float f) {
        float[] fArr = this.f26325b;
        int length = fArr.length;
        if (f <= fArr[i]) {
            return i;
        }
        if (f >= fArr[i2]) {
            return i2;
        }
        while (i <= i2) {
            int i3 = (i2 + i) >> 1;
            float[] fArr2 = this.f26325b;
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

    public int m13590c(float f) {
        int length;
        int i = 0;
        if (f == 0.0f || (length = this.f26325b.length) < 2) {
            return 0;
        }
        int i2 = length - 1;
        while (i <= i2) {
            int i3 = (i2 + i) >> 1;
            float[] fArr = this.f26325b;
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

    public String m13589d(int i) {
        String[] strArr = this.f26326c;
        long[] jArr = this.f26324a;
        return strArr[(int) ((jArr[i] - jArr[0]) / this.f26331h)];
    }

    public void mo13585e() {
        SimpleDateFormat simpleDateFormat;
        long[] jArr = this.f26324a;
        int length = jArr.length;
        if (length != 0) {
            long j = jArr[0];
            long j2 = jArr[length - 1];
            float[] fArr = new float[length];
            this.f26325b = fArr;
            if (length == 1) {
                fArr[0] = 1.0f;
            } else {
                for (int i = 0; i < length; i++) {
                    this.f26325b[i] = ((float) (this.f26324a[i] - j)) / ((float) (j2 - j));
                }
            }
            for (int i2 = 0; i2 < this.f26327d.size(); i2++) {
                if (this.f26327d.get(i2).f26336e > this.f26328e) {
                    this.f26328e = this.f26327d.get(i2).f26336e;
                }
                if (this.f26327d.get(i2).f26337f < this.f26329f) {
                    this.f26329f = this.f26327d.get(i2).f26337f;
                }
                this.f26327d.get(i2).f26333b = new C7848t(this.f26327d.get(i2).f26332a);
            }
            long j3 = this.f26331h;
            this.f26326c = new String[((int) ((j2 - j) / j3)) + 10];
            if (j3 == 1) {
                simpleDateFormat = null;
            } else if (j3 < 86400000) {
                simpleDateFormat = new SimpleDateFormat("HH:mm");
            } else {
                simpleDateFormat = new SimpleDateFormat("MMM d");
            }
            int i3 = 0;
            while (true) {
                String[] strArr = this.f26326c;
                if (i3 < strArr.length) {
                    if (this.f26331h == 1) {
                        strArr[i3] = String.format(Locale.ENGLISH, "%02d:00", Integer.valueOf(i3));
                    } else {
                        strArr[i3] = simpleDateFormat.format(new Date((i3 * this.f26331h) + j));
                    }
                    i3++;
                } else {
                    long[] jArr2 = this.f26324a;
                    this.f26330g = ((float) this.f26331h) / ((float) (jArr2[jArr2.length - 1] - jArr2[0]));
                    return;
                }
            }
        }
    }
}
