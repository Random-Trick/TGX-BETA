package g6;

import android.location.Location;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import k5.f;
import k5.g;

@Deprecated
public interface a {
    @RecentlyNonNull
    Location a(@RecentlyNonNull f fVar);

    @RecentlyNonNull
    g<Status> b(@RecentlyNonNull f fVar, @RecentlyNonNull e eVar);

    @RecentlyNonNull
    g<Status> c(@RecentlyNonNull f fVar, @RecentlyNonNull LocationRequest locationRequest, @RecentlyNonNull e eVar);
}
