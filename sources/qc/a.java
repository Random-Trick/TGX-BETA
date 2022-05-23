package qc;

import android.graphics.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import pc.t;

public class a {
    public long[] f21507a;
    public float[] f21508b;
    public String[] f21509c;
    public ArrayList<C0200a> f21510d = new ArrayList<>();
    public int f21511e = 0;
    public int f21512f = Integer.MAX_VALUE;
    public float f21513g = 0.0f;
    public long f21514h;

    public class C0200a {
        public int[] f21515a;
        public t f21516b;
        public String f21517c;
        public String f21518d;
        public String f21521g;
        public int f21519e = 0;
        public int f21520f = Integer.MAX_VALUE;
        public int f21522h = -16777216;
        public int f21523i = -1;

        public C0200a() {
        }
    }

    public a(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("columns");
        jSONArray.length();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
            if (jSONArray2.getString(0).equals("x")) {
                int length = jSONArray2.length() - 1;
                this.f21507a = new long[length];
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i11 + 1;
                    this.f21507a[i11] = jSONArray2.getLong(i12);
                    i11 = i12;
                }
            } else {
                C0200a aVar = new C0200a();
                this.f21510d.add(aVar);
                int length2 = jSONArray2.length() - 1;
                aVar.f21517c = jSONArray2.getString(0);
                aVar.f21515a = new int[length2];
                int i13 = 0;
                while (i13 < length2) {
                    int i14 = i13 + 1;
                    aVar.f21515a[i13] = jSONArray2.getInt(i14);
                    int[] iArr = aVar.f21515a;
                    if (iArr[i13] > aVar.f21519e) {
                        aVar.f21519e = iArr[i13];
                    }
                    if (iArr[i13] < aVar.f21520f) {
                        aVar.f21520f = iArr[i13];
                    }
                    i13 = i14;
                }
            }
            long[] jArr = this.f21507a;
            if (jArr.length > 1) {
                this.f21514h = jArr[1] - jArr[0];
            } else {
                this.f21514h = 86400000L;
            }
            e();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("colors");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("names");
        Pattern compile = Pattern.compile("(.*)(#.*)");
        for (int i15 = 0; i15 < this.f21510d.size(); i15++) {
            C0200a aVar2 = this.f21510d.get(i15);
            if (optJSONObject != null) {
                Matcher matcher = compile.matcher(optJSONObject.getString(aVar2.f21517c));
                if (matcher.matches()) {
                    if (matcher.group(1) != null) {
                        aVar2.f21521g = "statisticChartLine_" + matcher.group(1).toLowerCase();
                    }
                    int parseColor = Color.parseColor(matcher.group(2));
                    aVar2.f21522h = parseColor;
                    aVar2.f21523i = t0.a.d(-1, parseColor, 0.85f);
                }
            }
            if (optJSONObject2 != null) {
                aVar2.f21518d = optJSONObject2.getString(aVar2.f21517c);
            }
        }
    }

    public int a(int i10, float f10) {
        int length = this.f21508b.length;
        if (f10 == 1.0f) {
            return length - 1;
        }
        int i11 = length - 1;
        int i12 = i11;
        while (i10 <= i12) {
            int i13 = (i12 + i10) >> 1;
            float[] fArr = this.f21508b;
            if ((f10 > fArr[i13] && (i13 == i11 || f10 < fArr[i13 + 1])) || f10 == fArr[i13]) {
                return i13;
            }
            if (f10 < fArr[i13]) {
                i12 = i13 - 1;
            } else if (f10 > fArr[i13]) {
                i10 = i13 + 1;
            }
        }
        return i12;
    }

    public int b(int i10, int i11, float f10) {
        float[] fArr = this.f21508b;
        int length = fArr.length;
        if (f10 <= fArr[i10]) {
            return i10;
        }
        if (f10 >= fArr[i11]) {
            return i11;
        }
        while (i10 <= i11) {
            int i12 = (i11 + i10) >> 1;
            float[] fArr2 = this.f21508b;
            if ((f10 > fArr2[i12] && (i12 == length - 1 || f10 < fArr2[i12 + 1])) || f10 == fArr2[i12]) {
                return i12;
            }
            if (f10 < fArr2[i12]) {
                i11 = i12 - 1;
            } else if (f10 > fArr2[i12]) {
                i10 = i12 + 1;
            }
        }
        return i11;
    }

    public int c(float f10) {
        int length;
        int i10 = 0;
        if (f10 == 0.0f || (length = this.f21508b.length) < 2) {
            return 0;
        }
        int i11 = length - 1;
        while (i10 <= i11) {
            int i12 = (i11 + i10) >> 1;
            float[] fArr = this.f21508b;
            if ((f10 < fArr[i12] && (i12 == 0 || f10 > fArr[i12 - 1])) || f10 == fArr[i12]) {
                return i12;
            }
            if (f10 < fArr[i12]) {
                i11 = i12 - 1;
            } else if (f10 > fArr[i12]) {
                i10 = i12 + 1;
            }
        }
        return i10;
    }

    public String d(int i10) {
        String[] strArr = this.f21509c;
        long[] jArr = this.f21507a;
        return strArr[(int) ((jArr[i10] - jArr[0]) / this.f21514h)];
    }

    public void e() {
        SimpleDateFormat simpleDateFormat;
        long[] jArr = this.f21507a;
        int length = jArr.length;
        if (length != 0) {
            long j10 = jArr[0];
            long j11 = jArr[length - 1];
            float[] fArr = new float[length];
            this.f21508b = fArr;
            if (length == 1) {
                fArr[0] = 1.0f;
            } else {
                for (int i10 = 0; i10 < length; i10++) {
                    this.f21508b[i10] = ((float) (this.f21507a[i10] - j10)) / ((float) (j11 - j10));
                }
            }
            for (int i11 = 0; i11 < this.f21510d.size(); i11++) {
                if (this.f21510d.get(i11).f21519e > this.f21511e) {
                    this.f21511e = this.f21510d.get(i11).f21519e;
                }
                if (this.f21510d.get(i11).f21520f < this.f21512f) {
                    this.f21512f = this.f21510d.get(i11).f21520f;
                }
                this.f21510d.get(i11).f21516b = new t(this.f21510d.get(i11).f21515a);
            }
            long j12 = this.f21514h;
            this.f21509c = new String[((int) ((j11 - j10) / j12)) + 10];
            if (j12 == 1) {
                simpleDateFormat = null;
            } else if (j12 < 86400000) {
                simpleDateFormat = new SimpleDateFormat("HH:mm");
            } else {
                simpleDateFormat = new SimpleDateFormat("MMM d");
            }
            int i12 = 0;
            while (true) {
                String[] strArr = this.f21509c;
                if (i12 < strArr.length) {
                    if (this.f21514h == 1) {
                        strArr[i12] = String.format(Locale.ENGLISH, "%02d:00", Integer.valueOf(i12));
                    } else {
                        strArr[i12] = simpleDateFormat.format(new Date((i12 * this.f21514h) + j10));
                    }
                    i12++;
                } else {
                    long[] jArr2 = this.f21507a;
                    this.f21513g = ((float) this.f21514h) / ((float) (jArr2[jArr2.length - 1] - jArr2[0]));
                    return;
                }
            }
        }
    }
}
