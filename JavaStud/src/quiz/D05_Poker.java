package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import myobj.Poker.*;


public class D05_Poker {
	/*
	 	(����, ��ī, ����, ü��, ���, ��Ʈ���� �� �� 1)�� �����غ�����
	 	��Ŀ�� ���̽��� ���� ������

	 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Player[] players;

			// System.out.println(dealer.deck);
			System.out.print("������ ������ Player�� ���� �Է��ϼ��� > ");
			int numOfPlayer = new Scanner(System.in).nextInt();
			players = new Player[numOfPlayer];

			// �� �÷��̾�� �⺻ ���ñ� 10000������ ��������.
			for (int i = 0; i < numOfPlayer; i++) {
				players[i] = new Player();
				players[i].money = 10000;
			}
			int index = 0;

			// ���� ���� ���ο� ���� ���α׷��� �ݺ� ���� ����. ���� ������ �����ϰ��� �� ��� ������ ������.

			while (true) {

				System.out.print("��� �Ͻ÷��� 1 , �����Ͻ÷��� 2");
				System.out.println(" > ");
				index = new Scanner(System.in).nextInt();
				if (index == 1) {
					Computer dealer = new Computer();

					for (int i = 0; i < numOfPlayer; i++) {
						dealer.deal(players[i]);
						// �÷��̾�ī�� ����
						Arrays.sort(players[i].cards);
						System.out.println("�÷��̾� " + (i + 1) + " " + Arrays.toString(players[i].cards));
						// ������ �����ϸ� �� �÷��̾��� ���õ� �� 10000������ �� ���ñ� 1000���� ������
						players[i].money -= 1000;
					}

					dealer.checkRank(players);

					// ranking �迭�� �����Ͽ� ������ �÷��̾��� ������ �־��� (�ؽø� ���� ��ũ�� ���� ������ ���� �� ���� ���� �Ǵ� ������ ���� ����
					// �߰��Ǵ� ������ ���ļ� ��)
					int ranking[] = new int[numOfPlayer];
					for (int i = 0; i < numOfPlayer; i++) {
						ranking[i] = players[i].rank;
					}
					Arrays.sort(ranking);
					System.out.println(Arrays.toString(ranking));
					int winnerrank = ranking[numOfPlayer-1];
					for (int i = 0; i < numOfPlayer; i++) {
						if (players[i].rank == winnerrank) {
							System.out.println(i + 1 + "��° �÷��̾ �¸��߽��ϴ�");
							players[i].money += (1000 * (numOfPlayer));
						}

					}
					// ���� ������ �����Ͽ��� ��� ���� ���� ���� �����ϰ� �ִ� �÷��̾ �¸��ϵ�����.
				} else if (index == 2) {
					int maxmoney = players[0].money;

					for (int i = 1; i < numOfPlayer; i++) {
						if (maxmoney < players[i].money) {
							maxmoney = players[i].money;
							System.out.println((i + 1) + "�÷��̾ ���� �� " + maxmoney + "�� ���� ���� �����ϴ�. �¸��ϼ̽��ϴ�.");

						}
					}
					break;
				}
			}
			// ������ �����ǰ� �� �÷��̾��� �ܾ��� Ȯ���� �� ���� �ܾ�Ȯ�� �� ���α׷��� ������.
			System.out.print("������ �÷��̾��� �ܾ��� Ȯ���Ͻ÷��� 3��");
			int confirm = new Scanner(System.in).nextInt();
			if (confirm == 3) {

				for (int i = 0; i < numOfPlayer; i++) {
					System.out.println((i + 1) + "�÷��̾��� ���� " + players[i].money + " �� �Դϴ�.");
				}
			}

			

		}
	}

