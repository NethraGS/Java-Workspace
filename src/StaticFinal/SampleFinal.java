package StaticFinal;


public class SampleFinal {
    int x;
    final  int y = 100;
    final  int z;
    static final int num = 100;

    public SampleFinal() {
        z=100;
    }

    public SampleFinal(int z) {
        this.z = z;
    }

    public SampleFinal(int z, int x) {
        this.z = z;
        this.x = x;
    }
}
