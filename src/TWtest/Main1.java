package TWtest;
public class Main1 {
	public static void main(String[] args) {
		Map map = new Map();
		map.initMap(10, 10);
		System.out.println("��ӡ��ʼ����map");
		printCellMap(map);
		for (int i = 0; i < 10; i++) {
			map.update();
			System.out.println("*********��" + (i + 1) + "�δ�ӡ���º��map*********");
			printCellMap(map);
		}
	}
	private static void printCellMap(Map map) {
		for (int j = 1; j < map.getCellMap().length-1 ; j++) {
			for (int j2 = 1; j2 < map.getCellMap()[0].length-1 ; j2++) {
				System.out.print(map.getCellMap()[j][j2] + " ");
			}
			System.out.println();
		}
	}

}