package ee;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import de.C4059n;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import lb.EnumC6459p;
import nc.C7389v0;
import org.thunderdog.challegram.Log;
import p067ed.C4184b;
import p108hb.C5069h;
import p108hb.C5070i;
import p139jb.AbstractC5918j;
import p156kd.C6253l;

@TargetApi(16)
public class C4193h extends AbstractC4186b implements Camera.PreviewCallback, Camera.AutoFocusMoveCallback, Camera.AutoFocusCallback, Camera.ShutterCallback, Camera.PictureCallback, MediaRecorder.OnInfoListener {
    public Camera.Size f14159B;
    public Camera.Size f14160C;
    public Camera.Size f14161D;
    public int f14162E;
    public Integer[] f14163F;
    public int f14167J;
    public int f14168K;
    public int f14169L;
    public int f14170M;
    public MediaRecorder f14171N;
    public File f14172O;
    public Camera f14173x;
    public int f14174y = -1;
    public final Camera.CameraInfo f14175z = new Camera.CameraInfo();
    public final Camera.CameraInfo f14158A = new Camera.CameraInfo();
    public int f14164G = -1;
    public int f14165H = -1;
    public final Comparator<Integer> f14166I = new Comparator() {
        @Override
        public final int compare(Object obj, Object obj2) {
            int E0;
            E0 = C4193h.this.m28552E0((Integer) obj, (Integer) obj2);
            return E0;
        }
    };

    public C4193h(Context context, C4195j jVar) {
        super(context, jVar);
    }

    public static void m28555B0(int i, Camera.CameraInfo cameraInfo) {
        cameraInfo.facing = 0;
        if (Build.VERSION.SDK_INT >= 17) {
            cameraInfo.canDisableShutterSound = false;
        }
        cameraInfo.orientation = 0;
        Camera.getCameraInfo(i, cameraInfo);
    }

    public static String m28554C0(int i) {
        return i != 2048 ? i != 4096 ? "off" : "auto" : "on";
    }

    public static int m28553D0() {
        return C4184b.f14109b != 10 ? 1 : 4;
    }

    public int m28552E0(Integer num, Integer num2) {
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        if (this.f14127b.m29091V()) {
            int i = this.f14165H;
            if (i != -1) {
                if (intValue == i) {
                    return -1;
                }
                if (intValue2 == i) {
                    return 1;
                }
            }
            int i2 = this.f14164G;
            if (i2 != -1) {
                if (intValue == i2) {
                    return -1;
                }
                if (intValue2 == i2) {
                    return 1;
                }
            }
        } else {
            int i3 = this.f14164G;
            if (i3 != -1) {
                if (intValue == i3) {
                    return -1;
                }
                if (intValue2 == i3) {
                    return 1;
                }
            }
            int i4 = this.f14165H;
            if (i4 != -1) {
                if (intValue == i4) {
                    return -1;
                }
                if (intValue2 == i4) {
                    return 1;
                }
            }
        }
        if (intValue < intValue2) {
            return -1;
        }
        return intValue == intValue2 ? 0 : 1;
    }

    public void m28550F0(C6253l lVar) {
        this.f14127b.m29102A(lVar, false);
    }

    public static int m28549G0(float f, int i, Camera.Size size, Camera.Size size2) {
        return AbstractC4186b.m28580k(size.width, size.height, size2.width, size2.height, f, i);
    }

    public static int m28547H0(long j, float f, Camera.Size size, Camera.Size size2) {
        return AbstractC4186b.m28578l(size.width, size.height, size2.width, size2.height, j, f);
    }

    public static void m28533O0(List<Camera.Size> list, final float f, final int i) {
        Collections.sort(list, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int G0;
                G0 = C4193h.m28549G0(f, i, (Camera.Size) obj, (Camera.Size) obj2);
                return G0;
            }
        });
    }

    public static void m28532P0(List<Camera.Size> list, long j, long j2, final float f) {
        final long j3 = j * j2;
        Collections.sort(list, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int H0;
                H0 = C4193h.m28547H0(j3, f, (Camera.Size) obj, (Camera.Size) obj2);
                return H0;
            }
        });
    }

    public final File m28556A0(MediaRecorder mediaRecorder) {
        int i = this.f14141p;
        Camera.CameraInfo cameraInfo = this.f14175z;
        int i2 = 90;
        if (cameraInfo.facing == 1) {
            int i3 = (360 - ((cameraInfo.orientation + i) % 360)) % 360;
            if (i3 == 90) {
                i3 = 270;
            }
            if (!"Huawei".equals(Build.MANUFACTURER) || !"angler".equals(Build.PRODUCT) || i3 != 270) {
                i2 = i3;
            }
        } else {
            i2 = ((cameraInfo.orientation - i) + 360) % 360;
        }
        mediaRecorder.setOrientationHint(i2);
        Log.m14721i((int) Log.TAG_CAMERA, "output video orientation: %d", Integer.valueOf(i2));
        int D0 = m28553D0();
        if (CamcorderProfile.hasProfile(this.f14174y, D0)) {
            mediaRecorder.setProfile(CamcorderProfile.get(this.f14174y, D0));
        } else if (CamcorderProfile.hasProfile(this.f14174y, 0)) {
            mediaRecorder.setProfile(CamcorderProfile.get(this.f14174y, 0));
        } else {
            throw new IllegalStateException("Could not set camcorder profile");
        }
        return this.f14127b.m29063r(true);
    }

    @Override
    public boolean mo28551F() {
        return true;
    }

    @Override
    public void mo28548H() {
        if (this.f14138m) {
            try {
                this.f14173x.setDisplayOrientation(mo28527e());
                m28539L0(m28518z0());
            } catch (Throwable th) {
                Log.critical(th);
            }
        }
    }

    @Override
    public void mo28546I(boolean z, AbstractC5918j<C6253l> jVar) {
        try {
            this.f14173x.reconnect();
            this.f14173x.startPreview();
        } catch (Throwable th) {
            Log.m14712w(Log.TAG_CAMERA, "Cannot reconnect camera", th, new Object[0]);
        }
        MediaRecorder mediaRecorder = this.f14171N;
        if (mediaRecorder != null) {
            try {
                mediaRecorder.stop();
            } catch (Throwable th2) {
                Log.m14712w(Log.TAG_CAMERA, "Cannot stop videoRecorder", th2, new Object[0]);
            }
        }
        File file = this.f14172O;
        if (file != null) {
            if (z && file.exists()) {
                C7389v0.m16687R2(this.f14172O, true, jVar);
            }
            if (!z && this.f14172O.exists() && !this.f14172O.delete()) {
                Log.m14711w((int) Log.TAG_CAMERA, "Cannot delete video file: %s", this.f14172O.getPath());
            }
            this.f14172O = null;
        }
        MediaRecorder mediaRecorder2 = this.f14171N;
        if (mediaRecorder2 != null) {
            try {
                mediaRecorder2.release();
            } catch (Throwable th3) {
                Log.m14712w(Log.TAG_CAMERA, "Cannot release MediaRecorder", th3, new Object[0]);
            }
            this.f14171N = null;
        }
    }

    public void m28545I0() {
        if (this.f14138m) {
            try {
                this.f14173x.setOneShotPreviewCallback(new C4188c(this));
            } catch (RuntimeException unused) {
            }
        }
    }

    @Override
    public void mo28544J(int i) {
        if (this.f14138m) {
            Camera.Parameters parameters = this.f14173x.getParameters();
            parameters.setFlashMode(m28554C0(i));
            this.f14173x.setParameters(parameters);
        }
    }

    public void m28543J0(byte[] bArr, Camera camera) {
        if (this.f14138m) {
            this.f14127b.m28508J0(bArr, camera);
        }
    }

    @Override
    public void mo28542K() {
        if (this.f14138m) {
            m28539L0(m28518z0());
        }
    }

    public final void m28541K0() {
        m28599Z();
        m28595b0();
    }

    @Override
    public void mo28540L() {
        if (this.f14138m && this.f14142q > 1) {
            m28541K0();
            this.f14127b.m28503O0(true);
            int v = m28560v();
            m28555B0(this.f14163F[v].intValue(), this.f14158A);
            boolean z = v >= m28558x();
            boolean z2 = this.f14158A.facing == 1;
            this.f14127b.m28511G0(false, z, z2);
            m28586g0(false);
            m28573n0(v);
            m28586g0(true);
            this.f14127b.m28511G0(true, z, z2);
        }
    }

    public final void m28539L0(int i) {
        if (this.f14167J != i) {
            this.f14167J = i;
            try {
                Camera.Parameters parameters = this.f14173x.getParameters();
                parameters.setRotation(i);
                this.f14173x.setParameters(parameters);
            } catch (Throwable th) {
                Log.m14728e(Log.TAG_CAMERA, "Cannot set output rotation", th, new Object[0]);
            }
        }
    }

    @Override
    public void mo28538M(int i, int i2) {
        if (this.f14138m) {
            m28535N0(this.f14173x.getParameters());
        }
    }

    public final void m28537M0() {
        boolean z;
        char c;
        char c2;
        int i;
        C4059n nVar = new C4059n(false);
        Camera.Parameters parameters = this.f14173x.getParameters();
        if (this.f14175z.facing == 1) {
            nVar.m29109a(1);
        }
        if (nVar.m29104f(1)) {
            List<String> supportedSceneModes = parameters.getSupportedSceneModes();
            if (supportedSceneModes != null && !supportedSceneModes.isEmpty()) {
                Iterator<String> it = supportedSceneModes.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C5070i.m24067c(it.next(), "portrait")) {
                            parameters.setSceneMode("portrait");
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            List<String> supportedAntibanding = parameters.getSupportedAntibanding();
            if (supportedAntibanding != null && !supportedAntibanding.isEmpty()) {
                Iterator<String> it2 = supportedAntibanding.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (C5070i.m24067c(it2.next(), "auto")) {
                            parameters.setAntibanding("auto");
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            List<String> supportedWhiteBalance = parameters.getSupportedWhiteBalance();
            if (supportedWhiteBalance != null && !supportedWhiteBalance.isEmpty()) {
                Iterator<String> it3 = supportedWhiteBalance.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    String next = it3.next();
                    if (C5070i.m24067c(next, "auto")) {
                        parameters.setWhiteBalance(next);
                        break;
                    }
                }
            }
            if (parameters.isVideoStabilizationSupported()) {
                parameters.setVideoStabilization(true);
            }
        }
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes != null) {
            for (String str : supportedFocusModes) {
                if (!C5070i.m24061i(str)) {
                    str.hashCode();
                    switch (str.hashCode()) {
                        case -194628547:
                            if (str.equals("continuous-video")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3005871:
                            if (str.equals("auto")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 910005312:
                            if (str.equals("continuous-picture")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            i = Log.TAG_YOUTUBE;
                            break;
                        case 1:
                            i = 32;
                            break;
                        case 2:
                            i = 64;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    if (i != 0) {
                        nVar.m29109a(i);
                    }
                }
            }
        }
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (supportedFlashModes != null) {
            for (String str2 : supportedFlashModes) {
                if (!C5070i.m24061i(str2)) {
                    str2.hashCode();
                    switch (str2.hashCode()) {
                        case 3551:
                            if (str2.equals("on")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 109935:
                            if (str2.equals("off")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3005871:
                            if (str2.equals("auto")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 110547964:
                            if (str2.equals("torch")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            nVar.m29109a(Log.TAG_VOICE);
                            continue;
                        case 1:
                            nVar.m29109a(Log.TAG_CAMERA);
                            continue;
                        case 2:
                            nVar.m29109a(Log.TAG_EMOJI);
                            continue;
                        case 3:
                            nVar.m29109a(Log.TAG_LUX);
                            continue;
                    }
                }
            }
        }
        if (parameters.isZoomSupported()) {
            nVar.m29109a(Log.TAG_NDK);
            z = true;
        } else {
            z = false;
        }
        if (parameters.isSmoothZoomSupported()) {
            nVar.m29109a(Log.TAG_ACCOUNTS);
            z = true;
        }
        if (z) {
            nVar.m29103g(parameters.getMaxZoom());
        }
        if (parameters.getMaxNumFocusAreas() > 0) {
            nVar.m29109a(2);
        }
        if (parameters.getMaxNumMeteringAreas() > 0) {
            nVar.m29109a(4);
        }
        parameters.setRecordingHint(true);
        parameters.setPictureFormat(Log.TAG_CRASH);
        int z0 = m28518z0();
        this.f14167J = z0;
        parameters.setRotation(z0);
        if (nVar.m29104f(224)) {
            if (nVar.m29104f(64)) {
                parameters.setFocusMode("continuous-picture");
            } else if (nVar.m29104f(Log.TAG_YOUTUBE)) {
                parameters.setFocusMode("continuous-video");
            } else if (nVar.m29104f(32)) {
                parameters.setFocusMode("auto");
            }
        }
        if (nVar.m29108b(false)) {
            parameters.setFlashMode(m28554C0(this.f14136k));
        } else if (nVar.m29104f(Log.TAG_CAMERA)) {
            parameters.setFlashMode(m28554C0(Log.TAG_CAMERA));
        }
        if (nVar.m29106d()) {
            parameters.setZoom(this.f14162E);
        }
        m28584h0(nVar);
        m28535N0(parameters);
        this.f14173x.setParameters(parameters);
    }

    @Override
    public void mo28536N() {
        this.f14165H = -1;
        this.f14164G = -1;
        this.f14162E = 0;
    }

    public final void m28535N0(Camera.Parameters parameters) {
        int i;
        int i2;
        int i3;
        int i4 = this.f14130e;
        if (i4 != 0 && (i = this.f14131f) != 0) {
            int e = mo28527e();
            boolean x1 = C7389v0.m16564x1(e);
            if (x1) {
                i = i4;
                i4 = i;
            }
            Log.m14721i((int) Log.TAG_CAMERA, "calculating output sizes; width: %d, height: %d, orientation: %d", Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(e));
            ArrayList arrayList = new ArrayList();
            List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
            if (supportedPreviewSizes != null && !supportedPreviewSizes.isEmpty()) {
                float f = i4 / i;
                arrayList.ensureCapacity(supportedPreviewSizes.size());
                arrayList.addAll(supportedPreviewSizes);
                int n = this.f14127b.m29067n();
                if (n != 0) {
                    long j = n;
                    m28532P0(arrayList, j, j, 1.7777778f);
                } else {
                    m28532P0(arrayList, i4, i, f);
                }
                Camera.Size size = (Camera.Size) arrayList.get(0);
                this.f14159B = size;
                parameters.setPreviewSize(size.width, size.height);
                arrayList.clear();
            }
            List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
            if (supportedPictureSizes != null && !supportedPictureSizes.isEmpty()) {
                arrayList.ensureCapacity(supportedPictureSizes.size());
                arrayList.addAll(supportedPictureSizes);
                m28532P0(arrayList, 1280L, (int) ((Math.min(i4, i) / Math.max(i4, i)) * 1280.0f), C5069h.m24092a(i4, i));
                Camera.Size size2 = (Camera.Size) arrayList.get(0);
                this.f14160C = size2;
                parameters.setPictureSize(size2.width, size2.height);
                arrayList.clear();
            }
            List<Camera.Size> supportedVideoSizes = parameters.getSupportedVideoSizes();
            if (supportedVideoSizes == null || supportedVideoSizes.isEmpty()) {
                Log.m14721i((int) Log.TAG_CAMERA, "output video size: unknown", new Object[0]);
                this.f14161D = null;
            } else {
                arrayList.ensureCapacity(supportedVideoSizes.size());
                arrayList.addAll(supportedVideoSizes);
                m28533O0(arrayList, C5069h.m24092a(i4, i), this.f14127b.m29067n());
                Camera.Size size3 = (Camera.Size) arrayList.get(0);
                this.f14161D = size3;
                Log.m14721i((int) Log.TAG_CAMERA, "output video size: %dx%d", Integer.valueOf(size3.width), Integer.valueOf(this.f14161D.height));
                arrayList.clear();
            }
            Log.m14721i((int) Log.TAG_CAMERA, "preview size: %dx%d", Integer.valueOf(this.f14159B.width), Integer.valueOf(this.f14159B.height));
            if (x1) {
                Camera.Size size4 = this.f14159B;
                i2 = size4.height;
                i3 = size4.width;
            } else {
                Camera.Size size5 = this.f14159B;
                i2 = size5.width;
                i3 = size5.height;
            }
            this.f14127b.m28501Q0(i2, i3);
        }
    }

    @Override
    public void mo28534O() {
        if (this.f14138m) {
            this.f14173x.unlock();
            MediaRecorder mediaRecorder = new MediaRecorder();
            this.f14171N = mediaRecorder;
            mediaRecorder.setCamera(this.f14173x);
            this.f14171N.setVideoSource(1);
            this.f14171N.setAudioSource(5);
            File A0 = m28556A0(this.f14171N);
            this.f14172O = A0;
            if (A0.createNewFile()) {
                this.f14171N.setOutputFile(this.f14172O.getAbsolutePath());
                this.f14171N.setMaxFileSize(EnumC6459p.f20140M.mo20395b(1.0d));
                this.f14171N.setVideoFrameRate(30);
                this.f14171N.setMaxDuration(0);
                this.f14171N.setVideoEncodingBitRate(1800000);
                MediaRecorder mediaRecorder2 = this.f14171N;
                Camera.Size size = this.f14161D;
                mediaRecorder2.setVideoSize(size.width, size.height);
                this.f14171N.setOnInfoListener(this);
                this.f14171N.prepare();
                this.f14171N.start();
                return;
            }
            throw new IllegalStateException("Could not create output file");
        }
        throw new IllegalStateException("!isCameraActive");
    }

    @Override
    public void mo28531S(int i, int i2, int i3) {
        if (this.f14138m) {
            this.f14168K = i;
            this.f14169L = i2;
            this.f14170M = i3;
            this.f14173x.takePicture(this, null, this);
            return;
        }
        this.f14127b.m29056z(false);
    }

    @Override
    public void mo28530T(float f) {
        int round = Math.round(f);
        if (this.f14162E != round) {
            C4059n nVar = this.f14135j;
            boolean z = true;
            boolean z2 = nVar == null;
            if (!z2 && nVar.m29104f(Log.TAG_ACCOUNTS)) {
                try {
                    this.f14173x.stopSmoothZoom();
                    this.f14173x.startSmoothZoom(round);
                } catch (Throwable th) {
                    Log.m14712w(Log.TAG_CAMERA, "Cannot change zoom smoothly", th, new Object[0]);
                }
                if (!z && this.f14135j.m29104f(Log.TAG_NDK)) {
                    Camera.Parameters parameters = this.f14173x.getParameters();
                    parameters.setZoom(round);
                    this.f14173x.setParameters(parameters);
                }
                this.f14162E = round;
            }
            z = z2;
            if (!z) {
                Camera.Parameters parameters2 = this.f14173x.getParameters();
                parameters2.setZoom(round);
                this.f14173x.setParameters(parameters2);
            }
            this.f14162E = round;
        }
    }

    @Override
    public boolean mo28529U(SurfaceTexture surfaceTexture) {
        this.f14173x.setPreviewTexture(surfaceTexture);
        this.f14173x.setAutoFocusMoveCallback(this);
        this.f14173x.setDisplayOrientation(mo28527e());
        this.f14173x.setOneShotPreviewCallback(this);
        this.f14173x.startPreview();
        return true;
    }

    @Override
    public boolean mo28528X() {
        int i;
        m28577l0(Camera.getNumberOfCameras());
        int i2 = this.f14142q;
        if (i2 > 0) {
            Integer[] numArr = this.f14163F;
            if (numArr == null || numArr.length != i2) {
                this.f14163F = new Integer[i2];
            }
            this.f14164G = -1;
            this.f14165H = -1;
            int i3 = 0;
            int i4 = -1;
            while (i3 < this.f14142q) {
                m28555B0(i3, this.f14175z);
                if (this.f14175z.facing == 1) {
                    if (this.f14165H == -1) {
                        this.f14165H = i3;
                    }
                } else if (this.f14164G == -1) {
                    this.f14164G = i3;
                }
                this.f14163F[i3] = Integer.valueOf(i3);
                i3++;
                i4 = i3;
            }
            Arrays.sort(this.f14163F, this.f14166I);
            i = this.f14163F[m28558x()].intValue();
            if (i4 != i) {
                m28555B0(i, this.f14175z);
            }
        } else {
            i = -1;
        }
        if (i == -1) {
            this.f14127b.m28498T0("Camera hardware failed");
            return false;
        }
        this.f14173x = Camera.open(i);
        this.f14174y = i;
        try {
            m28537M0();
        } catch (Throwable th) {
            Log.m14712w(Log.TAG_CAMERA, "Cannot start camera preview", th, new Object[0]);
            mo28526i();
        }
        return this.f14173x != null;
    }

    @Override
    public int mo28527e() {
        int i = this.f14132g;
        Camera.CameraInfo cameraInfo = this.f14175z;
        if (cameraInfo.facing == 1) {
            return (360 - ((cameraInfo.orientation + i) % 360)) % 360;
        }
        return ((cameraInfo.orientation - i) + 360) % 360;
    }

    @Override
    public void mo28526i() {
        if (this.f14173x != null) {
            try {
                if (this.f14135j.m29107c()) {
                    this.f14173x.cancelAutoFocus();
                }
            } catch (Throwable th) {
                Log.m14722i(Log.TAG_CAMERA, "Cannot cancel auto-focus", th, new Object[0]);
            }
            try {
                this.f14127b.m28503O0(false);
                this.f14173x.stopPreview();
            } catch (Throwable th2) {
                Log.m14712w(Log.TAG_CAMERA, "Cannot stop camera preview", th2, new Object[0]);
            }
            try {
                this.f14173x.release();
            } catch (Throwable th3) {
                Log.m14712w(Log.TAG_CAMERA, "Cannot release camera", th3, new Object[0]);
            }
            this.f14173x = null;
            this.f14174y = -1;
            m28584h0(null);
        }
    }

    @Override
    public void onAutoFocus(boolean z, Camera camera) {
        Log.m14721i((int) Log.TAG_CAMERA, "onAutoFocus %b", Boolean.valueOf(z));
    }

    @Override
    public void onAutoFocusMoving(boolean z, Camera camera) {
        Log.m14721i((int) Log.TAG_CAMERA, "onAutoFocusMoving %b", Boolean.valueOf(z));
    }

    @Override
    public void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        if (i == 1 || i == 800 || i == 801) {
            m28572o();
        } else {
            Log.m14721i((int) Log.TAG_CAMERA, "unknown MediaRecorder what: %d, extra: %d", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    @Override
    public void onPictureTaken(byte[] r9, android.hardware.Camera r10) {
        throw new UnsupportedOperationException("Method not decompiled: ee.C4193h.onPictureTaken(byte[], android.hardware.Camera):void");
    }

    @Override
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        if (this.f14138m) {
            this.f14127b.m28507K0();
            try {
                camera.setOneShotPreviewCallback(new C4188c(this));
            } catch (RuntimeException unused) {
            }
        }
    }

    @Override
    public void onShutter() {
        this.f14127b.m28509I0(false);
    }

    @Override
    public int mo28525s() {
        return this.f14159B.height;
    }

    @Override
    public int mo28524t() {
        return this.f14159B.width;
    }

    @Override
    public int mo28520y() {
        return this.f14175z.orientation;
    }

    public final int m28518z0() {
        int i = this.f14141p;
        if (i == -1) {
            i = this.f14132g;
        }
        Camera.CameraInfo cameraInfo = this.f14175z;
        if (cameraInfo.facing == 1) {
            return (cameraInfo.orientation + i) % 360;
        }
        return ((cameraInfo.orientation - i) + 360) % 360;
    }
}
