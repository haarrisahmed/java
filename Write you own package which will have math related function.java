import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{

    public class Mat {

        protected float[] matrix;
        protected int order;
    }

    public class Mat4 extends Mat {

        public Vec4 c0;
        public Vec4 c1;
        public Vec4 c2;
        public Vec4 c3;

        public Mat4(float value) {

            order = 4;

            matrix = new float[16];

            for (int i = 0; i < 4; i++) {
                matrix[i * 5] = value;
            }
            c0 = new Vec4(matrix, 0);
            c1 = new Vec4(matrix, 4);
            c2 = new Vec4(matrix, 8);
            c3 = new Vec4(matrix, 12);
        }

        public float[] toFloatArray() {
            return new float[]{
                c0.x, c0.y, c0.z, c0.w,
                c1.x, c1.y, c1.z, c1.w,
                c2.x, c2.y, c2.z, c2.w,
                c3.x, c3.y, c3.z, c3.w,};
        }
    }

    public static float mix(float start, float end, float lerp) {
        return (start + lerp * (end - start));
    }
}
