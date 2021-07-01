package myobj.Poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Computer{
	ArrayList deck = new ArrayList(Card.NUM_MAX * Card.KIND_MAX); // Card[] deck = new Card[52];
	HashMap rankTable = new HashMap();

	public Computer() {
		// 1. deck�� Card�� �����ؼ� �ִ´�.
		int i = 0;

		for (int k = Card.KIND_MAX; k > 0; k--) {
			for (int n = 0; n < Card.NUM_MAX; n++) {
				deck.add(new Card(k, n + 1));
			}
		}
		
		Collections.shuffle(deck);

		// 2. rankTable�� rank������ �ִ´�.
		// "straight flush" �� 9000
		// "flush"�� 8000
		// "straight"�� 7000
		// "full house"�� 6000
		// "four card"�� 5000
		// "three card"�� 4000
		// "2 pair"�� 3000
		// "1 pair"�� 2000
		// "no rank"�� 1000

		String ranking[] = { "Straight flush", "flush", "Straight", "full house", "four card", "three card", "2 pair",
				"1 pair", "no rank" };
		for (i = 0; i < ranking.length; i++) {
			rankTable.put(ranking[i], 9000 - 1000 * i);
		}
		System.out.println("��ũ ���̺� : " + rankTable);
		System.out.println();
	}

	// ī�� �����ֱ�
	public void deal(Player p) {
		for (int i = 0; i < 5; i++) {
			p.cards[i] = (Card) deck.get(i);
			deck.remove(i);
		}

	}

	public void checkRank(Player[] players) {
		// �� player�� rank�� üũ�ؼ� player�� rank�� ����

		for (int ii = 0; ii < players.length; ii++) {
			int[] cntArr = new int[14];

			boolean threeCard = false;
			boolean fourCard = false;
			int pair = 0;
			boolean straight = false;
			boolean flush = false;
			boolean straightFlush = false;
			boolean fullhouse = false;
			int pairnum = 0;
			int kindCnt = 0;

			int stCnt = 0;
			for (int i = 0; i < 5; i++) {
				cntArr[players[ii].cards[i].num]++;
			}

			for (int i = 0; i < 4; i++) {
				if (cntArr[i] > 0) {
					// stCnt++;
					for (int j = i; j < cntArr.length - 1; j++) {
						if (cntArr[j + 1] > 0) {
							stCnt++;
							pairnum = i;
							if (stCnt == 5)
								straight = true;
						} else {
							stCnt = 0;
						}
					}

				}
				if (players[ii].cards[0].kind == players[ii].cards[i + 1].kind) {
					kindCnt++;
					if (kindCnt == 4) {
						flush = true;
					}
				} else if (stCnt == 5 && flush == true) {
					straightFlush = true;
				}
			}
			for (int i = 0; i < cntArr.length; i++) {
				if (cntArr[i] == 4) {
					fourCard = true;
					pairnum = i;
				break;}
				else if (cntArr[i] == 3) {
					for (int j = 0; j < cntArr.length; j++) {
						if (cntArr[j] == 2) {
							fullhouse = true;
						break;}
					threeCard = true;
					pairnum = i;

					break;}
				} else if (cntArr[i] == 2) {
					pair++;

					if (pair == 1||pair == 2) {
						pairnum = i;
						break;
					}
				} else if (pair == 0 && cntArr[i] == 1) {
					pairnum = i;

				}



			}

			// System.out.println(Arrays.toString(cntArr));

			if (fourCard) {
				players[ii].rank = (int) rankTable.get("four Card") + pairnum;
				System.out.print("[four Card] ");
			}else if (threeCard) {
				players[ii].rank = (int) rankTable.get("three card") + pairnum;
				System.out.print("[three Card] ");
			}else if (straight) {
				players[ii].rank = (int) rankTable.get("Straight") + pairnum;
				System.out.print("[straight] ");
			}else if (pair == 1) {
				players[ii].rank = (int) rankTable.get("1 pair") + pairnum;
				System.out.print("[one pair] ");
			}else if (pair == 2) {
				players[ii].rank = (int) rankTable.get("2 pair") + pairnum;
				System.out.print("[two pair] ");
			}else if (fullhouse) {
				players[ii].rank = (int) rankTable.get("full house") + pairnum;
				System.out.print("[full house] ");
			}else if (flush) {
				players[ii].rank = (int) rankTable.get("flush") + players[ii].cards[4].kind + players[ii].cards[4].num;
				System.out.print("[flush] ");
			}else if (straightFlush) {
				players[ii].rank = (int) rankTable.get("Straight flush") + pairnum;
				System.out.print("[straightFlush] ");
			}else {
				players[ii].rank = (int) rankTable.get("no rank") + pairnum + players[ii].cards[4].kind;
			}
			// ���� ��ũ�� ��� ���� ū ���� ī�� ��

			System.out.println("�÷��̾� " + (ii + 1) + "�� ������ : " + players[ii].rank);

		}
		// }

	}
}
		

	
