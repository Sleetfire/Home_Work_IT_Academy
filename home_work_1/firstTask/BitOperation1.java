package firstTask;

//1.2 Использовать ВСЕ возможные побитовые операции с числами 42 и 15.

public class BitOperation1 {

    public static void main(String[] args) {

        // Побитовое NOT (~)
        byte a = ~42; // ~00101010 = 11010101

        a = ~15; // ~00001111 = 11110000

        // Побитовый AND (&)
        a = 42 & 15; // 00101010 & 00001111 = 00001010

        // Побитовый AND с присваиванием (&=)
        a = 42;
        a &= 15; // a = 00101010 & 00001111 = 00001010

        // Побитовый OR (|)
        a = 42 | 15; // 00101010 | 00001111 = 00101111

        // Побитовый OR с присваиванием (|=)
        a = 42;
        a |= 15; // a = 00101010 | 00001111 = 00101111

        // Побитовый исключающий OR (^)
        a = 42 ^ 15; // 00101010 ^ 00001111 = 00100101

        // Побитовый исключающий OR с присваиванием (^=)
        a = 42;
        a ^= 15; // a = 00101010 ^ 00001111 = 00100101

        // Сдвиг вправо (>>) для 42 на 2
        a = 42 >> 2; // 00101010 >> 2 = 00001010

        // Сдвиг вправо (>>) для 15 на 2
        a = 15 >> 2; // 00001111 >> 2 = 00000011

        // Сдвиг вправо с присваиванием (>>=) для 42 на 2
        a = 42;
        a >>= 2; // a = 00101010 >> 2 = 00001010

        // Сдвиг вправо с присваиванием (>>=) для 15 на 2
        a = 15;
        a >>= 2; // a = 00001111 >> 2 = 00000011

        // Сдвиг вправо с заполнением нулями (>>>) для 42 на 2
        a = 42 >>> 2; // 00101010 >>> 2 = 00001010

        // Сдвиг вправо с заполнением нулями (>>>) для 15 на 2
        a = 15 >>> 2; // 00001111 >>> 2 = 00000011

        // Сдвиг вправо с заполнением нулями с присваиванием (=>>>) для 42 на 2
        a = 42;
        a >>>= 2; // a = 00101010 >>> 2 = 00001010

        // Сдвиг вправо с заполнением нулями с присваиванием (=>>>) для 15 на 2
        a = 15;
        a >>>= 2; // a = 00001111 >>> 2 = 00000011

        // Сдвиг влево (<<) для 42 на 2
        int aa = 42 << 2; // 00101010 << 2 = 0010101000, используется int, так как будет переполнение byte

        // Сдвиг влево (<<) для 15 на 2
        aa = 15 << 2; // 00001111 << 2 = 0000111100

        // Сдвиг влево c присваиванием (<<=) для 42 на 2
        aa = 42;
        aa <<= 2; // aa = 00101010 << 2 = 0010101000

        // Сдвиг влево c присваиванием (<<=) для 15 на 2
        aa = 15;
        aa <<= 2; // aa = 00001111 << 2 = 0000111100

    }
}
