package chapter02;

public class BattleExample {
	public static void main(String[] args) 
						throws Exception{
		boolean run = true;
		char keyCode = 0;

		while (run) {
			if (keyCode != '\r' && keyCode != '\n') {
				System.out.println("-----------------------------");
				System.out.println("1.���� | 2.���� | 3.��");
				System.out.println("-----------------------------");
				System.out.print("����: ");
			}

			keyCode = (char)System.in.read();
 
			// ��ǻ���� ���� - �����ϰ�
			// int com = (int)(Math.random() * 3) + 1;
			char com = (char) ((int)(Math.random() * 3) + '1');
			
			// �º� ���� - �̰����� ����, ������ �ٽ�
			if(com =='1') {	// �� - ����
				if(keyCode == '2') {
					System.out.println("�̰���ϴ�.");
					run = false;
				}
				
			} else if(com == '2') {	// �� - ���� 
				if(keyCode == '3') {
					System.out.println("�̰���ϴ�.");
					run = false;
				}
			} else  {	// �� - ��
				if(keyCode == '1') {
					System.out.println("�̰���ϴ�.");
					run = false;
				}
			}
			if(!run) {
				System.out.println("�̱��� ���߽��ϴ�. �ٽ� �մϴ�.");
			}
			
		}

		System.out.println("���α׷� ����");	
		
		
		
	}
}
