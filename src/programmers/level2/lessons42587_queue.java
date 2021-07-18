package programmers.level2;

import java.util.*;

public class lessons42587_queue {

	public static void main(String[] args) {
		int[] priorities = { 1, 1, 9, 1, 1, 1 };
		int location = 0;

		int res = solution(priorities, location);

		System.out.println(res);

	}

	private static int solution(int[] priorities, int location) {
		int answer = 0;

		Queue<Printer> print = new LinkedList<>();

		for (int index = 0; index < priorities.length; index++) {
			print.add(new Printer(index, priorities[index]));
		}

		while (!print.isEmpty()) {
			Boolean isAdd = false;
			Printer comparatorValue = print.poll();

			Iterator<Printer> value = print.iterator();

			while (value.hasNext()) {
				if (value.next().getPriority() > comparatorValue.getPriority()) {
					print.add(comparatorValue);
					isAdd = true;
					break;
				}
			}

			if (!isAdd) {
				answer++;
				if (comparatorValue.getPosition() == location)
					break;
			}

		}
		return answer;
	}

}

class Printer {

	private int position;
	private int priority;

	public Printer(int position, int priority) {
		this.position = position;
		this.priority = priority;
	}

	public int getPosition() {
		return position;
	}

	public int getPriority() {
		return priority;
	}

}
