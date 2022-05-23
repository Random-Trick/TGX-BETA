package i6;

import android.os.IInterface;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import u5.b;

public interface a extends IInterface {
    @RecentlyNonNull
    b G0(@RecentlyNonNull LatLngBounds latLngBounds, int i10, int i11, int i12);

    @RecentlyNonNull
    b L0(@RecentlyNonNull CameraPosition cameraPosition);

    @RecentlyNonNull
    b b0(@RecentlyNonNull LatLng latLng);

    @RecentlyNonNull
    b m1(@RecentlyNonNull LatLng latLng, float f10);
}
