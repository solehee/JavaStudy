package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import myobj.Poker.*;


public class D05_Poker {
	/*
	 	(섯다, 포카, 오목, 체스, 장기, 테트리스 중 택 1)을 구현해보세요
	 	포커가 다이스랑 가장 유사함

	 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Player[] players;

			// System.out.println(dealer.deck);
			System.out.print("게임을 진행할 Player의 수를 입력하세요 > ");
			int numOfPlayer = new Scanner(System.in).nextInt();
			players = new Player[numOfPlayer];

			// 각 플레이어마다 기본 세팅금 10000원으로 지정해줌.
			for (int i = 0; i < numOfPlayer; i++) {
				players[i] = new Player();
				players[i].money = 10000;
			}
			int index = 0;

			// 연속 게임 여부에 따라 프로그램을 반복 실행 해줌. 만일 게임을 중지하고자 할 경우 게임을 중지함.

			while (true) {

				System.out.print("계속 하시려면 1 , 중지하시려면 2");
				System.out.println(" > ");
				index = new Scanner(System.in).nextInt();
				if (index == 1) {
					Computer dealer = new Computer();

					for (int i = 0; i < numOfPlayer; i++) {
						dealer.deal(players[i]);
						// 플레이어카드 소팅
						Arrays.sort(players[i].cards);
						System.out.println("플레이어 " + (i + 1) + " " + Arrays.toString(players[i].cards));
						// 게임이 시작하면 각 플레이어의 셋팅된 돈 10000원에서 각 베팅금 1000원식 감해줌
						players[i].money -= 1000;
					}

					dealer.checkRank(players);

					// ranking 배열을 생성하여 각각의 플레이어의 점수를 넣어줌 (해시맵 상의 랭크에 따른 점수가 같을 때 패의 숫자 또는 무늬의 값에 따라
					// 추가되는 점수를 합쳐서 비교)
					int ranking[] = new int[numOfPlayer];
					for (int i = 0; i < numOfPlayer; i++) {
						ranking[i] = players[i].rank;
					}
					Arrays.sort(ranking);
					System.out.println(Arrays.toString(ranking));
					int winnerrank = ranking[numOfPlayer-1];
					for (int i = 0; i < numOfPlayer; i++) {
						if (players[i].rank == winnerrank) {
							System.out.println(i + 1 + "번째 플레이어가 승리했습니다");
							players[i].money += (1000 * (numOfPlayer));
						}

					}
					// 만일 게임을 중지하였을 경우 가장 돈을 많이 보유하고 있는 플레이어가 승리하도록함.
				} else if (index == 2) {
					int maxmoney = players[0].money;

					for (int i = 1; i < numOfPlayer; i++) {
						if (maxmoney < players[i].money) {
							maxmoney = players[i].money;
							System.out.println((i + 1) + "플레이어가 가진 돈 " + maxmoney + "원 으로 가장 많습니다. 승리하셨습니다.");

						}
					}
					break;
				}
			}
			// 게임이 중지되고 각 플레이어의 잔액을 확인할 수 있음 잔액확인 후 프로그램은 중지됨.
			System.out.print("각각의 플레이어의 잔액을 확인하시려면 3번");
			int confirm = new Scanner(System.in).nextInt();
			if (confirm == 3) {

				for (int i = 0; i < numOfPlayer; i++) {
					System.out.println((i + 1) + "플레이어의 돈은 " + players[i].money + " 원 입니다.");
				}
			}

			

		}
	}

