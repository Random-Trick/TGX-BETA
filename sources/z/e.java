package z;

import android.location.Location;
import androidx.camera.core.k1;
import androidx.camera.core.t1;
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

public final class e {
    public static final String f26712c = "e";
    public static final ThreadLocal<SimpleDateFormat> f26713d = new a();
    public static final ThreadLocal<SimpleDateFormat> f26714e = new b();
    public static final ThreadLocal<SimpleDateFormat> f26715f = new c();
    public static final List<String> f26716g = n();
    public static final List<String> f26717h = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");
    public final j1.a f26718a;
    public boolean f26719b = false;

    public class a extends ThreadLocal<SimpleDateFormat> {
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    public class b extends ThreadLocal<SimpleDateFormat> {
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    public class c extends ThreadLocal<SimpleDateFormat> {
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    public static final class d {

        public static final class a {
            public final double f26720a;

            public a(double d10) {
                this.f26720a = d10;
            }

            public double a() {
                return this.f26720a / 2.23694d;
            }
        }

        public static a a(double d10) {
            return new a(d10 * 0.621371d);
        }

        public static a b(double d10) {
            return new a(d10 * 1.15078d);
        }

        public static a c(double d10) {
            return new a(d10);
        }
    }

    public e(j1.a aVar) {
        this.f26718a = aVar;
    }

    public static Date c(String str) {
        return f26713d.get().parse(str);
    }

    public static Date d(String str) {
        return f26715f.get().parse(str);
    }

    public static Date e(String str) {
        return f26714e.get().parse(str);
    }

    public static String f(long j10) {
        return f26715f.get().format(new Date(j10));
    }

    public static e h(File file) {
        return i(file.toString());
    }

    public static e i(String str) {
        return new e(new j1.a(str));
    }

    public static e j(k1 k1Var) {
        ByteBuffer a10 = k1Var.j()[0].a();
        a10.rewind();
        byte[] bArr = new byte[a10.capacity()];
        a10.get(bArr);
        return k(new ByteArrayInputStream(bArr));
    }

    public static e k(InputStream inputStream) {
        return new e(new j1.a(inputStream));
    }

    public static List<String> n() {
        return Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    }

    public void A() {
        if (!this.f26719b) {
            a();
        }
        this.f26718a.W();
    }

    public final void a() {
        long currentTimeMillis = System.currentTimeMillis();
        String f10 = f(currentTimeMillis);
        this.f26718a.b0("DateTime", f10);
        try {
            this.f26718a.b0("SubSecTime", Long.toString(currentTimeMillis - d(f10).getTime()));
        } catch (ParseException unused) {
        }
    }

    public void b(Location location) {
        this.f26718a.c0(location);
    }

    public void g(e eVar) {
        ArrayList<String> arrayList = new ArrayList(f26716g);
        arrayList.removeAll(f26717h);
        for (String str : arrayList) {
            String g10 = this.f26718a.g(str);
            if (g10 != null) {
                eVar.f26718a.b0(str, g10);
            }
        }
    }

    public void l() {
        int i10;
        switch (r()) {
            case 2:
                i10 = 1;
                break;
            case 3:
                i10 = 4;
                break;
            case 4:
                i10 = 3;
                break;
            case 5:
                i10 = 6;
                break;
            case 6:
                i10 = 5;
                break;
            case 7:
                i10 = 8;
                break;
            case 8:
                i10 = 7;
                break;
            default:
                i10 = 2;
                break;
        }
        this.f26718a.b0("Orientation", String.valueOf(i10));
    }

    public void m() {
        int i10;
        switch (r()) {
            case 2:
                i10 = 3;
                break;
            case 3:
                i10 = 2;
                break;
            case 4:
                i10 = 1;
                break;
            case 5:
                i10 = 8;
                break;
            case 6:
                i10 = 7;
                break;
            case 7:
                i10 = 6;
                break;
            case 8:
                i10 = 5;
                break;
            default:
                i10 = 4;
                break;
        }
        this.f26718a.b0("Orientation", String.valueOf(i10));
    }

    public String o() {
        return this.f26718a.g("ImageDescription");
    }

    public int p() {
        return this.f26718a.i("ImageLength", 0);
    }

    public Location q() {
        double d10;
        String g10 = this.f26718a.g("GPSProcessingMethod");
        double[] m10 = this.f26718a.m();
        double f10 = this.f26718a.f(0.0d);
        double h10 = this.f26718a.h("GPSSpeed", 0.0d);
        String g11 = this.f26718a.g("GPSSpeedRef");
        if (g11 == null) {
            g11 = "K";
        }
        long y10 = y(this.f26718a.g("GPSDateStamp"), this.f26718a.g("GPSTimeStamp"));
        if (m10 == null) {
            return null;
        }
        if (g10 == null) {
            g10 = f26712c;
        }
        Location location = new Location(g10);
        location.setLatitude(m10[0]);
        location.setLongitude(m10[1]);
        if (f10 != 0.0d) {
            location.setAltitude(f10);
        }
        if (h10 != 0.0d) {
            char c10 = 65535;
            int hashCode = g11.hashCode();
            if (hashCode != 75) {
                if (hashCode != 77) {
                    if (hashCode == 78 && g11.equals("N")) {
                        c10 = 1;
                    }
                } else if (g11.equals("M")) {
                    c10 = 0;
                }
            } else if (g11.equals("K")) {
                c10 = 2;
            }
            if (c10 == 0) {
                d10 = d.c(h10).a();
            } else if (c10 != 1) {
                d10 = d.a(h10).a();
            } else {
                d10 = d.b(h10).a();
            }
            location.setSpeed((float) d10);
        }
        if (y10 != -1) {
            location.setTime(y10);
        }
        return location;
    }

    public int r() {
        return this.f26718a.i("Orientation", 0);
    }

    public int s() {
        switch (r()) {
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

    public long t() {
        long x10 = x(this.f26718a.g("DateTimeOriginal"));
        if (x10 == -1) {
            return -1L;
        }
        String g10 = this.f26718a.g("SubSecTimeOriginal");
        if (g10 == null) {
            return x10;
        }
        try {
            long parseLong = Long.parseLong(g10);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return x10 + parseLong;
        } catch (NumberFormatException unused) {
            return x10;
        }
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(u()), Integer.valueOf(p()), Integer.valueOf(s()), Boolean.valueOf(w()), Boolean.valueOf(v()), q(), Long.valueOf(t()), o());
    }

    public int u() {
        return this.f26718a.i("ImageWidth", 0);
    }

    public boolean v() {
        return r() == 2;
    }

    public boolean w() {
        int r10 = r();
        return r10 == 4 || r10 == 5 || r10 == 7;
    }

    public final long x(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return d(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    public final long y(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return c(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        } else if (str == null) {
            try {
                return e(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        } else {
            return x(str + " " + str2);
        }
    }

    public void z(int i10) {
        if (i10 % 90 != 0) {
            t1.k(f26712c, String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i10)));
            this.f26718a.b0("Orientation", String.valueOf(0));
            return;
        }
        int i11 = i10 % 360;
        int r10 = r();
        while (i11 < 0) {
            i11 += 90;
            switch (r10) {
                case 2:
                    r10 = 5;
                    break;
                case 3:
                case 8:
                    r10 = 6;
                    break;
                case 4:
                    r10 = 7;
                    break;
                case 5:
                    r10 = 4;
                    break;
                case 6:
                    r10 = 1;
                    break;
                case 7:
                    r10 = 2;
                    break;
                default:
                    r10 = 8;
                    break;
            }
        }
        while (i11 > 0) {
            i11 -= 90;
            switch (r10) {
                case 2:
                    r10 = 7;
                    break;
                case 3:
                    r10 = 8;
                    break;
                case 4:
                    r10 = 5;
                    break;
                case 5:
                    r10 = 2;
                    break;
                case 6:
                    r10 = 3;
                    break;
                case 7:
                    r10 = 4;
                    break;
                case 8:
                    r10 = 1;
                    break;
                default:
                    r10 = 6;
                    break;
            }
        }
        this.f26718a.b0("Orientation", String.valueOf(r10));
    }
}
