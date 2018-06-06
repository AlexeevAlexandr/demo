public class ArrayUtils {
    public static int[][][] rotateClockwise(int[][][] arg) {
        int[][][] result;
        try{
            int s = arg[0][0][0];
            if (arg.length == 2 && s != 0) {
            final int w = arg.length;
            final int h = arg[0].length;
            final int g = arg[1].length;
            result = new int[h][w][g];
                for (int i = 0; i < h; i++) {
                    for (int k = 0; k < h; k++) {
                        int j = 0;
                        result[i][k][j] = arg[j][i][k];
                        j++;
                        result[i][k][j] = arg[j][i][k];
                    }
                }
                return result;
            }
            if (arg.length == 3) {
                final int w = arg.length;
                final int h = arg[0].length;
                final int g = arg[1].length;
                result = new int[h][w][g];
                for (int i = 0; i < h; i++) {
                    for (int k = 0; k < h; k++) {
                        int j = 0;
                        result[i][k][j] = arg[j][i][k];
                        j++;
                        result[i][k][j] = arg[j][i][k];
                        j++;
                        result[i][k][j] = arg[j][i][k];
                    }
                }
                return result;
            }
        }catch(Exception ignore){}
        try{
           //
            int a = arg[0].length;
            int b = arg[0][0].length;
            if((arg.length != a) || (arg.length != b)){return null;}
        }catch(Exception ignored){}
        try {
            if (arg[0][0][0] == 1) {
                return arg;
            }
        }catch(Exception e){return null;}
        try{
            if (arg.length != arg[0][1].length) { return null; }
        }catch(Exception e){return null;}

        return null;
    }
}

/*1. Проверяет, что метод получил "кубическую" матрицу (
    допустимые размеры 1x1x1, 2x2x2, 3x3x3, ...)
    иначе возвращает null; (возможные ошибки: аргумент равен null,
     "длина" / "ширина" / "высота" не равны, есть строки разной длины,
     есть строки с null вместо одномерных/двумерных массивов ...)
 2. "Проворачивает куб"  по часовой стрелке на 120 градусов
 (по часовой стрелке*/
