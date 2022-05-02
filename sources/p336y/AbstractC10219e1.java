package p336y;

import android.util.Pair;
import android.util.Size;
import androidx.camera.core.C0530e;
import java.util.List;
import p336y.AbstractC10268n0;

public interface AbstractC10219e1 extends AbstractC10325z1 {
    public static final AbstractC10268n0.AbstractC10269a<Integer> f32984k = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.imageOutput.targetAspectRatio", C0530e.class);
    public static final AbstractC10268n0.AbstractC10269a<Integer> f32985l = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.imageOutput.targetRotation", Integer.TYPE);
    public static final AbstractC10268n0.AbstractC10269a<Size> f32986m = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.imageOutput.targetResolution", Size.class);
    public static final AbstractC10268n0.AbstractC10269a<Size> f32987n = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.imageOutput.defaultResolution", Size.class);
    public static final AbstractC10268n0.AbstractC10269a<Size> f32988o = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.imageOutput.maxResolution", Size.class);
    public static final AbstractC10268n0.AbstractC10269a<List<Pair<Integer, Size[]>>> f32989p = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.imageOutput.supportedResolutions", List.class);

    int mo5452E(int i);

    Size mo5440f(Size size);

    List<Pair<Integer, Size[]>> mo5438i(List<Pair<Integer, Size[]>> list);

    Size mo5434o(Size size);

    Size mo5433p(Size size);

    boolean mo5430u();

    int mo5428w();
}
