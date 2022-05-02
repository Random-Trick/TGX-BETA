package p351z;

import android.location.Location;
import androidx.camera.core.AbstractC0610l1;
import androidx.camera.core.C0662u1;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p129j1.C5828a;

public final class C11183e {
    public static final String f35837c = "e";
    public static final ThreadLocal<SimpleDateFormat> f35838d = new C11184a();
    public static final ThreadLocal<SimpleDateFormat> f35839e = new C11185b();
    public static final ThreadLocal<SimpleDateFormat> f35840f = new C11186c();
    public static final List<String> f35841g = m1292n();
    public static final List<String> f35842h = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");
    public final C5828a f35843a;
    public boolean f35844b = false;

    public class C11184a extends ThreadLocal<SimpleDateFormat> {
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    public class C11185b extends ThreadLocal<SimpleDateFormat> {
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    public class C11186c extends ThreadLocal<SimpleDateFormat> {
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    public static final class C11187d {

        public static final class C11188a {
            public final double f35845a;

            public C11188a(double d) {
                this.f35845a = d;
            }

            public double m1273a() {
                return this.f35845a / 2.23694d;
            }
        }

        public static C11188a m1276a(double d) {
            return new C11188a(d * 0.621371d);
        }

        public static C11188a m1275b(double d) {
            return new C11188a(d * 1.15078d);
        }

        public static C11188a m1274c(double d) {
            return new C11188a(d);
        }
    }

    public C11183e(C5828a aVar) {
        this.f35843a = aVar;
    }

    public static Date m1303c(String str) {
        return f35838d.get().parse(str);
    }

    public static Date m1302d(String str) {
        return f35840f.get().parse(str);
    }

    public static Date m1301e(String str) {
        return f35839e.get().parse(str);
    }

    public static String m1300f(long j) {
        return f35840f.get().format(new Date(j));
    }

    public static C11183e m1298h(File file) {
        return m1297i(file.toString());
    }

    public static C11183e m1297i(String str) {
        return new C11183e(new C5828a(str));
    }

    public static C11183e m1296j(AbstractC0610l1 l1Var) {
        ByteBuffer a = l1Var.mo40761j()[0].mo40758a();
        a.rewind();
        byte[] bArr = new byte[a.capacity()];
        a.get(bArr);
        return m1295k(new ByteArrayInputStream(bArr));
    }

    public static C11183e m1295k(InputStream inputStream) {
        return new C11183e(new C5828a(inputStream));
    }

    public static List<String> m1292n() {
        return Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    }

    public void m1306A() {
        if (!this.f35844b) {
            m1305a();
        }
        this.f35843a.m22040W();
    }

    public final void m1305a() {
        long currentTimeMillis = System.currentTimeMillis();
        String f = m1300f(currentTimeMillis);
        this.f35843a.m22033b0("DateTime", f);
        try {
            this.f35843a.m22033b0("SubSecTime", Long.toString(currentTimeMillis - m1302d(f).getTime()));
        } catch (ParseException unused) {
        }
    }

    public void m1304b(Location location) {
        this.f35843a.m22031c0(location);
    }

    public void m1299g(C11183e eVar) {
        ArrayList<String> arrayList = new ArrayList(f35841g);
        arrayList.removeAll(f35842h);
        for (String str : arrayList) {
            String g = this.f35843a.m22024g(str);
            if (g != null) {
                eVar.f35843a.m22033b0(str, g);
            }
        }
    }

    public void m1294l() {
        int i;
        switch (m1288r()) {
            case 2:
                i = 1;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 7;
                break;
            default:
                i = 2;
                break;
        }
        this.f35843a.m22033b0("Orientation", String.valueOf(i));
    }

    public void m1293m() {
        int i;
        switch (m1288r()) {
            case 2:
                i = 3;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 1;
                break;
            case 5:
                i = 8;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 5;
                break;
            default:
                i = 4;
                break;
        }
        this.f35843a.m22033b0("Orientation", String.valueOf(i));
    }

    public String m1291o() {
        return this.f35843a.m22024g("ImageDescription");
    }

    public int m1290p() {
        return this.f35843a.m22020i("ImageLength", 0);
    }

    public Location m1289q() {
        double d;
        String g = this.f35843a.m22024g("GPSProcessingMethod");
        double[] m = this.f35843a.m22014m();
        double f = this.f35843a.m22026f(0.0d);
        double h = this.f35843a.m22022h("GPSSpeed", 0.0d);
        String g2 = this.f35843a.m22024g("GPSSpeedRef");
        if (g2 == null) {
            g2 = "K";
        }
        long y = m1281y(this.f35843a.m22024g("GPSDateStamp"), this.f35843a.m22024g("GPSTimeStamp"));
        if (m == null) {
            return null;
        }
        if (g == null) {
            g = f35837c;
        }
        Location location = new Location(g);
        location.setLatitude(m[0]);
        location.setLongitude(m[1]);
        if (f != 0.0d) {
            location.setAltitude(f);
        }
        if (h != 0.0d) {
            char c = 65535;
            int hashCode = g2.hashCode();
            if (hashCode != 75) {
                if (hashCode != 77) {
                    if (hashCode == 78 && g2.equals("N")) {
                        c = 1;
                    }
                } else if (g2.equals("M")) {
                    c = 0;
                }
            } else if (g2.equals("K")) {
                c = 2;
            }
            if (c == 0) {
                d = C11187d.m1274c(h).m1273a();
            } else if (c != 1) {
                d = C11187d.m1276a(h).m1273a();
            } else {
                d = C11187d.m1275b(h).m1273a();
            }
            location.setSpeed((float) d);
        }
        if (y != -1) {
            location.setTime(y);
        }
        return location;
    }

    public int m1288r() {
        return this.f35843a.m22020i("Orientation", 0);
    }

    public int m1287s() {
        switch (m1288r()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public long m1286t() {
        long x = m1282x(this.f35843a.m22024g("DateTimeOriginal"));
        if (x == -1) {
            return -1L;
        }
        String g = this.f35843a.m22024g("SubSecTimeOriginal");
        if (g == null) {
            return x;
        }
        try {
            long parseLong = Long.parseLong(g);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return x + parseLong;
        } catch (NumberFormatException unused) {
            return x;
        }
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(m1285u()), Integer.valueOf(m1290p()), Integer.valueOf(m1287s()), Boolean.valueOf(m1283w()), Boolean.valueOf(m1284v()), m1289q(), Long.valueOf(m1286t()), m1291o());
    }

    public int m1285u() {
        return this.f35843a.m22020i("ImageWidth", 0);
    }

    public boolean m1284v() {
        return m1288r() == 2;
    }

    public boolean m1283w() {
        int r = m1288r();
        return r == 4 || r == 5 || r == 7;
    }

    public final long m1282x(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return m1302d(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    public final long m1281y(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return m1303c(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        } else if (str == null) {
            try {
                return m1301e(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        } else {
            return m1282x(str + " " + str2);
        }
    }

    public void m1280z(int i) {
        if (i % 90 != 0) {
            C0662u1.m40646k(f35837c, String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i)));
            this.f35843a.m22033b0("Orientation", String.valueOf(0));
            return;
        }
        int i2 = i % 360;
        int r = m1288r();
        while (i2 < 0) {
            i2 += 90;
            switch (r) {
                case 2:
                    r = 5;
                    break;
                case 3:
                case 8:
                    r = 6;
                    break;
                case 4:
                    r = 7;
                    break;
                case 5:
                    r = 4;
                    break;
                case 6:
                    r = 1;
                    break;
                case 7:
                    r = 2;
                    break;
                default:
                    r = 8;
                    break;
            }
        }
        while (i2 > 0) {
            i2 -= 90;
            switch (r) {
                case 2:
                    r = 7;
                    break;
                case 3:
                    r = 8;
                    break;
                case 4:
                    r = 5;
                    break;
                case 5:
                    r = 2;
                    break;
                case 6:
                    r = 3;
                    break;
                case 7:
                    r = 4;
                    break;
                case 8:
                    r = 1;
                    break;
                default:
                    r = 6;
                    break;
            }
        }
        this.f35843a.m22033b0("Orientation", String.valueOf(r));
    }
}
