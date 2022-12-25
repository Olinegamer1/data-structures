package com.company.array;

public class OrderedArray {
    private final long[] array;
    private int countOfElements;

    public OrderedArray(int size) {
        array = new long[size];
    }

    public int size() {
        return countOfElements;
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = countOfElements - 1;
        int currentElement;

        while (true) {
            currentElement = lowerBound + (upperBound - lowerBound) / 2;
            if (array[currentElement] == searchKey) {
                return currentElement;
            } else if (lowerBound > upperBound) {
                return -lowerBound;
            } else {
                if (array[currentElement] < searchKey) {
                    lowerBound = currentElement + 1;
                } else {
                    upperBound = currentElement - 1;
                }
            }
        }
    }

    public void insert(long value) {
        if (countOfElements >= array.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int indexToInsert = Math.abs(find(value));
        System.arraycopy(array, indexToInsert, array, indexToInsert + 1, countOfElements - indexToInsert);
        array[indexToInsert] = value;
        countOfElements++;
    }

    public OrderedArray merge(OrderedArray other) {
        int size = this.array.length + other.array.length;
        OrderedArray output = new OrderedArray(size);
        output.countOfElements = this.countOfElements + other.countOfElements;

        int i = 0;
        int j = 0;
        while (i < this.countOfElements || j < other.countOfElements) {
            output.array[i + j] = i < this.countOfElements
                    && (j == other.countOfElements || this.array[i] < other.array[j])
                    ? this.array[i++] : other.array[j++];
        }
        return output;
    }

    public boolean delete(long value) {
        int i;
        if ((i = find(value)) > -1) {
            System.arraycopy(array, i + 1, array, i, countOfElements - i - 1);
            countOfElements--;
            return true;
        }
        return false;
    }

    public void display() {
        for (int i = 0; i < countOfElements; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
