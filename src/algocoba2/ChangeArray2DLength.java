
package algocoba2;

public class ChangeArray2DLength {
    public static Object[][] changeLength2D(Object [][] a, int n, int m, int newLength, int newLength2){
        
        if (n> newLength){
            throw new IllegalArgumentException("Ukuran array yang depan terlalu kecil");
        }
        if(m>newLength2){
            throw new IllegalArgumentException("Ukuran array yang belakang terlalu kecil");
        }

        if (a != null) {
        Object[][] copy = new Object[newLength][newLength2];

            for (int i = 0; i < a.length; i++) {
                final Object[] row = a[i];
                copy[i] = new Object[newLength2];
                System.arraycopy(row, 0, copy[i], 0, row.length);
            }
        
        return copy;
        } 
    return null;
    }

    public static Object [][] changeLength2D(Object[][] a, int newLength, int newLength2){
        return changeLength2D(a, a.length, a[0].length, newLength, newLength2);
    }
}
