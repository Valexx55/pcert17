package jcp17.colecciones;

import java.util.Arrays;
import java.util.List;

public class Data {
	int value;

	Data(int value) {
		this.value = value;
	}

	public String toString() {
		return "" + value;
	}

	public static void main(String[] args) {

		int i = 1;
		int j = i++;
		if ((i == ++j) | (i++ == j)) {
			i += j;
		}
		System.out.println(i);

		Data[] dataArr = new Data[] { new Data(1), new Data(2), new Data(3), new Data(4) };

		List<Data> dataList = Arrays.asList(dataArr); // 1

		for (Data element : dataList) {

			dataList.removeIf((Data d) -> {
				return d.value % 2 == 0;
			}); // 2

			// System.out.println("Removed " + d + ", "); // 3
		}
	}
}
