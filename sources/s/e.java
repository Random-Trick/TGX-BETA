package s;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import androidx.camera.core.t1;
import y.i2;
import y.k;
import y.l;
import y.m;
import y.n;
import y.o;
import y.p;
import y.q;
import z.g;

public class e implements q {
    public final i2 f21999a;
    public final CaptureResult f22000b;

    public e(i2 i2Var, CaptureResult captureResult) {
        this.f21999a = i2Var;
        this.f22000b = captureResult;
    }

    @Override
    public i2 a() {
        return this.f21999a;
    }

    @Override
    public void b(g.b bVar) {
        Integer num;
        p.a(this, bVar);
        Rect rect = (Rect) this.f22000b.get(CaptureResult.SCALER_CROP_REGION);
        if (rect != null) {
            bVar.j(rect.width()).i(rect.height());
        }
        Integer num2 = (Integer) this.f22000b.get(CaptureResult.JPEG_ORIENTATION);
        if (num2 != null) {
            bVar.m(num2.intValue());
        }
        Long l10 = (Long) this.f22000b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l10 != null) {
            bVar.f(l10.longValue());
        }
        Float f10 = (Float) this.f22000b.get(CaptureResult.LENS_APERTURE);
        if (f10 != null) {
            bVar.l(f10.floatValue());
        }
        Integer num3 = (Integer) this.f22000b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num3 != null) {
            if (Build.VERSION.SDK_INT >= 24 && (num = (Integer) this.f22000b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num3 = Integer.valueOf(num3.intValue() * ((int) (num.intValue() / 100.0f)));
            }
            bVar.k(num3.intValue());
        }
        Float f11 = (Float) this.f22000b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f11 != null) {
            bVar.h(f11.floatValue());
        }
        Integer num4 = (Integer) this.f22000b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num4 != null) {
            g.c cVar = g.c.AUTO;
            if (num4.intValue() == 0) {
                cVar = g.c.MANUAL;
            }
            bVar.n(cVar);
        }
    }

    @Override
    public long c() {
        Long l10 = (Long) this.f22000b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l10 == null) {
            return -1L;
        }
        return l10.longValue();
    }

    @Override
    public o d() {
        Integer num = (Integer) this.f22000b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return o.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return o.NONE;
        }
        if (intValue == 2) {
            return o.READY;
        }
        if (intValue == 3 || intValue == 4) {
            return o.FIRED;
        }
        t1.c("C2CameraCaptureResult", "Undefined flash state: " + num);
        return o.UNKNOWN;
    }

    public k e() {
        Integer num = (Integer) this.f22000b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return k.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return k.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return k.CONVERGED;
            }
            if (intValue == 3) {
                return k.LOCKED;
            }
            if (intValue == 4) {
                return k.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                t1.c("C2CameraCaptureResult", "Undefined ae state: " + num);
                return k.UNKNOWN;
            }
        }
        return k.SEARCHING;
    }

    public l f() {
        Integer num = (Integer) this.f22000b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return l.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return l.ON_MANUAL_AUTO;
            }
            if (intValue == 3 || intValue == 4) {
                return l.ON_CONTINUOUS_AUTO;
            }
            if (intValue != 5) {
                t1.c("C2CameraCaptureResult", "Undefined af mode: " + num);
                return l.UNKNOWN;
            }
        }
        return l.OFF;
    }

    public m g() {
        Integer num = (Integer) this.f22000b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return m.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return m.INACTIVE;
            case 1:
            case 3:
                return m.SCANNING;
            case 2:
                return m.PASSIVE_FOCUSED;
            case 4:
                return m.LOCKED_FOCUSED;
            case 5:
                return m.LOCKED_NOT_FOCUSED;
            case 6:
                return m.PASSIVE_NOT_FOCUSED;
            default:
                t1.c("C2CameraCaptureResult", "Undefined af state: " + num);
                return m.UNKNOWN;
        }
    }

    public n h() {
        Integer num = (Integer) this.f22000b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return n.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return n.INACTIVE;
        }
        if (intValue == 1) {
            return n.METERING;
        }
        if (intValue == 2) {
            return n.CONVERGED;
        }
        if (intValue == 3) {
            return n.LOCKED;
        }
        t1.c("C2CameraCaptureResult", "Undefined awb state: " + num);
        return n.UNKNOWN;
    }

    public e(CaptureResult captureResult) {
        this(i2.a(), captureResult);
    }
}
