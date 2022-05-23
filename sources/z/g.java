package z;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.t1;
import b1.h;
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
import y.o;

public class g {
    public static final i[] f26730d;
    public static final i[] f26731e;
    public static final i[] f26732f;
    public static final i[] f26734h;
    public static final i[][] f26735i;
    public final List<Map<String, f>> f26737a;
    public final ByteOrder f26738b;
    public static final String[] f26729c = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final i[] f26733g = {new i("SubIFDPointer", 330, 4), new i("ExifIFDPointer", 34665, 4), new i("GPSInfoIFDPointer", 34853, 4), new i("InteroperabilityIFDPointer", 40965, 4)};
    public static final HashSet<String> f26736j = new HashSet<>(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));

    public static class a {
        public static final int[] f26739a;
        public static final int[] f26740b;

        static {
            int[] iArr = new int[c.values().length];
            f26740b = iArr;
            try {
                iArr[c.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26740b[c.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[o.values().length];
            f26739a = iArr2;
            try {
                iArr2[o.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26739a[o.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26739a[o.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class b {
        public static final Pattern f26741c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        public static final Pattern f26742d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        public static final Pattern f26743e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        public static final List<HashMap<String, i>> f26744f = Collections.list(new a());
        public final List<Map<String, f>> f26745a = Collections.list(new C0254b());
        public final ByteOrder f26746b;

        public class a implements Enumeration<HashMap<String, i>> {
            public int f26747a = 0;

            public HashMap<String, i> nextElement() {
                i[] iVarArr;
                HashMap<String, i> hashMap = new HashMap<>();
                for (i iVar : g.f26735i[this.f26747a]) {
                    hashMap.put(iVar.f26759b, iVar);
                }
                this.f26747a++;
                return hashMap;
            }

            @Override
            public boolean hasMoreElements() {
                return this.f26747a < g.f26735i.length;
            }
        }

        public class C0254b implements Enumeration<Map<String, f>> {
            public int f26748a = 0;

            public C0254b() {
            }

            public Map<String, f> nextElement() {
                this.f26748a++;
                return new HashMap();
            }

            @Override
            public boolean hasMoreElements() {
                return this.f26748a < g.f26735i.length;
            }
        }

        public class c implements Enumeration<Map<String, f>> {
            public final Enumeration<Map<String, f>> f26750a;

            public c() {
                this.f26750a = Collections.enumeration(b.this.f26745a);
            }

            public Map<String, f> nextElement() {
                return new HashMap(this.f26750a.nextElement());
            }

            @Override
            public boolean hasMoreElements() {
                return this.f26750a.hasMoreElements();
            }
        }

        public b(ByteOrder byteOrder) {
            this.f26746b = byteOrder;
        }

        public static Pair<Integer, Integer> b(String str) {
            if (str.contains(",")) {
                String[] split = str.split(",", -1);
                Pair<Integer, Integer> b10 = b(split[0]);
                if (((Integer) b10.first).intValue() == 2) {
                    return b10;
                }
                for (int i10 = 1; i10 < split.length; i10++) {
                    Pair<Integer, Integer> b11 = b(split[i10]);
                    int intValue = (((Integer) b11.first).equals(b10.first) || ((Integer) b11.second).equals(b10.first)) ? ((Integer) b10.first).intValue() : -1;
                    int intValue2 = (((Integer) b10.second).intValue() == -1 || (!((Integer) b11.first).equals(b10.second) && !((Integer) b11.second).equals(b10.second))) ? -1 : ((Integer) b10.second).intValue();
                    if (intValue == -1 && intValue2 == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (intValue == -1) {
                        b10 = new Pair<>(Integer.valueOf(intValue2), -1);
                    } else if (intValue2 == -1) {
                        b10 = new Pair<>(Integer.valueOf(intValue), -1);
                    }
                }
                return b10;
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
                        int i11 = (parseLong > 0L ? 1 : (parseLong == 0L ? 0 : -1));
                        if (i11 >= 0 && parseLong <= 65535) {
                            return new Pair<>(3, 4);
                        }
                        if (i11 < 0) {
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

        public g a() {
            ArrayList list = Collections.list(new c());
            if (!list.get(1).isEmpty()) {
                d("ExposureProgram", String.valueOf(0), list);
                d("ExifVersion", "0230", list);
                d("ComponentsConfiguration", "1,2,3,0", list);
                d("MeteringMode", String.valueOf(0), list);
                d("LightSource", String.valueOf(0), list);
                d("FlashpixVersion", "0100", list);
                d("FocalPlaneResolutionUnit", String.valueOf(2), list);
                d("FileSource", String.valueOf(3), list);
                d("SceneType", String.valueOf(1), list);
                d("CustomRendered", String.valueOf(0), list);
                d("SceneCaptureType", String.valueOf(0), list);
                d("Contrast", String.valueOf(0), list);
                d("Saturation", String.valueOf(0), list);
                d("Sharpness", String.valueOf(0), list);
            }
            if (!list.get(2).isEmpty()) {
                d("GPSVersionID", "2300", list);
                d("GPSSpeedRef", "K", list);
                d("GPSTrackRef", "T", list);
                d("GPSImgDirectionRef", "T", list);
                d("GPSDestBearingRef", "T", list);
                d("GPSDestDistanceRef", "K", list);
            }
            return new g(this.f26746b, list);
        }

        public b c(String str, String str2) {
            e(str, str2, this.f26745a);
            return this;
        }

        public final void d(String str, String str2, List<Map<String, f>> list) {
            for (Map<String, f> map : list) {
                if (map.containsKey(str)) {
                    return;
                }
            }
            e(str, str2, list);
        }

        public final void e(java.lang.String r18, java.lang.String r19, java.util.List<java.util.Map<java.lang.String, z.f>> r20) {
            throw new UnsupportedOperationException("Method not decompiled: z.g.b.e(java.lang.String, java.lang.String, java.util.List):void");
        }

        public b f(long j10) {
            return c("ExposureTime", String.valueOf(j10 / TimeUnit.SECONDS.toNanos(1L)));
        }

        public b g(o oVar) {
            int i10;
            if (oVar == o.UNKNOWN) {
                return this;
            }
            int i11 = a.f26739a[oVar.ordinal()];
            if (i11 == 1) {
                i10 = 0;
            } else if (i11 == 2) {
                i10 = 32;
            } else if (i11 != 3) {
                t1.k("ExifData", "Unknown flash state: " + oVar);
                return this;
            } else {
                i10 = 1;
            }
            if ((i10 & 1) == 1) {
                c("LightSource", String.valueOf(4));
            }
            return c("Flash", String.valueOf(i10));
        }

        public b h(float f10) {
            return c("FocalLength", new j(f10 * 1000.0f, 1000L).toString());
        }

        public b i(int i10) {
            return c("ImageLength", String.valueOf(i10));
        }

        public b j(int i10) {
            return c("ImageWidth", String.valueOf(i10));
        }

        public b k(int i10) {
            return c("SensitivityType", String.valueOf(3)).c("PhotographicSensitivity", String.valueOf(Math.min(65535, i10)));
        }

        public b l(float f10) {
            return c("FNumber", String.valueOf(f10));
        }

        public b m(int i10) {
            int i11;
            if (i10 == 0) {
                i11 = 1;
            } else if (i10 == 90) {
                i11 = 6;
            } else if (i10 == 180) {
                i11 = 3;
            } else if (i10 != 270) {
                t1.k("ExifData", "Unexpected orientation value: " + i10 + ". Must be one of 0, 90, 180, 270.");
                i11 = 0;
            } else {
                i11 = 8;
            }
            return c("Orientation", String.valueOf(i11));
        }

        public b n(c cVar) {
            String str;
            int i10 = a.f26740b[cVar.ordinal()];
            if (i10 != 1) {
                str = i10 != 2 ? null : String.valueOf(1);
            } else {
                str = String.valueOf(0);
            }
            return c("WhiteBalance", str);
        }
    }

    public enum c {
        AUTO,
        MANUAL
    }

    static {
        i[] iVarArr = {new i("ImageWidth", Log.TAG_CRASH, 3, 4), new i("ImageLength", 257, 3, 4), new i("Make", 271, 2), new i("Model", 272, 2), new i("Orientation", 274, 3), new i("XResolution", 282, 5), new i("YResolution", 283, 5), new i("ResolutionUnit", 296, 3), new i("Software", 305, 2), new i("DateTime", 306, 2), new i("YCbCrPositioning", 531, 3), new i("SubIFDPointer", 330, 4), new i("ExifIFDPointer", 34665, 4), new i("GPSInfoIFDPointer", 34853, 4)};
        f26730d = iVarArr;
        i[] iVarArr2 = {new i("ExposureTime", 33434, 5), new i("FNumber", 33437, 5), new i("ExposureProgram", 34850, 3), new i("PhotographicSensitivity", 34855, 3), new i("SensitivityType", 34864, 3), new i("ExifVersion", 36864, 2), new i("DateTimeOriginal", 36867, 2), new i("DateTimeDigitized", 36868, 2), new i("ComponentsConfiguration", 37121, 7), new i("ShutterSpeedValue", 37377, 10), new i("ApertureValue", 37378, 5), new i("BrightnessValue", 37379, 10), new i("ExposureBiasValue", 37380, 10), new i("MaxApertureValue", 37381, 5), new i("MeteringMode", 37383, 3), new i("LightSource", 37384, 3), new i("Flash", 37385, 3), new i("FocalLength", 37386, 5), new i("SubSecTime", 37520, 2), new i("SubSecTimeOriginal", 37521, 2), new i("SubSecTimeDigitized", 37522, 2), new i("FlashpixVersion", 40960, 7), new i("ColorSpace", 40961, 3), new i("PixelXDimension", 40962, 3, 4), new i("PixelYDimension", 40963, 3, 4), new i("InteroperabilityIFDPointer", 40965, 4), new i("FocalPlaneResolutionUnit", 41488, 3), new i("SensingMethod", 41495, 3), new i("FileSource", 41728, 7), new i("SceneType", 41729, 7), new i("CustomRendered", 41985, 3), new i("ExposureMode", 41986, 3), new i("WhiteBalance", 41987, 3), new i("SceneCaptureType", 41990, 3), new i("Contrast", 41992, 3), new i("Saturation", 41993, 3), new i("Sharpness", 41994, 3)};
        f26731e = iVarArr2;
        i[] iVarArr3 = {new i("GPSVersionID", 0, 1), new i("GPSLatitudeRef", 1, 2), new i("GPSLatitude", 2, 5, 10), new i("GPSLongitudeRef", 3, 2), new i("GPSLongitude", 4, 5, 10), new i("GPSAltitudeRef", 5, 1), new i("GPSAltitude", 6, 5), new i("GPSTimeStamp", 7, 5), new i("GPSSpeedRef", 12, 2), new i("GPSTrackRef", 14, 2), new i("GPSImgDirectionRef", 16, 2), new i("GPSDestBearingRef", 23, 2), new i("GPSDestDistanceRef", 25, 2)};
        f26732f = iVarArr3;
        i[] iVarArr4 = {new i("InteroperabilityIndex", 1, 2)};
        f26734h = iVarArr4;
        f26735i = new i[][]{iVarArr, iVarArr2, iVarArr3, iVarArr4};
    }

    public g(ByteOrder byteOrder, List<Map<String, f>> list) {
        h.h(list.size() == f26735i.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.f26738b = byteOrder;
        this.f26737a = list;
    }

    public static b a() {
        return new b(ByteOrder.BIG_ENDIAN).c("Orientation", String.valueOf(1)).c("XResolution", "72/1").c("YResolution", "72/1").c("ResolutionUnit", String.valueOf(2)).c("YCbCrPositioning", String.valueOf(1)).c("Make", Build.MANUFACTURER).c("Model", Build.MODEL);
    }

    public Map<String, f> b(int i10) {
        int length = f26735i.length;
        h.c(i10, 0, length, "Invalid IFD index: " + i10 + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.f26737a.get(i10);
    }

    public ByteOrder c() {
        return this.f26738b;
    }
}
