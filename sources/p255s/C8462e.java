package p255s;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import androidx.camera.core.C0662u1;
import p336y.AbstractC10286q;
import p336y.C10242i2;
import p336y.C10282p;
import p336y.EnumC10250k;
import p336y.EnumC10254l;
import p336y.EnumC10261m;
import p336y.EnumC10267n;
import p336y.EnumC10275o;
import p351z.C11190g;

public class C8462e implements AbstractC10286q {
    public final C10242i2 f27457a;
    public final CaptureResult f27458b;

    public C8462e(C10242i2 i2Var, CaptureResult captureResult) {
        this.f27457a = i2Var;
        this.f27458b = captureResult;
    }

    @Override
    public C10242i2 mo5557a() {
        return this.f27457a;
    }

    @Override
    public void mo5556b(C11190g.C11192b bVar) {
        Integer num;
        C10282p.m5570a(this, bVar);
        Rect rect = (Rect) this.f27458b.get(CaptureResult.SCALER_CROP_REGION);
        if (rect != null) {
            bVar.m1250j(rect.width()).m1251i(rect.height());
        }
        Integer num2 = (Integer) this.f27458b.get(CaptureResult.JPEG_ORIENTATION);
        if (num2 != null) {
            bVar.m1247m(num2.intValue());
        }
        Long l = (Long) this.f27458b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l != null) {
            bVar.m1254f(l.longValue());
        }
        Float f = (Float) this.f27458b.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            bVar.m1248l(f.floatValue());
        }
        Integer num3 = (Integer) this.f27458b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num3 != null) {
            if (Build.VERSION.SDK_INT >= 24 && (num = (Integer) this.f27458b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num3 = Integer.valueOf(num3.intValue() * ((int) (num.intValue() / 100.0f)));
            }
            bVar.m1249k(num3.intValue());
        }
        Float f2 = (Float) this.f27458b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            bVar.m1252h(f2.floatValue());
        }
        Integer num4 = (Integer) this.f27458b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num4 != null) {
            C11190g.EnumC11196c cVar = C11190g.EnumC11196c.AUTO;
            if (num4.intValue() == 0) {
                cVar = C11190g.EnumC11196c.MANUAL;
            }
            bVar.m1246n(cVar);
        }
    }

    @Override
    public long mo5555c() {
        Long l = (Long) this.f27458b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    @Override
    public EnumC10275o mo5554d() {
        Integer num = (Integer) this.f27458b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return EnumC10275o.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return EnumC10275o.NONE;
        }
        if (intValue == 2) {
            return EnumC10275o.READY;
        }
        if (intValue == 3 || intValue == 4) {
            return EnumC10275o.FIRED;
        }
        C0662u1.m40654c("C2CameraCaptureResult", "Undefined flash state: " + num);
        return EnumC10275o.UNKNOWN;
    }

    public EnumC10250k m12416e() {
        Integer num = (Integer) this.f27458b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return EnumC10250k.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return EnumC10250k.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return EnumC10250k.CONVERGED;
            }
            if (intValue == 3) {
                return EnumC10250k.LOCKED;
            }
            if (intValue == 4) {
                return EnumC10250k.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                C0662u1.m40654c("C2CameraCaptureResult", "Undefined ae state: " + num);
                return EnumC10250k.UNKNOWN;
            }
        }
        return EnumC10250k.SEARCHING;
    }

    public EnumC10254l m12415f() {
        Integer num = (Integer) this.f27458b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return EnumC10254l.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return EnumC10254l.ON_MANUAL_AUTO;
            }
            if (intValue == 3 || intValue == 4) {
                return EnumC10254l.ON_CONTINUOUS_AUTO;
            }
            if (intValue != 5) {
                C0662u1.m40654c("C2CameraCaptureResult", "Undefined af mode: " + num);
                return EnumC10254l.UNKNOWN;
            }
        }
        return EnumC10254l.OFF;
    }

    public EnumC10261m m12414g() {
        Integer num = (Integer) this.f27458b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return EnumC10261m.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return EnumC10261m.INACTIVE;
            case 1:
            case 3:
                return EnumC10261m.SCANNING;
            case 2:
                return EnumC10261m.PASSIVE_FOCUSED;
            case 4:
                return EnumC10261m.LOCKED_FOCUSED;
            case 5:
                return EnumC10261m.LOCKED_NOT_FOCUSED;
            case 6:
                return EnumC10261m.PASSIVE_NOT_FOCUSED;
            default:
                C0662u1.m40654c("C2CameraCaptureResult", "Undefined af state: " + num);
                return EnumC10261m.UNKNOWN;
        }
    }

    public EnumC10267n m12413h() {
        Integer num = (Integer) this.f27458b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return EnumC10267n.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return EnumC10267n.INACTIVE;
        }
        if (intValue == 1) {
            return EnumC10267n.METERING;
        }
        if (intValue == 2) {
            return EnumC10267n.CONVERGED;
        }
        if (intValue == 3) {
            return EnumC10267n.LOCKED;
        }
        C0662u1.m40654c("C2CameraCaptureResult", "Undefined awb state: " + num);
        return EnumC10267n.UNKNOWN;
    }

    public C8462e(CaptureResult captureResult) {
        this(C10242i2.m5661a(), captureResult);
    }
}
