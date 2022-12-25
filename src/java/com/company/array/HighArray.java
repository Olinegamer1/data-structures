package com.company.array;

import java.util.Arrays;
import java.util.HashSet;

public class HighArray {
    private final long[] array;
    private int countOfElements;

    public HighArray(int size) {
        array = new long[size];
    }

    public HighArray(HighArray other) {
        this(other.array.length);
        System.arraycopy(other.array, 0, array, 0, other.countOfElements);
        countOfElements = other.countOfElements;
    }

    public int find(long searchKey) {
        for (int i = 0; i < countOfElements; i++) {
            if (array[i] == searchKey) {
                return i;
            }
        }
        return -1;
    }

    public void insert(long value) {
        if (countOfElements >= array.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        array[countOfElements++] = value;
    }

    public boolean delete(long value) {
        int i;
        if ((i = find(value)) != -1) {
            if (countOfElements - i >= 0) {
                System.arraycopy(array, i + 1, array, i, countOfElements - i - 1);
                countOfElements--;
                return true;
            }
        }
        return false;
    }

    public void display() {
        for (int i = 0; i < countOfElements; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public long getMax() {
        return Arrays.stream(array).max().orElse(-1);
    }

    public void removeMax() {
        delete(getMax());
    }

    public HighArray bubbleSort() {
        HighArray output = new HighArray(this);
        for (int i = 0; i < output.countOfElements - 1; i++) {
            for (int j = i + 1; j < output.countOfElements; j++) {
                if (output.array[i] > output.array[j]) {
                    swap(output, i, j);
                }
            }
        }
        return output;
    }

    public HighArray selectionSort() {
        HighArray output = new HighArray(this);
        for (int i = 0; i < output.countOfElements; i++) {
            int min = i;
            for (int j = i + 1; j < output.countOfElements; j++) {
                if (output.array[min] > output.array[j]) {
                    min = j;
                }
            }
            swap(output, i, min);
        }
        return output;
    }

    public HighArray insertionSort() {
        HighArray output = new HighArray(this);

        for (int out = 1; out < output.countOfElements; out++) {
            long temp = output.array[out];
            int in = out;
            while (in > 0 && output.array[in - 1] >= temp) {
                output.array[in] = output.array[in - 1];
                in--;
            }
            output.array[in] = temp;
        }
        return output;
    }

    private void swap(HighArray output, int one, int two) {
        long temp = output.array[one];
        output.array[one] = output.array[two];
        output.array[two] = temp;
    }

    public HighArray deleteDuplicates() {
        HighArray output = new HighArray(this.array.length);
        HashSet<Long> uniqNumbers = new HashSet<>();
        for (int i = 0, j = 0; i < output.countOfElements; i++) {
            if (!uniqNumbers.contains(array[i])) {
                uniqNumbers.add(array[i]);
                output.insert(array[i]);
            }
        }
        return output;
    }
}
