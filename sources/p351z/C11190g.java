package p351z;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.C0662u1;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.thunderdog.challegram.Log;
import p016b1.C1132h;
import p336y.EnumC10275o;

public class C11190g {
    public static final C11199i[] f35855d;
    public static final C11199i[] f35856e;
    public static final C11199i[] f35857f;
    public static final C11199i[] f35859h;
    public static final C11199i[][] f35860i;
    public final List<Map<String, C11189f>> f35862a;
    public final ByteOrder f35863b;
    public static final String[] f35854c = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final C11199i[] f35858g = {new C11199i("SubIFDPointer", 330, 4), new C11199i("ExifIFDPointer", 34665, 4), new C11199i("GPSInfoIFDPointer", 34853, 4), new C11199i("InteroperabilityIFDPointer", 40965, 4)};
    public static final HashSet<String> f35861j = new HashSet<>(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));

    public static class C11191a {
        public static final int[] f35864a;
        public static final int[] f35865b;

        static {
            int[] iArr = new int[EnumC11196c.values().length];
            f35865b = iArr;
            try {
                iArr[EnumC11196c.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35865b[EnumC11196c.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC10275o.values().length];
            f35864a = iArr2;
            try {
                iArr2[EnumC10275o.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35864a[EnumC10275o.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35864a[EnumC10275o.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class C11192b {
        public static final Pattern f35866c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        public static final Pattern f35867d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        public static final Pattern f35868e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        public static final List<HashMap<String, C11199i>> f35869f = Collections.list(new C11193a());
        public final List<Map<String, C11189f>> f35870a = Collections.list(new C11194b());
        public final ByteOrder f35871b;

        public class C11193a implements Enumeration<HashMap<String, C11199i>> {
            public int f35872a = 0;

            public HashMap<String, C11199i> nextElement() {
                C11199i[] iVarArr;
                HashMap<String, C11199i> hashMap = new HashMap<>();
                for (C11199i iVar : C11190g.f35860i[this.f35872a]) {
                    hashMap.put(iVar.f35888b, iVar);
                }
                this.f35872a++;
                return hashMap;
            }

            @Override
            public boolean hasMoreElements() {
                return this.f35872a < C11190g.f35860i.length;
            }
        }

        public class C11194b implements Enumeration<Map<String, C11189f>> {
            public int f35873a = 0;

            public C11194b() {
            }

            public Map<String, C11189f> nextElement() {
                this.f35873a++;
                return new HashMap();
            }

            @Override
            public boolean hasMoreElements() {
                return this.f35873a < C11190g.f35860i.length;
            }
        }

        public class C11195c implements Enumeration<Map<String, C11189f>> {
            public final Enumeration<Map<String, C11189f>> f35875a;

            public C11195c() {
                this.f35875a = Collections.enumeration(C11192b.this.f35870a);
            }

            public Map<String, C11189f> nextElement() {
                return new HashMap(this.f35875a.nextElement());
            }

            @Override
            public boolean hasMoreElements() {
                return this.f35875a.hasMoreElements();
            }
        }

        public C11192b(ByteOrder byteOrder) {
            this.f35871b = byteOrder;
        }

        public static Pair<Integer, Integer> m1258b(String str) {
            if (str.contains(",")) {
                String[] split = str.split(",", -1);
                Pair<Integer, Integer> b = m1258b(split[0]);
                if (((Integer) b.first).intValue() == 2) {
                    return b;
                }
                for (int i = 1; i < split.length; i++) {
                    Pair<Integer, Integer> b2 = m1258b(split[i]);
                    int intValue = (((Integer) b2.first).equals(b.first) || ((Integer) b2.second).equals(b.first)) ? ((Integer) b.first).intValue() : -1;
                    int intValue2 = (((Integer) b.second).intValue() == -1 || (!((Integer) b2.first).equals(b.second) && !((Integer) b2.second).equals(b.second))) ? -1 : ((Integer) b.second).intValue();
                    if (intValue == -1 && intValue2 == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (intValue == -1) {
                        b = new Pair<>(Integer.valueOf(intValue2), -1);
                    } else if (intValue2 == -1) {
                        b = new Pair<>(Integer.valueOf(intValue), -1);
                    }
                }
                return b;
            } else if (str.contains("/")) {
                String[] split2 = str.split("/", -1);
                if (split2.length == 2) {
                    try {
                        long parseDouble = (long) Double.parseDouble(split2[0]);
                        long parseDouble2 = (long) Double.parseDouble(split2[1]);
                        if (parseDouble >= 0 && parseDouble2 >= 0) {
                            if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                                return new Pair<>(10, 5);
                            }
                            return new Pair<>(5, -1);
                        }
                        return new Pair<>(10, -1);
                    } catch (NumberFormatException unused) {
                    }
                }
                return new Pair<>(2, -1);
            } else {
                try {
                    try {
                        long parseLong = Long.parseLong(str);
                        int i2 = (parseLong > 0L ? 1 : (parseLong == 0L ? 0 : -1));
                        if (i2 >= 0 && parseLong <= 65535) {
                            return new Pair<>(3, 4);
                        }
                        if (i2 < 0) {
                            return new Pair<>(9, -1);
                        }
                        return new Pair<>(4, -1);
                    } catch (NumberFormatException unused2) {
                        return new Pair<>(2, -1);
                    }
                } catch (NumberFormatException unused3) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            }
        }

        public C11190g m1259a() {
            ArrayList list = Collections.list(new C11195c());
            if (!list.get(1).isEmpty()) {
                m1256d("ExposureProgram", String.valueOf(0), list);
                m1256d("ExifVersion", "0230", list);
                m1256d("ComponentsConfiguration", "1,2,3,0", list);
                m1256d("MeteringMode", String.valueOf(0), list);
                m1256d("LightSource", String.valueOf(0), list);
                m1256d("FlashpixVersion", "0100", list);
                m1256d("FocalPlaneResolutionUnit", String.valueOf(2), list);
                m1256d("FileSource", String.valueOf(3), list);
                m1256d("SceneType", String.valueOf(1), list);
                m1256d("CustomRendered", String.valueOf(0), list);
                m1256d("SceneCaptureType", String.valueOf(0), list);
                m1256d("Contrast", String.valueOf(0), list);
                m1256d("Saturation", String.valueOf(0), list);
                m1256d("Sharpness", String.valueOf(0), list);
            }
            if (!list.get(2).isEmpty()) {
                m1256d("GPSVersionID", "2300", list);
                m1256d("GPSSpeedRef", "K", list);
                m1256d("GPSTrackRef", "T", list);
                m1256d("GPSImgDirectionRef", "T", list);
                m1256d("GPSDestBearingRef", "T", list);
                m1256d("GPSDestDistanceRef", "K", list);
            }
            return new C11190g(this.f35871b, list);
        }

        public C11192b m1257c(String str, String str2) {
            m1255e(str, str2, this.f35870a);
            return this;
        }

        public final void m1256d(String str, String str2, List<Map<String, C11189f>> list) {
            for (Map<String, C11189f> map : list) {
                if (map.containsKey(str)) {
                    return;
                }
            }
            m1255e(str, str2, list);
        }

        public final void m1255e(java.lang.String r18, java.lang.String r19, java.util.List<java.util.Map<java.lang.String, p351z.C11189f>> r20) {
            throw new UnsupportedOperationException("Method not decompiled: p351z.C11190g.C11192b.m1255e(java.lang.String, java.lang.String, java.util.List):void");
        }

        public C11192b m1254f(long j) {
            return m1257c("ExposureTime", String.valueOf(j / TimeUnit.SECONDS.toNanos(1L)));
        }

        public C11192b m1253g(EnumC10275o oVar) {
            int i;
            if (oVar == EnumC10275o.UNKNOWN) {
                return this;
            }
            int i2 = C11191a.f35864a[oVar.ordinal()];
            if (i2 == 1) {
                i = 0;
            } else if (i2 == 2) {
                i = 32;
            } else if (i2 != 3) {
                C0662u1.m40646k("ExifData", "Unknown flash state: " + oVar);
                return this;
            } else {
                i = 1;
            }
            if ((i & 1) == 1) {
                m1257c("LightSource", String.valueOf(4));
            }
            return m1257c("Flash", String.valueOf(i));
        }

        public C11192b m1252h(float f) {
            return m1257c("FocalLength", new C11200j(f * 1000.0f, 1000L).toString());
        }

        public C11192b m1251i(int i) {
            return m1257c("ImageLength", String.valueOf(i));
        }

        public C11192b m1250j(int i) {
            return m1257c("ImageWidth", String.valueOf(i));
        }

        public C11192b m1249k(int i) {
            return m1257c("SensitivityType", String.valueOf(3)).m1257c("PhotographicSensitivity", String.valueOf(Math.min(65535, i)));
        }

        public C11192b m1248l(float f) {
            return m1257c("FNumber", String.valueOf(f));
        }

        public C11192b m1247m(int i) {
            int i2;
            if (i == 0) {
                i2 = 1;
            } else if (i == 90) {
                i2 = 6;
            } else if (i == 180) {
                i2 = 3;
            } else if (i != 270) {
                C0662u1.m40646k("ExifData", "Unexpected orientation value: " + i + ". Must be one of 0, 90, 180, 270.");
                i2 = 0;
            } else {
                i2 = 8;
            }
            return m1257c("Orientation", String.valueOf(i2));
        }

        public C11192b m1246n(EnumC11196c cVar) {
            String str;
            int i = C11191a.f35865b[cVar.ordinal()];
            if (i != 1) {
                str = i != 2 ? null : String.valueOf(1);
            } else {
                str = String.valueOf(0);
            }
            return m1257c("WhiteBalance", str);
        }
    }

    public enum EnumC11196c {
        AUTO,
        MANUAL
    }

    static {
        C11199i[] iVarArr = {new C11199i("ImageWidth", Log.TAG_CRASH, 3, 4), new C11199i("ImageLength", 257, 3, 4), new C11199i("Make", 271, 2), new C11199i("Model", 272, 2), new C11199i("Orientation", 274, 3), new C11199i("XResolution", 282, 5), new C11199i("YResolution", 283, 5), new C11199i("ResolutionUnit", 296, 3), new C11199i("Software", 305, 2), new C11199i("DateTime", 306, 2), new C11199i("YCbCrPositioning", 531, 3), new C11199i("SubIFDPointer", 330, 4), new C11199i("ExifIFDPointer", 34665, 4), new C11199i("GPSInfoIFDPointer", 34853, 4)};
        f35855d = iVarArr;
        C11199i[] iVarArr2 = {new C11199i("ExposureTime", 33434, 5), new C11199i("FNumber", 33437, 5), new C11199i("ExposureProgram", 34850, 3), new C11199i("PhotographicSensitivity", 34855, 3), new C11199i("SensitivityType", 34864, 3), new C11199i("ExifVersion", 36864, 2), new C11199i("DateTimeOriginal", 36867, 2), new C11199i("DateTimeDigitized", 36868, 2), new C11199i("ComponentsConfiguration", 37121, 7), new C11199i("ShutterSpeedValue", 37377, 10), new C11199i("ApertureValue", 37378, 5), new C11199i("BrightnessValue", 37379, 10), new C11199i("ExposureBiasValue", 37380, 10), new C11199i("MaxApertureValue", 37381, 5), new C11199i("MeteringMode", 37383, 3), new C11199i("LightSource", 37384, 3), new C11199i("Flash", 37385, 3), new C11199i("FocalLength", 37386, 5), new C11199i("SubSecTime", 37520, 2), new C11199i("SubSecTimeOriginal", 37521, 2), new C11199i("SubSecTimeDigitized", 37522, 2), new C11199i("FlashpixVersion", 40960, 7), new C11199i("ColorSpace", 40961, 3), new C11199i("PixelXDimension", 40962, 3, 4), new C11199i("PixelYDimension", 40963, 3, 4), new C11199i("InteroperabilityIFDPointer", 40965, 4), new C11199i("FocalPlaneResolutionUnit", 41488, 3), new C11199i("SensingMethod", 41495, 3), new C11199i("FileSource", 41728, 7), new C11199i("SceneType", 41729, 7), new C11199i("CustomRendered", 41985, 3), new C11199i("ExposureMode", 41986, 3), new C11199i("WhiteBalance", 41987, 3), new C11199i("SceneCaptureType", 41990, 3), new C11199i("Contrast", 41992, 3), new C11199i("Saturation", 41993, 3), new C11199i("Sharpness", 41994, 3)};
        f35856e = iVarArr2;
        C11199i[] iVarArr3 = {new C11199i("GPSVersionID", 0, 1), new C11199i("GPSLatitudeRef", 1, 2), new C11199i("GPSLatitude", 2, 5, 10), new C11199i("GPSLongitudeRef", 3, 2), new C11199i("GPSLongitude", 4, 5, 10), new C11199i("GPSAltitudeRef", 5, 1), new C11199i("GPSAltitude", 6, 5), new C11199i("GPSTimeStamp", 7, 5), new C11199i("GPSSpeedRef", 12, 2), new C11199i("GPSTrackRef", 14, 2), new C11199i("GPSImgDirectionRef", 16, 2), new C11199i("GPSDestBearingRef", 23, 2), new C11199i("GPSDestDistanceRef", 25, 2)};
        f35857f = iVarArr3;
        C11199i[] iVarArr4 = {new C11199i("InteroperabilityIndex", 1, 2)};
        f35859h = iVarArr4;
        f35860i = new C11199i[][]{iVarArr, iVarArr2, iVarArr3, iVarArr4};
    }

    public C11190g(ByteOrder byteOrder, List<Map<String, C11189f>> list) {
        C1132h.m38322h(list.size() == f35860i.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.f35863b = byteOrder;
        this.f35862a = list;
    }

    public static C11192b m1262a() {
        return new C11192b(ByteOrder.BIG_ENDIAN).m1257c("Orientation", String.valueOf(1)).m1257c("XResolution", "72/1").m1257c("YResolution", "72/1").m1257c("ResolutionUnit", String.valueOf(2)).m1257c("YCbCrPositioning", String.valueOf(1)).m1257c("Make", Build.MANUFACTURER).m1257c("Model", Build.MODEL);
    }

    public Map<String, C11189f> m1261b(int i) {
        int length = f35860i.length;
        C1132h.m38327c(i, 0, length, "Invalid IFD index: " + i + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.f35862a.get(i);
    }

    public ByteOrder m1260c() {
        return this.f35863b;
    }
}
