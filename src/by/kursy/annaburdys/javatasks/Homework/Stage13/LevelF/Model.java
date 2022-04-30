package by.kursy.annaburdys.javatasks.Homework.Stage13.LevelF;

public class Model {
    public static void sortDescUntilFirstZero(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] == 0 || array[0] == 0) {
                return;
            } else {
                int element = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] < element) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = element;
            }
        }
    }

    public static void sortAscUntilFirstZero(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] == 0 || array[0] == 0) {
                return;
            } else {
                int element = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] > element) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = element;
            }
        }
    }

    public static void sortDescUntilFirstNegative(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < 0 || array[0] < 0) {
                return;
            } else {
                int element = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] < element) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = element;
            }
        }
    }

    public static void sortDescUntilFirstPositive(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > 0 || array[0] > 0) {
                return;
            } else {
                int element = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] < element) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = element;
            }
        }
    }

    public static void sortAscUntilFirstNegative(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < 0 || array[0] < 0) {
                return;
            } else {
                int element = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] > element) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = element;
            }
        }
    }

    public static void sortAscUntilFirstPositive(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > 0 || array[0] > 0) {
                return;
            } else {
                int element = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] > element) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = element;
            }
        }
    }

    public static void sortDescUntilFirstEven(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 == 0 || array[0] % 2 == 0) {
                return;
            } else {
                int element = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] < element) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = element;
            }
        }
    }

    public static void sortDescUntilFirstOdd(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 != 0 || array[0] % 2 != 0) {
                return;
            } else {
                int element = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] < element) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = element;
            }
        }
    }

    public static void sortAscUntilFirstEven(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 == 0 || array[0] % 2 == 0) {
                return;
            } else {
                int element = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] > element) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = element;
            }
        }
    }

    public static void sortAscUntilFirstOdd(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 != 0 || array[0] % 2 != 0) {
                return;
            } else {
                int element = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] > element) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = element;
            }
        }
    }

    public static void sortAscUntilNumber(int[] array, int number) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] == number || array[0] == number) {
                return;
            } else {
                int element = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] > element) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = element;
            }
        }
    }

    public static void sortDescUntilNumber(int[] array, int number) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] == number || array[0] == number) {
                return;
            } else {
                int element = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] < element) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = element;
            }
        }
    }



}