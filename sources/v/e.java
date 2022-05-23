package v;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.t1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import t.z;
import y.w1;

public class e implements w1 {
    public final List<Size> f24662a;

    public e(z zVar) {
        List<Size> list;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) zVar.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            t1.c("CamcorderProfileResolutionQuirk", "StreamConfigurationMap is null");
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
        this.f24662a = list;
        t1.a("CamcorderProfileResolutionQuirk", "mSupportedResolutions = " + list);
    }

    public static boolean b(z zVar) {
        Integer num = (Integer) zVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    public List<Size> a() {
        return new ArrayList(this.f24662a);
    }
}
