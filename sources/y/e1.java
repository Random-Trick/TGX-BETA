package y;

import android.util.Pair;
import android.util.Size;
import androidx.camera.core.e;
import java.util.List;
import y.n0;

public interface e1 extends z1 {
    public static final n0.a<Integer> f26287k = n0.a.a("camerax.core.imageOutput.targetAspectRatio", e.class);
    public static final n0.a<Integer> f26288l = n0.a.a("camerax.core.imageOutput.targetRotation", Integer.TYPE);
    public static final n0.a<Size> f26289m = n0.a.a("camerax.core.imageOutput.targetResolution", Size.class);
    public static final n0.a<Size> f26290n = n0.a.a("camerax.core.imageOutput.defaultResolution", Size.class);
    public static final n0.a<Size> f26291o = n0.a.a("camerax.core.imageOutput.maxResolution", Size.class);
    public static final n0.a<List<Pair<Integer, Size[]>>> f26292p = n0.a.a("camerax.core.imageOutput.supportedResolutions", List.class);

    int E(int i10);

    Size f(Size size);

    List<Pair<Integer, Size[]>> i(List<Pair<Integer, Size[]>> list);

    Size o(Size size);

    Size p(Size size);

    boolean u();

    int w();
}
