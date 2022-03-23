package Ques_03;

public class Employee_Record {

	public static void main(String[] args) {

		Employee[] arr = new Employee[7];
		arr[0] = new Employee(19000, 20, "Somu");
		arr[1] = new Employee(20000, 21, "Gomu");
		arr[2] = new Employee(20000, 44, "Somya");
		arr[3] = new Employee(25000, 22, "Gomya");
		arr[4] = new Employee(9000, 30, "Gomesh");
		arr[5] = new Employee(40000, 22, "z");
		arr[6] = new Employee(40000, 22, "a");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].salary == arr[j].salary) {
					if (arr[i].age == arr[j].age) {
						if (arr[i].name.compareTo(arr[j].name) > 0) {
							Employee temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}
					}
					if (arr[i].age > arr[j].age) {
						Employee temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				} else if (arr[i].salary > arr[j].salary) {
					Employee temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
