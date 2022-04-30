package by.kursy.annaburdys.javatasks.Homework.Stage13.LevelE;

public class Model {

    public static int findMinIndex(float[] array) {
        float min = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int findMaxIndex(float[] array) {
        float max = array[0];
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static float multipleElementsBtwMinMax(float[] array) {
        float multiple = 1;
        int minIndex = Math.min(findMinIndex(array), findMaxIndex(array));
        int maxIndex = Math.max(findMinIndex(array), findMaxIndex(array));
        for (int i = minIndex + 1; i < maxIndex; i++) {
            multiple *= array[i];
        }
        return multiple;
    }

    public static int sumElementsBtwZeros(int[] array) {
        int sum = 0;
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                minIndex = i;
                break;
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 0) {
                maxIndex = i;
                break;
            }
        }
        for (int i = minIndex + 1; i < maxIndex; i++) {
            sum += array[i];
        }
        return sum;
    }


    public static float sumElementsUntilLastPositive(float[] array) {
        int sum = 0;
        int lastIndex = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 0) {
                lastIndex = i;
                break;
            }
        }
        for (int i = 0; i < lastIndex; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int sumElementsBtwFirstAndSecondZero(int[] array) {
        int sum = 0;
        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                firstIndex = i;
                break;
            }
        }
        for (int i = firstIndex + 1; i < array.length; i++) {
            if (array[i] == 0) {
                secondIndex = i;
                break;
            }
        }
        for (int i = firstIndex + 1; i < secondIndex; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static float sumElementsAfterFirstPositive(float[] array) {
        float sum = 0;
        int firstIndex = 0;
        for (int i = 0; i <= array.length; i++) {
            if (array[i] > 0) {
                firstIndex = i;
                break;
            }
        }
        for (int i = firstIndex; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static float sumElementsAfterAbsMax(float[] array) {
        float sum = 0;
        float max = Math.abs(array[0]);
        int absMaxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (max > Math.abs(array[i - 1])) {
                max = array[i];
                absMaxIndex = i;
            }
        }
        for (int i = absMaxIndex + 1; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static float sumPositiveElementsBeforeMax(float[] array) {
        float sum = 0;
        float max = array[0];
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (max > array[i - 1]) {
                max = array[i];
                maxIndex = i;
            }
        }
        for (int i = 0; i < maxIndex; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        System.out.println(max);
        return sum;
    }

    public static float sumElementsBetweenFirstAndLastPositive(float[] array) {
        int sum = 0;
        int firstIndex = 0;
        int lastIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                firstIndex = i;
                break;
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 0) {
                lastIndex = i;
                break;
            }
        }
        for (int i = firstIndex + 1; i < lastIndex; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static float sumElementsAfterMax(float[] array) {
        float sum = 0;
        float max = array[0];
        int absMaxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (max > array[i - 1]) {
                max = array[i];
                absMaxIndex = i;
            }
        }
        for (int i = absMaxIndex + 1; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static float sumElementsBeforeMin(float[] array) {
        float sum = 0;
        float min = array[0];
        int absMinIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (min < array[i - 1]) {
                min = array[i];
                absMinIndex = i;
            }
        }
        for (int i = 0; i < absMinIndex; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static float sumElementsBetweenFirstAndLastNegative(float[] array) {
        int sum = 0;
        int firstIndex = 0;
        int lastIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                firstIndex = i;
                break;
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] < 0) {
                lastIndex = i;
                break;
            }
        }
        for (int i = firstIndex + 1; i < lastIndex; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int sumElementsBtwFirstAndSecondNegative(float[] array) {
        int sum = 0;
        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                firstIndex = i;
                break;
            }
        }
        for (int i = firstIndex + 1; i < array.length; i++) {
            if (array[i] < 0) {
                secondIndex = i;
                break;
            }
        }
        for (int i = firstIndex + 1; i < secondIndex; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static float sumElementsAfterMin(float[] array) {
        float sum = 0;
        float min = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (min < array[i - 1]) {
                min = array[i];
                minIndex = i;
            }
        }
        for (int i = minIndex; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }


}