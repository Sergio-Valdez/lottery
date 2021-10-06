package edu.cnm.deepdive;

import java.util.Arrays;
import java.util.Random;

public class Shuffler {

  private final Random rng;
// TODO create overloads of both forms of shuffle (full and partial) boolean[], byte[], char[], short[],long[],float[], object[]
  public Shuffler(Random rng) {
    this.rng = rng;
  }

  public void shuffle(int[] data) {
    shufflePart(data, data.length - 1);
  }
  public int[] shuffle(int[] data, int drawSize) {
    shufflePart(data, drawSize);
    return Arrays.copyOfRange(data, data.length - drawSize, data.length);
  }
  public void shuffle(double[] data) {
    shufflePart(data, data.length - 1);
  }
  public double[] shuffle(double[] data, int drawSize) {
    shufflePart(data, drawSize);
    return Arrays.copyOfRange(data, data.length - drawSize, data.length);
  }

  //BOOLEAN: full
  public boolean[] shuffle(boolean[] data, int drawSize) {
    shufflePart(data, drawSize);
    return Arrays.copyOfRange(data, data.length - drawSize, data.length);
  }
  //BYTE: full
  public byte[] shuffle(byte[] data, int drawSize) {
    shufflePart(data, drawSize);
    return Arrays.copyOfRange(data, data.length - drawSize, data.length);
  }
  //CHAR: full
  public char[] shuffle(char[] data, int drawSize) {
    shufflePart(data, drawSize);
    return Arrays.copyOfRange(data, data.length - drawSize, data.length);
  }
  //SHORT: full
  public short[] shuffle(short[] data, int drawSize) {
    shufflePart(data, drawSize);
    return Arrays.copyOfRange(data, data.length - drawSize, data.length);
  }
  //LONG: full
  public long[] shuffle(long[] data, int drawSize) {
    shufflePart(data, drawSize);
    return Arrays.copyOfRange(data, data.length - drawSize, data.length);
  }
  //FLOAT:
  public float[] shuffle(float[] data, int drawSize) {
    shufflePart(data, drawSize);
    return Arrays.copyOfRange(data, data.length - drawSize, data.length);
  }
  //OBJECT:
  public Object[] shuffle(Object[] data, int drawSize) {
    shufflePart(data, drawSize);
    return Arrays.copyOfRange(data, data.length - drawSize, data.length);
  }


  //BOOLEAN: partial
  public void shuffle(boolean[] data) {
    shufflePart(data, data.length - 1);
  }
  //BYTE: partial
  public void shuffle(byte[] data) {
    shufflePart(data, data.length - 1);
  }
  //CHAR: partial
  public void shuffle(char[] data) {
    shufflePart(data, data.length - 1);
  }
  //SHORT: partial
  public void shuffle(short[] data) {
    shufflePart(data, data.length - 1);
  }
  //LONG: partial
  public void shuffle(long[] data) {
    shufflePart(data, data.length - 1);
  }
  //FLOAT: partial
  public void shuffle(float[] data) {
    shufflePart(data, data.length - 1);
  }
  //OBJECT: partial
  public void shuffle(Object[] data) {
    shufflePart(data, data.length - 1);
  }


  // TODO Create overloads of shuffle Part for boolean[], byte[], char[], short[],loNg[],float[], object[]
  private void shufflePart(int[] data, int drawSize) {
    for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
      int destIndex = rng.nextInt(sourceIndex + 1);
      if (sourceIndex != destIndex) {
        int temp = data[sourceIndex];
        data[sourceIndex] = data[destIndex];
        data[destIndex] = temp;
      }
    }
  }
  private void shufflePart(double[] data, int drawSize) {
    for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
      int destIndex = rng.nextInt(sourceIndex + 1);
      if (sourceIndex != destIndex) {
        double temp = data[sourceIndex];
        data[sourceIndex] = data[destIndex];
        data[destIndex] = temp;
      }
    }
  }

  // BOOLEAN: Temp changed
  private void shufflePart(boolean[] data, int drawSize) {
    for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
      int destIndex = rng.nextInt(sourceIndex + 1);
      if (sourceIndex != destIndex) {
        boolean temp = data[sourceIndex];
        data[sourceIndex] = data[destIndex];
        data[destIndex] = temp;
      }
    }
  }
  //BYTE: Temp changed
  private void shufflePart(byte[] data, int drawSize) {
    for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
      int destIndex = rng.nextInt(sourceIndex + 1);
      if (sourceIndex != destIndex) {
        byte temp = data[sourceIndex];
        data[sourceIndex] = data[destIndex];
        data[destIndex] = temp;
      }
    }
  }
  //CHAR: Temp changed
  private void shufflePart(char[] data, int drawSize) {
    for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
      int destIndex = rng.nextInt(sourceIndex + 1);
      if (sourceIndex != destIndex) {
        char temp = data[sourceIndex];
        data[sourceIndex] = data[destIndex];
        data[destIndex] = temp;
      }
    }
  }
  //SHORT: Temp changed
  private void shufflePart(short[] data, int drawSize) {
    for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
      int destIndex = rng.nextInt(sourceIndex + 1);
      if (sourceIndex != destIndex) {
        short temp = data[sourceIndex];
        data[sourceIndex] = data[destIndex];
        data[destIndex] = temp;
      }
    }
  }
  //LONG: Temp changed
  private void shufflePart(long[] data, int drawSize) {
    for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
      int destIndex = rng.nextInt(sourceIndex + 1);
      if (sourceIndex != destIndex) {
        long temp = data[sourceIndex];
        data[sourceIndex] = data[destIndex];
        data[destIndex] = temp;
      }
    }
  }
  //FLOAT: Temp changed
  private void shufflePart(float[] data, int drawSize) {
    for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
      int destIndex = rng.nextInt(sourceIndex + 1);
      if (sourceIndex != destIndex) {
        float temp = data[sourceIndex];
        data[sourceIndex] = data[destIndex];
        data[destIndex] = temp;
      }
    }
  }
  //OBJECT: Temp changed
  private void shufflePart(Object[] data, int drawSize) {
    for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
      int destIndex = rng.nextInt(sourceIndex + 1);
      if (sourceIndex != destIndex) {
        Object temp = data[sourceIndex];
        data[sourceIndex] = data[destIndex];
        data[destIndex] = temp;
      }
    }
  }
}
