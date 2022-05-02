package org.thunderdog.challegram.video.old;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.coremedia.iso.boxes.AbstractMediaHeaderBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.mp4parser.iso14496.part15.AvcConfigurationBox;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import p039d.C3563j;
import p249r8.C8377a;
import p249r8.C8383e;
import p249r8.C8386h;
import p249r8.C8392n;

@TargetApi(16)
public class C7932e {
    public static Map<Integer, Integer> f25787r;
    public long f25788a;
    public int[] f25791d;
    public String f25792e;
    public AbstractMediaHeaderBox f25793f;
    public SampleDescriptionBox f25794g;
    public LinkedList<Integer> f25795h;
    public int f25796i;
    public int f25798k;
    public int f25799l;
    public float f25800m;
    public long[] f25801n;
    public boolean f25803p;
    public ArrayList<C7930c> f25789b = new ArrayList<>();
    public long f25790c = 0;
    public Date f25797j = new Date();
    public ArrayList<C7933a> f25802o = new ArrayList<>();
    public boolean f25804q = true;

    public static class C7933a {
        public int f25805a;
        public long f25806b;
        public long f25807c;

        public C7933a(int i, long j) {
            this.f25805a = i;
            this.f25806b = j;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f25787r = hashMap;
        hashMap.put(96000, 0);
        f25787r.put(88200, 1);
        f25787r.put(64000, 2);
        f25787r.put(48000, 3);
        f25787r.put(44100, 4);
        f25787r.put(32000, 5);
        f25787r.put(24000, 6);
        f25787r.put(22050, 7);
        f25787r.put(16000, 8);
        f25787r.put(12000, 9);
        f25787r.put(11025, 10);
        f25787r.put(8000, 11);
    }

    public C7932e(int i, MediaFormat mediaFormat, boolean z) {
        this.f25795h = null;
        this.f25800m = 0.0f;
        this.f25788a = i;
        this.f25803p = z;
        if (!z) {
            this.f25799l = mediaFormat.getInteger("width");
            this.f25798k = mediaFormat.getInteger("height");
            this.f25796i = 90000;
            this.f25795h = new LinkedList<>();
            this.f25792e = "vide";
            this.f25793f = new VideoMediaHeaderBox();
            this.f25794g = new SampleDescriptionBox();
            String string = mediaFormat.getString("mime");
            if (string.equals("video/avc")) {
                VisualSampleEntry visualSampleEntry = new VisualSampleEntry(VisualSampleEntry.TYPE3);
                visualSampleEntry.setDataReferenceIndex(1);
                visualSampleEntry.setDepth(24);
                visualSampleEntry.setFrameCount(1);
                visualSampleEntry.setHorizresolution(72.0d);
                visualSampleEntry.setVertresolution(72.0d);
                visualSampleEntry.setWidth(this.f25799l);
                visualSampleEntry.setHeight(this.f25798k);
                AvcConfigurationBox avcConfigurationBox = new AvcConfigurationBox();
                if (mediaFormat.getByteBuffer("csd-0") != null) {
                    ArrayList arrayList = new ArrayList();
                    ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
                    byteBuffer.position(4);
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    arrayList.add(bArr);
                    ArrayList arrayList2 = new ArrayList();
                    ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
                    byteBuffer2.position(4);
                    byte[] bArr2 = new byte[byteBuffer2.remaining()];
                    byteBuffer2.get(bArr2);
                    arrayList2.add(bArr2);
                    avcConfigurationBox.setSequenceParameterSets(arrayList);
                    avcConfigurationBox.setPictureParameterSets(arrayList2);
                }
                if (mediaFormat.containsKey("level")) {
                    int integer = mediaFormat.getInteger("level");
                    if (integer == 1) {
                        avcConfigurationBox.setAvcLevelIndication(1);
                    } else if (integer == 32) {
                        avcConfigurationBox.setAvcLevelIndication(2);
                    } else if (integer == 4) {
                        avcConfigurationBox.setAvcLevelIndication(11);
                    } else if (integer == 8) {
                        avcConfigurationBox.setAvcLevelIndication(12);
                    } else if (integer == 16) {
                        avcConfigurationBox.setAvcLevelIndication(13);
                    } else if (integer == 64) {
                        avcConfigurationBox.setAvcLevelIndication(21);
                    } else if (integer == 128) {
                        avcConfigurationBox.setAvcLevelIndication(22);
                    } else if (integer == 256) {
                        avcConfigurationBox.setAvcLevelIndication(3);
                    } else if (integer == 512) {
                        avcConfigurationBox.setAvcLevelIndication(31);
                    } else if (integer == 1024) {
                        avcConfigurationBox.setAvcLevelIndication(32);
                    } else if (integer == 2048) {
                        avcConfigurationBox.setAvcLevelIndication(4);
                    } else if (integer == 4096) {
                        avcConfigurationBox.setAvcLevelIndication(41);
                    } else if (integer == 8192) {
                        avcConfigurationBox.setAvcLevelIndication(42);
                    } else if (integer == 16384) {
                        avcConfigurationBox.setAvcLevelIndication(5);
                    } else if (integer == 32768) {
                        avcConfigurationBox.setAvcLevelIndication(51);
                    } else if (integer == 65536) {
                        avcConfigurationBox.setAvcLevelIndication(52);
                    } else if (integer == 2) {
                        avcConfigurationBox.setAvcLevelIndication(27);
                    }
                } else {
                    avcConfigurationBox.setAvcLevelIndication(13);
                }
                if (mediaFormat.containsKey("profile")) {
                    int integer2 = mediaFormat.getInteger("profile");
                    if (integer2 == 1) {
                        avcConfigurationBox.setAvcProfileIndication(66);
                    } else if (integer2 == 2) {
                        avcConfigurationBox.setAvcProfileIndication(77);
                    } else if (integer2 == 4) {
                        avcConfigurationBox.setAvcProfileIndication(88);
                    } else if (integer2 == 8) {
                        avcConfigurationBox.setAvcProfileIndication(100);
                    } else if (integer2 == 16) {
                        avcConfigurationBox.setAvcProfileIndication(110);
                    } else if (integer2 == 32) {
                        avcConfigurationBox.setAvcProfileIndication(C3563j.f11967N0);
                    } else if (integer2 == 64) {
                        avcConfigurationBox.setAvcProfileIndication(244);
                    }
                } else {
                    avcConfigurationBox.setAvcProfileIndication(100);
                }
                avcConfigurationBox.setBitDepthLumaMinus8(-1);
                avcConfigurationBox.setBitDepthChromaMinus8(-1);
                avcConfigurationBox.setChromaFormat(-1);
                avcConfigurationBox.setConfigurationVersion(1);
                avcConfigurationBox.setLengthSizeMinusOne(3);
                avcConfigurationBox.setProfileCompatibility(0);
                visualSampleEntry.addBox(avcConfigurationBox);
                this.f25794g.addBox(visualSampleEntry);
            } else if (string.equals("video/mp4v")) {
                VisualSampleEntry visualSampleEntry2 = new VisualSampleEntry(VisualSampleEntry.TYPE1);
                visualSampleEntry2.setDataReferenceIndex(1);
                visualSampleEntry2.setDepth(24);
                visualSampleEntry2.setFrameCount(1);
                visualSampleEntry2.setHorizresolution(72.0d);
                visualSampleEntry2.setVertresolution(72.0d);
                visualSampleEntry2.setWidth(this.f25799l);
                visualSampleEntry2.setHeight(this.f25798k);
                this.f25794g.addBox(visualSampleEntry2);
            }
        } else {
            this.f25800m = 1.0f;
            this.f25796i = mediaFormat.getInteger("sample-rate");
            this.f25792e = "soun";
            this.f25793f = new SoundMediaHeaderBox();
            this.f25794g = new SampleDescriptionBox();
            AudioSampleEntry audioSampleEntry = new AudioSampleEntry(AudioSampleEntry.TYPE3);
            audioSampleEntry.setChannelCount(mediaFormat.getInteger("channel-count"));
            audioSampleEntry.setSampleRate(mediaFormat.getInteger("sample-rate"));
            audioSampleEntry.setDataReferenceIndex(1);
            audioSampleEntry.setSampleSize(16);
            ESDescriptorBox eSDescriptorBox = new ESDescriptorBox();
            C8386h hVar = new C8386h();
            hVar.m12595v(0);
            C8392n nVar = new C8392n();
            nVar.m12590h(2);
            hVar.m12594w(nVar);
            String string2 = mediaFormat.containsKey("mime") ? mediaFormat.getString("mime") : "audio/mp4-latm";
            C8383e eVar = new C8383e();
            if ("audio/mpeg".equals(string2)) {
                eVar.m12613u(105);
            } else {
                eVar.m12613u(64);
            }
            eVar.m12612v(5);
            eVar.m12615s(1536);
            if (mediaFormat.containsKey("max-bitrate")) {
                eVar.m12614t(mediaFormat.getInteger("max-bitrate"));
            } else {
                eVar.m12614t(96000L);
            }
            eVar.m12616r(this.f25796i);
            C8377a aVar = new C8377a();
            aVar.m12640p(2);
            aVar.m12638r(f25787r.get(Integer.valueOf((int) audioSampleEntry.getSampleRate())).intValue());
            aVar.m12639q(audioSampleEntry.getChannelCount());
            eVar.m12617q(aVar);
            hVar.m12596u(eVar);
            ByteBuffer s = hVar.m12598s();
            eSDescriptorBox.setEsDescriptor(hVar);
            eSDescriptorBox.setData(s);
            audioSampleEntry.addBox(eSDescriptorBox);
            this.f25794g.addBox(audioSampleEntry);
        }
    }

    public static int m14076r(C7933a aVar, C7933a aVar2) {
        if (aVar.f25806b > aVar2.f25806b) {
            return 1;
        }
        return aVar.f25806b < aVar2.f25806b ? -1 : 0;
    }

    public void m14092b(long j, MediaCodec.BufferInfo bufferInfo) {
        boolean z = true;
        if (this.f25803p || (bufferInfo.flags & 1) == 0) {
            z = false;
        }
        this.f25789b.add(new C7930c(j, bufferInfo.size));
        LinkedList<Integer> linkedList = this.f25795h;
        if (linkedList != null && z) {
            linkedList.add(Integer.valueOf(this.f25789b.size()));
        }
        ArrayList<C7933a> arrayList = this.f25802o;
        arrayList.add(new C7933a(arrayList.size(), ((bufferInfo.presentationTimeUs * this.f25796i) + 500000) / 1000000));
    }

    public Date m14091c() {
        return this.f25797j;
    }

    public long m14090d() {
        return this.f25790c;
    }

    public String m14089e() {
        return this.f25792e;
    }

    public int m14088f() {
        return this.f25798k;
    }

    public AbstractMediaHeaderBox m14087g() {
        return this.f25793f;
    }

    public int[] m14086h() {
        return this.f25791d;
    }

    public SampleDescriptionBox m14085i() {
        return this.f25794g;
    }

    public long[] m14084j() {
        return this.f25801n;
    }

    public ArrayList<C7930c> m14083k() {
        return this.f25789b;
    }

    public long[] m14082l() {
        LinkedList<Integer> linkedList = this.f25795h;
        if (linkedList == null || linkedList.isEmpty()) {
            return null;
        }
        long[] jArr = new long[this.f25795h.size()];
        for (int i = 0; i < this.f25795h.size(); i++) {
            jArr[i] = this.f25795h.get(i).intValue();
        }
        return jArr;
    }

    public int m14081m() {
        return this.f25796i;
    }

    public long m14080n() {
        return this.f25788a;
    }

    public float m14079o() {
        return this.f25800m;
    }

    public int m14078p() {
        return this.f25799l;
    }

    public boolean m14077q() {
        return this.f25803p;
    }

    public void m14075s() {
        int i;
        ArrayList arrayList = new ArrayList(this.f25802o);
        Collections.sort(this.f25802o, C7931d.f25786a);
        this.f25801n = new long[this.f25802o.size()];
        long j = Long.MAX_VALUE;
        long j2 = 0;
        int i2 = 0;
        boolean z = false;
        while (true) {
            if (i2 >= this.f25802o.size()) {
                break;
            }
            C7933a aVar = this.f25802o.get(i2);
            long j3 = aVar.f25806b - j2;
            j2 = aVar.f25806b;
            this.f25801n[aVar.f25805a] = j3;
            long j4 = j;
            if (aVar.f25805a != 0) {
                this.f25790c += j3;
            }
            j = (j3 <= 0 || j3 >= 2147483647L) ? j4 : Math.min(j4, j3);
            if (aVar.f25805a != i2) {
                z = true;
            }
            i2++;
        }
        long[] jArr = this.f25801n;
        if (jArr.length > 0) {
            jArr[0] = j;
            this.f25790c += j;
        }
        for (i = 1; i < arrayList.size(); i++) {
            ((C7933a) arrayList.get(i)).f25807c = this.f25801n[i] + ((C7933a) arrayList.get(i - 1)).f25807c;
        }
        if (z) {
            this.f25791d = new int[this.f25802o.size()];
            for (int i3 = 0; i3 < this.f25802o.size(); i3++) {
                C7933a aVar2 = this.f25802o.get(i3);
                this.f25791d[aVar2.f25805a] = (int) (aVar2.f25806b - aVar2.f25807c);
            }
        }
    }
}
