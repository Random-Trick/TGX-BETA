package p293v;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.C0662u1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p266t.C8927z;
import p336y.AbstractC10311w1;

public class C9810e implements AbstractC10311w1 {
    public final List<Size> f32080a;

    public C9810e(C8927z zVar) {
        List<Size> list;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) zVar.m10951a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            C0662u1.m40654c("CamcorderProfileResolutionQuirk", "StreamConfigurationMap is null");
        }
        Size[] sizeArr = null;
        if (Build.VERSION.SDK_INT < 23) {
            if (streamConfigurationMap != null) {
                sizeArr = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
            }
        } else if (streamConfigurationMap != null) {
            sizeArr = streamConfigurationMap.getOutputSizes(34);
        }
        if (sizeArr != null) {
            list = Arrays.asList((Size[]) sizeArr.clone());
        } else {
            list = Collections.emptyList();
        }
        this.f32080a = list;
        C0662u1.m40656a("CamcorderProfileResolutionQuirk", "mSupportedResolutions = " + list);
    }

    public static boolean m6821b(C8927z zVar) {
        Integer num = (Integer) zVar.m10951a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    public List<Size> m6822a() {
        return new ArrayList(this.f32080a);
    }
}
