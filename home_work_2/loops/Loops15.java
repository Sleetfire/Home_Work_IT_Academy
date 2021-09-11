package home_work_2.loops;

public class Loops15 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            System.out.println();

            for (int j = 2; j <= 5; j++) {

                if (j == 5) {

                    if (i < 10 && i * j < 10) {

                        System.out.print(" " + j + " x " + i + "  =  " + i * j);

                    } else if (i < 10 && i * j >= 10) {

                        System.out.print(" " + j + " x " + i + "  = " + i * j);

                    } else {

                        System.out.print(" " + j + " x " + i + " = " + i * j);

                    }

                } else {

                    if (i < 10 && i * j < 10) {

                        System.out.print(" " + j + " x " + i + "  =  " + i * j + " |");

                    } else if (i < 10 && i * j >= 10) {

                        System.out.print(" " + j + " x " + i + "  = " + i * j + " |");

                    } else {

                        System.out.print(" " + j + " x " + i + " = " + i * j + " |");

                    }

                }

            }

        }

        System.out.println();
        System.out.print(" -----------------------------------------------------");

        for (int i = 1; i <= 10; i++) {

            System.out.println();

            for (int j = 6; j <= 9; j++) {

                if (j == 9) {

                    if (i < 10 && i * j < 10) {

                        System.out.print(" " + j + " x " + i + "  =  " + i * j);

                    } else if (i < 10 && i * j >= 10) {

                        System.out.print(" " + j + " x " + i + "  = " + i * j);

                    } else {

                        System.out.print(" " + j + " x " + i + " = " + i * j);

                    }

                } else {

                    if (i < 10 && i * j < 10) {

                        System.out.print(" " + j + " x " + i + "  =  " + i * j + " |");

                    } else if (i < 10 && i * j >= 10) {

                        System.out.print(" " + j + " x " + i + "  = " + i * j + " |");

                    } else {

                        System.out.print(" " + j + " x " + i + " = " + i * j + " |");

                    }

                }

            }

        }

    }

}
