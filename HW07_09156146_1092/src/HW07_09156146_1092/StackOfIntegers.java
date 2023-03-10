//資一A 09156146 張庭禎
package HW07_09156146_1092;

public class StackOfIntegers {
	//data fields
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;
	//constructors
	public StackOfIntegers() {
		this(DEFAULT_CAPACITY);
	}
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}
	//methods
	public void push(int value) {
		if(size >= elements.length) {//若陣列滿了，將陣列長度增加為兩倍
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = value;//將值加入陣列後，size加一
	}
	public int pop() {
		return elements[--size];//將size減一後，回傳陣列該位置的數值
	}
	public int peek() {
		return elements[size - 1];//回傳陣列在size-1位置的數值(size值不變)
	}
	public boolean empty() {
		return size == 0;
	}
	public int getSize() {
		return size;
	}

}
